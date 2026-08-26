package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
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
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
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
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Storage.CacheModel;

public abstract class CachedMediaLayout extends FrameLayout implements NestedSizeNotifierLayout.ChildLayout {
    public final ArrayList actionModeViews;
    public final Page[] allPages;
    public int bottomPadding;
    public CacheModel cacheModel;
    public Delegate delegate;
    public final View divider;
    public final ArrayList pages;
    public final BaseFragment parentFragment;
    public BasePlaceProvider placeProvider;
    public final ViewPagerFixed.AnonymousClass3 tabs;
    public final ViewPagerFixed viewPagerFixed;

    public final class AnonymousClass1 extends ViewPagerFixed.Adapter {
        public ActionBarPopupWindow popupWindow;
        public final Context val$context;
        public final BaseFragment val$parentFragment;

        public AnonymousClass1(Context context, BaseFragment baseFragment) {
            this.val$context = context;
            this.val$parentFragment = baseFragment;
        }

        @Override
        public final void bindView(View view, int i, int i2) {
            RecyclerListView recyclerListView = (RecyclerListView) view;
            CachedMediaLayout cachedMediaLayout = CachedMediaLayout.this;
            recyclerListView.setAdapter(((Page) cachedMediaLayout.pages.get(i)).adapter);
            ArrayList arrayList = cachedMediaLayout.pages;
            if (((Page) arrayList.get(i)).type == 1 || ((Page) arrayList.get(i)).type == 4) {
                view.getContext();
                recyclerListView.setLayoutManager(new GridLayoutManager(3));
            } else {
                view.getContext();
                recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
            }
            recyclerListView.setTag(Integer.valueOf(((Page) arrayList.get(i)).type));
        }

