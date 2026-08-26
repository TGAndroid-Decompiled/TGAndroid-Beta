package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.PhotoPickerAlbumsCell;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.iv.RichEditor;

public final class PhotoAlbumPickerActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList albumsSorted;
    public final boolean allowCaption;
    public final boolean allowGifs;
    public boolean allowOrder;
    public boolean allowSearchImages;
    public Editable caption;
    public final ChatActivity chatActivity;
    public int columnsCount;
    public EditTextEmoji commentTextView;
    public PhotoAlbumPickerActivityDelegate delegate;
    public TextView emptyView;
    public FrameLayout frameLayout2;
    public ActionBarMenuSubItem[] itemCells;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public boolean loading;
    public int maxSelectedPhotos;
    public final Paint paint;
    public FrameLayout progressView;
    public final RectF rect;
    public final int selectPhotoType;
    public QrActivity.AnonymousClass2 selectedCountView;
    public final HashMap selectedPhotos;
    public final ArrayList selectedPhotosOrder;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout sendPopupLayout;
    public ActionBarPopupWindow sendPopupWindow;
    public boolean sendPressed;
    public View shadow;
    public AnonymousClass2 sizeNotifierFrameLayout;
    public final TextPaint textPaint;
    public ImageView writeButton;
    public LoginActivity.AnonymousClass4 writeButtonContainer;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            PhotoAlbumPickerActivity photoAlbumPickerActivity = PhotoAlbumPickerActivity.this;
            ArrayList arrayList = photoAlbumPickerActivity.albumsSorted;
            if (arrayList != null) {
                return (int) Math.ceil(arrayList.size() / photoAlbumPickerActivity.columnsCount);
            }
            return 0;
        }

        @Override
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            PhotoPickerAlbumsCell photoPickerAlbumsCell = (PhotoPickerAlbumsCell) viewHolder.itemView;
            PhotoAlbumPickerActivity photoAlbumPickerActivity = PhotoAlbumPickerActivity.this;
            photoPickerAlbumsCell.setAlbumsCount(photoAlbumPickerActivity.columnsCount);
            int i2 = 0;
            while (true) {
                int i3 = photoAlbumPickerActivity.columnsCount;
                if (i2 >= i3) {
                    photoPickerAlbumsCell.requestLayout();
                    return;
                }
                int i4 = (i3 * i) + i2;
                if (i4 < photoAlbumPickerActivity.albumsSorted.size()) {
                    photoPickerAlbumsCell.setAlbum(i2, (MediaController.AlbumEntry) photoAlbumPickerActivity.albumsSorted.get(i4));
                } else {
                    photoPickerAlbumsCell.setAlbum(i2, null);
                }
                i2++;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            PhotoPickerAlbumsCell photoPickerAlbumsCell = new PhotoPickerAlbumsCell(this.mContext);
            photoPickerAlbumsCell.setDelegate(new PhotoViewer$$ExternalSyntheticLambda115(this, 18));
            return new RecyclerListView.Holder(photoPickerAlbumsCell);
        }
    }

    public interface PhotoAlbumPickerActivityDelegate {
        void didSelectPhotos(ArrayList arrayList);

        void startPhotoSelectActivity();
    }

    public PhotoAlbumPickerActivity(int i, boolean z, boolean z2, ChatActivity chatActivity) {
        super(null);
        this.selectedPhotos = new HashMap();
        this.selectedPhotosOrder = new ArrayList();
        this.albumsSorted = null;
        this.loading = false;
        this.columnsCount = 2;
        this.allowSearchImages = true;
        this.allowOrder = true;
        this.textPaint = new TextPaint(1);
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.chatActivity = chatActivity;
        this.selectPhotoType = i;
        this.allowGifs = z;
        this.allowCaption = z2;
    }

    public static void access$100(PhotoAlbumPickerActivity photoAlbumPickerActivity, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            PhotoPickerActivity photoPickerActivity = new PhotoPickerActivity(0, albumEntry, photoAlbumPickerActivity.selectedPhotos, photoAlbumPickerActivity.selectedPhotosOrder, photoAlbumPickerActivity.selectPhotoType, photoAlbumPickerActivity.allowCaption, photoAlbumPickerActivity.chatActivity, false);
            Editable text = photoAlbumPickerActivity.commentTextView.getText();
            photoAlbumPickerActivity.caption = text;
            photoPickerActivity.caption = text;
            EditTextEmoji editTextEmoji = photoPickerActivity.commentTextView;
            if (editTextEmoji != null) {
                editTextEmoji.setText(text);
            }
            photoPickerActivity.delegate = new PhotoPickerActivity.PhotoPickerActivityDelegate() {
                @Override
                public final void actionButtonPressed(int i, boolean z, boolean z2) {
                    PhotoAlbumPickerActivity photoAlbumPickerActivity2 = PhotoAlbumPickerActivity.this;
                    photoAlbumPickerActivity2.removeSelfFromStack();
                    if (z) {
                        return;
                    }
                    photoAlbumPickerActivity2.sendSelectedPhotos(photoAlbumPickerActivity2.selectedPhotosOrder, photoAlbumPickerActivity2.selectedPhotos);
                }

                @Override
                public final boolean canFinishFragment() {
                    return true;
                }

                @Override
                public final void onCaptionChanged(Editable editable) {
                    PhotoAlbumPickerActivity photoAlbumPickerActivity2 = PhotoAlbumPickerActivity.this;
                    EditTextEmoji editTextEmoji2 = photoAlbumPickerActivity2.commentTextView;
                    photoAlbumPickerActivity2.caption = editable;
                    editTextEmoji2.setText(editable);
                }

                @Override
                public final void onOpenInPressed() {
                }

                @Override
                public final void selectedPhotosChanged() {
                    PhotoAlbumPickerActivity photoAlbumPickerActivity2 = PhotoAlbumPickerActivity.this;
                    if (photoAlbumPickerActivity2.selectedPhotos.size() != 0) {
                        photoAlbumPickerActivity2.selectedCountView.invalidate();
                        photoAlbumPickerActivity2.showCommentTextView$1(true);
                    } else {
                        photoAlbumPickerActivity2.selectedCountView.setPivotX(0.0f);
                        photoAlbumPickerActivity2.selectedCountView.setPivotY(0.0f);
                        photoAlbumPickerActivity2.showCommentTextView$1(false);
                    }
                }
            };
            photoPickerActivity.setMaxSelectedPhotos(photoAlbumPickerActivity.maxSelectedPhotos, photoAlbumPickerActivity.allowOrder);
            photoAlbumPickerActivity.presentFragment(photoPickerActivity);
            return;
        }
        final HashMap map = new HashMap();
        final ArrayList arrayList = new ArrayList();
        if (!photoAlbumPickerActivity.allowGifs) {
            PhotoPickerActivity photoPickerActivity2 = new PhotoPickerActivity(0, albumEntry, map, arrayList, photoAlbumPickerActivity.selectPhotoType, photoAlbumPickerActivity.allowCaption, photoAlbumPickerActivity.chatActivity, false);
            Editable text2 = photoAlbumPickerActivity.commentTextView.getText();
            photoAlbumPickerActivity.caption = text2;
            photoPickerActivity2.caption = text2;
            EditTextEmoji editTextEmoji2 = photoPickerActivity2.commentTextView;
            if (editTextEmoji2 != null) {
                editTextEmoji2.setText(text2);
            }
            photoPickerActivity2.delegate = new PhotoPickerActivity.PhotoPickerActivityDelegate() {
                @Override
                public final void actionButtonPressed(int i, boolean z, boolean z2) {
                    PhotoAlbumPickerActivity photoAlbumPickerActivity2 = PhotoAlbumPickerActivity.this;
                    photoAlbumPickerActivity2.removeSelfFromStack();
                    if (z) {
                        return;
                    }
                    photoAlbumPickerActivity2.sendSelectedPhotos(arrayList, map);
                }

                @Override
                public final boolean canFinishFragment() {
                    return true;
                }

                @Override
                public final void onCaptionChanged(Editable editable) {
                    PhotoAlbumPickerActivity photoAlbumPickerActivity2 = PhotoAlbumPickerActivity.this;
                    EditTextEmoji editTextEmoji3 = photoAlbumPickerActivity2.commentTextView;
                    photoAlbumPickerActivity2.caption = editable;
                    editTextEmoji3.setText(editable);
                }

                @Override
                public final void onOpenInPressed() {
                }

                @Override
                public final void selectedPhotosChanged() {
                }
            };
            photoPickerActivity2.setMaxSelectedPhotos(photoAlbumPickerActivity.maxSelectedPhotos, photoAlbumPickerActivity.allowOrder);
            photoAlbumPickerActivity.presentFragment(photoPickerActivity2);
            return;
        }
        PhotoPickerSearchActivity photoPickerSearchActivity = new PhotoPickerSearchActivity(map, arrayList, photoAlbumPickerActivity.selectPhotoType, photoAlbumPickerActivity.allowCaption, photoAlbumPickerActivity.chatActivity);
        Editable text3 = photoAlbumPickerActivity.commentTextView.getText();
        photoAlbumPickerActivity.caption = text3;
        PhotoPickerActivity photoPickerActivity3 = photoPickerSearchActivity.imagesSearch;
        if (photoPickerActivity3 != null) {
            photoPickerActivity3.caption = text3;
            EditTextEmoji editTextEmoji3 = photoPickerActivity3.commentTextView;
            if (editTextEmoji3 != null) {
                editTextEmoji3.setText(text3);
            }
        }
        PhotoPickerActivity.PhotoPickerActivityDelegate photoPickerActivityDelegate = new PhotoPickerActivity.PhotoPickerActivityDelegate() {
            @Override
            public final void actionButtonPressed(int i, boolean z, boolean z2) {
                PhotoAlbumPickerActivity photoAlbumPickerActivity2 = PhotoAlbumPickerActivity.this;
                photoAlbumPickerActivity2.removeSelfFromStack();
                if (z) {
                    return;
                }
                photoAlbumPickerActivity2.sendSelectedPhotos(arrayList, map);
            }

            @Override
            public final boolean canFinishFragment() {
                return true;
            }

            @Override
            public final void onCaptionChanged(Editable editable) {
                PhotoAlbumPickerActivity photoAlbumPickerActivity2 = PhotoAlbumPickerActivity.this;
                EditTextEmoji editTextEmoji4 = photoAlbumPickerActivity2.commentTextView;
                photoAlbumPickerActivity2.caption = editable;
                editTextEmoji4.setText(editable);
            }

            @Override
            public final void onOpenInPressed() {
            }

            @Override
            public final void selectedPhotosChanged() {
            }
        };
        photoPickerActivity3.delegate = photoPickerActivityDelegate;
        PhotoPickerActivity photoPickerActivity4 = photoPickerSearchActivity.gifsSearch;
        photoPickerActivity4.delegate = photoPickerActivityDelegate;
        photoPickerActivity3.searchDelegate = new PhotoViewer.AnonymousClass49(photoPickerSearchActivity, 9);
        photoPickerActivity4.searchDelegate = new PollItemMenu.AnonymousClass6(photoPickerSearchActivity, 4);
        int i = photoAlbumPickerActivity.maxSelectedPhotos;
        boolean z = photoAlbumPickerActivity.allowOrder;
        photoPickerActivity3.setMaxSelectedPhotos(i, z);
        photoPickerActivity4.setMaxSelectedPhotos(i, z);
        photoAlbumPickerActivity.presentFragment(photoPickerSearchActivity);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_dialogBackground;
        actionBar.setBackgroundColor(Theme.getColor(null, i, false));
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_dialogTextBlack;
        actionBar2.setTitleColor(Theme.getColor(null, i2, false));
        this.actionBar.setItemsColor(Theme.getColor(null, i2, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_dialogButtonSelector, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i3) {
                PhotoAlbumPickerActivity photoAlbumPickerActivity = PhotoAlbumPickerActivity.this;
                if (i3 == -1) {
                    photoAlbumPickerActivity.finishFragment();
                    return;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        PhotoAlbumPickerActivity.access$100(photoAlbumPickerActivity, null);
                    }
                } else if (photoAlbumPickerActivity.delegate != null) {
                    photoAlbumPickerActivity.finishFragment(false);
                    photoAlbumPickerActivity.delegate.startPhotoSelectActivity();
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        if (this.allowSearchImages) {
            actionBarMenuCreateMenu.addItem(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other);
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        actionBarMenuItemAddItem.addSubItem(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        ?? r1 = new SizeNotifierFrameLayout(context) {
            public boolean ignoreLayout;
            public int lastNotifyWidth;

            @Override
            public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                int i7;
                int paddingRight;
                int paddingLeft;
                int i8;
                int i9;
                int paddingTop;
                EditTextEmoji editTextEmoji;
                int measuredHeight;
                int measuredHeight2;
                int i10 = this.lastNotifyWidth;
                int i11 = i5 - i3;
                PhotoAlbumPickerActivity photoAlbumPickerActivity = PhotoAlbumPickerActivity.this;
                if (i10 != i11) {
                    this.lastNotifyWidth = i11;
                    ActionBarPopupWindow actionBarPopupWindow = photoAlbumPickerActivity.sendPopupWindow;
                    if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                        photoAlbumPickerActivity.sendPopupWindow.dismiss(true);
                    }
                }
                int childCount = getChildCount();
                int emojiPadding = (AndroidUtilities.dp(20.0f) < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : photoAlbumPickerActivity.commentTextView.getEmojiPadding();
                setBottomClip(emojiPadding);
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i13 = layoutParams.gravity;
                        if (i13 == -1) {
                            i13 = 51;
                        }
                        int i14 = i13 & 112;
                        int i15 = i13 & 7;
                        if (i15 != 1) {
                            if (i15 != 5) {
                                paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                            } else {
                                i7 = (i11 - measuredWidth) - layoutParams.rightMargin;
                                paddingRight = getPaddingRight();
                            }
                            if (i14 != 16) {
                                if (i14 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i14 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i8 = ((i6 - emojiPadding) - i4) - measuredHeight3;
                                    i9 = layoutParams.bottomMargin;
                                }
                                editTextEmoji = photoAlbumPickerActivity.commentTextView;
                                if (editTextEmoji != null && editTextEmoji.isPopupView(childAt)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                            } else {
                                i8 = ((((i6 - emojiPadding) - i4) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i9 = layoutParams.bottomMargin;
                            }
                            paddingTop = i8 - i9;
                            editTextEmoji = photoAlbumPickerActivity.commentTextView;
                            if (editTextEmoji != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                        } else {
                            i7 = ((i11 - measuredWidth) / 2) + layoutParams.leftMargin;
                            paddingRight = layoutParams.rightMargin;
                        }
                        paddingLeft = i7 - paddingRight;
                        if (i14 != 16) {
                            if (i14 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                            } else if (i14 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i8 = ((i6 - emojiPadding) - i4) - measuredHeight3;
                                i9 = layoutParams.bottomMargin;
                            }
                            editTextEmoji = photoAlbumPickerActivity.commentTextView;
                            if (editTextEmoji != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                        } else {
                            i8 = ((((i6 - emojiPadding) - i4) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i9 = layoutParams.bottomMargin;
                        }
                        paddingTop = i8 - i9;
                        editTextEmoji = photoAlbumPickerActivity.commentTextView;
                        if (editTextEmoji != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    }
                }
                notifyHeightChanged();
            }

            @Override
            public final void onMeasure(int i3, int i4) {
                int i5;
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i4);
                setMeasuredDimension(size, size2);
                int iDp = AndroidUtilities.dp(20.0f);
                int i6 = 0;
                PhotoAlbumPickerActivity photoAlbumPickerActivity = PhotoAlbumPickerActivity.this;
                if (iDp < 0) {
                    this.ignoreLayout = true;
                    photoAlbumPickerActivity.commentTextView.hideEmojiView();
                    this.ignoreLayout = false;
                } else if (!AndroidUtilities.isInMultiwindow) {
                    size2 -= photoAlbumPickerActivity.commentTextView.getEmojiPadding();
                    i4 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                }
                int i7 = i4;
                int childCount = getChildCount();
                while (i6 < childCount) {
                    View childAt = getChildAt(i6);
                    if (childAt == null || childAt.getVisibility() == 8) {
                        i5 = i3;
                    } else {
                        EditTextEmoji editTextEmoji = photoAlbumPickerActivity.commentTextView;
                        if (editTextEmoji == null || !editTextEmoji.isPopupView(childAt)) {
                            i5 = i3;
                            measureChildWithMargins(childAt, i5, 0, i7, 0);
                        } else {
                            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                            }
                            i5 = i3;
                        }
                    }
                    i6++;
                    i3 = i5;
                }
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.sizeNotifierFrameLayout = r1;
        r1.setBackgroundColor(Theme.getColor(null, i, false));
        this.fragmentView = this.sizeNotifierFrameLayout;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.listView.setClipToPadding(false);
        this.listView.setHorizontalScrollBarEnabled(false);
        this.listView.setVerticalScrollBarEnabled(false);
        zzku.m(this.listView);
        this.listView.setDrawingCacheEnabled(false);
        addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setGlowColor(Theme.getColor(null, i, false));
        TextView textView = new TextView(context);
        this.emptyView = textView;
        textView.setTextColor(-8355712);
        this.emptyView.setTextSize(1, 20.0f);
        this.emptyView.setGravity(17);
        this.emptyView.setVisibility(8);
        this.emptyView.setText(LocaleController.getString(R.string.NoPhotos));
        addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.emptyView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.progressView = frameLayout;
        frameLayout.setVisibility(8);
        addView(this.progressView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.progressView.addView(radialProgressView, LayoutHelper.createFrame(-2, -2, 17));
        View view = new View(context);
        this.shadow = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.shadow.setTranslationY(AndroidUtilities.dp(48.0f));
        addView(this.shadow, LayoutHelper.createFrame(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.frameLayout2 = frameLayout2;
        frameLayout2.setBackgroundColor(Theme.getColor(null, i, false));
        this.frameLayout2.setVisibility(4);
        this.frameLayout2.setTranslationY(AndroidUtilities.dp(48.0f));
        addView(this.frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
        this.frameLayout2.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        this.commentTextView = new EditTextEmoji(context, this.sizeNotifierFrameLayout, null, 1, false, null);
        this.commentTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.commentTextView.setHint(LocaleController.getString(R.string.AddCaption));
        EditTextCaption editText = this.commentTextView.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.frameLayout2.addView(this.commentTextView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        Editable editable = this.caption;
        if (editable != null) {
            this.commentTextView.setText(editable);
        }
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 13);
        this.writeButtonContainer = anonymousClass4;
        anonymousClass4.setFocusable(true);
        this.writeButtonContainer.setFocusableInTouchMode(true);
        this.writeButtonContainer.setVisibility(4);
        this.writeButtonContainer.setScaleX(0.2f);
        this.writeButtonContainer.setScaleY(0.2f);
        this.writeButtonContainer.setAlpha(0.0f);
        addView(this.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.writeButton = new ImageView(context);
        this.writeButton.setBackgroundDrawable(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(null, Theme.key_dialogFloatingButton, false), Theme.getColor(null, Theme.key_dialogFloatingButtonPressed, false)));
        this.writeButton.setImageResource(R.drawable.attach_send);
        this.writeButton.setImportantForAccessibility(2);
        this.writeButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogFloatingIcon, false), PorterDuff.Mode.MULTIPLY));
        this.writeButton.setScaleType(ImageView.ScaleType.CENTER);
        this.writeButton.setOutlineProvider(new RichEditor.AnonymousClass5(15));
        this.writeButtonContainer.addView(this.writeButton, LayoutHelper.createFrame(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.writeButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 16));
        this.writeButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 10));
        TextPaint textPaint = this.textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, context, 24);
        this.selectedCountView = anonymousClass2;
        anonymousClass2.setAlpha(0.0f);
        this.selectedCountView.setScaleX(0.2f);
        this.selectedCountView.setScaleY(0.2f);
        addView(this.selectedCountView, LayoutHelper.createFrame(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.selectPhotoType != 0) {
            this.commentTextView.setVisibility(8);
        }
        if (this.loading && ((arrayList = this.albumsSorted) == null || arrayList.isEmpty())) {
            this.progressView.setVisibility(0);
            this.listView.setEmptyView(null);
        } else {
            this.progressView.setVisibility(8);
            this.listView.setEmptyView(this.emptyView);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.albumsDidLoad) {
            if (i == NotificationCenter.closeChats) {
                removeSelfFromStack(true);
                return;
            }
            return;
        }
        if (this.classGuid == ((Integer) objArr[0]).intValue()) {
            int i3 = this.selectPhotoType;
            if (i3 == 1 || i3 == 2 || i3 == 10 || !this.allowSearchImages) {
                this.albumsSorted = (ArrayList) objArr[2];
            } else {
                this.albumsSorted = (ArrayList) objArr[1];
            }
            FrameLayout frameLayout = this.progressView;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView != null && recyclerListView.getEmptyView() == null) {
                this.listView.setEmptyView(this.emptyView);
            }
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.mObservable.notifyChanged();
            }
            this.loading = false;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, i));
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_dialogTextBlack;
        arrayList.add(new ThemeDescription(actionBar, 64, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_dialogButtonSelector));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{Theme.chat_attachEmptyDrawable}, null, Theme.key_chat_attachEmptyImage));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, null, null, Theme.key_chat_attachPhotoBackground));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji == null || !editTextEmoji.emojiViewVisible) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        editTextEmoji.hidePopup(true);
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 9));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i = this.selectPhotoType;
        if (i == 1 || i == 2 || i == 10 || !this.allowSearchImages) {
            this.albumsSorted = MediaController.allPhotoAlbums;
        } else {
            this.albumsSorted = MediaController.allMediaAlbums;
        }
        this.loading = this.albumsSorted == null;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onResume();
        }
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 9));
        }
    }

    public final void sendSelectedPhotos(ArrayList arrayList, HashMap map) {
        if (map.isEmpty() || this.delegate == null || this.sendPressed) {
            return;
        }
        this.sendPressed = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = map.get(arrayList.get(i));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList2.add(sendingMediaInfo);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                String str = photoEntry.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.path = photoEntry.path;
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
            } else if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                String str2 = searchImage.imagePath;
                if (str2 != null) {
                    sendingMediaInfo.path = str2;
                } else {
                    sendingMediaInfo.searchImage = searchImage;
                }
                sendingMediaInfo.thumbPath = searchImage.thumbPath;
                sendingMediaInfo.coverPath = searchImage.coverPath;
                sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                CharSequence charSequence2 = searchImage.caption;
                sendingMediaInfo.caption = charSequence2 != null ? charSequence2.toString() : null;
                sendingMediaInfo.entities = searchImage.entities;
                sendingMediaInfo.masks = searchImage.stickers;
                sendingMediaInfo.ttl = searchImage.ttl;
                TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                if (botInlineResult != null && searchImage.type == 1) {
                    sendingMediaInfo.inlineResult = botInlineResult;
                    sendingMediaInfo.params = searchImage.params;
                }
                searchImage.date = (int) (System.currentTimeMillis() / 1000);
            }
        }
        this.delegate.didSelectPhotos(arrayList2);
    }

    public final void showCommentTextView$1(boolean z) {
        if (z == (this.frameLayout2.getTag() != null)) {
            return;
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (this.commentTextView.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
        }
        this.commentTextView.hidePopup(true);
        if (z) {
            this.frameLayout2.setVisibility(0);
            this.writeButtonContainer.setVisibility(0);
        } else {
            this.frameLayout2.setVisibility(4);
            this.writeButtonContainer.setVisibility(4);
        }
        this.writeButtonContainer.setScaleX(z ? 1.0f : 0.2f);
        this.writeButtonContainer.setScaleY(z ? 1.0f : 0.2f);
        this.writeButtonContainer.setAlpha(z ? 1.0f : 0.0f);
        this.selectedCountView.setScaleX(z ? 1.0f : 0.2f);
        this.selectedCountView.setScaleY(z ? 1.0f : 0.2f);
        this.selectedCountView.setAlpha(z ? 1.0f : 0.0f);
        this.frameLayout2.setTranslationY(z ? 0.0f : AndroidUtilities.dp(48.0f));
        this.shadow.setTranslationY(z ? 0.0f : AndroidUtilities.dp(48.0f));
    }
}
