package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Outline;
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
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DividerCell;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackupImageView;
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
import org.telegram.ui.PhotoViewer;

public class PhotoPickerActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int alertOnlyOnce;
    private boolean allowCaption;
    private boolean allowIndices;
    private AnimatorSet animatorSet;
    private CharSequence caption;
    private ChatActivity chatActivity;
    protected EditTextEmoji commentTextView;
    private PhotoPickerActivityDelegate delegate;
    private final int dialogBackgroundKey;
    private StickerEmptyView emptyView;
    private FlickerLoadingView flickerView;
    private final boolean forceDarckTheme;
    protected FrameLayout frameLayout2;
    private int imageReqId;
    private String initialSearchString;
    private boolean isDocumentsPicker;
    private ActionBarMenuSubItem[] itemCells;
    private RecyclerViewItemRangeSelector itemRangeSelector;
    private String lastSearchImageString;
    private String lastSearchString;
    private int lastSearchToken;
    private GridLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private boolean listSort;
    private RecyclerListView listView;
    private int maxSelectedPhotos;
    private String nextImagesSearchOffset;
    private PhotoPickerActivitySearchDelegate searchDelegate;
    private ActionBarMenuItem searchItem;
    private boolean searching;
    private boolean searchingUser;
    private int selectPhotoType;
    private MediaController.AlbumEntry selectedAlbum;
    protected View selectedCountView;
    private HashMap selectedPhotos;
    private ArrayList selectedPhotosOrder;
    private final int selectorKey;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout sendPopupLayout;
    private ActionBarPopupWindow sendPopupWindow;
    private boolean sendPressed;
    protected View shadow;
    private boolean shouldSelect;
    private ActionBarMenuSubItem showAsListItem;
    private SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private final int textKey;
    private int type;
    private ImageView writeButton;
    protected FrameLayout writeButtonContainer;
    private Drawable writeButtonDrawable;
    private ArrayList searchResult = new ArrayList();
    private HashMap searchResultKeys = new HashMap();
    private HashMap searchResultUrls = new HashMap();
    private ArrayList recentSearches = new ArrayList();
    private boolean imageSearchEndReached = true;
    private boolean allowOrder = true;
    private int itemSize = 100;
    private int itemsPerRow = 3;
    private TextPaint textPaint = new TextPaint(1);
    private RectF rect = new RectF();
    private Paint paint = new Paint(1);
    private boolean needsBottomLayout = true;
    private PhotoViewer.PhotoViewerProvider provider = new PhotoViewer.EmptyPhotoViewerProvider() {
        @Override
        public boolean scaleToFill() {
            return false;
        }

        @Override
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            PhotoAttachPhotoCell cellForIndex = PhotoPickerActivity.this.getCellForIndex(i);
            if (cellForIndex == null) {
                return null;
            }
            BackupImageView imageView = cellForIndex.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = PhotoPickerActivity.this.listView;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            placeProviderObject.imageReceiver = imageReceiver;
            placeProviderObject.thumb = imageReceiver.getBitmapSafe();
            placeProviderObject.scale = cellForIndex.getScale();
            cellForIndex.showCheck(false);
            return placeProviderObject;
        }

        @Override
        public void updatePhotoAtIndex(int i) {
            PhotoAttachPhotoCell cellForIndex = PhotoPickerActivity.this.getCellForIndex(i);
            if (cellForIndex != null) {
                if (PhotoPickerActivity.this.selectedAlbum == null) {
                    cellForIndex.setPhotoEntry((MediaController.SearchImage) PhotoPickerActivity.this.searchResult.get(i), true, false);
                    return;
                }
                BackupImageView imageView = cellForIndex.getImageView();
                imageView.setOrientation(0, true);
                MediaController.PhotoEntry photoEntry = PhotoPickerActivity.this.selectedAlbum.photos.get(i);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.setImage(str, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                if (photoEntry.path != null) {
                    imageView.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo) {
                        imageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
                        return;
                    }
                    imageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                imageView.setImageDrawable(Theme.chat_attachEmptyDrawable);
            }
        }

        @Override
        public boolean allowCaption() {
            return PhotoPickerActivity.this.allowCaption;
        }

        @Override
        public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i) {
            PhotoAttachPhotoCell cellForIndex = PhotoPickerActivity.this.getCellForIndex(i);
            if (cellForIndex != null) {
                return cellForIndex.getImageView().getImageReceiver().getBitmapSafe();
            }
            return null;
        }

        @Override
        public void willSwitchFromPhoto(org.telegram.messenger.MessageObject r4, org.telegram.tgnet.TLRPC.FileLocation r5, int r6) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoPickerActivity.AnonymousClass1.willSwitchFromPhoto(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int):void");
        }

        @Override
        public void willHidePhotoViewer() {
            int childCount = PhotoPickerActivity.this.listView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = PhotoPickerActivity.this.listView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    ((PhotoAttachPhotoCell) childAt).showCheck(true);
                }
            }
        }

        @Override
        public boolean isPhotoChecked(int i) {
            return PhotoPickerActivity.this.selectedAlbum != null ? i >= 0 && i < PhotoPickerActivity.this.selectedAlbum.photos.size() && PhotoPickerActivity.this.selectedPhotos.containsKey(Integer.valueOf(PhotoPickerActivity.this.selectedAlbum.photos.get(i).imageId)) : i >= 0 && i < PhotoPickerActivity.this.searchResult.size() && PhotoPickerActivity.this.selectedPhotos.containsKey(((MediaController.SearchImage) PhotoPickerActivity.this.searchResult.get(i)).id);
        }

        @Override
        public int setPhotoUnchecked(Object obj) {
            Object objValueOf;
            if (obj instanceof MediaController.PhotoEntry) {
                objValueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
            } else {
                objValueOf = obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
            }
            if (objValueOf == null || !PhotoPickerActivity.this.selectedPhotos.containsKey(objValueOf)) {
                return -1;
            }
            PhotoPickerActivity.this.selectedPhotos.remove(objValueOf);
            int iIndexOf = PhotoPickerActivity.this.selectedPhotosOrder.indexOf(objValueOf);
            if (iIndexOf >= 0) {
                PhotoPickerActivity.this.selectedPhotosOrder.remove(iIndexOf);
            }
            if (PhotoPickerActivity.this.allowIndices) {
                PhotoPickerActivity.this.updateCheckedPhotoIndices();
            }
            return iIndexOf;
        }

        @Override
        public int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
            int iAddToSelectedPhotos;
            boolean z;
            if (PhotoPickerActivity.this.selectedAlbum != null) {
                if (i < 0 || i >= PhotoPickerActivity.this.selectedAlbum.photos.size()) {
                    return -1;
                }
                MediaController.PhotoEntry photoEntry = PhotoPickerActivity.this.selectedAlbum.photos.get(i);
                iAddToSelectedPhotos = PhotoPickerActivity.this.addToSelectedPhotos(photoEntry, -1);
                if (iAddToSelectedPhotos == -1) {
                    photoEntry.editedInfo = videoEditedInfo;
                    iAddToSelectedPhotos = PhotoPickerActivity.this.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntry.imageId));
                    z = true;
                } else {
                    photoEntry.editedInfo = null;
                    z = false;
                }
            } else {
                if (i < 0 || i >= PhotoPickerActivity.this.searchResult.size()) {
                    return -1;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) PhotoPickerActivity.this.searchResult.get(i);
                iAddToSelectedPhotos = PhotoPickerActivity.this.addToSelectedPhotos(searchImage, -1);
                if (iAddToSelectedPhotos == -1) {
                    searchImage.editedInfo = videoEditedInfo;
                    iAddToSelectedPhotos = PhotoPickerActivity.this.selectedPhotosOrder.indexOf(searchImage.id);
                    z = true;
                } else {
                    searchImage.editedInfo = null;
                    z = false;
                }
            }
            int childCount = PhotoPickerActivity.this.listView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = PhotoPickerActivity.this.listView.getChildAt(i2);
                if (((Integer) childAt.getTag()).intValue() == i) {
                    ((PhotoAttachPhotoCell) childAt).setChecked(PhotoPickerActivity.this.allowIndices ? iAddToSelectedPhotos : -1, z, false);
                } else {
                    i2++;
                }
            }
            PhotoPickerActivity.this.updatePhotosButton(z ? 1 : 2);
            PhotoPickerActivity.this.delegate.selectedPhotosChanged();
            return iAddToSelectedPhotos;
        }

        @Override
        public boolean cancelButtonPressed() {
            PhotoPickerActivity.this.delegate.actionButtonPressed(true, true, 0, 0);
            PhotoPickerActivity.this.finishFragment();
            return true;
        }

        @Override
        public int getSelectedCount() {
            return PhotoPickerActivity.this.selectedPhotos.size();
        }

        @Override
        public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
            if (PhotoPickerActivity.this.selectedPhotos.isEmpty()) {
                if (PhotoPickerActivity.this.selectedAlbum != null) {
                    if (i < 0 || i >= PhotoPickerActivity.this.selectedAlbum.photos.size()) {
                        return;
                    }
                    MediaController.PhotoEntry photoEntry = PhotoPickerActivity.this.selectedAlbum.photos.get(i);
                    photoEntry.editedInfo = videoEditedInfo;
                    PhotoPickerActivity.this.addToSelectedPhotos(photoEntry, -1);
                } else {
                    if (i < 0 || i >= PhotoPickerActivity.this.searchResult.size()) {
                        return;
                    }
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) PhotoPickerActivity.this.searchResult.get(i);
                    searchImage.editedInfo = videoEditedInfo;
                    PhotoPickerActivity.this.addToSelectedPhotos(searchImage, -1);
                }
            }
            PhotoPickerActivity.this.sendSelectedPhotos(z, i2, 0);
        }

        @Override
        public ArrayList getSelectedPhotosOrder() {
            return PhotoPickerActivity.this.selectedPhotosOrder;
        }

        @Override
        public HashMap getSelectedPhotos() {
            return PhotoPickerActivity.this.selectedPhotos;
        }
    };

    public interface PhotoPickerActivityDelegate {

        public abstract class CC {
            public static boolean $default$canFinishFragment(PhotoPickerActivityDelegate photoPickerActivityDelegate) {
                return true;
            }

            public static void $default$onOpenInPressed(PhotoPickerActivityDelegate photoPickerActivityDelegate) {
            }
        }

        void actionButtonPressed(boolean z, boolean z2, int i, int i2);

        boolean canFinishFragment();

        void onCaptionChanged(CharSequence charSequence);

        void onOpenInPressed();

        void selectedPhotosChanged();
    }

    public interface PhotoPickerActivitySearchDelegate {
        void shouldClearRecentSearch();

        void shouldSearchText(String str);
    }

    public static boolean lambda$createView$3(View view, MotionEvent motionEvent) {
        return true;
    }

    public PhotoPickerActivity(int i, MediaController.AlbumEntry albumEntry, HashMap map, ArrayList arrayList, int i2, boolean z, ChatActivity chatActivity, boolean z2) {
        this.selectedAlbum = albumEntry;
        this.selectedPhotos = map;
        this.selectedPhotosOrder = arrayList;
        this.type = i;
        this.selectPhotoType = i2;
        this.chatActivity = chatActivity;
        this.allowCaption = z;
        this.forceDarckTheme = z2;
        if (albumEntry == null) {
            loadRecentSearch();
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

    public void setDocumentsPicker(boolean z) {
        this.isDocumentsPicker = z;
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
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

    @Override
    public View createView(Context context) {
        int i;
        this.listSort = false;
        this.actionBar.setBackgroundColor(Theme.getColor(this.dialogBackgroundKey));
        this.actionBar.setTitleColor(Theme.getColor(this.textKey));
        this.actionBar.setItemsColor(Theme.getColor(this.textKey), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(this.selectorKey), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        MediaController.AlbumEntry albumEntry = this.selectedAlbum;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else {
            int i2 = this.type;
            if (i2 == 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i2 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    PhotoPickerActivity.this.finishFragment();
                    return;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (PhotoPickerActivity.this.delegate != null) {
                            PhotoPickerActivity.this.delegate.onOpenInPressed();
                        }
                        PhotoPickerActivity.this.finishFragment();
                        return;
                    }
                    return;
                }
                PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
                photoPickerActivity.listSort = true ^ photoPickerActivity.listSort;
                if (PhotoPickerActivity.this.listSort) {
                    PhotoPickerActivity.this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                } else {
                    PhotoPickerActivity.this.listView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                }
                PhotoPickerActivity.this.listView.stopScroll();
                PhotoPickerActivity.this.layoutManager.scrollToPositionWithOffset(0, 0);
                PhotoPickerActivity.this.listAdapter.notifyDataSetChanged();
            }
        });
        if (this.isDocumentsPicker) {
            ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_other);
            actionBarMenuItemAddItem.setSubMenuDelegate(new ActionBarMenuItem.ActionBarSubMenuItemDelegate() {
                @Override
                public void onHideSubMenu() {
                }

                @Override
                public void onShowSubMenu() {
                    PhotoPickerActivity.this.showAsListItem.setText(LocaleController.getString(PhotoPickerActivity.this.listSort ? R.string.ShowAsGrid : R.string.ShowAsList));
                    PhotoPickerActivity.this.showAsListItem.setIcon(PhotoPickerActivity.this.listSort ? R.drawable.msg_media : R.drawable.msg_list);
                }
            });
            this.showAsListItem = actionBarMenuItemAddItem.addSubItem(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            actionBarMenuItemAddItem.addSubItem(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (this.selectedAlbum == null) {
            ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new AnonymousClass4());
            this.searchItem = actionBarMenuItemSearchListener;
            EditTextBoldCursor searchField = actionBarMenuItemSearchListener.getSearchField();
            searchField.setTextColor(Theme.getColor(this.textKey));
            searchField.setCursorColor(Theme.getColor(this.textKey));
            searchField.setHintTextColor(Theme.getColor(Theme.key_chat_messagePanelHint));
        }
        if (this.selectedAlbum == null) {
            int i3 = this.type;
            if (i3 == 0) {
                this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i3 == 1) {
                this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
        this.sizeNotifierFrameLayout = anonymousClass5;
        anonymousClass5.setBackgroundColor(Theme.getColor(this.dialogBackgroundKey));
        this.fragmentView = this.sizeNotifierFrameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.listView.setClipToPadding(false);
        this.listView.setHorizontalScrollBarEnabled(false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView2 = this.listView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = gridLayoutManager;
        recyclerListView2.setLayoutManager(gridLayoutManager);
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i4) {
                if (PhotoPickerActivity.this.listAdapter.getItemViewType(i4) == 1 || PhotoPickerActivity.this.listSort || (PhotoPickerActivity.this.selectedAlbum == null && TextUtils.isEmpty(PhotoPickerActivity.this.lastSearchString))) {
                    return PhotoPickerActivity.this.layoutManager.getSpanCount();
                }
                return PhotoPickerActivity.this.itemSize + (i4 % PhotoPickerActivity.this.itemsPerRow != PhotoPickerActivity.this.itemsPerRow - 1 ? AndroidUtilities.dp(2.0f) : 0);
            }
        });
        this.sizeNotifierFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setGlowColor(Theme.getColor(this.dialogBackgroundKey));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i4) throws NumberFormatException {
                this.f$0.lambda$createView$1(view, i4);
            }
        });
        if (this.maxSelectedPhotos != 1) {
            this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                @Override
                public final boolean onItemClick(View view, int i4) {
                    return this.f$0.lambda$createView$2(view, i4);
                }
            });
        }
        RecyclerViewItemRangeSelector recyclerViewItemRangeSelector = new RecyclerViewItemRangeSelector(new RecyclerViewItemRangeSelector.RecyclerViewItemRangeSelectorDelegate() {
            @Override
            public void setSelected(View view, int i4, boolean z) {
                if (z == PhotoPickerActivity.this.shouldSelect && (view instanceof PhotoAttachPhotoCell)) {
                    ((PhotoAttachPhotoCell) view).callDelegate();
                }
            }

            @Override
            public boolean isSelected(int i4) {
                Object objValueOf;
                if (PhotoPickerActivity.this.selectedAlbum != null) {
                    objValueOf = Integer.valueOf(PhotoPickerActivity.this.selectedAlbum.photos.get(i4).imageId);
                } else {
                    objValueOf = ((MediaController.SearchImage) PhotoPickerActivity.this.searchResult.get(i4)).id;
                }
                return PhotoPickerActivity.this.selectedPhotos.containsKey(objValueOf);
            }

            @Override
            public boolean isIndexSelectable(int i4) {
                return PhotoPickerActivity.this.listAdapter.getItemViewType(i4) == 0;
            }

            @Override
            public void onStartStopSelection(boolean z) {
                PhotoPickerActivity.this.alertOnlyOnce = z ? 1 : 0;
                if (z) {
                    ((BaseFragment) PhotoPickerActivity.this).parentLayout.getView().requestDisallowInterceptTouchEvent(true);
                }
                PhotoPickerActivity.this.listView.hideSelector(true);
            }
        });
        this.itemRangeSelector = recyclerViewItemRangeSelector;
        if (this.maxSelectedPhotos != 1) {
            this.listView.addOnItemTouchListener(recyclerViewItemRangeSelector);
        }
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, getResourceProvider()) {
            @Override
            public int getColumnsCount() {
                return 3;
            }

            @Override
            public int getViewType() {
                return 2;
            }
        };
        this.flickerView = flickerLoadingView;
        flickerLoadingView.setAlpha(0.0f);
        this.flickerView.setVisibility(8);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, this.flickerView, 1, getResourceProvider());
        this.emptyView = stickerEmptyView;
        stickerEmptyView.setAnimateLayoutChange(true);
        this.emptyView.title.setTypeface(Typeface.DEFAULT);
        this.emptyView.title.setTextSize(1, 16.0f);
        this.emptyView.title.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        this.emptyView.addView(this.flickerView, 0);
        if (this.selectedAlbum != null) {
            this.emptyView.title.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.emptyView.title.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.emptyView.showProgress(false, false);
        this.sizeNotifierFrameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                if (i4 == 1) {
                    AndroidUtilities.hideKeyboard(PhotoPickerActivity.this.getParentActivity().getCurrentFocus());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) throws NumberFormatException {
                if (PhotoPickerActivity.this.selectedAlbum == null) {
                    int iFindFirstVisibleItemPosition = PhotoPickerActivity.this.layoutManager.findFirstVisibleItemPosition();
                    int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(PhotoPickerActivity.this.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                    if (iAbs <= 0 || iFindFirstVisibleItemPosition + iAbs <= PhotoPickerActivity.this.layoutManager.getItemCount() - 2 || PhotoPickerActivity.this.searching || PhotoPickerActivity.this.imageSearchEndReached) {
                        return;
                    }
                    PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
                    photoPickerActivity.searchImages(photoPickerActivity.type == 1, PhotoPickerActivity.this.lastSearchString, PhotoPickerActivity.this.nextImagesSearchOffset, true);
                }
            }
        });
        if (this.selectedAlbum == null) {
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
            frameLayout.setBackgroundColor(Theme.getColor(this.dialogBackgroundKey));
            this.frameLayout2.setVisibility(4);
            this.frameLayout2.setTranslationY(AndroidUtilities.dp(48.0f));
            this.sizeNotifierFrameLayout.addView(this.frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
            this.frameLayout2.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return PhotoPickerActivity.lambda$createView$3(view2, motionEvent);
                }
            });
            EditTextEmoji editTextEmoji = this.commentTextView;
            if (editTextEmoji != null) {
                editTextEmoji.onDestroy();
            }
            this.commentTextView = new EditTextEmoji(context, this.sizeNotifierFrameLayout, null, 1, false);
            this.commentTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.commentTextView.setHint(LocaleController.getString(R.string.AddCaption));
            this.commentTextView.onResume();
            EditTextCaption editText = this.commentTextView.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.frameLayout2.addView(this.commentTextView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.caption;
            if (charSequence != null) {
                this.commentTextView.setText(charSequence);
            }
            this.commentTextView.getEditText().addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence2, int i4, int i5, int i6) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence2, int i4, int i5, int i6) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (PhotoPickerActivity.this.delegate != null) {
                        PhotoPickerActivity.this.delegate.onCaptionChanged(editable);
                    }
                }
            });
            FrameLayout frameLayout2 = new FrameLayout(context) {
                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", PhotoPickerActivity.this.selectedPhotos.size(), new Object[0]));
                    accessibilityNodeInfo.setClassName(Button.class.getName());
                    accessibilityNodeInfo.setLongClickable(true);
                    accessibilityNodeInfo.setClickable(true);
                }
            };
            this.writeButtonContainer = frameLayout2;
            frameLayout2.setFocusable(true);
            this.writeButtonContainer.setFocusableInTouchMode(true);
            this.writeButtonContainer.setVisibility(4);
            this.writeButtonContainer.setScaleX(0.2f);
            this.writeButtonContainer.setScaleY(0.2f);
            this.writeButtonContainer.setAlpha(0.0f);
            this.sizeNotifierFrameLayout.addView(this.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.writeButton = new ImageView(context);
            Drawable drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(Theme.key_dialogFloatingButton), Theme.getColor(Theme.key_dialogFloatingButtonPressed));
            this.writeButtonDrawable = drawableCreateSimpleSelectorCircleDrawable;
            this.writeButton.setBackgroundDrawable(drawableCreateSimpleSelectorCircleDrawable);
            this.writeButton.setImageResource(R.drawable.attach_send);
            this.writeButton.setImportantForAccessibility(2);
            this.writeButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogFloatingIcon), PorterDuff.Mode.MULTIPLY));
            this.writeButton.setScaleType(ImageView.ScaleType.CENTER);
            this.writeButton.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view2, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                }
            });
            this.writeButtonContainer.addView(this.writeButton, LayoutHelper.createFrame(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.writeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$createView$5(view2);
                }
            });
            this.writeButton.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view2) {
                    return this.f$0.lambda$createView$9(view2);
                }
            });
            this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.textPaint.setTypeface(AndroidUtilities.bold());
            View view2 = new View(context) {
                @Override
                protected void onDraw(Canvas canvas) {
                    String str = String.format("%d", Integer.valueOf(Math.max(1, PhotoPickerActivity.this.selectedPhotosOrder.size())));
                    int iMax = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(PhotoPickerActivity.this.textPaint.measureText(str))), AndroidUtilities.dp(24.0f));
                    int measuredWidth = getMeasuredWidth() / 2;
                    getMeasuredHeight();
                    PhotoPickerActivity.this.textPaint.setColor(Theme.getColor(Theme.key_dialogRoundCheckBoxCheck));
                    PhotoPickerActivity.this.paint.setColor(Theme.getColor(PhotoPickerActivity.this.dialogBackgroundKey));
                    int i4 = iMax / 2;
                    PhotoPickerActivity.this.rect.set(measuredWidth - i4, 0.0f, i4 + measuredWidth, getMeasuredHeight());
                    canvas.drawRoundRect(PhotoPickerActivity.this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), PhotoPickerActivity.this.paint);
                    PhotoPickerActivity.this.paint.setColor(Theme.getColor(Theme.key_dialogRoundCheckBox));
                    PhotoPickerActivity.this.rect.set(r5 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), r2 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                    canvas.drawRoundRect(PhotoPickerActivity.this.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), PhotoPickerActivity.this.paint);
                    canvas.drawText(str, measuredWidth - (r1 / 2), AndroidUtilities.dp(16.2f), PhotoPickerActivity.this.textPaint);
                }
            };
            this.selectedCountView = view2;
            view2.setAlpha(0.0f);
            this.selectedCountView.setScaleX(0.2f);
            this.selectedCountView.setScaleY(0.2f);
            this.sizeNotifierFrameLayout.addView(this.selectedCountView, LayoutHelper.createFrame(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.selectPhotoType != PhotoAlbumPickerActivity.SELECT_TYPE_ALL) {
                this.commentTextView.setVisibility(8);
            }
        }
        this.allowIndices = (this.selectedAlbum != null || (i = this.type) == 0 || i == 1) && this.allowOrder;
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAnimateEmptyView(true, 0);
        updatePhotosButton(0);
        return this.fragmentView;
    }

    class AnonymousClass4 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        Runnable updateSearch = new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$$0();
            }
        };

        @Override
        public void onSearchExpand() {
        }

        AnonymousClass4() {
        }

        @Override
        public boolean canCollapseSearch() {
            PhotoPickerActivity.this.finishFragment();
            return false;
        }

        @Override
        public void onTextChanged(EditText editText) {
            if (editText.getText().length() == 0) {
                PhotoPickerActivity.this.searchResult.clear();
                PhotoPickerActivity.this.searchResultKeys.clear();
                PhotoPickerActivity.this.lastSearchString = null;
                PhotoPickerActivity.this.imageSearchEndReached = true;
                PhotoPickerActivity.this.searching = false;
                if (PhotoPickerActivity.this.imageReqId != 0) {
                    ConnectionsManager.getInstance(((BaseFragment) PhotoPickerActivity.this).currentAccount).cancelRequest(PhotoPickerActivity.this.imageReqId, true);
                    PhotoPickerActivity.this.imageReqId = 0;
                }
                PhotoPickerActivity.this.emptyView.title.setText(LocaleController.getString(R.string.NoRecentSearches));
                PhotoPickerActivity.this.emptyView.showProgress(false);
                PhotoPickerActivity.this.updateSearchInterface();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.updateSearch);
            AndroidUtilities.runOnUIThread(this.updateSearch, 1200L);
        }

        public void lambda$$0() throws NumberFormatException {
            PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
            photoPickerActivity.processSearch(photoPickerActivity.searchItem.getSearchField());
        }

        @Override
        public void onSearchPressed(EditText editText) throws NumberFormatException {
            PhotoPickerActivity.this.processSearch(editText);
        }
    }

    class AnonymousClass5 extends SizeNotifierFrameLayout {
        private boolean ignoreLayout;
        private int lastItemSize;
        private int lastNotifyWidth;

        AnonymousClass5(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            if (AndroidUtilities.isTablet()) {
                PhotoPickerActivity.this.itemsPerRow = 4;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    PhotoPickerActivity.this.itemsPerRow = 4;
                } else {
                    PhotoPickerActivity.this.itemsPerRow = 3;
                }
            }
            this.ignoreLayout = true;
            PhotoPickerActivity.this.itemSize = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / PhotoPickerActivity.this.itemsPerRow;
            if (this.lastItemSize != PhotoPickerActivity.this.itemSize) {
                this.lastItemSize = PhotoPickerActivity.this.itemSize;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onMeasure$0();
                    }
                });
            }
            if (PhotoPickerActivity.this.listSort) {
                PhotoPickerActivity.this.layoutManager.setSpanCount(1);
            } else {
                PhotoPickerActivity.this.layoutManager.setSpanCount(Math.max(1, (PhotoPickerActivity.this.itemSize * PhotoPickerActivity.this.itemsPerRow) + (AndroidUtilities.dp(2.0f) * (PhotoPickerActivity.this.itemsPerRow - 1))));
            }
            this.ignoreLayout = false;
            onMeasureInternal(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        public void lambda$onMeasure$0() {
            PhotoPickerActivity.this.listAdapter.notifyDataSetChanged();
        }

        private void onMeasureInternal(int i, int i2) {
            EditTextEmoji editTextEmoji;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            int iMeasureKeyboardHeight = measureKeyboardHeight();
            if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow) {
                PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
                if (photoPickerActivity.commentTextView != null && photoPickerActivity.frameLayout2.getParent() == this) {
                    size2 -= PhotoPickerActivity.this.commentTextView.getEmojiPadding();
                    i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                }
            }
            if (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) && (editTextEmoji = PhotoPickerActivity.this.commentTextView) != null) {
                this.ignoreLayout = true;
                editTextEmoji.hideEmojiView();
                this.ignoreLayout = false;
            }
            EditTextEmoji editTextEmoji2 = PhotoPickerActivity.this.commentTextView;
            if (editTextEmoji2 != null && editTextEmoji2.isPopupShowing()) {
                PhotoPickerActivity.this.fragmentView.setTranslationY(0.0f);
                PhotoPickerActivity.this.listView.setTranslationY(0.0f);
                PhotoPickerActivity.this.emptyView.setTranslationY(0.0f);
            }
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8) {
                    EditTextEmoji editTextEmoji3 = PhotoPickerActivity.this.commentTextView;
                    if (editTextEmoji3 != null && editTextEmoji3.isPopupView(childAt)) {
                        if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                            if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (size2 - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                            }
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        }
                    } else {
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                    }
                }
            }
        }

        @Override
        protected void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoPickerActivity.AnonymousClass5.onLayout(boolean, int, int, int, int):void");
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public void lambda$createView$1(View view, int i) throws NumberFormatException {
        ArrayList<MediaController.PhotoEntry> arrayList;
        int i2;
        if (this.selectedAlbum == null && this.searchResult.isEmpty()) {
            if (i < this.recentSearches.size()) {
                String str = (String) this.recentSearches.get(i);
                PhotoPickerActivitySearchDelegate photoPickerActivitySearchDelegate = this.searchDelegate;
                if (photoPickerActivitySearchDelegate != null) {
                    photoPickerActivitySearchDelegate.shouldSearchText(str);
                    return;
                }
                this.searchItem.getSearchField().setText(str);
                this.searchItem.getSearchField().setSelection(str.length());
                processSearch(this.searchItem.getSearchField());
                return;
            }
            if (i == this.recentSearches.size() + 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString(R.string.ClearSearchAlertTitle));
                builder.setMessage(LocaleController.getString(R.string.ClearSearchAlert));
                builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        this.f$0.lambda$createView$0(alertDialog, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            return;
        }
        MediaController.AlbumEntry albumEntry = this.selectedAlbum;
        if (albumEntry != null) {
            arrayList = albumEntry.photos;
        } else {
            arrayList = this.searchResult;
        }
        ArrayList<MediaController.PhotoEntry> arrayList2 = arrayList;
        if (i < 0 || i >= arrayList2.size()) {
            return;
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            AndroidUtilities.hideKeyboard(actionBarMenuItem.getSearchField());
        }
        if (this.listSort) {
            onListItemClick(view, arrayList2.get(i));
            return;
        }
        int i3 = this.selectPhotoType;
        if (i3 == PhotoAlbumPickerActivity.SELECT_TYPE_AVATAR || i3 == PhotoAlbumPickerActivity.SELECT_TYPE_AVATAR_VIDEO) {
            i2 = 1;
        } else if (i3 == PhotoAlbumPickerActivity.SELECT_TYPE_WALLPAPER) {
            i2 = 3;
        } else if (i3 == PhotoAlbumPickerActivity.SELECT_TYPE_QR) {
            i2 = 10;
        } else {
            i2 = this.chatActivity == null ? 4 : 0;
        }
        PhotoViewer.getInstance().setParentActivity(this);
        PhotoViewer.getInstance().setMaxSelectedPhotos(this.maxSelectedPhotos, this.allowOrder);
        PhotoViewer.getInstance().openPhotoForSelect(arrayList2, i, i2, this.isDocumentsPicker, this.provider, this.chatActivity);
    }

    public void lambda$createView$0(AlertDialog alertDialog, int i) {
        PhotoPickerActivitySearchDelegate photoPickerActivitySearchDelegate = this.searchDelegate;
        if (photoPickerActivitySearchDelegate != null) {
            photoPickerActivitySearchDelegate.shouldClearRecentSearch();
        } else {
            clearRecentSearch();
        }
    }

    public boolean lambda$createView$2(View view, int i) {
        if (this.listSort) {
            onListItemClick(view, this.selectedAlbum.photos.get(i));
            return true;
        }
        if (!(view instanceof PhotoAttachPhotoCell)) {
            return false;
        }
        RecyclerViewItemRangeSelector recyclerViewItemRangeSelector = this.itemRangeSelector;
        boolean z = !((PhotoAttachPhotoCell) view).isChecked();
        this.shouldSelect = z;
        recyclerViewItemRangeSelector.setIsActive(view, true, i, z);
        return false;
    }

    public void lambda$createView$5(View view) {
        ChatActivity chatActivity = this.chatActivity;
        if (chatActivity != null && chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i, int i2) {
                    this.f$0.lambda$createView$4(z, i, i2);
                }
            });
        } else {
            sendSelectedPhotos(true, 0, 0);
        }
    }

    public void lambda$createView$4(boolean z, int i, int i2) {
        sendSelectedPhotos(z, i, 0);
    }

    public boolean lambda$createView$9(View view) {
        ChatActivity chatActivity = this.chatActivity;
        if (chatActivity != null && this.maxSelectedPhotos != 1) {
            chatActivity.getCurrentChat();
            TLRPC.User currentUser = this.chatActivity.getCurrentUser();
            if (this.sendPopupLayout == null) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getParentActivity());
                this.sendPopupLayout = actionBarPopupWindowLayout;
                actionBarPopupWindowLayout.setAnimationEnabled(false);
                this.sendPopupLayout.setOnTouchListener(new View.OnTouchListener() {
                    private Rect popupRect = new Rect();

                    @Override
                    public boolean onTouch(View view2, MotionEvent motionEvent) {
                        if (motionEvent.getActionMasked() != 0 || PhotoPickerActivity.this.sendPopupWindow == null || !PhotoPickerActivity.this.sendPopupWindow.isShowing()) {
                            return false;
                        }
                        view2.getHitRect(this.popupRect);
                        if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            return false;
                        }
                        PhotoPickerActivity.this.sendPopupWindow.dismiss();
                        return false;
                    }
                });
                this.sendPopupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                    @Override
                    public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                        this.f$0.lambda$createView$6(keyEvent);
                    }
                });
                this.sendPopupLayout.setShownFromBottom(false);
                this.itemCells = new ActionBarMenuSubItem[2];
                final int i = 0;
                while (i < 2) {
                    if ((i != 0 || this.chatActivity.canScheduleMessage()) && (i != 1 || !UserObject.isUserSelf(currentUser))) {
                        this.itemCells[i] = new ActionBarMenuSubItem(getParentActivity(), i == 0, i == 1);
                        if (i == 0) {
                            if (UserObject.isUserSelf(currentUser)) {
                                this.itemCells[i].setTextAndIcon(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2);
                            } else {
                                this.itemCells[i].setTextAndIcon(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2);
                            }
                        } else {
                            this.itemCells[i].setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off);
                        }
                        this.itemCells[i].setMinimumWidth(AndroidUtilities.dp(196.0f));
                        this.sendPopupLayout.addView((View) this.itemCells[i], LayoutHelper.createLinear(-1, 48));
                        this.itemCells[i].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                this.f$0.lambda$createView$8(i, view2);
                            }
                        });
                    }
                    i++;
                }
                this.sendPopupLayout.setupRadialSelectors(Theme.getColor(this.selectorKey));
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(this.sendPopupLayout, -2, -2);
                this.sendPopupWindow = actionBarPopupWindow;
                actionBarPopupWindow.setAnimationEnabled(false);
                this.sendPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
                this.sendPopupWindow.setOutsideTouchable(true);
                this.sendPopupWindow.setClippingEnabled(true);
                this.sendPopupWindow.setInputMethodMode(2);
                this.sendPopupWindow.setSoftInputMode(0);
                this.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
            }
            this.sendPopupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.sendPopupWindow.setFocusable(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.sendPopupWindow.showAtLocation(view, 51, ((iArr[0] + view.getMeasuredWidth()) - this.sendPopupLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f), (iArr[1] - this.sendPopupLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
            this.sendPopupWindow.dimBehind();
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void lambda$createView$6(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$createView$8(int i, View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        if (i == 0) {
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i2, int i3) {
                    this.f$0.lambda$createView$7(z, i2, i3);
                }
            });
        } else {
            sendSelectedPhotos(true, 0, 0);
        }
    }

    public void lambda$createView$7(boolean z, int i, int i2) {
        sendSelectedPhotos(z, i, 0);
    }

    @Override
    protected void onPanTranslationUpdate(float f) {
        if (this.listView == null) {
            return;
        }
        if (this.commentTextView.isPopupShowing()) {
            this.fragmentView.setTranslationY(f);
            this.listView.setTranslationY(0.0f);
        } else {
            this.listView.setTranslationY(f);
        }
    }

    public void setLayoutViews(FrameLayout frameLayout, FrameLayout frameLayout2, View view, View view2, EditTextEmoji editTextEmoji) {
        this.frameLayout2 = frameLayout;
        this.writeButtonContainer = frameLayout2;
        this.commentTextView = editTextEmoji;
        this.selectedCountView = view;
        this.shadow = view2;
        this.needsBottomLayout = false;
    }

    private void applyCaption() {
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji == null || editTextEmoji.length() <= 0) {
            return;
        }
        Object obj = this.selectedPhotos.get(this.selectedPhotosOrder.get(0));
        if (obj instanceof MediaController.PhotoEntry) {
            ((MediaController.PhotoEntry) obj).caption = this.commentTextView.getText().toString();
        } else if (obj instanceof MediaController.SearchImage) {
            ((MediaController.SearchImage) obj).caption = this.commentTextView.getText().toString();
        }
    }

    private void onListItemClick(View view, Object obj) {
        boolean z = addToSelectedPhotos(obj, -1) == -1;
        if (view instanceof SharedDocumentCell) {
            ((SharedDocumentCell) view).setChecked(this.selectedPhotosOrder.contains(Integer.valueOf(this.selectedAlbum.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        updatePhotosButton(z ? 1 : 2);
        this.delegate.selectedPhotosChanged();
    }

    public void clearRecentSearch() {
        this.recentSearches.clear();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        this.emptyView.showProgress(false);
        saveRecentSearch();
    }

    @Override
    public void onResume() throws NumberFormatException {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
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
    public void onPause() {
        super.onPause();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public RecyclerListView getListView() {
        return this.listView;
    }

    public void setCaption(CharSequence charSequence) {
        this.caption = charSequence;
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.setText(charSequence);
        }
    }

    public void setInitialSearchString(String str) {
        this.initialSearchString = str;
    }

    private void saveRecentSearch() {
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        editorEdit.clear();
        editorEdit.putInt("count", this.recentSearches.size());
        int size = this.recentSearches.size();
        for (int i = 0; i < size; i++) {
            editorEdit.putString("recent" + i, (String) this.recentSearches.get(i));
        }
        editorEdit.commit();
    }

    private void loadRecentSearch() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
        int i = sharedPreferences.getInt("count", 0);
        for (int i2 = 0; i2 < i; i2++) {
            String string = sharedPreferences.getString("recent" + i2, null);
            if (string == null) {
                return;
            }
            this.recentSearches.add(string);
        }
    }

    private void addToRecentSearches(String str) {
        int size = this.recentSearches.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((String) this.recentSearches.get(i)).equalsIgnoreCase(str)) {
                this.recentSearches.remove(i);
                break;
            }
            i++;
        }
        this.recentSearches.add(0, str);
        while (this.recentSearches.size() > 20) {
            this.recentSearches.remove(r5.size() - 1);
        }
        saveRecentSearch();
    }

    public void processSearch(EditText editText) throws NumberFormatException {
        if (editText.getText().length() == 0) {
            return;
        }
        String string = editText.getText().toString();
        this.searchResult.clear();
        this.searchResultKeys.clear();
        this.imageSearchEndReached = true;
        searchImages(this.type == 1, string, "", true);
        this.lastSearchString = string;
        if (string.length() == 0) {
            this.lastSearchString = null;
            this.emptyView.title.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.emptyView.title.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.lastSearchString));
        }
        updateSearchInterface();
    }

    private boolean showCommentTextView(final boolean z, boolean z2) {
        if (this.commentTextView == null) {
            return false;
        }
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
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
        if (z2) {
            this.animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            FrameLayout frameLayout = this.writeButtonContainer;
            Property property = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.2f));
            FrameLayout frameLayout2 = this.writeButtonContainer;
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, z ? 1.0f : 0.2f));
            FrameLayout frameLayout3 = this.writeButtonContainer;
            Property property3 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.selectedCountView, (Property<View, Float>) property, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(this.selectedCountView, (Property<View, Float>) property2, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(this.selectedCountView, (Property<View, Float>) property3, z ? 1.0f : 0.0f));
            FrameLayout frameLayout4 = this.frameLayout2;
            Property property4 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, z ? 0.0f : AndroidUtilities.dp(48.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.shadow, (Property<View, Float>) property4, z ? 0.0f : AndroidUtilities.dp(48.0f)));
            this.animatorSet.playTogether(arrayList);
            this.animatorSet.setInterpolator(new DecelerateInterpolator());
            this.animatorSet.setDuration(180L);
            this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(PhotoPickerActivity.this.animatorSet)) {
                        if (!z) {
                            PhotoPickerActivity.this.frameLayout2.setVisibility(4);
                            PhotoPickerActivity.this.writeButtonContainer.setVisibility(4);
                        }
                        PhotoPickerActivity.this.animatorSet = null;
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (animator.equals(PhotoPickerActivity.this.animatorSet)) {
                        PhotoPickerActivity.this.animatorSet = null;
                    }
                }
            });
            this.animatorSet.start();
        } else {
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
        }
        return true;
    }

    public void setMaxSelectedPhotos(int i, boolean z) {
        this.maxSelectedPhotos = i;
        this.allowOrder = z;
        if (i <= 0 || this.type != 1) {
            return;
        }
        this.maxSelectedPhotos = 1;
    }

    public void updateCheckedPhotoIndices() {
        if (this.allowIndices) {
            int childCount = this.listView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    Integer num = (Integer) childAt.getTag();
                    MediaController.AlbumEntry albumEntry = this.selectedAlbum;
                    if (albumEntry != null) {
                        photoAttachPhotoCell.setNum(this.allowIndices ? this.selectedPhotosOrder.indexOf(Integer.valueOf(albumEntry.photos.get(num.intValue()).imageId)) : -1);
                    } else {
                        photoAttachPhotoCell.setNum(this.allowIndices ? this.selectedPhotosOrder.indexOf(((MediaController.SearchImage) this.searchResult.get(num.intValue())).id) : -1);
                    }
                } else if (childAt instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) childAt).setChecked(this.selectedPhotosOrder.indexOf(Integer.valueOf(this.selectedAlbum.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0, false);
                }
            }
        }
    }

    public org.telegram.ui.Cells.PhotoAttachPhotoCell getCellForIndex(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoPickerActivity.getCellForIndex(int):org.telegram.ui.Cells.PhotoAttachPhotoCell");
    }

    public int addToSelectedPhotos(Object obj, int i) {
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
        if (this.selectedPhotos.containsKey(objValueOf)) {
            this.selectedPhotos.remove(objValueOf);
            int iIndexOf = this.selectedPhotosOrder.indexOf(objValueOf);
            if (iIndexOf >= 0) {
                this.selectedPhotosOrder.remove(iIndexOf);
            }
            if (this.allowIndices) {
                updateCheckedPhotoIndices();
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
        this.selectedPhotos.put(objValueOf, obj);
        this.selectedPhotosOrder.add(objValueOf);
        return -1;
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        ActionBarMenuItem actionBarMenuItem;
        if (!z || (actionBarMenuItem = this.searchItem) == null) {
            return;
        }
        AndroidUtilities.showKeyboard(actionBarMenuItem.getSearchField());
    }

    @Override
    public boolean onBackPressed(boolean z) {
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji == null || !editTextEmoji.isPopupShowing()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        this.commentTextView.hidePopup(true);
        return false;
    }

    public void updatePhotosButton(int i) {
        if (this.selectedPhotos.size() == 0) {
            this.selectedCountView.setPivotX(0.0f);
            this.selectedCountView.setPivotY(0.0f);
            showCommentTextView(false, i != 0);
            return;
        }
        this.selectedCountView.invalidate();
        if (!showCommentTextView(true, i != 0) && i != 0) {
            this.selectedCountView.setPivotX(AndroidUtilities.dp(21.0f));
            this.selectedCountView.setPivotY(AndroidUtilities.dp(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.selectedCountView, (Property<View, Float>) View.SCALE_X, i == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.selectedCountView, (Property<View, Float>) View.SCALE_Y, i == 1 ? 1.1f : 0.9f, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.selectedCountView.setPivotX(0.0f);
        this.selectedCountView.setPivotY(0.0f);
    }

    public void updateSearchInterface() {
        String str;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        if (this.searching || (this.recentSearches.size() > 0 && ((str = this.lastSearchString) == null || TextUtils.isEmpty(str)))) {
            this.emptyView.showProgress(true);
        } else {
            this.emptyView.showProgress(false);
        }
    }

    private void searchBotUser(final boolean z) {
        if (this.searchingUser) {
            return;
        }
        this.searchingUser = true;
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = z ? MessagesController.getInstance(this.currentAccount).gifSearchBot : MessagesController.getInstance(this.currentAccount).imageSearchBot;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$searchBotUser$11(z, tLObject, tL_error);
            }
        });
    }

    public void lambda$searchBotUser$11(final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws NumberFormatException {
                    this.f$0.lambda$searchBotUser$10(tLObject, z);
                }
            });
        }
    }

    public void lambda$searchBotUser$10(TLObject tLObject, boolean z) throws NumberFormatException {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = this.lastSearchImageString;
        this.lastSearchImageString = null;
        searchImages(z, str, "", false);
    }

    public void searchImages(final boolean z, final String str, String str2, boolean z2) throws NumberFormatException {
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
            if (z2) {
                searchBotUser(z);
                return;
            }
            return;
        }
        final TLRPC.User user = (TLRPC.User) userOrChat;
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
        final int i = this.lastSearchToken + 1;
        this.lastSearchToken = i;
        this.imageReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$searchImages$13(str, i, z, user, tLObject, tL_error);
            }
        });
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.imageReqId, this.classGuid);
    }

    public void lambda$searchImages$13(final String str, final int i, final boolean z, final TLRPC.User user, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchImages$12(str, i, tLObject, z, user);
            }
        });
    }

    public void lambda$searchImages$12(String str, int i, TLObject tLObject, boolean z, TLRPC.User user) {
        int i2;
        TLRPC.Photo photo;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        addToRecentSearches(str);
        if (i != this.lastSearchToken) {
            return;
        }
        int size = this.searchResult.size();
        if (tLObject != null) {
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            this.nextImagesSearchOffset = messages_botresults.next_offset;
            int size2 = messages_botresults.results.size();
            i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i3);
                if ((z || "photo".equals(botInlineResult.type)) && ((!z || "gif".equals(botInlineResult.type)) && !this.searchResultKeys.containsKey(botInlineResult.id))) {
                    MediaController.SearchImage searchImage = new MediaController.SearchImage();
                    if (z && botInlineResult.document != null) {
                        for (int i4 = 0; i4 < botInlineResult.document.attributes.size(); i4++) {
                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i4);
                            if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                searchImage.width = documentAttribute.w;
                                searchImage.height = documentAttribute.h;
                                break;
                            }
                        }
                        searchImage.document = botInlineResult.document;
                        searchImage.size = 0;
                        TLRPC.Photo photo2 = botInlineResult.photo;
                        if (photo2 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.itemSize, true)) != null) {
                            botInlineResult.document.thumbs.add(closestPhotoSizeWithSize);
                            botInlineResult.document.flags |= 1;
                        }
                    } else if (!z && (photo = botInlineResult.photo) != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                        if (closestPhotoSizeWithSize2 != null) {
                            searchImage.width = closestPhotoSizeWithSize2.w;
                            searchImage.height = closestPhotoSizeWithSize2.h;
                            searchImage.photoSize = closestPhotoSizeWithSize2;
                            searchImage.photo = botInlineResult.photo;
                            searchImage.size = closestPhotoSizeWithSize2.size;
                            searchImage.thumbPhotoSize = closestPhotoSizeWithSize3;
                        }
                    } else if (botInlineResult.content != null) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= botInlineResult.content.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i5);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                searchImage.width = documentAttribute2.w;
                                searchImage.height = documentAttribute2.h;
                                break;
                            }
                            i5++;
                        }
                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                        if (webDocument != null) {
                            searchImage.thumbUrl = webDocument.url;
                        } else {
                            searchImage.thumbUrl = null;
                        }
                        TLRPC.WebDocument webDocument2 = botInlineResult.content;
                        searchImage.imageUrl = webDocument2.url;
                        searchImage.size = z ? 0 : webDocument2.size;
                    }
                    searchImage.id = botInlineResult.id;
                    searchImage.type = z ? 1 : 0;
                    searchImage.inlineResult = botInlineResult;
                    HashMap<String, String> map = new HashMap<>();
                    searchImage.params = map;
                    map.put("id", botInlineResult.id);
                    searchImage.params.put("query_id", "" + messages_botresults.query_id);
                    searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                    this.searchResult.add(searchImage);
                    this.searchResultKeys.put(searchImage.id, searchImage);
                    i2++;
                }
            }
            this.imageSearchEndReached = size == this.searchResult.size() || this.nextImagesSearchOffset == null;
        } else {
            i2 = 0;
        }
        this.searching = false;
        if (i2 != 0) {
            this.listAdapter.notifyItemRangeInserted(size, i2);
        } else if (this.imageSearchEndReached) {
            this.listAdapter.notifyItemRemoved(this.searchResult.size() - 1);
        }
        if (this.searchResult.size() <= 0) {
            this.emptyView.showProgress(false);
        }
    }

    public void setDelegate(PhotoPickerActivityDelegate photoPickerActivityDelegate) {
        this.delegate = photoPickerActivityDelegate;
    }

    public void setSearchDelegate(PhotoPickerActivitySearchDelegate photoPickerActivitySearchDelegate) {
        this.searchDelegate = photoPickerActivitySearchDelegate;
    }

    public void sendSelectedPhotos(boolean z, int i, int i2) {
        if (this.selectedPhotos.isEmpty() || this.delegate == null || this.sendPressed) {
            return;
        }
        applyCaption();
        this.sendPressed = true;
        this.delegate.actionButtonPressed(false, z, i, i2);
        if (this.selectPhotoType != PhotoAlbumPickerActivity.SELECT_TYPE_WALLPAPER) {
            PhotoPickerActivityDelegate photoPickerActivityDelegate = this.delegate;
            if (photoPickerActivityDelegate == null || photoPickerActivityDelegate.canFinishFragment()) {
                finishFragment();
            }
        }
    }

    private class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        @Override
        public long getItemId(int i) {
            return i;
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (PhotoPickerActivity.this.selectedAlbum == null) {
                return TextUtils.isEmpty(PhotoPickerActivity.this.lastSearchString) ? viewHolder.getItemViewType() == 3 : viewHolder.getAdapterPosition() < PhotoPickerActivity.this.searchResult.size();
            }
            return true;
        }

        @Override
        public int getItemCount() {
            if (PhotoPickerActivity.this.selectedAlbum == null) {
                if (PhotoPickerActivity.this.searchResult.isEmpty()) {
                    if (!TextUtils.isEmpty(PhotoPickerActivity.this.lastSearchString) || PhotoPickerActivity.this.recentSearches.isEmpty()) {
                        return 0;
                    }
                    return PhotoPickerActivity.this.recentSearches.size() + 2;
                }
                return PhotoPickerActivity.this.searchResult.size() + (!PhotoPickerActivity.this.imageSearchEndReached ? 1 : 0);
            }
            return PhotoPickerActivity.this.selectedAlbum.photos.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewGroup sharedDocumentCell;
            ViewGroup viewGroup2;
            if (i != 0) {
                if (i == 1) {
                    ViewGroup frameLayout = new FrameLayout(this.mContext);
                    frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(this.mContext);
                    radialProgressView.setProgressColor(-11371101);
                    frameLayout.addView(radialProgressView, LayoutHelper.createFrame(-1, -1.0f));
                    viewGroup2 = frameLayout;
                } else if (i == 2) {
                    sharedDocumentCell = new SharedDocumentCell(this.mContext, 1);
                } else if (i == 3) {
                    TextCell textCell = new TextCell(this.mContext, 23, true);
                    textCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    viewGroup2 = textCell;
                    if (PhotoPickerActivity.this.forceDarckTheme) {
                        textCell.textView.setTextColor(Theme.getColor(PhotoPickerActivity.this.textKey));
                        textCell.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_voipgroup_mutedIcon), PorterDuff.Mode.MULTIPLY));
                        viewGroup2 = textCell;
                    }
                } else {
                    DividerCell dividerCell = new DividerCell(this.mContext);
                    dividerCell.setForceDarkTheme(PhotoPickerActivity.this.forceDarckTheme);
                    sharedDocumentCell = dividerCell;
                }
                sharedDocumentCell = viewGroup2;
            } else {
                PhotoAttachPhotoCell photoAttachPhotoCell = new PhotoAttachPhotoCell(this.mContext, null);
                photoAttachPhotoCell.setDelegate(new PhotoAttachPhotoCell.PhotoAttachPhotoCellDelegate() {
                    private void checkSlowMode() {
                        TLRPC.Chat currentChat;
                        if (!PhotoPickerActivity.this.allowOrder || PhotoPickerActivity.this.chatActivity == null || (currentChat = PhotoPickerActivity.this.chatActivity.getCurrentChat()) == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled || PhotoPickerActivity.this.alertOnlyOnce == 2) {
                            return;
                        }
                        AlertsCreator.showSimpleAlert(PhotoPickerActivity.this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError));
                        if (PhotoPickerActivity.this.alertOnlyOnce == 1) {
                            PhotoPickerActivity.this.alertOnlyOnce = 2;
                        }
                    }

                    @Override
                    public void onCheckClick(PhotoAttachPhotoCell photoAttachPhotoCell2) {
                        boolean z;
                        int iIntValue = ((Integer) photoAttachPhotoCell2.getTag()).intValue();
                        int size = -1;
                        if (PhotoPickerActivity.this.selectedAlbum != null) {
                            MediaController.PhotoEntry photoEntry = PhotoPickerActivity.this.selectedAlbum.photos.get(iIntValue);
                            boolean zContainsKey = PhotoPickerActivity.this.selectedPhotos.containsKey(Integer.valueOf(photoEntry.imageId));
                            z = !zContainsKey;
                            if (zContainsKey || PhotoPickerActivity.this.maxSelectedPhotos <= 0 || PhotoPickerActivity.this.selectedPhotos.size() < PhotoPickerActivity.this.maxSelectedPhotos) {
                                if (PhotoPickerActivity.this.allowIndices && !zContainsKey) {
                                    size = PhotoPickerActivity.this.selectedPhotosOrder.size();
                                }
                                photoAttachPhotoCell2.setChecked(size, z, true);
                                PhotoPickerActivity.this.addToSelectedPhotos(photoEntry, iIntValue);
                            } else {
                                checkSlowMode();
                                return;
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(PhotoPickerActivity.this.getParentActivity().getCurrentFocus());
                            MediaController.SearchImage searchImage = (MediaController.SearchImage) PhotoPickerActivity.this.searchResult.get(iIntValue);
                            boolean zContainsKey2 = PhotoPickerActivity.this.selectedPhotos.containsKey(searchImage.id);
                            z = !zContainsKey2;
                            if (zContainsKey2 || PhotoPickerActivity.this.maxSelectedPhotos <= 0 || PhotoPickerActivity.this.selectedPhotos.size() < PhotoPickerActivity.this.maxSelectedPhotos) {
                                if (PhotoPickerActivity.this.allowIndices && !zContainsKey2) {
                                    size = PhotoPickerActivity.this.selectedPhotosOrder.size();
                                }
                                photoAttachPhotoCell2.setChecked(size, z, true);
                                PhotoPickerActivity.this.addToSelectedPhotos(searchImage, iIntValue);
                            } else {
                                checkSlowMode();
                                return;
                            }
                        }
                        PhotoPickerActivity.this.updatePhotosButton(z ? 1 : 2);
                        PhotoPickerActivity.this.delegate.selectedPhotosChanged();
                    }
                });
                photoAttachPhotoCell.getCheckFrame().setVisibility(PhotoPickerActivity.this.selectPhotoType != PhotoAlbumPickerActivity.SELECT_TYPE_ALL ? 8 : 0);
                sharedDocumentCell = photoAttachPhotoCell;
            }
            return new RecyclerListView.Holder(sharedDocumentCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean zIsShowingImage;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) viewHolder.itemView;
                photoAttachPhotoCell.setItemSize(PhotoPickerActivity.this.itemSize);
                BackupImageView imageView = photoAttachPhotoCell.getImageView();
                photoAttachPhotoCell.setTag(Integer.valueOf(i));
                imageView.setOrientation(0, true);
                if (PhotoPickerActivity.this.selectedAlbum != null) {
                    MediaController.PhotoEntry photoEntry = PhotoPickerActivity.this.selectedAlbum.photos.get(i);
                    photoAttachPhotoCell.setPhotoEntry(photoEntry, PhotoPickerActivity.this.selectedPhotosOrder.size() > 1, true, false);
                    photoAttachPhotoCell.setChecked(PhotoPickerActivity.this.allowIndices ? PhotoPickerActivity.this.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, PhotoPickerActivity.this.selectedPhotos.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                    zIsShowingImage = PhotoViewer.isShowingImage(photoEntry.path);
                } else {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) PhotoPickerActivity.this.searchResult.get(i);
                    photoAttachPhotoCell.setPhotoEntry(searchImage, true, false);
                    photoAttachPhotoCell.getVideoInfoContainer().setVisibility(4);
                    photoAttachPhotoCell.setChecked(PhotoPickerActivity.this.allowIndices ? PhotoPickerActivity.this.selectedPhotosOrder.indexOf(searchImage.id) : -1, PhotoPickerActivity.this.selectedPhotos.containsKey(searchImage.id), false);
                    zIsShowingImage = PhotoViewer.isShowingImage(searchImage.getPathToAttach());
                }
                imageView.getImageReceiver().setVisible(!zIsShowingImage, true);
                photoAttachPhotoCell.getCheckBox().setVisibility((PhotoPickerActivity.this.selectPhotoType != PhotoAlbumPickerActivity.SELECT_TYPE_ALL || zIsShowingImage) ? 8 : 0);
                return;
            }
            if (itemViewType == 1) {
                ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = PhotoPickerActivity.this.itemSize;
                    viewHolder.itemView.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            if (itemViewType == 2) {
                MediaController.PhotoEntry photoEntry2 = PhotoPickerActivity.this.selectedAlbum.photos.get(i);
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewHolder.itemView;
                sharedDocumentCell.setPhotoEntry(photoEntry2);
                sharedDocumentCell.setChecked(PhotoPickerActivity.this.selectedPhotos.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
                sharedDocumentCell.setTag(Integer.valueOf(i));
                return;
            }
            if (itemViewType != 3) {
                return;
            }
            TextCell textCell = (TextCell) viewHolder.itemView;
            if (i < PhotoPickerActivity.this.recentSearches.size()) {
                textCell.setTextAndIcon((CharSequence) PhotoPickerActivity.this.recentSearches.get(i), R.drawable.msg_recent, false);
            } else {
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.ClearRecentHistory), R.drawable.msg_clear_recent, false);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (PhotoPickerActivity.this.listSort) {
                return 2;
            }
            if (PhotoPickerActivity.this.selectedAlbum != null) {
                return 0;
            }
            return PhotoPickerActivity.this.searchResult.isEmpty() ? i == PhotoPickerActivity.this.recentSearches.size() ? 4 : 3 : i < PhotoPickerActivity.this.searchResult.size() ? 0 : 1;
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.sizeNotifierFrameLayout, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, this.dialogBackgroundKey));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, this.dialogBackgroundKey));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, this.textKey));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, this.textKey));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, this.selectorKey));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, this.textKey));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_chat_messagePanelHint));
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem != null ? actionBarMenuItem.getSearchField() : null, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, this.textKey));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, this.dialogBackgroundKey));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{Theme.chat_attachEmptyDrawable}, null, Theme.key_chat_attachEmptyImage));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, null, null, Theme.key_chat_attachPhotoBackground));
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundGray)) > 0.721f;
    }
}