        @Override
        public final View createView(int i) {
            final RecyclerListView recyclerListView = new RecyclerListView(this.val$context, null);
            DefaultItemAnimator defaultItemAnimator = (DefaultItemAnimator) recyclerListView.getItemAnimator();
            defaultItemAnimator.delayAnimations = false;
            defaultItemAnimator.mSupportsChangeAnimations = false;
            recyclerListView.setClipToPadding(false);
            recyclerListView.setPadding(0, 0, 0, CachedMediaLayout.this.bottomPadding);
            recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(int i2, View view) {
                    RecyclerListView recyclerListView2 = recyclerListView;
                    BaseAdapter baseAdapter = (BaseAdapter) recyclerListView2.getAdapter();
                    ItemInner itemInner = (ItemInner) baseAdapter.itemInners.get(i2);
                    boolean z = view instanceof SharedPhotoVideoCell2;
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (z) {
                        CachedMediaLayout.access$600(CachedMediaLayout.this, itemInner, (MediaAdapter) baseAdapter, recyclerListView2);
                    } else {
                        Delegate delegate = CachedMediaLayout.this.delegate;
                        if (delegate != null) {
                            delegate.onItemSelected(itemInner.entities, itemInner.file, false);
                        }
                    }
                }
            });
            recyclerListView.setOnItemLongClickListener(new ChatActivity$$ExternalSyntheticLambda248(this, recyclerListView, this.val$parentFragment, 9));
            return recyclerListView;
        }

        @Override
        public final int getItemCount() {
            return CachedMediaLayout.this.pages.size();
        }

        @Override
        public final int getItemId(int i) {
            return ((Page) CachedMediaLayout.this.pages.get(i)).type;
        }

        @Override
        public final CharSequence getItemTitle(int i) {
            return ((Page) CachedMediaLayout.this.pages.get(i)).title;
        }
    }

    public abstract class BaseAdapter extends AdapterWithDiffUtils {
        public final ArrayList itemInners = new ArrayList();
        public final int type;

        public BaseAdapter(int i) {
            this.type = i;
        }

        @Override
        public final int getItemCount() {
            return this.itemInners.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((ItemInner) this.itemInners.get(i)).viewType;
        }

        public abstract void update();
    }

    public abstract class BaseFilesAdapter extends BaseAdapter {
        public final ArrayList oldItems;

        public BaseFilesAdapter(int i) {
            super(i);
            this.oldItems = new ArrayList();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return !(this instanceof MediaAdapter);
        }

        @Override
        public void update() {
            ArrayList arrayList;
            ArrayList arrayList2 = this.oldItems;
            arrayList2.clear();
            ArrayList arrayList3 = this.itemInners;
            arrayList2.addAll(arrayList3);
            arrayList3.clear();
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
                        arrayList3.add(new ItemInner((CacheModel.FileInfo) arrayList.get(i2)));
                    }
                }
            }
            setItems(arrayList2, arrayList3);
        }
    }

    public final class BasePlaceProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        public RecyclerListView recyclerListView;

        public BasePlaceProvider() {
        }

        @Override
        public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            SharedPhotoVideoCell2 sharedPhotoVideoCell2;
            RecyclerListView listView = CachedMediaLayout.this.getListView();
            int i2 = 0;
            while (true) {
                if (i2 >= listView.getChildCount()) {
                    sharedPhotoVideoCell2 = null;
                    break;
                }
                View childAt = listView.getChildAt(i2);
                if (RecyclerView.getChildAdapterPosition(childAt) == i && (childAt instanceof SharedPhotoVideoCell2)) {
                    sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                    break;
                }
                i2++;
            }
            if (sharedPhotoVideoCell2 == null) {
                return null;
            }
            int[] iArr = new int[2];
            sharedPhotoVideoCell2.getLocationInWindow(iArr);
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = this.recyclerListView;
            ImageReceiver imageReceiver = sharedPhotoVideoCell2.imageReceiver;
            placeProviderObject.imageReceiver = imageReceiver;
            placeProviderObject.thumb = imageReceiver.getBitmapSafe();
            placeProviderObject.scale = sharedPhotoVideoCell2.getScaleX();
            return placeProviderObject;
        }
    }

    public interface Delegate {
        void clear();

        void clearSelection();

        void dismiss();

        void onItemSelected(CacheControlActivity.DialogFileEntities dialogFileEntities, CacheModel.FileInfo fileInfo, boolean z);
    }

    public final class DialogsAdapter extends BaseAdapter {
        public final ArrayList old;

        public DialogsAdapter() {
            super(0);
            this.old = new ArrayList();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String dialogPhotoTitle;
            if (viewHolder.mItemViewType != 1) {
                return;
            }
            CacheControlActivity.UserCell userCell = (CacheControlActivity.UserCell) viewHolder.itemView;
            ArrayList arrayList = this.itemInners;
            CacheControlActivity.DialogFileEntities dialogFileEntities = ((ItemInner) arrayList.get(i)).entities;
            CachedMediaLayout cachedMediaLayout = CachedMediaLayout.this;
            TLObject userOrChat = cachedMediaLayout.parentFragment.getMessagesController().getUserOrChat(dialogFileEntities.dialogId);
            CacheControlActivity.DialogFileEntities dialogFileEntities2 = userCell.dialogFileEntities;
            boolean z = dialogFileEntities2 != null && dialogFileEntities2.dialogId == dialogFileEntities.dialogId;
            if (dialogFileEntities.dialogId == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                userCell.getImageView().getAvatarDrawable().setAvatarType(14);
                BackupImageView imageView = userCell.getImageView();
                imageView.imageReceiver.setForUserOrChat(null, userCell.getImageView().getAvatarDrawable());
                imageView.onNewImageSet();
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(userCell.getImageView(), userOrChat);
            }
            userCell.dialogFileEntities = dialogFileEntities;
            userCell.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
            String fileSize = AndroidUtilities.formatFileSize(dialogFileEntities.totalSize);
            boolean z2 = i < arrayList.size() - 1;
            TextView textView = userCell.textView;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            AnimatedTextView animatedTextView = userCell.valueTextView;
            if (fileSize != null) {
                animatedTextView.setText(fileSize, false, true);
                animatedTextView.setVisibility(0);
            } else {
                animatedTextView.setVisibility(4);
            }
            userCell.needDivider = z2;
            userCell.setWillNotDraw(!z2);
            userCell.requestLayout();
            boolean zContains = cachedMediaLayout.cacheModel.selectedDialogs.contains(Long.valueOf(dialogFileEntities.dialogId));
            CheckBox2 checkBox2 = userCell.checkBox;
            if (checkBox2 != null || zContains) {
                if (checkBox2 == null) {
                    CheckBox2 checkBox3 = new CheckBox2(userCell.getContext(), 21, userCell.resourcesProvider);
                    userCell.checkBox = checkBox3;
                    checkBox3.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                    userCell.checkBox.setDrawUnchecked(false);
                    userCell.checkBox.setDrawBackgroundAsArc(3);
                    userCell.addView(userCell.checkBox, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
                }
                userCell.checkBox.checkBoxBase.setChecked(-1, zContains, z);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            CacheControlActivity.UserCell userCell = null;
            if (i == 1) {
                CacheControlActivity.UserCell userCell2 = new CacheControlActivity.UserCell(CachedMediaLayout.this.getContext(), null);
                userCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                userCell = userCell2;
            }
            return new RecyclerListView.Holder(userCell);
        }

        @Override
        public final void update() {
            ArrayList arrayList = this.old;
            arrayList.clear();
            ArrayList arrayList2 = this.itemInners;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            CachedMediaLayout cachedMediaLayout = CachedMediaLayout.this;
            if (cachedMediaLayout.cacheModel != null) {
                for (int i = 0; i < cachedMediaLayout.cacheModel.entities.size(); i++) {
                    arrayList2.add(new ItemInner((CacheControlActivity.DialogFileEntities) cachedMediaLayout.cacheModel.entities.get(i)));
                }
            }
            setItems(arrayList, arrayList2);
        }
    }

    public final class DocumentsAdapter extends BaseFilesAdapter {
        public final ArrayList photoEntries;

        public DocumentsAdapter() {
            super(2);
            this.photoEntries = new ArrayList();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            View view = viewHolder.itemView;
            MusicAdapter.AnonymousClass1 anonymousClass1 = (MusicAdapter.AnonymousClass1) view;
            SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) anonymousClass1.container.getChildAt(0);
            ArrayList arrayList = this.itemInners;
            CacheModel.FileInfo fileInfo = ((ItemInner) arrayList.get(i)).file;
            boolean z = fileInfo == view.getTag();
            boolean z2 = i != arrayList.size() - 1;
            view.setTag(fileInfo);
            long jLastModified = fileInfo.file.lastModified();
            int i2 = fileInfo.messageType;
            File file = fileInfo.file;
            sharedDocumentCell.setTextAndValueAndTypeAndThumb(z2, i2 == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), 0, LocaleController.formatDateAudio(jLastModified / 1000, true), Utilities.getExtension(file.getName()), null);
            if (!z) {
                sharedDocumentCell.setPhoto(file.getPath());
            }
            sharedDocumentCell.getImageView().setRoundRadius(AndroidUtilities.dp(fileInfo.messageType == 5 ? 20.0f : 4.0f));
            anonymousClass1.drawDivider = z2;
            anonymousClass1.sizeTextView.setText(AndroidUtilities.formatFileSize(fileInfo.size));
            anonymousClass1.checkBox.checkBoxBase.setChecked(-1, CachedMediaLayout.this.cacheModel.selectedFiles.contains(fileInfo), z);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            MusicAdapter.AnonymousClass1 anonymousClass1 = new MusicAdapter.AnonymousClass1(this, viewGroup.getContext(), 1);
            anonymousClass1.type = 2;
            anonymousClass1.container.addView(new SharedDocumentCell(viewGroup.getContext(), 3, null));
            return new RecyclerListView.Holder(anonymousClass1);
        }

        @Override
        public final void update() {
            super.update();
            ArrayList arrayList = this.photoEntries;
            arrayList.clear();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.itemInners;
                if (i >= arrayList2.size()) {
                    return;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((ItemInner) arrayList2.get(i)).file.file.getPath(), 0, ((ItemInner) arrayList2.get(i)).file.type == 1, 0, 0, 0L));
                i++;
            }
        }
    }

    public final class MediaAdapter extends BaseFilesAdapter {
        public final ArrayList photoEntries;
        public SharedPhotoVideoCell2.SharedResources sharedResources;
        public CombinedDrawable thumb;

        public MediaAdapter() {
            super(1);
            this.photoEntries = new ArrayList();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (this.thumb == null) {
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_chat_attachPhotoBackground, false)), Theme.chat_attachEmptyDrawable);
                this.thumb = combinedDrawable;
                combinedDrawable.fullSize = true;
            }
            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) viewHolder.itemView;
            CacheModel.FileInfo fileInfo = ((ItemInner) this.itemInners.get(i)).file;
            boolean z = fileInfo == sharedPhotoVideoCell2.getTag();
            sharedPhotoVideoCell2.setTag(fileInfo);
            int iMax = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
            int i2 = fileInfo.type;
            ImageReceiver imageReceiver = sharedPhotoVideoCell2.imageReceiver;
            File file = fileInfo.file;
            if (i2 == 1) {
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), DiffUtil.m(iMax, iMax, "_"), this.thumb, null, null, 0);
                sharedPhotoVideoCell2.setVideoText(AndroidUtilities.formatFileSize(fileInfo.size), true);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), DiffUtil.m(iMax, iMax, "_"), this.thumb, null, null, 0);
                sharedPhotoVideoCell2.setVideoText(AndroidUtilities.formatFileSize(fileInfo.size), false);
            }
            sharedPhotoVideoCell2.setChecked(CachedMediaLayout.this.cacheModel.selectedFiles.contains(fileInfo), z);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (this.sharedResources == null) {
                this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext(), null);
            }
            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(viewGroup.getContext(), this.sharedResources, CachedMediaLayout.this.parentFragment.getCurrentAccount()) {
                @Override
                public final void onCheckBoxPressed() {
                    CachedMediaLayout.this.delegate.onItemSelected(null, (CacheModel.FileInfo) getTag(), true);
                }
            };
            sharedPhotoVideoCell2.setStyle(1);
            return new RecyclerListView.Holder(sharedPhotoVideoCell2);
        }

        @Override
        public final void update() {
            super.update();
            ArrayList arrayList = this.photoEntries;
            arrayList.clear();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.itemInners;
                if (i >= arrayList2.size()) {
                    return;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((ItemInner) arrayList2.get(i)).file.file.getPath(), 0, ((ItemInner) arrayList2.get(i)).file.type == 1, 0, 0, 0L));
                i++;
            }
        }
    }

    public final class MusicAdapter extends BaseFilesAdapter {

        public final class AnonymousClass1 extends FrameLayout {
            public final int $r8$classId;
            public final CheckBox2 checkBox;
            public final FrameLayout container;
            public boolean drawDivider;
            public final TextView sizeTextView;
            public final BaseFilesAdapter this$1;
            public int type;

            public AnonymousClass1(BaseFilesAdapter baseFilesAdapter, Context context, int i) {
                super(context);
                this.$r8$classId = i;
                this.this$1 = baseFilesAdapter;
                CheckBox2 checkBox2 = new CheckBox2(context, 21);
                this.checkBox = checkBox2;
                checkBox2.setDrawBackgroundAsArc(14);
                checkBox2.checkBoxBase.setColor(Theme.key_checkbox, Theme.key_radioBackground, Theme.key_checkboxCheck);
                View view = new View(getContext());
                view.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 15));
                FrameLayout frameLayout = new FrameLayout(context);
                this.container = frameLayout;
                TextView textView = new TextView(context);
                this.sizeTextView = textView;
                textView.setTextSize(1, 16.0f);
                textView.setGravity(5);
                textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false));
                if (LocaleController.isRTL) {
                    addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
                    addView(view, LayoutHelper.createFrame(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
                    addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
                    addView(textView, LayoutHelper.createFrame(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    return;
                }
                addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                addView(view, LayoutHelper.createFrame(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
                addView(textView, LayoutHelper.createFrame(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (this.drawDivider) {
                    if (LocaleController.isRTL) {
                        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, Theme.dividerPaint);
                    } else {
                        canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
                    }
                }
            }
        }

        public MusicAdapter() {
            super(3);
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) viewHolder.itemView;
            SharedAudioCell sharedAudioCell = (SharedAudioCell) anonymousClass1.container.getChildAt(0);
            CacheModel.FileInfo fileInfo = ((ItemInner) this.itemInners.get(i)).file;
            boolean z = fileInfo == anonymousClass1.getTag();
            boolean z2 = i != this.itemInners.size() - 1;
            anonymousClass1.setTag(fileInfo);
            CachedMediaLayout cachedMediaLayout = CachedMediaLayout.this;
            cachedMediaLayout.getClass();
            if (fileInfo.messageObject == null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = i;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(cachedMediaLayout.parentFragment.getCurrentAccount()).getClientUserId();
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
                    Utilities.globalQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda102(cachedMediaLayout, fileInfo, tL_documentAttributeAudio, 1));
                }
                tL_documentAttributeAudio.flags |= 3;
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                tL_documentAttributeFilename.file_name = fileInfo.file.getName();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                MessageObject messageObject = new MessageObject(cachedMediaLayout.parentFragment.getCurrentAccount(), tL_message, false, false);
                fileInfo.messageObject = messageObject;
                messageObject.mediaExists = true;
            }
            sharedAudioCell.setMessageObject(fileInfo.messageObject, z2);
            boolean z3 = fileInfo.metadata.isOpen;
            boolean z4 = !z3;
            if (!z) {
                sharedAudioCell.showNameProgress = !z3 ? 1.0f : 0.0f;
            }
            if (sharedAudioCell.showName != z4) {
                sharedAudioCell.showName = z4;
                sharedAudioCell.invalidate();
            }
            anonymousClass1.drawDivider = z2;
            anonymousClass1.sizeTextView.setText(AndroidUtilities.formatFileSize(fileInfo.size));
            anonymousClass1.checkBox.checkBoxBase.setChecked(-1, CachedMediaLayout.this.cacheModel.selectedFiles.contains(fileInfo), z);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, viewGroup.getContext(), 0);
            anonymousClass1.type = 3;
            SharedAudioCell sharedAudioCell = new SharedAudioCell(viewGroup.getContext()) {
                @Override
                public final void didPressedButton() {
                    CachedMediaLayout cachedMediaLayout = CachedMediaLayout.this;
                    AnonymousClass1 anonymousClass2 = anonymousClass1;
                    CachedMediaLayout.access$700(cachedMediaLayout, (CacheModel.FileInfo) anonymousClass2.getTag(), anonymousClass2);
                }
            };
            sharedAudioCell.setCheckForButtonPress(true);
            anonymousClass1.container.addView(sharedAudioCell);
            return new RecyclerListView.Holder(anonymousClass1);
        }
    }

    public final class Page {
        public final BaseAdapter adapter;
        public final String title;
        public final int type;

        public Page(String str, int i, BaseAdapter baseAdapter) {
            this.title = str;
            this.type = i;
            this.adapter = baseAdapter;
        }
    }

    public CachedMediaLayout(Context context, BaseFragment baseFragment) {
        super(context);
        this.actionModeViews = new ArrayList();
        this.pages = new ArrayList();
        Page[] pageArr = new Page[5];
        this.allPages = pageArr;
        this.parentFragment = baseFragment;
        pageArr[0] = new Page(LocaleController.getString(R.string.FilterChats), 0, new DialogsAdapter());
        pageArr[1] = new Page(LocaleController.getString(R.string.MediaTab), 1, new MediaAdapter());
        pageArr[2] = new Page(LocaleController.getString(R.string.SharedFilesTab2), 2, new DocumentsAdapter());
        pageArr[3] = new Page(LocaleController.getString(R.string.Music), 3, new MusicAdapter());
        int i = 0;
        while (true) {
            Page[] pageArr2 = this.allPages;
            if (i >= pageArr2.length) {
                ViewPagerFixed viewPagerFixed = new ViewPagerFixed(getContext(), null);
                this.viewPagerFixed = viewPagerFixed;
                viewPagerFixed.setAllowDisallowInterceptTouch(false);
                addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                ViewPagerFixed.AnonymousClass3 anonymousClass3CreateTabsView = viewPagerFixed.createTabsView(3, true);
                this.tabs = anonymousClass3CreateTabsView;
                addView(anonymousClass3CreateTabsView, LayoutHelper.createFrame(48.0f, -1));
                View view = new View(getContext());
                this.divider = view;
                view.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
                addView(view, LayoutHelper.createFrame(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                viewPagerFixed.setAdapter(new AnonymousClass1(context, baseFragment));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, LayoutHelper.createFrame(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                BackDrawable backDrawable = new BackDrawable(true);
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
                                this.f$0.delegate.clearSelection();
                                break;
                            default:
                                this.f$0.delegate.clear();
                                break;
                        }
                    }
                });
                AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
                animatedTextView.setTextSize(AndroidUtilities.dp(18.0f));
                animatedTextView.setTypeface(AndroidUtilities.bold());
                animatedTextView.setTextColor(Theme.getColor(null, i2, false));
                linearLayout.addView(animatedTextView, LayoutHelper.createLinear(1.0f, 0, -1, 18, 0, 0));
                this.actionModeViews.add(animatedTextView);
                ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, Theme.getColor(null, i3, false), Theme.getColor(null, i2, false), false, null);
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
                                this.f$0.delegate.clearSelection();
                                break;
                            default:
                                this.f$0.delegate.clear();
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

    public static void access$600(CachedMediaLayout cachedMediaLayout, ItemInner itemInner, MediaAdapter mediaAdapter, RecyclerListView recyclerListView) {
        PhotoViewer.getInstance().setParentActivity(null, cachedMediaLayout.parentFragment, null);
        if (cachedMediaLayout.placeProvider == null) {
            cachedMediaLayout.placeProvider = cachedMediaLayout.new BasePlaceProvider();
        }
        cachedMediaLayout.placeProvider.recyclerListView = recyclerListView;
        ArrayList arrayList = mediaAdapter.itemInners;
        if (arrayList.indexOf(itemInner) >= 0) {
            PhotoViewer.getInstance().openPhotoForSelect(mediaAdapter.photoEntries, arrayList.indexOf(itemInner), -1, false, cachedMediaLayout.placeProvider, null);
        }
    }

    public static void access$700(CachedMediaLayout cachedMediaLayout, CacheModel.FileInfo fileInfo, MusicAdapter.AnonymousClass1 anonymousClass1) {
        RecyclerListView recyclerListView = (RecyclerListView) cachedMediaLayout.viewPagerFixed.getCurrentView();
        if (anonymousClass1.type == 2) {
            if (!(recyclerListView.getAdapter() instanceof DocumentsAdapter)) {
                return;
            }
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            BaseFragment baseFragment = cachedMediaLayout.parentFragment;
            photoViewer.setParentActivity(null, baseFragment, null);
            if (cachedMediaLayout.placeProvider == null) {
                cachedMediaLayout.placeProvider = cachedMediaLayout.new BasePlaceProvider();
            }
            cachedMediaLayout.placeProvider.recyclerListView = recyclerListView;
            File file = fileInfo.file;
            String lowerCase = file.getName().toLowerCase();
            boolean zEndsWith = file.getName().endsWith("mp4");
            File file2 = fileInfo.file;
            if (zEndsWith || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, fileInfo.type == 1, 0, 0, 0L));
                PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, -1, false, cachedMediaLayout.placeProvider, null);
            } else {
                AndroidUtilities.openForView(file2, file2.getName(), null, baseFragment.getParentActivity(), null, false);
            }
        }
        if (anonymousClass1.type == 3) {
            if (!MediaController.getInstance().isPlayingMessage(fileInfo.messageObject)) {
                MediaController.getInstance().playMessage(fileInfo.messageObject);
            } else if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(fileInfo.messageObject);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(fileInfo.messageObject);
            }
        }
    }

    public RecyclerListView getListView() {
        ViewPagerFixed viewPagerFixed = this.viewPagerFixed;
        if (viewPagerFixed.getCurrentView() == null) {
            return null;
        }
        return (RecyclerListView) viewPagerFixed.getCurrentView();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    public void setBottomPadding(int i) {
        this.bottomPadding = i;
        int i2 = 0;
        while (true) {
            ViewPagerFixed viewPagerFixed = this.viewPagerFixed;
            if (i2 >= viewPagerFixed.getViewPages().length) {
                return;
            }
            RecyclerListView recyclerListView = (RecyclerListView) viewPagerFixed.getViewPages()[i2];
            if (recyclerListView != null) {
                recyclerListView.setPadding(0, 0, 0, i);
            }
            i2++;
        }
    }

    public void setCacheModel(CacheModel cacheModel) {
        this.cacheModel = cacheModel;
        update();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public final void update() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.pages;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
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
                        arrayList2.add(pageArr[i]);
                    } else if (pageArr[i].type == 1 && !this.cacheModel.media.isEmpty()) {
                        arrayList2.add(pageArr[i]);
                    } else if (pageArr[i].type == 2 && !this.cacheModel.documents.isEmpty()) {
                        arrayList2.add(pageArr[i]);
                    } else if (pageArr[i].type == 3 && !this.cacheModel.music.isEmpty()) {
                        arrayList2.add(pageArr[i]);
                    } else if (pageArr[i].type == 5 && !this.cacheModel.voice.isEmpty()) {
                        arrayList2.add(pageArr[i]);
                    } else if (pageArr[i].type == 4 && !this.cacheModel.stories.isEmpty()) {
                        arrayList2.add(pageArr[i]);
                    }
                }
                i++;
            }
        }
        int size = arrayList2.size();
        ViewPagerFixed viewPagerFixed = this.viewPagerFixed;
        if (size == 1 && this.cacheModel.isDialog) {
            this.tabs.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) viewPagerFixed.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.divider.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() != arrayList2.size()) {
            viewPagerFixed.rebuild(true);
            break;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((Page) arrayList.get(i2)).type != ((Page) arrayList2.get(i2)).type) {
                viewPagerFixed.rebuild(true);
                break;
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            BaseAdapter baseAdapter = ((Page) arrayList2.get(i3)).adapter;
            ((Page) arrayList2.get(i3)).adapter.update();
        }
    }

    public final void updateVisibleRows() {
        int i = 0;
        while (true) {
            ViewPagerFixed viewPagerFixed = this.viewPagerFixed;
            if (i >= viewPagerFixed.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((RecyclerListView) viewPagerFixed.getViewPages()[i]);
            i++;
        }
    }

    public final class ItemInner extends AdapterWithDiffUtils.Item {
        public final CacheControlActivity.DialogFileEntities entities;
        public final CacheModel.FileInfo file;

        public ItemInner(CacheControlActivity.DialogFileEntities dialogFileEntities) {
            super(1, true);
            this.entities = dialogFileEntities;
        }

        public final boolean equals(Object obj) {
            CacheModel.FileInfo fileInfo;
            CacheModel.FileInfo fileInfo2;
            CacheControlActivity.DialogFileEntities dialogFileEntities;
            CacheControlActivity.DialogFileEntities dialogFileEntities2;
            if (this == obj) {
                return true;
            }
            if (obj != null && ItemInner.class == obj.getClass()) {
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

        public ItemInner(CacheModel.FileInfo fileInfo) {
            super(2, true);
            this.file = fileInfo;
        }
    }
}
