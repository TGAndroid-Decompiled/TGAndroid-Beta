package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.ConditionVariable;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Storage.CacheModel;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public class CachedMediaLayout extends FrameLayout implements NestedSizeNotifierLayout.ChildLayout {
    private static final int PAGE_TYPE_CHATS = 0;
    private static final int PAGE_TYPE_DOCUMENTS = 2;
    private static final int PAGE_TYPE_MEDIA = 1;
    private static final int PAGE_TYPE_MUSIC = 3;
    private static final int PAGE_TYPE_STORIES = 4;
    private static final int PAGE_TYPE_VOICE = 5;
    private static final int VIEW_TYPE_CHAT = 1;
    private static final int VIEW_TYPE_FILE_ENTRY = 2;
    private final LinearLayout actionModeLayout;
    private final ArrayList<View> actionModeViews;
    Page[] allPages;
    private final BackDrawable backDrawable;
    private int bottomPadding;
    CacheModel cacheModel;
    private final ActionBarMenuItem clearItem;
    private final ImageView closeButton;
    Delegate delegate;
    private final View divider;
    ArrayList<Page> pages;
    BaseFragment parentFragment;
    BasePlaceProvider placeProvider;
    public final AnimatedTextView selectedMessagesCountTextView;
    private final ViewPagerFixed.TabsView tabs;
    ViewPagerFixed viewPagerFixed;

    public class AnonymousClass1 extends ViewPagerFixed.Adapter {
        private ActionBarPopupWindow popupWindow;
        final Context val$context;
        final BaseFragment val$parentFragment;

        public AnonymousClass1(Context context, BaseFragment baseFragment) {
            this.val$context = context;
            this.val$parentFragment = baseFragment;
        }

        public void lambda$createView$0(ItemInner itemInner, BaseAdapter baseAdapter, RecyclerListView recyclerListView, View view, View view2) {
            CachedMediaLayout.this.openPhoto(itemInner, (MediaAdapter) baseAdapter, recyclerListView, (SharedPhotoVideoCell2) view);
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
        }

        public void lambda$createView$1(ItemInner itemInner, View view, View view2) {
            CachedMediaLayout.this.openItem(itemInner.file, (CacheCell) view);
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
        }

        public void lambda$createView$2(ItemInner itemInner, View view, View view2) {
            CachedMediaLayout.this.openItem(itemInner.file, (CacheCell) view);
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
        }

        public void lambda$createView$3(ItemInner itemInner, BaseFragment baseFragment, View view) {
            Bundle bundle = new Bundle();
            long j = itemInner.file.dialogId;
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putInt("message_id", itemInner.file.messageId);
            baseFragment.presentFragment(new ChatActivity(bundle));
            CachedMediaLayout.this.delegate.dismiss();
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
        }

        public void lambda$createView$4(ItemInner itemInner, View view) {
            Delegate delegate = CachedMediaLayout.this.delegate;
            if (delegate != null) {
                delegate.onItemSelected(itemInner.entities, itemInner.file, true);
            }
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
        }

        public boolean lambda$createView$5(RecyclerListView recyclerListView, BaseFragment baseFragment, final View view, int i, float f, float f2) {
            BaseAdapter baseAdapter = (BaseAdapter) recyclerListView.getAdapter();
            final ItemInner itemInner = baseAdapter.itemInners.get(i);
            if (!(view instanceof CacheCell) && !(view instanceof SharedPhotoVideoCell2)) {
                Delegate delegate = CachedMediaLayout.this.delegate;
                if (delegate != null) {
                    delegate.onItemSelected(itemInner.entities, itemInner.file, true);
                }
                return true;
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(CachedMediaLayout.this.getContext());
            if (view instanceof SharedPhotoVideoCell2) {
                ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda13(this, itemInner, baseAdapter, recyclerListView, (SharedPhotoVideoCell2) view, 1));
            } else if (((CacheCell) view).container.getChildAt(0) instanceof SharedAudioCell) {
                final int i2 = 0;
                ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener(this) {
                    public final CachedMediaLayout.AnonymousClass1 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$createView$1(itemInner, view, view2);
                                break;
                            default:
                                this.f$0.lambda$createView$2(itemInner, view, view2);
                                break;
                        }
                    }
                });
            } else {
                final int i3 = 1;
                ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener(this) {
                    public final CachedMediaLayout.AnonymousClass1 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$createView$1(itemInner, view, view2);
                                break;
                            default:
                                this.f$0.lambda$createView$2(itemInner, view, view2);
                                break;
                        }
                    }
                });
            }
            CacheModel.FileInfo fileInfo = itemInner.file;
            if (fileInfo.dialogId != 0 && fileInfo.messageId != 0) {
                ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda0(this, itemInner, baseFragment, 1));
            }
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!CachedMediaLayout.this.cacheModel.selectedFiles.contains(itemInner.file) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(3, this, itemInner));
            this.popupWindow = AlertsCreator.createSimplePopup(baseFragment, actionBarPopupWindowLayout, view, (int) f, (int) f2);
            CachedMediaLayout.this.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            return true;
        }

        @Override
        public void bindView(View view, int i, int i2) {
            RecyclerListView recyclerListView = (RecyclerListView) view;
            recyclerListView.setAdapter(CachedMediaLayout.this.pages.get(i).adapter);
            if (CachedMediaLayout.this.pages.get(i).type == 1 || CachedMediaLayout.this.pages.get(i).type == 4) {
                view.getContext();
                recyclerListView.setLayoutManager(new GridLayoutManager(3));
            } else {
                view.getContext();
                recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
            }
            recyclerListView.setTag(Integer.valueOf(CachedMediaLayout.this.pages.get(i).type));
        }

        @Override
        public View createView(int i) {
            final RecyclerListView recyclerListView = new RecyclerListView(this.val$context);
            DefaultItemAnimator defaultItemAnimator = (DefaultItemAnimator) recyclerListView.getItemAnimator();
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            recyclerListView.setClipToPadding(false);
            recyclerListView.setPadding(0, 0, 0, CachedMediaLayout.this.bottomPadding);
            recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int i2) {
                    BaseAdapter baseAdapter = (BaseAdapter) recyclerListView.getAdapter();
                    ItemInner itemInner = baseAdapter.itemInners.get(i2);
                    if (!(view instanceof SharedPhotoVideoCell2)) {
                        Delegate delegate = CachedMediaLayout.this.delegate;
                        if (delegate != null) {
                            delegate.onItemSelected(itemInner.entities, itemInner.file, false);
                            return;
                        }
                        return;
                    }
                    MediaAdapter mediaAdapter = (MediaAdapter) baseAdapter;
                    if (!mediaAdapter.isStories) {
                        CachedMediaLayout.this.openPhoto(itemInner, mediaAdapter, recyclerListView, (SharedPhotoVideoCell2) view);
                        return;
                    }
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    CacheModel.FileInfo fileInfo = itemInner.file;
                    tL_storyItem.dialogId = fileInfo.dialogId;
                    tL_storyItem.id = Objects.hash(fileInfo.file.getAbsolutePath());
                    tL_storyItem.attachPath = itemInner.file.file.getAbsolutePath();
                    tL_storyItem.date = -1;
                    AnonymousClass1.this.val$parentFragment.getOrCreateStoryViewer().open(UserConfig.selectedAccount, AnonymousClass1.this.val$context, tL_storyItem, new StoriesListPlaceProvider(recyclerListView, false));
                }
            });
            recyclerListView.setOnItemLongClickListener(new WearAuthSheet$$ExternalSyntheticLambda5(this, recyclerListView, this.val$parentFragment, 1));
            return recyclerListView;
        }

        @Override
        public int getItemCount() {
            return CachedMediaLayout.this.pages.size();
        }

        @Override
        public int getItemId(int i) {
            return CachedMediaLayout.this.pages.get(i).type;
        }

        @Override
        public boolean hasStableId() {
            return true;
        }

        @Override
        public String getItemTitle(int i) {
            return CachedMediaLayout.this.pages.get(i).title;
        }
    }

    public abstract class BaseAdapter extends AdapterWithDiffUtils {
        ArrayList<ItemInner> itemInners = new ArrayList<>();
        final int type;

        public BaseAdapter(int i) {
            this.type = i;
        }

        @Override
        public int getItemCount() {
            return this.itemInners.size();
        }

        @Override
        public int getItemViewType(int i) {
            return this.itemInners.get(i).viewType;
        }

        public ArrayList<Object> getPhotos() {
            return null;
        }

        public abstract void update();
    }

    public abstract class BaseFilesAdapter extends BaseAdapter {
        ArrayList<ItemInner> oldItems;

        public BaseFilesAdapter(int i) {
            super(i);
            this.oldItems = new ArrayList<>();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void update() {
            ArrayList arrayList;
            this.oldItems.clear();
            this.oldItems.addAll(this.itemInners);
            this.itemInners.clear();
            CacheModel cacheModel = CachedMediaLayout.this.cacheModel;
            if (cacheModel != null) {
                int i = this.type;
                if (i == 1) {
                    arrayList = cacheModel.media;
                } else if (i == 2) {
                    arrayList = cacheModel.documents;
                } else if (i == 3) {
                    arrayList = cacheModel.music;
                } else if (i == 5) {
                    arrayList = cacheModel.voice;
                } else {
                    arrayList = i == 4 ? cacheModel.stories : null;
                }
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        this.itemInners.add(CachedMediaLayout.this.new ItemInner(2, (CacheModel.FileInfo) arrayList.get(i2)));
                    }
                }
            }
            setItems(this.oldItems, this.itemInners);
        }
    }

    public class BasePlaceProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        RecyclerListView recyclerListView;

        private BasePlaceProvider() {
        }

        @Override
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            SharedPhotoVideoCell2 cellForIndex = CachedMediaLayout.this.getCellForIndex(i);
            if (cellForIndex == null) {
                return null;
            }
            int[] iArr = new int[2];
            cellForIndex.getLocationInWindow(iArr);
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = this.recyclerListView;
            ImageReceiver imageReceiver = cellForIndex.imageReceiver;
            placeProviderObject.imageReceiver = imageReceiver;
            placeProviderObject.thumb = imageReceiver.getBitmapSafe();
            placeProviderObject.scale = cellForIndex.getScaleX();
            return placeProviderObject;
        }

        public void setRecyclerListView(RecyclerListView recyclerListView) {
            this.recyclerListView = recyclerListView;
        }

        public BasePlaceProvider(CachedMediaLayout cachedMediaLayout, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public class CacheCell extends FrameLayout {
        CheckBox2 checkBox;
        FrameLayout container;
        boolean drawDivider;
        TextView sizeTextView;
        int type;

        public CacheCell(Context context) {
            super(context);
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setDrawBackgroundAsArc(14);
            this.checkBox.setColor(Theme.key_checkbox, Theme.key_radioBackground, Theme.key_checkboxCheck);
            View view = new View(getContext());
            view.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 4));
            this.container = new FrameLayout(context);
            TextView textView = new TextView(context);
            this.sizeTextView = textView;
            textView.setTextSize(1, 16.0f);
            this.sizeTextView.setGravity(5);
            this.sizeTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false));
            if (LocaleController.isRTL) {
                addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
                addView(view, LayoutHelper.createFrame(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
                addView(this.container, LayoutHelper.createFrame(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
                addView(this.sizeTextView, LayoutHelper.createFrame(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                return;
            }
            addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
            addView(view, LayoutHelper.createFrame(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(this.container, LayoutHelper.createFrame(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
            addView(this.sizeTextView, LayoutHelper.createFrame(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
        }

        public void lambda$new$0(View view) {
            onCheckBoxPressed();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.drawDivider) {
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, Theme.dividerPaint);
                } else {
                    canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
                }
            }
        }

        public void onCheckBoxPressed() {
        }
    }

    public class DialogsAdapter extends BaseAdapter {
        ArrayList<ItemInner> old;

        public DialogsAdapter(CachedMediaLayout cachedMediaLayout, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String dialogPhotoTitle;
            if (viewHolder.getItemViewType() != 1) {
                return;
            }
            CacheControlActivity.UserCell userCell = (CacheControlActivity.UserCell) viewHolder.itemView;
            CacheControlActivity.DialogFileEntities dialogFileEntities = this.itemInners.get(i).entities;
            TLObject userOrChat = CachedMediaLayout.this.parentFragment.getMessagesController().getUserOrChat(dialogFileEntities.dialogId);
            CacheControlActivity.DialogFileEntities dialogFileEntities2 = userCell.dialogFileEntities;
            boolean z = dialogFileEntities2 != null && dialogFileEntities2.dialogId == dialogFileEntities.dialogId;
            if (dialogFileEntities.dialogId == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                userCell.getImageView().getAvatarDrawable().setAvatarType(14);
                userCell.getImageView().setForUserOrChat(null, userCell.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(userCell.getImageView(), userOrChat);
            }
            userCell.dialogFileEntities = dialogFileEntities;
            userCell.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
            userCell.setTextAndValue(dialogPhotoTitle, AndroidUtilities.formatFileSize(dialogFileEntities.totalSize), i < getItemCount() - 1);
            userCell.setChecked(CachedMediaLayout.this.cacheModel.selectedDialogs.contains(Long.valueOf(dialogFileEntities.dialogId)), z);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            CacheControlActivity.UserCell userCell = null;
            if (i == 1) {
                CacheControlActivity.UserCell userCell2 = new CacheControlActivity.UserCell(CachedMediaLayout.this.getContext(), null);
                userCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                userCell = userCell2;
            }
            return new RecyclerListView.Holder(userCell);
        }

        @Override
        public void update() {
            this.old.clear();
            this.old.addAll(this.itemInners);
            this.itemInners.clear();
            if (CachedMediaLayout.this.cacheModel != null) {
                for (int i = 0; i < CachedMediaLayout.this.cacheModel.entities.size(); i++) {
                    ArrayList<ItemInner> arrayList = this.itemInners;
                    CachedMediaLayout cachedMediaLayout = CachedMediaLayout.this;
                    arrayList.add(cachedMediaLayout.new ItemInner(1, (CacheControlActivity.DialogFileEntities) cachedMediaLayout.cacheModel.entities.get(i)));
                }
            }
            setItems(this.old, this.itemInners);
        }

        private DialogsAdapter() {
            super(0);
            this.old = new ArrayList<>();
        }
    }

    public class DocumentsAdapter extends BaseFilesAdapter {
        ArrayList<Object> photoEntries;

        public DocumentsAdapter(CachedMediaLayout cachedMediaLayout, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override
        public ArrayList<Object> getPhotos() {
            return this.photoEntries;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            CacheCell cacheCell = (CacheCell) viewHolder.itemView;
            SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) cacheCell.container.getChildAt(0);
            CacheModel.FileInfo fileInfo = this.itemInners.get(i).file;
            boolean z = fileInfo == viewHolder.itemView.getTag();
            boolean z2 = i != this.itemInners.size() - 1;
            viewHolder.itemView.setTag(fileInfo);
            long jLastModified = fileInfo.file.lastModified();
            int i2 = fileInfo.messageType;
            File file = fileInfo.file;
            sharedDocumentCell.setTextAndValueAndTypeAndThumb(z2, i2 == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), 0, LocaleController.formatDateAudio(jLastModified / 1000, true), Utilities.getExtension(file.getName()), null);
            if (!z) {
                sharedDocumentCell.setPhoto(file.getPath());
            }
            sharedDocumentCell.getImageView().setRoundRadius(AndroidUtilities.dp(fileInfo.messageType == 5 ? 20.0f : 4.0f));
            cacheCell.drawDivider = z2;
            cacheCell.sizeTextView.setText(AndroidUtilities.formatFileSize(fileInfo.size));
            cacheCell.checkBox.setChecked(CachedMediaLayout.this.cacheModel.selectedFiles.contains(fileInfo), z);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            CacheCell cacheCell = new CacheCell(viewGroup.getContext()) {
                {
                    CachedMediaLayout cachedMediaLayout = CachedMediaLayout.this;
                }

                @Override
                public void onCheckBoxPressed() {
                    CachedMediaLayout.this.delegate.onItemSelected(null, (CacheModel.FileInfo) getTag(), true);
                }
            };
            cacheCell.type = 2;
            cacheCell.container.addView(new SharedDocumentCell(viewGroup.getContext(), 3, null));
            return new RecyclerListView.Holder(cacheCell);
        }

        @Override
        public void update() {
            super.update();
            this.photoEntries.clear();
            for (int i = 0; i < this.itemInners.size(); i++) {
                this.photoEntries.add(new MediaController.PhotoEntry(0, 0, 0L, this.itemInners.get(i).file.file.getPath(), 0, this.itemInners.get(i).file.type == 1, 0, 0, 0L));
            }
        }

        private DocumentsAdapter() {
            super(2);
            this.photoEntries = new ArrayList<>();
        }
    }

    public class MediaAdapter extends BaseFilesAdapter {
        boolean isStories;
        ArrayList<Object> photoEntries;
        private SharedPhotoVideoCell2.SharedResources sharedResources;
        private int storiesPointer;
        CombinedDrawable thumb;

        public MediaAdapter(CachedMediaLayout cachedMediaLayout, boolean z, AnonymousClass1 anonymousClass1) {
            this(z);
        }

        @Override
        public ArrayList<Object> getPhotos() {
            return this.photoEntries;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (this.thumb == null) {
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_chat_attachPhotoBackground, false)), Theme.chat_attachEmptyDrawable);
                this.thumb = combinedDrawable;
                combinedDrawable.setFullsize(true);
            }
            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) viewHolder.itemView;
            CacheModel.FileInfo fileInfo = this.itemInners.get(i).file;
            boolean z = fileInfo == sharedPhotoVideoCell2.getTag();
            sharedPhotoVideoCell2.setTag(fileInfo);
            int iMax = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
            if (this.isStories) {
                boolean zEndsWith = fileInfo.file.getAbsolutePath().endsWith(".mp4");
                File file = fileInfo.file;
                if (zEndsWith) {
                    sharedPhotoVideoCell2.imageReceiver.setImage(ImageLocation.getForPath(file.getAbsolutePath()), iMax + "_" + iMax + "_pframe", this.thumb, null, null, 0);
                } else {
                    sharedPhotoVideoCell2.imageReceiver.setImage(ImageLocation.getForPath(file.getAbsolutePath()), DiffUtil.m(iMax, iMax, "_"), this.thumb, null, null, 0);
                }
                sharedPhotoVideoCell2.storyId = Objects.hash(file.getAbsolutePath());
                sharedPhotoVideoCell2.isStory = true;
                sharedPhotoVideoCell2.setVideoText(AndroidUtilities.formatFileSize(fileInfo.size), true);
            } else {
                int i2 = fileInfo.type;
                File file2 = fileInfo.file;
                if (i2 == 1) {
                    sharedPhotoVideoCell2.imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file2.getAbsolutePath()), DiffUtil.m(iMax, iMax, "_"), this.thumb, null, null, 0);
                    sharedPhotoVideoCell2.setVideoText(AndroidUtilities.formatFileSize(fileInfo.size), true);
                } else {
                    sharedPhotoVideoCell2.imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file2.getAbsolutePath()), DiffUtil.m(iMax, iMax, "_"), this.thumb, null, null, 0);
                    sharedPhotoVideoCell2.setVideoText(AndroidUtilities.formatFileSize(fileInfo.size), false);
                }
            }
            sharedPhotoVideoCell2.setChecked(CachedMediaLayout.this.cacheModel.selectedFiles.contains(fileInfo), z);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (this.sharedResources == null) {
                this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext(), null);
            }
            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(viewGroup.getContext(), this.sharedResources, CachedMediaLayout.this.parentFragment.getCurrentAccount()) {
                @Override
                public void lambda$setStyle$1() {
                    CachedMediaLayout.this.delegate.onItemSelected(null, (CacheModel.FileInfo) getTag(), true);
                }
            };
            sharedPhotoVideoCell2.setStyle(1);
            return new RecyclerListView.Holder(sharedPhotoVideoCell2);
        }

        @Override
        public void update() {
            super.update();
            this.photoEntries.clear();
            for (int i = 0; i < this.itemInners.size(); i++) {
                this.photoEntries.add(new MediaController.PhotoEntry(0, 0, 0L, this.itemInners.get(i).file.file.getPath(), 0, this.itemInners.get(i).file.type == 1, 0, 0, 0L));
            }
        }

        private MediaAdapter(boolean z) {
            super(z ? 4 : 1);
            this.photoEntries = new ArrayList<>();
            this.isStories = z;
        }
    }

    public class MusicAdapter extends BaseFilesAdapter {
        public MusicAdapter(CachedMediaLayout cachedMediaLayout, AnonymousClass1 anonymousClass1) {
            this();
        }

        public ArrayList<MessageObject> createPlaylist() {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            for (int i = 0; i < this.itemInners.size(); i++) {
                CachedMediaLayout.this.checkMessageObjectForAudio(this.itemInners.get(i).file, i);
                arrayList.add(this.itemInners.get(i).file.messageObject);
            }
            return arrayList;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            CacheCell cacheCell = (CacheCell) viewHolder.itemView;
            SharedAudioCell sharedAudioCell = (SharedAudioCell) cacheCell.container.getChildAt(0);
            CacheModel.FileInfo fileInfo = this.itemInners.get(i).file;
            boolean z = fileInfo == cacheCell.getTag();
            boolean z2 = i != this.itemInners.size() - 1;
            cacheCell.setTag(fileInfo);
            CachedMediaLayout.this.checkMessageObjectForAudio(fileInfo, i);
            sharedAudioCell.setMessageObject(fileInfo.messageObject, z2);
            sharedAudioCell.showName(!fileInfo.metadata.isOpen, z);
            cacheCell.drawDivider = z2;
            cacheCell.sizeTextView.setText(AndroidUtilities.formatFileSize(fileInfo.size));
            cacheCell.checkBox.setChecked(CachedMediaLayout.this.cacheModel.selectedFiles.contains(fileInfo), z);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            final CacheCell cacheCell = new CacheCell(viewGroup.getContext()) {
                {
                    CachedMediaLayout cachedMediaLayout = CachedMediaLayout.this;
                }

                @Override
                public void onCheckBoxPressed() {
                    CachedMediaLayout.this.delegate.onItemSelected(null, (CacheModel.FileInfo) getTag(), true);
                }
            };
            cacheCell.type = 3;
            SharedAudioCell sharedAudioCell = new SharedAudioCell(viewGroup.getContext(), 0, null) {
                @Override
                public void didPressedButton() {
                    CachedMediaLayout.this.openItem((CacheModel.FileInfo) cacheCell.getTag(), cacheCell);
                }
            };
            sharedAudioCell.setCheckForButtonPress(true);
            cacheCell.container.addView(sharedAudioCell);
            return new RecyclerListView.Holder(cacheCell);
        }

        private MusicAdapter() {
            super(3);
        }
    }

    public class Page {
        public final BaseAdapter adapter;
        public final String title;
        public final int type;

        public Page(CachedMediaLayout cachedMediaLayout, String str, int i, BaseAdapter baseAdapter, AnonymousClass1 anonymousClass1) {
            this(str, i, baseAdapter);
        }

        private Page(String str, int i, BaseAdapter baseAdapter) {
            this.title = str;
            this.type = i;
            this.adapter = baseAdapter;
        }
    }

    public class VoiceAdapter extends BaseFilesAdapter {
        private VoiceAdapter() {
            super(5);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewHolder.itemView;
            CacheModel.FileInfo fileInfo = this.itemInners.get(i).file;
            boolean z = fileInfo == sharedDocumentCell.getTag();
            sharedDocumentCell.setTag(fileInfo);
            String name = fileInfo.file.getName();
            String fileSize = AndroidUtilities.formatFileSize(fileInfo.size);
            File file = fileInfo.file;
            sharedDocumentCell.setTextAndValueAndTypeAndThumb(true, name, 0, fileSize, Utilities.getExtension(file.getName()), null);
            sharedDocumentCell.setPhoto(file.getPath());
            sharedDocumentCell.setChecked(CachedMediaLayout.this.cacheModel.selectedFiles.contains(fileInfo), z);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new SharedDocumentCell(viewGroup.getContext(), 0, null));
        }
    }

    public CachedMediaLayout(Context context, BaseFragment baseFragment) {
        super(context);
        this.actionModeViews = new ArrayList<>();
        this.pages = new ArrayList<>();
        Page[] pageArr = new Page[5];
        this.allPages = pageArr;
        this.parentFragment = baseFragment;
        AnonymousClass1 anonymousClass1 = null;
        AnonymousClass1 anonymousClass2 = null;
        pageArr[0] = new Page(this, LocaleController.getString(R.string.FilterChats), 0, new DialogsAdapter(this, anonymousClass1), anonymousClass2);
        this.allPages[1] = new Page(this, LocaleController.getString(R.string.MediaTab), 1, new MediaAdapter(this, false, anonymousClass1), anonymousClass2);
        this.allPages[2] = new Page(this, LocaleController.getString(R.string.SharedFilesTab2), 2, new DocumentsAdapter(this, anonymousClass1), anonymousClass2);
        this.allPages[3] = new Page(this, LocaleController.getString(R.string.Music), 3, new MusicAdapter(this, anonymousClass1), anonymousClass2);
        int i = 0;
        while (true) {
            Page[] pageArr2 = this.allPages;
            if (i >= pageArr2.length) {
                ViewPagerFixed viewPagerFixed = new ViewPagerFixed(getContext());
                this.viewPagerFixed = viewPagerFixed;
                viewPagerFixed.setAllowDisallowInterceptTouch(false);
                addView(this.viewPagerFixed, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                ViewPagerFixed.TabsView tabsViewCreateTabsView = this.viewPagerFixed.createTabsView(true, 3);
                this.tabs = tabsViewCreateTabsView;
                addView(tabsViewCreateTabsView, LayoutHelper.createFrame(-1, 48.0f));
                View view = new View(getContext());
                this.divider = view;
                view.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
                addView(view, LayoutHelper.createFrame(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                this.viewPagerFixed.setAdapter(new AnonymousClass1(context, baseFragment));
                LinearLayout linearLayout = new LinearLayout(context);
                this.actionModeLayout = linearLayout;
                linearLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, LayoutHelper.createFrame(-1, 48.0f));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                this.closeButton = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                BackDrawable backDrawable = new BackDrawable(true);
                this.backDrawable = backDrawable;
                imageView.setImageDrawable(backDrawable);
                int i2 = Theme.key_actionBarActionModeDefaultIcon;
                backDrawable.color = Theme.getColor(null, i2, false);
                backDrawable.invalidateSelf();
                int i3 = Theme.key_actionBarActionModeDefaultSelector;
                imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i3, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.actionModeViews.add(imageView);
                final int i4 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final CachedMediaLayout f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$new$0(view2);
                                break;
                            default:
                                this.f$0.lambda$new$1(view2);
                                break;
                        }
                    }
                });
                AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
                this.selectedMessagesCountTextView = animatedTextView;
                animatedTextView.setTextSize(AndroidUtilities.dp(18.0f));
                animatedTextView.setTypeface(AndroidUtilities.bold());
                animatedTextView.setTextColor(Theme.getColor(null, i2, false));
                linearLayout.addView(animatedTextView, LayoutHelper.createLinear(0, -1, 1.0f, 18, 0, 0, 0));
                this.actionModeViews.add(animatedTextView);
                ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, Theme.getColor(null, i3, false), Theme.getColor(null, i2, false), false, null);
                this.clearItem = actionBarMenuItem;
                actionBarMenuItem.setIcon(R.drawable.msg_clear);
                actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.Delete));
                actionBarMenuItem.setDuplicateParentStateEnabled(false);
                linearLayout.addView(actionBarMenuItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.actionModeViews.add(actionBarMenuItem);
                final int i5 = 1;
                actionBarMenuItem.setOnClickListener(new View.OnClickListener(this) {
                    public final CachedMediaLayout f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i5) {
                            case 0:
                                this.f$0.lambda$new$0(view2);
                                break;
                            default:
                                this.f$0.lambda$new$1(view2);
                                break;
                        }
                    }
                });
                return;
            }
            Page page = pageArr2[i];
            if (page != null) {
                this.pages.add(i, page);
            }
            i++;
        }
    }

    public void checkMessageObjectForAudio(CacheModel.FileInfo fileInfo, int i) {
        if (fileInfo.messageObject == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(this.parentFragment.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = fileInfo.file.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = fileInfo.dialogId;
            String fileExtension = FileLoader.getFileExtension(fileInfo.file);
            TLRPC.Document document = tL_message.media.document;
            document.id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = fileInfo.size;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (fileInfo.metadata == null) {
                ConditionVariable conditionVariable = new ConditionVariable();
                fileInfo.metadata = conditionVariable;
                conditionVariable.isOpen = true;
                Utilities.globalQueue.postRunnable(new PhotoViewer$86$$ExternalSyntheticLambda0(this, fileInfo, tL_documentAttributeAudio, 25));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = fileInfo.file.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(this.parentFragment.getCurrentAccount(), tL_message, false, false);
            fileInfo.messageObject = messageObject;
            messageObject.mediaExists = true;
        }
    }

    public static boolean fileIsMedia(File file) {
        String lowerCase = file.getName().toLowerCase();
        return file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif");
    }

    public SharedPhotoVideoCell2 getCellForIndex(int i) {
        RecyclerListView listView = getListView();
        for (int i2 = 0; i2 < listView.getChildCount(); i2++) {
            View childAt = listView.getChildAt(i2);
            if (listView.getChildAdapterPosition(childAt) == i && (childAt instanceof SharedPhotoVideoCell2)) {
                return (SharedPhotoVideoCell2) childAt;
            }
        }
        return null;
    }

    public void lambda$checkMessageObjectForAudio$2(CacheModel.FileInfo fileInfo, TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio, String str, String str2) {
        ConditionVariable conditionVariable = fileInfo.metadata;
        conditionVariable.isOpen = false;
        tL_documentAttributeAudio.title = str;
        conditionVariable.getClass();
        tL_documentAttributeAudio.performer = str2;
        updateRow(fileInfo, 3);
    }

    public void lambda$checkMessageObjectForAudio$3(CacheModel.FileInfo fileInfo, TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio) throws Throwable {
        String str;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        String strExtractMetadata;
        String str2;
        String str3;
        String strExtractMetadata2 = "";
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        MediaMetadataRetriever mediaMetadataRetriever3 = null;
        try {
            try {
                MediaMetadataRetriever mediaMetadataRetriever4 = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever4.setDataSource(getContext(), Uri.fromFile(fileInfo.file));
                        strExtractMetadata = mediaMetadataRetriever4.extractMetadata(7);
                        try {
                            strExtractMetadata2 = mediaMetadataRetriever4.extractMetadata(2);
                            try {
                                mediaMetadataRetriever4.release();
                            } catch (Throwable unused) {
                            }
                            str2 = strExtractMetadata2;
                            str3 = strExtractMetadata;
                            mediaMetadataRetriever2 = strExtractMetadata;
                        } catch (Exception e) {
                            e = e;
                            str = strExtractMetadata;
                            mediaMetadataRetriever3 = mediaMetadataRetriever4;
                            FileLog.e(e);
                            if (mediaMetadataRetriever3 != null) {
                                try {
                                    mediaMetadataRetriever3.release();
                                } catch (Throwable unused2) {
                                    strExtractMetadata = str;
                                    str2 = strExtractMetadata2;
                                    str3 = strExtractMetadata;
                                    mediaMetadataRetriever2 = strExtractMetadata;
                                }
                            }
                            str2 = "";
                            str3 = str;
                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((Object) this, (Object) fileInfo, (Object) tL_documentAttributeAudio, str3, (Object) str2, 7));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        mediaMetadataRetriever = mediaMetadataRetriever4;
                        if (mediaMetadataRetriever == null) {
                            throw th;
                        }
                        try {
                            mediaMetadataRetriever.release();
                            throw th;
                        } catch (Throwable unused3) {
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    strExtractMetadata = "";
                }
            } catch (Throwable th3) {
                th = th3;
                mediaMetadataRetriever = mediaMetadataRetriever2;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
        }
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((Object) this, (Object) fileInfo, (Object) tL_documentAttributeAudio, str3, (Object) str2, 7));
    }

    public void lambda$new$0(View view) {
        this.delegate.clearSelection();
    }

    public void lambda$new$1(View view) {
        this.delegate.clear();
    }

    public void openItem(CacheModel.FileInfo fileInfo, CacheCell cacheCell) {
        RecyclerListView recyclerListView = (RecyclerListView) this.viewPagerFixed.getCurrentView();
        if (cacheCell.type == 2) {
            if (!(recyclerListView.getAdapter() instanceof DocumentsAdapter)) {
                return;
            }
            PhotoViewer.getInstance().setParentActivity(this.parentFragment);
            if (this.placeProvider == null) {
                this.placeProvider = new BasePlaceProvider(this, null);
            }
            this.placeProvider.setRecyclerListView(recyclerListView);
            boolean zFileIsMedia = fileIsMedia(fileInfo.file);
            File file = fileInfo.file;
            if (zFileIsMedia) {
                ArrayList<Object> arrayList = new ArrayList<>();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, fileInfo.type == 1, 0, 0, 0L));
                PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, -1, false, this.placeProvider, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, this.parentFragment.getParentActivity(), null, false);
            }
        }
        if (cacheCell.type == 3) {
            if (!MediaController.getInstance().isPlayingMessage(fileInfo.messageObject)) {
                MediaController.getInstance().playMessage(fileInfo.messageObject);
            } else if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(fileInfo.messageObject);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(fileInfo.messageObject);
            }
        }
    }

    public void openPhoto(ItemInner itemInner, MediaAdapter mediaAdapter, RecyclerListView recyclerListView, SharedPhotoVideoCell2 sharedPhotoVideoCell2) {
        PhotoViewer.getInstance().setParentActivity(this.parentFragment);
        if (this.placeProvider == null) {
            this.placeProvider = new BasePlaceProvider(this, null);
        }
        this.placeProvider.setRecyclerListView(recyclerListView);
        if (mediaAdapter.itemInners.indexOf(itemInner) >= 0) {
            PhotoViewer.getInstance().openPhotoForSelect(mediaAdapter.getPhotos(), mediaAdapter.itemInners.indexOf(itemInner), -1, false, this.placeProvider, null);
        }
    }

    private void updateRow(CacheModel.FileInfo fileInfo, int i) {
        for (int i2 = 0; i2 < this.viewPagerFixed.getViewPages().length; i2++) {
            RecyclerListView recyclerListView = (RecyclerListView) this.viewPagerFixed.getViewPages()[i2];
            if (recyclerListView != null && ((BaseAdapter) recyclerListView.getAdapter()).type == i) {
                BaseAdapter baseAdapter = (BaseAdapter) recyclerListView.getAdapter();
                for (int i3 = 0; i3 < baseAdapter.itemInners.size(); i3++) {
                    if (baseAdapter.itemInners.get(i3).file == fileInfo) {
                        baseAdapter.lambda$onBindViewHolder$31(i3);
                        break;
                    }
                }
            }
        }
    }

    public boolean actionModeIsVisible() {
        return false;
    }

    @Override
    public RecyclerListView getListView() {
        if (this.viewPagerFixed.getCurrentView() == null) {
            return null;
        }
        return (RecyclerListView) this.viewPagerFixed.getCurrentView();
    }

    @Override
    public boolean isAttached() {
        return true;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    public void setBottomPadding(int i) {
        this.bottomPadding = i;
        for (int i2 = 0; i2 < this.viewPagerFixed.getViewPages().length; i2++) {
            RecyclerListView recyclerListView = (RecyclerListView) this.viewPagerFixed.getViewPages()[i2];
            if (recyclerListView != null) {
                recyclerListView.setPadding(0, 0, 0, i);
            }
        }
    }

    public void setCacheModel(CacheModel cacheModel) {
        this.cacheModel = cacheModel;
        update();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void showActionMode(boolean z) {
    }

    public void update() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.pages);
        this.pages.clear();
        if (this.cacheModel != null) {
            int i = 0;
            while (true) {
                Page[] pageArr = this.allPages;
                if (i >= pageArr.length) {
                    break;
                }
                Page page = pageArr[i];
                if (page != null) {
                    if (page.type == 0 && !this.cacheModel.entities.isEmpty()) {
                        this.pages.add(this.allPages[i]);
                    } else if (this.allPages[i].type == 1 && !this.cacheModel.media.isEmpty()) {
                        this.pages.add(this.allPages[i]);
                    } else if (this.allPages[i].type == 2 && !this.cacheModel.documents.isEmpty()) {
                        this.pages.add(this.allPages[i]);
                    } else if (this.allPages[i].type == 3 && !this.cacheModel.music.isEmpty()) {
                        this.pages.add(this.allPages[i]);
                    } else if (this.allPages[i].type == 5 && !this.cacheModel.voice.isEmpty()) {
                        this.pages.add(this.allPages[i]);
                    } else if (this.allPages[i].type == 4 && !this.cacheModel.stories.isEmpty()) {
                        this.pages.add(this.allPages[i]);
                    }
                }
                i++;
            }
        }
        if (this.pages.size() == 1 && this.cacheModel.isDialog) {
            this.tabs.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.viewPagerFixed.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.divider.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() != this.pages.size()) {
            this.viewPagerFixed.rebuild(true);
            break;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((Page) arrayList.get(i2)).type != this.pages.get(i2).type) {
                this.viewPagerFixed.rebuild(true);
                break;
            }
        }
        for (int i3 = 0; i3 < this.pages.size(); i3++) {
            if (this.pages.get(i3).adapter != null) {
                this.pages.get(i3).adapter.update();
            }
        }
    }

    public void updateVisibleRows() {
        for (int i = 0; i < this.viewPagerFixed.getViewPages().length; i++) {
            AndroidUtilities.updateVisibleRows((RecyclerListView) this.viewPagerFixed.getViewPages()[i]);
        }
    }

    public class ItemInner extends AdapterWithDiffUtils.Item {
        CacheControlActivity.DialogFileEntities entities;
        CacheModel.FileInfo file;

        public ItemInner(int i, CacheControlActivity.DialogFileEntities dialogFileEntities) {
            super(i, true);
            this.entities = dialogFileEntities;
        }

        public boolean equals(Object obj) {
            CacheModel.FileInfo fileInfo;
            CacheModel.FileInfo fileInfo2;
            CacheControlActivity.DialogFileEntities dialogFileEntities;
            CacheControlActivity.DialogFileEntities dialogFileEntities2;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ItemInner itemInner = (ItemInner) obj;
                int i = this.viewType;
                if (i == itemInner.viewType) {
                    if (i == 1 && (dialogFileEntities = this.entities) != null && (dialogFileEntities2 = itemInner.entities) != null) {
                        return dialogFileEntities.dialogId == dialogFileEntities2.dialogId;
                    }
                    if (i == 2 && (fileInfo = this.file) != null && (fileInfo2 = itemInner.file) != null) {
                        return Objects.equals(fileInfo.file, fileInfo2.file);
                    }
                }
            }
            return false;
        }

        public ItemInner(int i, CacheModel.FileInfo fileInfo) {
            super(i, true);
            this.file = fileInfo;
        }
    }

    public interface Delegate {
        void clear();

        void clearSelection();

        void dismiss();

        void onItemSelected(CacheControlActivity.DialogFileEntities dialogFileEntities, CacheModel.FileInfo fileInfo, boolean z);

        public abstract class CC {
            public static void $default$dismiss(Delegate delegate) {
            }
        }
    }
}
