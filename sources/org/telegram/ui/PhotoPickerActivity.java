package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DividerCell;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.RecyclerViewItemRangeSelector;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.web.WebActionBar;

public final class PhotoPickerActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int alertOnlyOnce;
    public final boolean allowCaption;
    public boolean allowIndices;
    public boolean allowOrder;
    public AnimatorSet animatorSet;
    public Editable caption;
    public final ChatActivity chatActivity;
    public EditTextEmoji commentTextView;
    public PhotoPickerActivityDelegate delegate;
    public final int dialogBackgroundKey;
    public StickerEmptyView emptyView;
    public AnonymousClass9 flickerView;
    public final boolean forceDarckTheme;
    public FrameLayout frameLayout2;
    public int imageReqId;
    public boolean imageSearchEndReached;
    public String initialSearchString;
    public boolean isDocumentsPicker;
    public ActionBarMenuSubItem[] itemCells;
    public RecyclerViewItemRangeSelector itemRangeSelector;
    public int itemSize;
    public int itemsPerRow;
    public String lastSearchImageString;
    public String lastSearchString;
    public int lastSearchToken;
    public AnonymousClass6 layoutManager;
    public ListAdapter listAdapter;
    public boolean listSort;
    public RecyclerListView listView;
    public int maxSelectedPhotos;
    public boolean needsBottomLayout;
    public String nextImagesSearchOffset;
    public final Paint paint;
    public final AnonymousClass1 provider;
    public final ArrayList recentSearches;
    public final RectF rect;
    public PhotoPickerActivitySearchDelegate searchDelegate;
    public ActionBarMenuItem searchItem;
    public final ArrayList searchResult;
    public final HashMap searchResultKeys;
    public boolean searching;
    public boolean searchingUser;
    public final int selectPhotoType;
    public final MediaController.AlbumEntry selectedAlbum;
    public QrActivity.AnonymousClass2 selectedCountView;
    public final HashMap selectedPhotos;
    public final ArrayList selectedPhotosOrder;
    public final int selectorKey;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout sendPopupLayout;
    public ActionBarPopupWindow sendPopupWindow;
    public boolean sendPressed;
    public View shadow;
    public boolean shouldSelect;
    public ActionBarMenuSubItem showAsListItem;
    public AnonymousClass5 sizeNotifierFrameLayout;
    public final int textKey;
    public final TextPaint textPaint;
    public final int type;
    public ImageView writeButton;
    public LoginActivity.AnonymousClass4 writeButtonContainer;

    public final class AnonymousClass1 extends PhotoViewer.EmptyPhotoViewerProvider {
        public AnonymousClass1() {
        }

        @Override
        public final boolean allowCaption() {
            return PhotoPickerActivity.this.allowCaption;
        }

        @Override
        public final boolean cancelButtonPressed() {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            photoPickerActivity.delegate.actionButtonPressed(0, true, true);
            photoPickerActivity.finishFragment();
            return true;
        }

        @Override
        public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            PhotoAttachPhotoCell photoAttachPhotoCellAccess$000 = PhotoPickerActivity.access$000(photoPickerActivity, i);
            if (photoAttachPhotoCellAccess$000 == null) {
                return null;
            }
            BackupImageView imageView = photoAttachPhotoCellAccess$000.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = photoPickerActivity.listView;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            placeProviderObject.imageReceiver = imageReceiver;
            placeProviderObject.thumb = imageReceiver.getBitmapSafe();
            placeProviderObject.scale = photoAttachPhotoCellAccess$000.getScale();
            photoAttachPhotoCellAccess$000.showCheck(false);
            return placeProviderObject;
        }

        @Override
        public final int getSelectedCount() {
            return PhotoPickerActivity.this.selectedPhotos.size();
        }

        @Override
        public final HashMap getSelectedPhotos() {
            return PhotoPickerActivity.this.selectedPhotos;
        }

        @Override
        public final ArrayList getSelectedPhotosOrder() {
            return PhotoPickerActivity.this.selectedPhotosOrder;
        }

        @Override
        public final ImageReceiver.BitmapHolder getThumbForPhoto(int i) {
            PhotoAttachPhotoCell photoAttachPhotoCellAccess$000 = PhotoPickerActivity.access$000(PhotoPickerActivity.this, i);
            if (photoAttachPhotoCellAccess$000 != null) {
                return photoAttachPhotoCellAccess$000.getImageView().getImageReceiver().getBitmapSafe();
            }
            return null;
        }

        @Override
        public final boolean isPhotoChecked(int i) {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            MediaController.AlbumEntry albumEntry = photoPickerActivity.selectedAlbum;
            if (albumEntry != null) {
                return i >= 0 && i < albumEntry.photos.size() && photoPickerActivity.selectedPhotos.containsKey(Integer.valueOf(photoPickerActivity.selectedAlbum.photos.get(i).imageId));
            }
            return i >= 0 && i < photoPickerActivity.searchResult.size() && photoPickerActivity.selectedPhotos.containsKey(((MediaController.SearchImage) photoPickerActivity.searchResult.get(i)).id);
        }

        @Override
        public final void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            if (photoPickerActivity.selectedPhotos.isEmpty()) {
                MediaController.AlbumEntry albumEntry = photoPickerActivity.selectedAlbum;
                if (albumEntry != null) {
                    if (i < 0 || i >= albumEntry.photos.size()) {
                        return;
                    }
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i);
                    photoEntry.editedInfo = videoEditedInfo;
                    photoPickerActivity.addToSelectedPhotos(-1, photoEntry);
                } else {
                    if (i < 0) {
                        return;
                    }
                    ArrayList arrayList = photoPickerActivity.searchResult;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i);
                    searchImage.editedInfo = videoEditedInfo;
                    photoPickerActivity.addToSelectedPhotos(-1, searchImage);
                }
            }
            photoPickerActivity.sendSelectedPhotos(i2, z);
        }

        @Override
        public final int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
            int iAddToSelectedPhotos;
            boolean z;
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            MediaController.AlbumEntry albumEntry = photoPickerActivity.selectedAlbum;
            if (albumEntry != null) {
                if (i < 0 || i >= albumEntry.photos.size()) {
                    return -1;
                }
                MediaController.PhotoEntry photoEntry = photoPickerActivity.selectedAlbum.photos.get(i);
                iAddToSelectedPhotos = photoPickerActivity.addToSelectedPhotos(-1, photoEntry);
                if (iAddToSelectedPhotos == -1) {
                    photoEntry.editedInfo = videoEditedInfo;
                    iAddToSelectedPhotos = photoPickerActivity.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntry.imageId));
                    z = true;
                } else {
                    photoEntry.editedInfo = null;
                    z = false;
                }
            } else {
                if (i < 0 || i >= photoPickerActivity.searchResult.size()) {
                    return -1;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) photoPickerActivity.searchResult.get(i);
                iAddToSelectedPhotos = photoPickerActivity.addToSelectedPhotos(-1, searchImage);
                if (iAddToSelectedPhotos == -1) {
                    searchImage.editedInfo = videoEditedInfo;
                    iAddToSelectedPhotos = photoPickerActivity.selectedPhotosOrder.indexOf(searchImage.id);
                    z = true;
                } else {
                    searchImage.editedInfo = null;
                    z = false;
                }
            }
            int childCount = photoPickerActivity.listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = photoPickerActivity.listView.getChildAt(i2);
                if (((Integer) childAt.getTag()).intValue() == i) {
                    ((PhotoAttachPhotoCell) childAt).setChecked(photoPickerActivity.allowIndices ? iAddToSelectedPhotos : -1, z, false);
                    break;
                }
            }
            photoPickerActivity.updatePhotosButton(z ? 1 : 2);
            photoPickerActivity.delegate.selectedPhotosChanged();
            return iAddToSelectedPhotos;
        }

        @Override
        public final int setPhotoUnchecked(Object obj) {
            Object objValueOf;
            if (obj instanceof MediaController.PhotoEntry) {
                objValueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
            } else {
                objValueOf = obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
            }
            if (objValueOf == null) {
                return -1;
            }
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            if (!photoPickerActivity.selectedPhotos.containsKey(objValueOf)) {
                return -1;
            }
            photoPickerActivity.selectedPhotos.remove(objValueOf);
            int iIndexOf = photoPickerActivity.selectedPhotosOrder.indexOf(objValueOf);
            if (iIndexOf >= 0) {
                photoPickerActivity.selectedPhotosOrder.remove(iIndexOf);
            }
            if (photoPickerActivity.allowIndices) {
                photoPickerActivity.updateCheckedPhotoIndices$1();
            }
            return iIndexOf;
        }

        @Override
        public final void updatePhotoAtIndex(int i) {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            PhotoAttachPhotoCell photoAttachPhotoCellAccess$000 = PhotoPickerActivity.access$000(photoPickerActivity, i);
            if (photoAttachPhotoCellAccess$000 != null) {
                if (photoPickerActivity.selectedAlbum == null) {
                    photoAttachPhotoCellAccess$000.setPhotoEntry((MediaController.SearchImage) photoPickerActivity.searchResult.get(i));
                    return;
                }
                BackupImageView imageView = photoAttachPhotoCellAccess$000.getImageView();
                imageView.imageReceiver.setOrientation(0, true);
                MediaController.PhotoEntry photoEntry = photoPickerActivity.selectedAlbum.photos.get(i);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.setImage(str, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                if (photoEntry.path == null) {
                    imageView.setImageDrawable(Theme.chat_attachEmptyDrawable);
                    return;
                }
                imageView.imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                    imageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                imageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
            }
        }

        @Override
        public final void willHidePhotoViewer() {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            int childCount = photoPickerActivity.listView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = photoPickerActivity.listView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    ((PhotoAttachPhotoCell) childAt).showCheck(true);
                }
            }
        }

        @Override
        public final void willSwitchFromPhoto(int i) {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            int childCount = photoPickerActivity.listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = photoPickerActivity.listView.getChildAt(i2);
                if (childAt.getTag() != null) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    int iIntValue = ((Integer) childAt.getTag()).intValue();
                    MediaController.AlbumEntry albumEntry = photoPickerActivity.selectedAlbum;
                    if (albumEntry != null) {
                        if (iIntValue >= 0 && iIntValue < albumEntry.photos.size()) {
                            if (iIntValue == i) {
                                photoAttachPhotoCell.showCheck(true);
                                return;
                            }
                        }
                    } else if (iIntValue >= 0 && iIntValue < photoPickerActivity.searchResult.size()) {
                        if (iIntValue == i) {
                            photoAttachPhotoCell.showCheck(true);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final class AnonymousClass4 extends OKLCH {
        public final PhotoViewer$$ExternalSyntheticLambda21 updateSearch = new PhotoViewer$$ExternalSyntheticLambda21(this, 11);

        public AnonymousClass4() {
        }

        @Override
        public final boolean canCollapseSearch() {
            PhotoPickerActivity.this.finishFragment();
            return false;
        }

        @Override
        public final void onSearchExpand() {
        }

        @Override
        public final void onSearchPressed(EditTextBoldCursor editTextBoldCursor) {
            PhotoPickerActivity.this.processSearch(editTextBoldCursor);
        }

        @Override
        public final void onTextChanged(EditTextBoldCursor editTextBoldCursor) {
            if (editTextBoldCursor.getText().length() != 0) {
                PhotoViewer$$ExternalSyntheticLambda21 photoViewer$$ExternalSyntheticLambda21 = this.updateSearch;
                AndroidUtilities.cancelRunOnUIThread(photoViewer$$ExternalSyntheticLambda21);
                AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda21, 1200L);
                return;
            }
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            photoPickerActivity.searchResult.clear();
            photoPickerActivity.searchResultKeys.clear();
            photoPickerActivity.lastSearchString = null;
            photoPickerActivity.imageSearchEndReached = true;
            photoPickerActivity.searching = false;
            if (photoPickerActivity.imageReqId != 0) {
                ConnectionsManager.getInstance(((BaseFragment) photoPickerActivity).currentAccount).cancelRequest(photoPickerActivity.imageReqId, true);
                photoPickerActivity.imageReqId = 0;
            }
            photoPickerActivity.emptyView.title.setText(LocaleController.getString(R.string.NoRecentSearches));
            photoPickerActivity.emptyView.showProgress(false, true);
            photoPickerActivity.updateSearchInterface();
        }
    }

    public final class AnonymousClass5 extends SizeNotifierFrameLayout {
        public boolean ignoreLayout;
        public int lastItemSize;
        public int lastNotifyWidth;

        public AnonymousClass5(Context context) {
            super(context, null);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int paddingRight;
            int paddingLeft;
            int i6;
            int i7;
            int paddingTop;
            EditTextEmoji editTextEmoji;
            int measuredHeight;
            int measuredHeight2;
            int i8 = this.lastNotifyWidth;
            int i9 = i3 - i;
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            if (i8 != i9) {
                this.lastNotifyWidth = i9;
                ListAdapter listAdapter = photoPickerActivity.listAdapter;
                if (listAdapter != null) {
                    listAdapter.mObservable.notifyChanged();
                }
                ActionBarPopupWindow actionBarPopupWindow = photoPickerActivity.sendPopupWindow;
                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                    photoPickerActivity.sendPopupWindow.dismiss(true);
                }
            }
            int childCount = getChildCount();
            int emojiPadding = (photoPickerActivity.commentTextView == null || photoPickerActivity.frameLayout2.getParent() != this || AndroidUtilities.dp(20.0f) < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : photoPickerActivity.commentTextView.getEmojiPadding();
            setBottomClip(emojiPadding);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    int i11 = layoutParams.gravity;
                    if (i11 == -1) {
                        i11 = 51;
                    }
                    int i12 = i11 & 112;
                    int i13 = i11 & 7;
                    if (i13 != 1) {
                        if (i13 != 5) {
                            paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                        } else {
                            i5 = (i9 - measuredWidth) - layoutParams.rightMargin;
                            paddingRight = getPaddingRight();
                        }
                        if (i12 != 16) {
                            if (i12 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                            } else if (i12 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i6 = ((i4 - emojiPadding) - i2) - measuredHeight3;
                                i7 = layoutParams.bottomMargin;
                            }
                            editTextEmoji = photoPickerActivity.commentTextView;
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
                            i6 = ((((i4 - emojiPadding) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i7 = layoutParams.bottomMargin;
                        }
                        paddingTop = i6 - i7;
                        editTextEmoji = photoPickerActivity.commentTextView;
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
                        i5 = ((i9 - measuredWidth) / 2) + layoutParams.leftMargin;
                        paddingRight = layoutParams.rightMargin;
                    }
                    paddingLeft = i5 - paddingRight;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            paddingTop = layoutParams.topMargin + getPaddingTop();
                        } else if (i12 != 80) {
                            paddingTop = layoutParams.topMargin;
                        } else {
                            i6 = ((i4 - emojiPadding) - i2) - measuredHeight3;
                            i7 = layoutParams.bottomMargin;
                        }
                        editTextEmoji = photoPickerActivity.commentTextView;
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
                        i6 = ((((i4 - emojiPadding) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i7 = layoutParams.bottomMargin;
                    }
                    paddingTop = i6 - i7;
                    editTextEmoji = photoPickerActivity.commentTextView;
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
        public final void onMeasure(int i, int i2) {
            EditTextEmoji editTextEmoji;
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            boolean zIsTablet = AndroidUtilities.isTablet();
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            if (zIsTablet) {
                photoPickerActivity.itemsPerRow = 4;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    photoPickerActivity.itemsPerRow = 4;
                } else {
                    photoPickerActivity.itemsPerRow = 3;
                }
            }
            this.ignoreLayout = true;
            int iDp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / photoPickerActivity.itemsPerRow;
            photoPickerActivity.itemSize = iDp;
            if (this.lastItemSize != iDp) {
                this.lastItemSize = iDp;
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda21(this, 12));
            }
            if (photoPickerActivity.listSort) {
                photoPickerActivity.layoutManager.setSpanCount(1);
            } else {
                photoPickerActivity.layoutManager.setSpanCount(Math.max(1, ((photoPickerActivity.itemsPerRow - 1) * AndroidUtilities.dp(2.0f)) + (photoPickerActivity.itemSize * photoPickerActivity.itemsPerRow)));
            }
            this.ignoreLayout = false;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            int size3 = View.MeasureSpec.getSize(i);
            int size4 = View.MeasureSpec.getSize(iMakeMeasureSpec);
            setMeasuredDimension(size3, size4);
            int iMeasureKeyboardHeight = measureKeyboardHeight();
            if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && photoPickerActivity.commentTextView != null && photoPickerActivity.frameLayout2.getParent() == this) {
                size4 -= photoPickerActivity.commentTextView.getEmojiPadding();
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
            }
            int i3 = size4;
            int i4 = iMakeMeasureSpec;
            if (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) && (editTextEmoji = photoPickerActivity.commentTextView) != null) {
                this.ignoreLayout = true;
                editTextEmoji.hideEmojiView();
                this.ignoreLayout = false;
            }
            EditTextEmoji editTextEmoji2 = photoPickerActivity.commentTextView;
            if (editTextEmoji2 != null && editTextEmoji2.emojiViewVisible) {
                photoPickerActivity.fragmentView.setTranslationY(0.0f);
                photoPickerActivity.listView.setTranslationY(0.0f);
                photoPickerActivity.emptyView.setTranslationY(0.0f);
            }
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8) {
                    EditTextEmoji editTextEmoji3 = photoPickerActivity.commentTextView;
                    if (editTextEmoji3 == null || !editTextEmoji3.isPopupView(childAt)) {
                        measureChildWithMargins(childAt, i, 0, i4, 0);
                    } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (i3 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i3 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                }
            }
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public final class AnonymousClass6 extends GridLayoutManager {
        @Override
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    public final class AnonymousClass9 extends FlickerLoadingView {
        @Override
        public final int getColumnsCount() {
            return 3;
        }

        @Override
        public final int getViewType() {
            return 2;
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            MediaController.AlbumEntry albumEntry = photoPickerActivity.selectedAlbum;
            if (albumEntry != null) {
                return albumEntry.photos.size();
            }
            if (!photoPickerActivity.searchResult.isEmpty()) {
                return photoPickerActivity.searchResult.size() + (!photoPickerActivity.imageSearchEndReached ? 1 : 0);
            }
            if (!TextUtils.isEmpty(photoPickerActivity.lastSearchString) || photoPickerActivity.recentSearches.isEmpty()) {
                return 0;
            }
            return photoPickerActivity.recentSearches.size() + 2;
        }

        @Override
        public final long getItemId(int i) {
            return i;
        }

        @Override
        public final int getItemViewType(int i) {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            if (photoPickerActivity.listSort) {
                return 2;
            }
            if (photoPickerActivity.selectedAlbum != null) {
                return 0;
            }
            if (photoPickerActivity.searchResult.isEmpty()) {
                return i == photoPickerActivity.recentSearches.size() ? 4 : 3;
            }
            return i < photoPickerActivity.searchResult.size() ? 0 : 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            if (photoPickerActivity.selectedAlbum != null) {
                return true;
            }
            if (TextUtils.isEmpty(photoPickerActivity.lastSearchString)) {
                return viewHolder.mItemViewType == 3;
            }
            return viewHolder.getAdapterPosition() < photoPickerActivity.searchResult.size();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean zIsShowingImage;
            int i2 = viewHolder.mItemViewType;
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            MediaController.AlbumEntry albumEntry = photoPickerActivity.selectedAlbum;
            HashMap map = photoPickerActivity.selectedPhotos;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
                photoAttachPhotoCell.setItemSize(photoPickerActivity.itemSize);
                BackupImageView imageView = photoAttachPhotoCell.getImageView();
                photoAttachPhotoCell.setTag(Integer.valueOf(i));
                imageView.imageReceiver.setOrientation(0, true);
                ArrayList arrayList = photoPickerActivity.selectedPhotosOrder;
                if (albumEntry != null) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i);
                    photoAttachPhotoCell.setPhotoEntry(photoEntry, arrayList.size() > 1, true, false, false);
                    photoAttachPhotoCell.setChecked(photoPickerActivity.allowIndices ? arrayList.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, map.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                    zIsShowingImage = PhotoViewer.isShowingImage(photoEntry.path);
                } else {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) photoPickerActivity.searchResult.get(i);
                    photoAttachPhotoCell.setPhotoEntry(searchImage);
                    photoAttachPhotoCell.getVideoInfoContainer().setVisibility(4);
                    photoAttachPhotoCell.setChecked(photoPickerActivity.allowIndices ? arrayList.indexOf(searchImage.id) : -1, map.containsKey(searchImage.id), false);
                    zIsShowingImage = PhotoViewer.isShowingImage(searchImage.getPathToAttach());
                }
                imageView.getImageReceiver().setVisible(!zIsShowingImage, true);
                photoAttachPhotoCell.getCheckBox().setVisibility((photoPickerActivity.selectPhotoType != 0 || zIsShowingImage) ? 8 : 0);
                return;
            }
            if (i2 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = photoPickerActivity.itemSize;
                    view.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            if (i2 == 2) {
                MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i);
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                sharedDocumentCell.setPhotoEntry(photoEntry2);
                sharedDocumentCell.setChecked(map.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
                sharedDocumentCell.setTag(Integer.valueOf(i));
                return;
            }
            if (i2 != 3) {
                return;
            }
            TextCell textCell = (TextCell) view;
            ArrayList arrayList2 = photoPickerActivity.recentSearches;
            if (i < arrayList2.size()) {
                textCell.setTextAndIcon(R.drawable.msg_recent, (CharSequence) arrayList2.get(i), false);
            } else {
                textCell.setTextAndIcon(R.drawable.msg_clear_recent, (CharSequence) LocaleController.getString(R.string.ClearRecentHistory), false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View sharedDocumentCell;
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            Context context = this.mContext;
            if (i == 0) {
                PhotoAttachPhotoCell photoAttachPhotoCell = new PhotoAttachPhotoCell(context, null);
                photoAttachPhotoCell.setDelegate(new PhotoAttachPhotoCell.PhotoAttachPhotoCellDelegate() {
                    public final void checkSlowMode() {
                        ChatActivity chatActivity;
                        TLRPC.Chat chat;
                        PhotoPickerActivity photoPickerActivity2 = PhotoPickerActivity.this;
                        if (!photoPickerActivity2.allowOrder || (chatActivity = photoPickerActivity2.chatActivity) == null || (chat = chatActivity.currentChat) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || photoPickerActivity2.alertOnlyOnce == 2) {
                            return;
                        }
                        AlertsCreator.showSimpleAlert(photoPickerActivity2, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
                        if (photoPickerActivity2.alertOnlyOnce == 1) {
                            photoPickerActivity2.alertOnlyOnce = 2;
                        }
                    }

                    @Override
                    public final void onCheckClick(PhotoAttachPhotoCell photoAttachPhotoCell2) {
                        boolean z;
                        int iIntValue = ((Integer) photoAttachPhotoCell2.getTag()).intValue();
                        ListAdapter listAdapter = ListAdapter.this;
                        PhotoPickerActivity photoPickerActivity2 = PhotoPickerActivity.this;
                        MediaController.AlbumEntry albumEntry = photoPickerActivity2.selectedAlbum;
                        int size = -1;
                        if (albumEntry != null) {
                            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(iIntValue);
                            boolean zContainsKey = PhotoPickerActivity.this.selectedPhotos.containsKey(Integer.valueOf(photoEntry.imageId));
                            z = !zContainsKey;
                            if (!zContainsKey) {
                                PhotoPickerActivity photoPickerActivity3 = PhotoPickerActivity.this;
                                if (photoPickerActivity3.maxSelectedPhotos > 0 && photoPickerActivity3.selectedPhotos.size() >= PhotoPickerActivity.this.maxSelectedPhotos) {
                                    checkSlowMode();
                                    return;
                                }
                            }
                            PhotoPickerActivity photoPickerActivity4 = PhotoPickerActivity.this;
                            if (photoPickerActivity4.allowIndices && !zContainsKey) {
                                size = photoPickerActivity4.selectedPhotosOrder.size();
                            }
                            photoAttachPhotoCell2.setChecked(size, z, true);
                            PhotoPickerActivity.this.addToSelectedPhotos(iIntValue, photoEntry);
                        } else {
                            AndroidUtilities.hideKeyboard(photoPickerActivity2.getParentActivity().getCurrentFocus());
                            MediaController.SearchImage searchImage = (MediaController.SearchImage) PhotoPickerActivity.this.searchResult.get(iIntValue);
                            boolean zContainsKey2 = PhotoPickerActivity.this.selectedPhotos.containsKey(searchImage.id);
                            z = !zContainsKey2;
                            if (!zContainsKey2) {
                                PhotoPickerActivity photoPickerActivity5 = PhotoPickerActivity.this;
                                if (photoPickerActivity5.maxSelectedPhotos > 0 && photoPickerActivity5.selectedPhotos.size() >= PhotoPickerActivity.this.maxSelectedPhotos) {
                                    checkSlowMode();
                                    return;
                                }
                            }
                            PhotoPickerActivity photoPickerActivity6 = PhotoPickerActivity.this;
                            if (photoPickerActivity6.allowIndices && !zContainsKey2) {
                                size = photoPickerActivity6.selectedPhotosOrder.size();
                            }
                            photoAttachPhotoCell2.setChecked(size, z, true);
                            PhotoPickerActivity.this.addToSelectedPhotos(iIntValue, searchImage);
                        }
                        PhotoPickerActivity.this.updatePhotosButton(z ? 1 : 2);
                        PhotoPickerActivity.this.delegate.selectedPhotosChanged();
                    }
                });
                photoAttachPhotoCell.getCheckFrame().setVisibility(photoPickerActivity.selectPhotoType != 0 ? 8 : 0);
                sharedDocumentCell = photoAttachPhotoCell;
            } else if (i == 1) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, LayoutHelper.createFrame(-1.0f, -1));
                sharedDocumentCell = frameLayout;
            } else if (i != 2) {
                boolean z = photoPickerActivity.forceDarckTheme;
                if (i != 3) {
                    DividerCell dividerCell = new DividerCell(context, null);
                    dividerCell.setForceDarkTheme(z);
                    sharedDocumentCell = dividerCell;
                } else {
                    TextCell textCell = new TextCell(23, this.mContext, null, true, false);
                    textCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    if (z) {
                        textCell.textView.setTextColor(Theme.getColor(null, photoPickerActivity.textKey, false));
                        textCell.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_voipgroup_mutedIcon, false), PorterDuff.Mode.MULTIPLY));
                    }
                    sharedDocumentCell = textCell;
                }
            } else {
                sharedDocumentCell = new SharedDocumentCell(context, 1, null);
            }
            return new RecyclerListView.Holder(sharedDocumentCell);
        }
    }

    public interface PhotoPickerActivityDelegate {
        void actionButtonPressed(int i, boolean z, boolean z2);

        boolean canFinishFragment();

        void onCaptionChanged(Editable editable);

        void onOpenInPressed();

        void selectedPhotosChanged();
    }

    public interface PhotoPickerActivitySearchDelegate {
        void shouldClearRecentSearch();

        void shouldSearchText(String str);
    }

    public PhotoPickerActivity(int i, MediaController.AlbumEntry albumEntry, HashMap map, ArrayList arrayList, int i2, boolean z, ChatActivity chatActivity, boolean z2) {
        super(null);
        this.searchResult = new ArrayList();
        this.searchResultKeys = new HashMap();
        new HashMap();
        this.recentSearches = new ArrayList();
        this.imageSearchEndReached = true;
        this.allowOrder = true;
        this.itemSize = 100;
        this.itemsPerRow = 3;
        this.textPaint = new TextPaint(1);
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.needsBottomLayout = true;
        this.provider = new AnonymousClass1();
        this.selectedAlbum = albumEntry;
        this.selectedPhotos = map;
        this.selectedPhotosOrder = arrayList;
        this.type = i;
        this.selectPhotoType = i2;
        this.chatActivity = chatActivity;
        this.allowCaption = z;
        this.forceDarckTheme = z2;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i3 = sharedPreferences.getInt("count", 0);
            for (int i4 = 0; i4 < i3; i4++) {
                String string = sharedPreferences.getString("recent" + i4, null);
                if (string == null) {
                    break;
                }
                this.recentSearches.add(string);
            }
        }
        if (z2) {
            this.dialogBackgroundKey = Theme.key_voipgroup_dialogBackground;
            this.textKey = Theme.key_voipgroup_actionBarItems;
            this.selectorKey = Theme.key_voipgroup_actionBarItemsSelector;
        } else {
            this.dialogBackgroundKey = Theme.key_dialogBackground;
            this.textKey = Theme.key_dialogTextBlack;
            this.selectorKey = Theme.key_dialogButtonSelector;
        }
    }

    public static PhotoAttachPhotoCell access$000(PhotoPickerActivity photoPickerActivity, int i) {
        int childCount = photoPickerActivity.listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = photoPickerActivity.listView.getChildAt(i2);
            if (childAt instanceof PhotoAttachPhotoCell) {
                PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                int iIntValue = ((Integer) photoAttachPhotoCell.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = photoPickerActivity.selectedAlbum;
                if (albumEntry != null) {
                    if (iIntValue >= 0 && iIntValue < albumEntry.photos.size()) {
                        if (iIntValue == i) {
                            return photoAttachPhotoCell;
                        }
                    }
                } else if (iIntValue >= 0 && iIntValue < photoPickerActivity.searchResult.size()) {
                    if (iIntValue == i) {
                        return photoAttachPhotoCell;
                    }
                }
            }
        }
        return null;
    }

    public final int addToSelectedPhotos(int i, Object obj) {
        Object objValueOf;
        boolean z = obj instanceof MediaController.PhotoEntry;
        if (z) {
            objValueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else {
            objValueOf = obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        }
        if (objValueOf == null) {
            return -1;
        }
        HashMap map = this.selectedPhotos;
        boolean zContainsKey = map.containsKey(objValueOf);
        ArrayList arrayList = this.selectedPhotosOrder;
        if (!zContainsKey) {
            map.put(objValueOf, obj);
            arrayList.add(objValueOf);
            return -1;
        }
        map.remove(objValueOf);
        int iIndexOf = arrayList.indexOf(objValueOf);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
        }
        if (this.allowIndices) {
            updateCheckedPhotoIndices$1();
        }
        if (i >= 0) {
            if (z) {
                ((MediaController.PhotoEntry) obj).reset();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).reset();
            }
            this.provider.updatePhotoAtIndex(i);
        }
        return iIndexOf;
    }

    public final void clearRecentSearch() {
        this.recentSearches.clear();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        this.emptyView.showProgress(false, true);
        saveRecentSearch();
    }

    @Override
    public final View createView(Context context) {
        int i = 0;
        this.listSort = false;
        ActionBar actionBar = this.actionBar;
        int i2 = this.dialogBackgroundKey;
        actionBar.setBackgroundColor(Theme.getColor(null, i2, false));
        ActionBar actionBar2 = this.actionBar;
        int i3 = this.textKey;
        actionBar2.setTitleColor(Theme.getColor(null, i3, false));
        this.actionBar.setItemsColor(Theme.getColor(null, i3, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, this.selectorKey, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i4 = this.type;
        int i5 = 1;
        MediaController.AlbumEntry albumEntry = this.selectedAlbum;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i4 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i4 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 9));
        if (this.isDocumentsPicker) {
            ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_other);
            actionBarMenuItemAddItem.setSubMenuDelegate(new ActionBarMenuItem.ActionBarSubMenuItemDelegate() {
                @Override
                public final void onHideSubMenu() {
                }

                @Override
                public final void onShowSubMenu() {
                    PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
                    photoPickerActivity.showAsListItem.setText(LocaleController.getString(photoPickerActivity.listSort ? R.string.ShowAsGrid : R.string.ShowAsList));
                    photoPickerActivity.showAsListItem.setIcon(photoPickerActivity.listSort ? R.drawable.msg_media : R.drawable.msg_list);
                }
            });
            this.showAsListItem = actionBarMenuItemAddItem.addSubItem(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            actionBarMenuItemAddItem.addSubItem(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            ActionBarMenuItem actionBarMenuItemAddItem2 = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
            actionBarMenuItemAddItem2.setIsSearchField$1();
            actionBarMenuItemAddItem2.listener = new AnonymousClass4();
            this.searchItem = actionBarMenuItemAddItem2;
            EditTextBoldCursor searchField = actionBarMenuItemAddItem2.getSearchField();
            searchField.setTextColor(Theme.getColor(null, i3, false));
            searchField.setCursorColor(Theme.getColor(null, i3, false));
            searchField.setHintTextColor(Theme.getColor(null, Theme.key_chat_messagePanelHint, false));
        }
        if (albumEntry == null) {
            if (i4 == 0) {
                this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i4 == 1) {
                this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
        this.sizeNotifierFrameLayout = anonymousClass5;
        anonymousClass5.setBackgroundColor(Theme.getColor(null, i2, false));
        this.fragmentView = this.sizeNotifierFrameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.listView.setClipToPadding(false);
        this.listView.setHorizontalScrollBarEnabled(false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView2 = this.listView;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(4);
        this.layoutManager = anonymousClass6;
        recyclerListView2.setLayoutManager(anonymousClass6);
        this.layoutManager.mSpanSizeLookup = new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int i6) {
                PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
                if (photoPickerActivity.listAdapter.getItemViewType(i6) == 1 || photoPickerActivity.listSort || (photoPickerActivity.selectedAlbum == null && TextUtils.isEmpty(photoPickerActivity.lastSearchString))) {
                    return photoPickerActivity.layoutManager.mSpanCount;
                }
                int i7 = photoPickerActivity.itemSize;
                int i8 = photoPickerActivity.itemsPerRow;
                return i7 + (i6 % i8 != i8 - 1 ? AndroidUtilities.dp(2.0f) : 0);
            }
        };
        this.sizeNotifierFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setGlowColor(Theme.getColor(null, i2, false));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 23));
        if (this.maxSelectedPhotos != 1) {
            this.listView.setOnItemLongClickListener(new PhotoPickerActivity$$ExternalSyntheticLambda1(this, i));
        }
        RecyclerViewItemRangeSelector recyclerViewItemRangeSelector = new RecyclerViewItemRangeSelector(new RecyclerViewItemRangeSelector.RecyclerViewItemRangeSelectorDelegate() {
            @Override
            public final boolean isIndexSelectable(int i6) {
                return PhotoPickerActivity.this.listAdapter.getItemViewType(i6) == 0;
            }

            @Override
            public final boolean isSelected(int i6) {
                PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
                MediaController.AlbumEntry albumEntry2 = photoPickerActivity.selectedAlbum;
                return photoPickerActivity.selectedPhotos.containsKey(albumEntry2 != null ? Integer.valueOf(albumEntry2.photos.get(i6).imageId) : ((MediaController.SearchImage) photoPickerActivity.searchResult.get(i6)).id);
            }

            @Override
            public final void onStartStopSelection(boolean z) {
                PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
                photoPickerActivity.alertOnlyOnce = z ? 1 : 0;
                if (z) {
                    ((ActionBarLayout) ((BaseFragment) photoPickerActivity).parentLayout).getView().requestDisallowInterceptTouchEvent(true);
                }
                photoPickerActivity.listView.hideSelector(true);
            }

            @Override
            public final void setSelected(View view, boolean z) {
                if (z == PhotoPickerActivity.this.shouldSelect && (view instanceof PhotoAttachPhotoCell)) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
                    photoAttachPhotoCell.delegate.onCheckClick(photoAttachPhotoCell);
                }
            }
        });
        this.itemRangeSelector = recyclerViewItemRangeSelector;
        if (this.maxSelectedPhotos != 1) {
            this.listView.mOnItemTouchListeners.add(recyclerViewItemRangeSelector);
        }
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(context, getResourceProvider());
        this.flickerView = anonymousClass9;
        anonymousClass9.setAlpha(0.0f);
        this.flickerView.setVisibility(8);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, getResourceProvider(), context, this.flickerView);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.setAnimateLayoutChange(true);
        this.emptyView.title.setTypeface(Typeface.DEFAULT);
        this.emptyView.title.setTextSize(1, 16.0f);
        this.emptyView.title.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        this.emptyView.addView(this.flickerView, 0);
        if (albumEntry != null) {
            this.emptyView.title.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.emptyView.title.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.emptyView.showProgress(false, false);
        this.sizeNotifierFrameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i6) {
                if (i6 == 1) {
                    AndroidUtilities.hideKeyboard(PhotoPickerActivity.this.getParentActivity().getCurrentFocus());
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
                if (photoPickerActivity.selectedAlbum == null) {
                    int iFindFirstVisibleItemPosition = photoPickerActivity.layoutManager.findFirstVisibleItemPosition();
                    int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(photoPickerActivity.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                    if (iAbs <= 0 || iFindFirstVisibleItemPosition + iAbs <= photoPickerActivity.layoutManager.getItemCount() - 2 || photoPickerActivity.searching || photoPickerActivity.imageSearchEndReached) {
                        return;
                    }
                    photoPickerActivity.searchImages(photoPickerActivity.lastSearchString, photoPickerActivity.nextImagesSearchOffset, photoPickerActivity.type == 1, true);
                }
            }
        });
        if (albumEntry == null) {
            updateSearchInterface();
        }
        if (this.needsBottomLayout) {
            View view = new View(context);
            this.shadow = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.shadow.setTranslationY(AndroidUtilities.dp(48.0f));
            this.sizeNotifierFrameLayout.addView(this.shadow, LayoutHelper.createFrame(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.frameLayout2 = frameLayout;
            frameLayout.setBackgroundColor(Theme.getColor(null, i2, false));
            this.frameLayout2.setVisibility(4);
            this.frameLayout2.setTranslationY(AndroidUtilities.dp(48.0f));
            this.sizeNotifierFrameLayout.addView(this.frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
            this.frameLayout2.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
            EditTextEmoji editTextEmoji = this.commentTextView;
            if (editTextEmoji != null) {
                editTextEmoji.onDestroy();
            }
            this.commentTextView = new EditTextEmoji(context, this.sizeNotifierFrameLayout, null, 1, false, null);
            this.commentTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.commentTextView.setHint(LocaleController.getString(R.string.AddCaption));
            this.commentTextView.onResume();
            EditTextCaption editText = this.commentTextView.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.frameLayout2.addView(this.commentTextView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            Editable editable = this.caption;
            if (editable != null) {
                this.commentTextView.setText(editable);
            }
            this.commentTextView.getEditText().addTextChangedListener(new WebActionBar.AnonymousClass5(this, i5));
            LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 14);
            this.writeButtonContainer = anonymousClass4;
            anonymousClass4.setFocusable(true);
            this.writeButtonContainer.setFocusableInTouchMode(true);
            this.writeButtonContainer.setVisibility(4);
            this.writeButtonContainer.setScaleX(0.2f);
            this.writeButtonContainer.setScaleY(0.2f);
            this.writeButtonContainer.setAlpha(0.0f);
            this.sizeNotifierFrameLayout.addView(this.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.writeButton = new ImageView(context);
            this.writeButton.setBackgroundDrawable(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(null, Theme.key_dialogFloatingButton, false), Theme.getColor(null, Theme.key_dialogFloatingButtonPressed, false)));
            this.writeButton.setImageResource(R.drawable.attach_send);
            this.writeButton.setImportantForAccessibility(2);
            this.writeButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogFloatingIcon, false), PorterDuff.Mode.MULTIPLY));
            this.writeButton.setScaleType(ImageView.ScaleType.CENTER);
            this.writeButton.setOutlineProvider(new RichEditor.AnonymousClass5(16));
            this.writeButtonContainer.addView(this.writeButton, LayoutHelper.createFrame(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.writeButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 17));
            this.writeButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 11));
            TextPaint textPaint = this.textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, context, 25);
            this.selectedCountView = anonymousClass2;
            anonymousClass2.setAlpha(0.0f);
            this.selectedCountView.setScaleX(0.2f);
            this.selectedCountView.setScaleY(0.2f);
            this.sizeNotifierFrameLayout.addView(this.selectedCountView, LayoutHelper.createFrame(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.selectPhotoType != 0) {
                this.commentTextView.setVisibility(8);
            }
        }
        this.allowIndices = (albumEntry != null || i4 == 0 || i4 == 1) && this.allowOrder;
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView4 = this.listView;
        recyclerListView4.animateEmptyView = true;
        recyclerListView4.emptyViewAnimationType = 0;
        updatePhotosButton(0);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.sizeNotifierFrameLayout, 1, null, null, null, null, this.dialogBackgroundKey));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, this.dialogBackgroundKey));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, this.textKey));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, this.textKey));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, this.selectorKey));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, this.textKey));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_chat_messagePanelHint));
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem != null ? actionBarMenuItem.getSearchField() : null, 16777216, null, null, null, null, this.textKey));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, this.dialogBackgroundKey));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{Theme.chat_attachEmptyDrawable}, null, Theme.key_chat_attachEmptyImage));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, null, null, Theme.key_chat_attachPhotoBackground));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(Theme.getColor(null, Theme.key_windowBackgroundGray, false)) > 0.721f;
    }

    public final void lambda$searchBotUser$10(TLObject tLObject, boolean z) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = this.lastSearchImageString;
        this.lastSearchImageString = null;
        searchImages(str, "", z, false);
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
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        if (this.imageReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.imageReqId, true);
            this.imageReqId = 0;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        super.onFragmentDestroy();
    }

    public final void onListItemClick(View view, Object obj) {
        boolean z = addToSelectedPhotos(-1, obj) == -1;
        if (view instanceof SharedDocumentCell) {
            ((SharedDocumentCell) view).setChecked(this.selectedPhotosOrder.contains(Integer.valueOf(this.selectedAlbum.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        updatePhotosButton(z ? 1 : 2);
        this.delegate.selectedPhotosChanged();
    }

    @Override
    public final void onPanTranslationUpdate(float f) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null) {
            return;
        }
        if (!this.commentTextView.emojiViewVisible) {
            recyclerListView.setTranslationY(f);
        } else {
            this.fragmentView.setTranslationY(f);
            this.listView.setTranslationY(0.0f);
        }
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
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.openSearch(true);
            if (!TextUtils.isEmpty(this.initialSearchString)) {
                this.searchItem.setSearchFieldText(this.initialSearchString, false);
                this.initialSearchString = null;
                processSearch(this.searchItem.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        ActionBarMenuItem actionBarMenuItem;
        if (!z || (actionBarMenuItem = this.searchItem) == null) {
            return;
        }
        AndroidUtilities.showKeyboard(actionBarMenuItem.getSearchField());
    }

    public final void processSearch(EditTextBoldCursor editTextBoldCursor) {
        if (editTextBoldCursor.getText().length() == 0) {
            return;
        }
        String string = editTextBoldCursor.getText().toString();
        this.searchResult.clear();
        this.searchResultKeys.clear();
        this.imageSearchEndReached = true;
        searchImages(string, "", this.type == 1, true);
        this.lastSearchString = string;
        if (string.length() == 0) {
            this.lastSearchString = null;
            this.emptyView.title.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.emptyView.title.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.lastSearchString));
        }
        updateSearchInterface();
    }

    public final void saveRecentSearch() {
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        editorEdit.clear();
        editorEdit.putInt("count", this.recentSearches.size());
        int size = this.recentSearches.size();
        for (int i = 0; i < size; i++) {
            editorEdit.putString(DiffUtil.m(i, "recent"), (String) this.recentSearches.get(i));
        }
        editorEdit.commit();
    }

    public final void searchImages(String str, String str2, boolean z, boolean z2) {
        if (this.searching) {
            this.searching = false;
            if (this.imageReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.imageReqId, true);
                this.imageReqId = 0;
            }
        }
        this.lastSearchImageString = str;
        this.searching = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
        TLObject userOrChat = messagesController.getUserOrChat(z ? messagesController2.gifSearchBot : messagesController2.imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z2 || this.searchingUser) {
                return;
            }
            this.searchingUser = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = z ? MessagesController.getInstance(this.currentAccount).gifSearchBot : MessagesController.getInstance(this.currentAccount).imageSearchBot;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new CallLogActivity$$ExternalSyntheticLambda31(10, this, z));
            return;
        }
        TLRPC.User user = (TLRPC.User) userOrChat;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.offset = str2;
        ChatActivity chatActivity = this.chatActivity;
        if (chatActivity != null) {
            long dialogId = chatActivity.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(dialogId);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i = this.lastSearchToken + 1;
        this.lastSearchToken = i;
        this.imageReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new PhotoPickerActivity$$ExternalSyntheticLambda4(this, str, i, z, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.imageReqId, this.classGuid);
    }

    public final void sendSelectedPhotos(int i, boolean z) {
        HashMap map = this.selectedPhotos;
        if (map.isEmpty() || this.delegate == null || this.sendPressed) {
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null && editTextEmoji.editText.length() > 0) {
            Object obj = map.get(this.selectedPhotosOrder.get(0));
            if (obj instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) obj).caption = this.commentTextView.getText().toString();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).caption = this.commentTextView.getText().toString();
            }
        }
        this.sendPressed = true;
        this.delegate.actionButtonPressed(i, false, z);
        if (this.selectPhotoType != 2) {
            PhotoPickerActivityDelegate photoPickerActivityDelegate = this.delegate;
            if (photoPickerActivityDelegate == null || photoPickerActivityDelegate.canFinishFragment()) {
                finishFragment();
            }
        }
    }

    public final void setMaxSelectedPhotos(int i, boolean z) {
        this.maxSelectedPhotos = i;
        this.allowOrder = z;
        if (i <= 0 || this.type != 1) {
            return;
        }
        this.maxSelectedPhotos = 1;
    }

    public final boolean showCommentTextView$1(boolean z, boolean z2) {
        if (this.commentTextView != null) {
            if (z != (this.frameLayout2.getTag() != null)) {
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.frameLayout2.setTag(z ? 1 : null);
                if (this.commentTextView.getEditText().isFocused()) {
                    AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
                }
                this.commentTextView.hidePopup(true);
                if (z) {
                    this.frameLayout2.setVisibility(0);
                    this.writeButtonContainer.setVisibility(0);
                }
                if (!z2) {
                    this.writeButtonContainer.setScaleX(z ? 1.0f : 0.2f);
                    this.writeButtonContainer.setScaleY(z ? 1.0f : 0.2f);
                    this.writeButtonContainer.setAlpha(z ? 1.0f : 0.0f);
                    this.selectedCountView.setScaleX(z ? 1.0f : 0.2f);
                    this.selectedCountView.setScaleY(z ? 1.0f : 0.2f);
                    this.selectedCountView.setAlpha(z ? 1.0f : 0.0f);
                    this.frameLayout2.setTranslationY(z ? 0.0f : AndroidUtilities.dp(48.0f));
                    this.shadow.setTranslationY(z ? 0.0f : AndroidUtilities.dp(48.0f));
                    if (!z) {
                        this.frameLayout2.setVisibility(4);
                        this.writeButtonContainer.setVisibility(4);
                    }
                    return true;
                }
                this.animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                LoginActivity.AnonymousClass4 anonymousClass4 = this.writeButtonContainer;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass4, (Property<LoginActivity.AnonymousClass4, Float>) property, z ? 1.0f : 0.2f));
                LoginActivity.AnonymousClass4 anonymousClass5 = this.writeButtonContainer;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass5, (Property<LoginActivity.AnonymousClass4, Float>) property2, z ? 1.0f : 0.2f));
                LoginActivity.AnonymousClass4 anonymousClass6 = this.writeButtonContainer;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<LoginActivity.AnonymousClass4, Float>) property3, z ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.selectedCountView, (Property<QrActivity.AnonymousClass2, Float>) property, z ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.selectedCountView, (Property<QrActivity.AnonymousClass2, Float>) property2, z ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.selectedCountView, (Property<QrActivity.AnonymousClass2, Float>) property3, z ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.frameLayout2;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z ? 0.0f : AndroidUtilities.dp(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.shadow, (Property<View, Float>) property4, z ? 0.0f : AndroidUtilities.dp(48.0f)));
                this.animatorSet.playTogether(arrayList);
                this.animatorSet.setInterpolator(new DecelerateInterpolator());
                this.animatorSet.setDuration(180L);
                this.animatorSet.addListener(new LoginActivity.AnonymousClass9(22, this, z));
                this.animatorSet.start();
                return true;
            }
        }
        return false;
    }

    public final void updateCheckedPhotoIndices$1() {
        if (this.allowIndices) {
            int childCount = this.listView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                boolean z = childAt instanceof PhotoAttachPhotoCell;
                MediaController.AlbumEntry albumEntry = this.selectedAlbum;
                ArrayList arrayList = this.selectedPhotosOrder;
                if (z) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (albumEntry != null) {
                        photoAttachPhotoCell.setNum(this.allowIndices ? arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(num.intValue()).imageId)) : -1);
                    } else {
                        photoAttachPhotoCell.setNum(this.allowIndices ? arrayList.indexOf(((MediaController.SearchImage) this.searchResult.get(num.intValue())).id) : -1);
                    }
                } else if (childAt instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) childAt).setChecked(arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0, false);
                }
            }
        }
    }

    public final void updatePhotosButton(int i) {
        if (this.selectedPhotos.size() == 0) {
            this.selectedCountView.setPivotX(0.0f);
            this.selectedCountView.setPivotY(0.0f);
            showCommentTextView$1(false, i != 0);
            return;
        }
        this.selectedCountView.invalidate();
        if (showCommentTextView$1(true, i != 0) || i == 0) {
            this.selectedCountView.setPivotX(0.0f);
            this.selectedCountView.setPivotY(0.0f);
            return;
        }
        this.selectedCountView.setPivotX(AndroidUtilities.dp(21.0f));
        this.selectedCountView.setPivotY(AndroidUtilities.dp(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.selectedCountView, (Property<QrActivity.AnonymousClass2, Float>) View.SCALE_X, i == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.selectedCountView, (Property<QrActivity.AnonymousClass2, Float>) View.SCALE_Y, i == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    public final void updateSearchInterface() {
        String str;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        if (this.searching || (this.recentSearches.size() > 0 && ((str = this.lastSearchString) == null || TextUtils.isEmpty(str)))) {
            this.emptyView.showProgress(true, true);
        } else {
            this.emptyView.showProgress(false, true);
        }
    }

    public final class AnonymousClass14 implements View.OnTouchListener {
        public final int $r8$classId = 1;
        public final Rect popupRect = new Rect();
        public final NotificationCenter.NotificationCenterDelegate this$0;

        public AnonymousClass14(ChatActivityEnterView chatActivityEnterView) {
            this.this$0 = chatActivityEnterView;
        }

        @Override
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PhotoPickerActivity photoPickerActivity;
            ActionBarPopupWindow actionBarPopupWindow;
            ChatActivityEnterView chatActivityEnterView;
            ChatActivityEnterView.AnonymousClass44 anonymousClass44;
            PhotoAlbumPickerActivity photoAlbumPickerActivity;
            ActionBarPopupWindow actionBarPopupWindow2;
            switch (this.$r8$classId) {
                case 0:
                    if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow = (photoPickerActivity = (PhotoPickerActivity) this.this$0).sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
                        Rect rect = this.popupRect;
                        view.getHitRect(rect);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            photoPickerActivity.sendPopupWindow.dismiss(true);
                        }
                        break;
                    }
                    break;
                case 1:
                    if (motionEvent.getActionMasked() == 0 && (anonymousClass44 = (chatActivityEnterView = (ChatActivityEnterView) this.this$0).sendPopupWindow) != null && anonymousClass44.isShowing()) {
                        Rect rect2 = this.popupRect;
                        view.getHitRect(rect2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            chatActivityEnterView.sendPopupWindow.dismiss();
                        }
                        break;
                    }
                    break;
                default:
                    if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow2 = (photoAlbumPickerActivity = (PhotoAlbumPickerActivity) this.this$0).sendPopupWindow) != null && actionBarPopupWindow2.isShowing()) {
                        Rect rect3 = this.popupRect;
                        view.getHitRect(rect3);
                        if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            photoAlbumPickerActivity.sendPopupWindow.dismiss(true);
                        }
                        break;
                    }
                    break;
            }
            return false;
        }

        public AnonymousClass14(PhotoAlbumPickerActivity photoAlbumPickerActivity) {
            this.this$0 = photoAlbumPickerActivity;
        }

        public AnonymousClass14(PhotoPickerActivity photoPickerActivity) {
            this.this$0 = photoPickerActivity;
        }
    }
}
