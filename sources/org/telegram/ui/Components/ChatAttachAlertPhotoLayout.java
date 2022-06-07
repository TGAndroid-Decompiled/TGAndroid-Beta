package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.PhotoAttachCameraCell;
import org.telegram.ui.Cells.PhotoAttachPermissionCell;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.RecyclerViewItemRangeSelector;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ZoomControlView;
import org.telegram.ui.PhotoViewer;

public class ChatAttachAlertPhotoLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    private static boolean mediaFromExternalCamera;
    private PhotoAttachAdapter adapter;
    float additionCloseCameraY;
    private int alertOnlyOnce;
    float animationClipBottom;
    float animationClipLeft;
    float animationClipRight;
    float animationClipTop;
    private boolean cameraAnimationInProgress;
    private PhotoAttachAdapter cameraAttachAdapter;
    protected PhotoAttachCameraCell cameraCell;
    private Drawable cameraDrawable;
    boolean cameraExpanded;
    protected FrameLayout cameraIcon;
    private AnimatorSet cameraInitAnimation;
    private float cameraOpenProgress;
    private boolean cameraOpened;
    private FrameLayout cameraPanel;
    private LinearLayoutManager cameraPhotoLayoutManager;
    private RecyclerListView cameraPhotoRecyclerView;
    private boolean cameraPhotoRecyclerViewIgnoreLayout;
    protected CameraView cameraView;
    private float cameraViewOffsetBottomY;
    private float cameraViewOffsetX;
    private float cameraViewOffsetY;
    private float cameraZoom;
    private boolean canSaveCameraPreview;
    private boolean cancelTakingPhotos;
    private boolean checkCameraWhenShown;
    private TextView counterTextView;
    private float currentPanTranslationY;
    private int currentSelectedCount;
    private boolean deviceHasGoodCamera;
    private boolean dragging;
    public TextView dropDown;
    private ArrayList<MediaController.AlbumEntry> dropDownAlbums;
    private ActionBarMenuItem dropDownContainer;
    private Drawable dropDownDrawable;
    private boolean flashAnimationInProgress;
    boolean forceDarkTheme;
    private MediaController.AlbumEntry galleryAlbumEntry;
    private int gridExtraSpace;
    public RecyclerListView gridView;
    private ViewPropertyAnimator headerAnimator;
    private boolean ignoreLayout;
    private boolean isHidden;
    private RecyclerViewItemRangeSelector itemRangeSelector;
    private int itemSize;
    private int lastItemSize;
    private int lastNotifyWidth;
    private float lastY;
    private GridLayoutManager layoutManager;
    private boolean maybeStartDraging;
    private boolean mediaEnabled;
    private boolean noCameraPermissions;
    private boolean noGalleryPermissions;
    private float pinchStartDistance;
    private boolean pressed;
    private EmptyTextProgressView progressView;
    private TextView recordTime;
    private boolean requestingPermissions;
    private MediaController.AlbumEntry selectedAlbumEntry;
    private boolean shouldSelect;
    private ShutterButton shutterButton;
    private ImageView switchCameraButton;
    private boolean takingPhoto;
    private TextView tooltipTextView;
    private Runnable videoRecordRunnable;
    private int videoRecordTime;
    private AnimatorSet zoomControlAnimation;
    private Runnable zoomControlHideRunnable;
    private ZoomControlView zoomControlView;
    private boolean zoomWas;
    private boolean zooming;
    private static ArrayList<Object> cameraPhotos = new ArrayList<>();
    private static HashMap<Object, Object> selectedPhotos = new HashMap<>();
    private static ArrayList<Object> selectedPhotosOrder = new ArrayList<>();
    private static int lastImageId = -1;
    private ImageView[] flashModeButton = new ImageView[2];
    private float[] cameraViewLocation = new float[2];
    private int[] viewPosition = new int[2];
    private int[] animateCameraValues = new int[5];
    private DecelerateInterpolator interpolator = new DecelerateInterpolator(1.5f);
    private Rect hitRect = new Rect();
    private int itemsPerRow = 3;
    private boolean loading = true;
    private int animationIndex = -1;
    private PhotoViewer.PhotoViewerProvider photoViewerProvider = new BasePhotoProvider() {
        @Override
        public boolean cancelButtonPressed() {
            return false;
        }

        @Override
        public void onOpen() {
            ChatAttachAlertPhotoLayout.this.pauseCameraPreview();
        }

        @Override
        public void onClose() {
            ChatAttachAlertPhotoLayout.this.resumeCameraPreview();
        }

        @Override
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z) {
            PhotoAttachPhotoCell cellForIndex = ChatAttachAlertPhotoLayout.this.getCellForIndex(i);
            if (cellForIndex == null) {
                return null;
            }
            int[] iArr = new int[2];
            cellForIndex.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - ChatAttachAlertPhotoLayout.this.parentAlert.getLeftInset();
            }
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = ChatAttachAlertPhotoLayout.this.gridView;
            ImageReceiver imageReceiver = cellForIndex.getImageView().getImageReceiver();
            placeProviderObject.imageReceiver = imageReceiver;
            placeProviderObject.thumb = imageReceiver.getBitmapSafe();
            placeProviderObject.scale = cellForIndex.getScale();
            placeProviderObject.clipBottomAddition = (int) ChatAttachAlertPhotoLayout.this.parentAlert.getClipLayoutBottom();
            cellForIndex.showCheck(false);
            return placeProviderObject;
        }

        @Override
        public void updatePhotoAtIndex(int i) {
            PhotoAttachPhotoCell cellForIndex = ChatAttachAlertPhotoLayout.this.getCellForIndex(i);
            if (cellForIndex != null) {
                cellForIndex.getImageView().setOrientation(0, true);
                MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
                if (photoEntryAtPosition != null) {
                    if (photoEntryAtPosition.thumbPath != null) {
                        cellForIndex.getImageView().setImage(photoEntryAtPosition.thumbPath, null, Theme.chat_attachEmptyDrawable);
                    } else if (photoEntryAtPosition.path != null) {
                        cellForIndex.getImageView().setOrientation(photoEntryAtPosition.orientation, true);
                        if (photoEntryAtPosition.isVideo) {
                            BackupImageView imageView = cellForIndex.getImageView();
                            imageView.setImage("vthumb://" + photoEntryAtPosition.imageId + ":" + photoEntryAtPosition.path, null, Theme.chat_attachEmptyDrawable);
                            return;
                        }
                        BackupImageView imageView2 = cellForIndex.getImageView();
                        imageView2.setImage("thumb://" + photoEntryAtPosition.imageId + ":" + photoEntryAtPosition.path, null, Theme.chat_attachEmptyDrawable);
                    } else {
                        cellForIndex.getImageView().setImageDrawable(Theme.chat_attachEmptyDrawable);
                    }
                }
            }
        }

        @Override
        public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i) {
            PhotoAttachPhotoCell cellForIndex = ChatAttachAlertPhotoLayout.this.getCellForIndex(i);
            if (cellForIndex != null) {
                return cellForIndex.getImageView().getImageReceiver().getBitmapSafe();
            }
            return null;
        }

        @Override
        public void willSwitchFromPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i) {
            PhotoAttachPhotoCell cellForIndex = ChatAttachAlertPhotoLayout.this.getCellForIndex(i);
            if (cellForIndex != null) {
                cellForIndex.showCheck(true);
            }
        }

        @Override
        public void willHidePhotoViewer() {
            int childCount = ChatAttachAlertPhotoLayout.this.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ChatAttachAlertPhotoLayout.this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    ((PhotoAttachPhotoCell) childAt).showCheck(true);
                }
            }
        }

        @Override
        public void onApplyCaption(CharSequence charSequence) {
            if (ChatAttachAlertPhotoLayout.selectedPhotos.size() > 0 && ChatAttachAlertPhotoLayout.selectedPhotosOrder.size() > 0) {
                Object obj = ChatAttachAlertPhotoLayout.selectedPhotos.get(ChatAttachAlertPhotoLayout.selectedPhotosOrder.get(0));
                CharSequence charSequence2 = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    charSequence2 = ((MediaController.PhotoEntry) obj).caption;
                }
                if (obj instanceof MediaController.SearchImage) {
                    charSequence2 = ((MediaController.SearchImage) obj).caption;
                }
                ChatAttachAlertPhotoLayout.this.parentAlert.commentTextView.setText(charSequence2);
            }
        }

        @Override
        public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, boolean z2) {
            MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
            if (photoEntryAtPosition != null) {
                photoEntryAtPosition.editedInfo = videoEditedInfo;
            }
            if (ChatAttachAlertPhotoLayout.selectedPhotos.isEmpty() && photoEntryAtPosition != null) {
                ChatAttachAlertPhotoLayout.this.addToSelectedPhotos(photoEntryAtPosition, -1);
            }
            ChatAttachAlertPhotoLayout.this.parentAlert.applyCaption();
            if (PhotoViewer.getInstance().hasCaptionForAllMedia) {
                HashMap<Object, Object> selectedPhotos2 = getSelectedPhotos();
                ArrayList<Object> selectedPhotosOrder2 = getSelectedPhotosOrder();
                if (!selectedPhotos2.isEmpty()) {
                    for (int i3 = 0; i3 < selectedPhotosOrder2.size(); i3++) {
                        Object obj = selectedPhotos2.get(selectedPhotosOrder2.get(i3));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i3 == 0) {
                                photoEntry.caption = PhotoViewer.getInstance().captionForAllMedia;
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            ChatAttachAlertPhotoLayout.this.parentAlert.delegate.didPressedButton(7, true, z, i2, z2);
        }
    };

    @Override
    int needsActionBar() {
        return 1;
    }

    static int access$2408(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        int i = chatAttachAlertPhotoLayout.videoRecordTime;
        chatAttachAlertPhotoLayout.videoRecordTime = i + 1;
        return i;
    }

    static int access$3010() {
        int i = lastImageId;
        lastImageId = i - 1;
        return i;
    }

    private class BasePhotoProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        private BasePhotoProvider() {
        }

        @Override
        public boolean isPhotoChecked(int i) {
            MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
            return photoEntryAtPosition != null && ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId));
        }

        @Override
        public int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
            MediaController.PhotoEntry photoEntryAtPosition;
            boolean z;
            if ((ChatAttachAlertPhotoLayout.this.parentAlert.maxSelectedPhotos >= 0 && ChatAttachAlertPhotoLayout.selectedPhotos.size() >= ChatAttachAlertPhotoLayout.this.parentAlert.maxSelectedPhotos && !isPhotoChecked(i)) || (photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i)) == null) {
                return -1;
            }
            int addToSelectedPhotos = ChatAttachAlertPhotoLayout.this.addToSelectedPhotos(photoEntryAtPosition, -1);
            int i2 = 1;
            if (addToSelectedPhotos == -1) {
                addToSelectedPhotos = ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId));
                z = true;
            } else {
                photoEntryAtPosition.editedInfo = null;
                z = false;
            }
            photoEntryAtPosition.editedInfo = videoEditedInfo;
            int childCount = ChatAttachAlertPhotoLayout.this.gridView.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = ChatAttachAlertPhotoLayout.this.gridView.getChildAt(i3);
                if (!(childAt instanceof PhotoAttachPhotoCell) || ((Integer) childAt.getTag()).intValue() != i) {
                    i3++;
                } else {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                    if (!(chatAttachAlert.baseFragment instanceof ChatActivity) || !chatAttachAlert.allowOrder) {
                        ((PhotoAttachPhotoCell) childAt).setChecked(-1, z, false);
                    } else {
                        ((PhotoAttachPhotoCell) childAt).setChecked(addToSelectedPhotos, z, false);
                    }
                }
            }
            int childCount2 = ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount2) {
                    break;
                }
                View childAt2 = ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView.getChildAt(i4);
                if (!(childAt2 instanceof PhotoAttachPhotoCell) || ((Integer) childAt2.getTag()).intValue() != i) {
                    i4++;
                } else {
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlertPhotoLayout.this.parentAlert;
                    if (!(chatAttachAlert2.baseFragment instanceof ChatActivity) || !chatAttachAlert2.allowOrder) {
                        ((PhotoAttachPhotoCell) childAt2).setChecked(-1, z, false);
                    } else {
                        ((PhotoAttachPhotoCell) childAt2).setChecked(addToSelectedPhotos, z, false);
                    }
                }
            }
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlertPhotoLayout.this.parentAlert;
            if (!z) {
                i2 = 2;
            }
            chatAttachAlert3.updateCountButton(i2);
            return addToSelectedPhotos;
        }

        @Override
        public int getSelectedCount() {
            return ChatAttachAlertPhotoLayout.selectedPhotos.size();
        }

        @Override
        public ArrayList<Object> getSelectedPhotosOrder() {
            return ChatAttachAlertPhotoLayout.selectedPhotosOrder;
        }

        @Override
        public HashMap<Object, Object> getSelectedPhotos() {
            return ChatAttachAlertPhotoLayout.selectedPhotos;
        }

        @Override
        public int getPhotoIndex(int i) {
            MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
            if (photoEntryAtPosition == null) {
                return -1;
            }
            return ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId));
        }
    }

    protected void updateCheckedPhotoIndices() {
        if (this.parentAlert.baseFragment instanceof ChatActivity) {
            int childCount = this.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    MediaController.PhotoEntry photoEntryAtPosition = getPhotoEntryAtPosition(((Integer) photoAttachPhotoCell.getTag()).intValue());
                    if (photoEntryAtPosition != null) {
                        photoAttachPhotoCell.setNum(selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)));
                    }
                }
            }
            int childCount2 = this.cameraPhotoRecyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = this.cameraPhotoRecyclerView.getChildAt(i2);
                if (childAt2 instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell2 = (PhotoAttachPhotoCell) childAt2;
                    MediaController.PhotoEntry photoEntryAtPosition2 = getPhotoEntryAtPosition(((Integer) photoAttachPhotoCell2.getTag()).intValue());
                    if (photoEntryAtPosition2 != null) {
                        photoAttachPhotoCell2.setNum(selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition2.imageId)));
                    }
                }
            }
        }
    }

    public MediaController.PhotoEntry getPhotoEntryAtPosition(int i) {
        if (i < 0) {
            return null;
        }
        int size = cameraPhotos.size();
        if (i < size) {
            return (MediaController.PhotoEntry) cameraPhotos.get(i);
        }
        int i2 = i - size;
        if (i2 < this.selectedAlbumEntry.photos.size()) {
            return this.selectedAlbumEntry.photos.get(i2);
        }
        return null;
    }

    protected ArrayList<Object> getAllPhotosArray() {
        if (this.selectedAlbumEntry != null) {
            if (cameraPhotos.isEmpty()) {
                return this.selectedAlbumEntry.photos;
            }
            ArrayList<Object> arrayList = new ArrayList<>(this.selectedAlbumEntry.photos.size() + cameraPhotos.size());
            arrayList.addAll(cameraPhotos);
            arrayList.addAll(this.selectedAlbumEntry.photos);
            return arrayList;
        } else if (!cameraPhotos.isEmpty()) {
            return cameraPhotos;
        } else {
            return new ArrayList<>(0);
        }
    }

    public ChatAttachAlertPhotoLayout(ChatAttachAlert chatAttachAlert, Context context, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        int dp = AndroidUtilities.dp(80.0f);
        this.itemSize = dp;
        this.lastItemSize = dp;
        this.forceDarkTheme = z;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        FrameLayout container = chatAttachAlert.getContainer();
        this.cameraDrawable = context.getResources().getDrawable(R.drawable.instant_camera).mutate();
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, this.parentAlert.actionBar.createMenu(), 0, 0, resourcesProvider) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(ChatAttachAlertPhotoLayout.this.dropDown.getText());
            }
        };
        this.dropDownContainer = actionBarMenuItem;
        actionBarMenuItem.setSubMenuOpenSide(1);
        this.parentAlert.actionBar.addView(this.dropDownContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        this.dropDownContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlertPhotoLayout.this.lambda$new$0(view);
            }
        });
        TextView textView = new TextView(context);
        this.dropDown = textView;
        textView.setImportantForAccessibility(2);
        this.dropDown.setGravity(3);
        this.dropDown.setSingleLine(true);
        this.dropDown.setLines(1);
        this.dropDown.setMaxLines(1);
        this.dropDown.setEllipsize(TextUtils.TruncateAt.END);
        this.dropDown.setTextColor(getThemedColor("dialogTextBlack"));
        this.dropDown.setText(LocaleController.getString("ChatGallery", R.string.ChatGallery));
        this.dropDown.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.dropDownDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogTextBlack"), PorterDuff.Mode.MULTIPLY));
        this.dropDown.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        this.dropDown.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        this.dropDownContainer.addView(this.dropDown, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        checkCamera(false);
        this.parentAlert.selectedMenuItem.addSubItem(0, LocaleController.getString("SendWithoutGrouping", R.string.SendWithoutGrouping));
        this.parentAlert.selectedMenuItem.addSubItem(1, LocaleController.getString("SendWithoutCompression", R.string.SendWithoutCompression));
        this.parentAlert.selectedMenuItem.addSubItem(2, R.drawable.msg_openin, LocaleController.getString("OpenInExternalApp", R.string.OpenInExternalApp));
        this.parentAlert.selectedMenuItem.addSubItem(3, LocaleController.getString("AttachMediaPreviewButton", R.string.AttachMediaPreviewButton));
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ChatAttachAlertPhotoLayout.this.parentAlert.scrollOffsetY[0] - AndroidUtilities.dp(80.0f)) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ChatAttachAlertPhotoLayout.this.parentAlert.scrollOffsetY[0] - AndroidUtilities.dp(80.0f)) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            }

            @Override
            public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                super.onLayout(z2, i, i2, i3, i4);
                PhotoViewer.getInstance().checkCurrentImageVisibility();
            }
        };
        this.gridView = recyclerListView;
        PhotoAttachAdapter photoAttachAdapter = new PhotoAttachAdapter(context, true);
        this.adapter = photoAttachAdapter;
        recyclerListView.setAdapter(photoAttachAdapter);
        this.adapter.createCache();
        this.gridView.setClipToPadding(false);
        this.gridView.setItemAnimator(null);
        this.gridView.setLayoutAnimation(null);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.setGlowColor(getThemedColor("dialogScrollGlow"));
        addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f));
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (ChatAttachAlertPhotoLayout.this.gridView.getChildCount() > 0) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                    chatAttachAlertPhotoLayout.parentAlert.updateLayout(chatAttachAlertPhotoLayout, true, i2);
                    if (i2 != 0) {
                        ChatAttachAlertPhotoLayout.this.checkCameraViewPosition();
                    }
                }
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                RecyclerListView.Holder holder;
                if (i == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    ActionBarMenuItem actionBarMenuItem2 = ChatAttachAlertPhotoLayout.this.parentAlert.selectedMenuItem;
                    int dp3 = dp2 + (actionBarMenuItem2 != null ? AndroidUtilities.dp(actionBarMenuItem2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = ChatAttachAlertPhotoLayout.this.parentAlert.getBackgroundPaddingTop();
                    if (((ChatAttachAlertPhotoLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < ActionBar.getCurrentActionBarHeight() && (holder = (RecyclerListView.Holder) ChatAttachAlertPhotoLayout.this.gridView.findViewHolderForAdapterPosition(0)) != null && holder.itemView.getTop() > AndroidUtilities.dp(7.0f)) {
                        ChatAttachAlertPhotoLayout.this.gridView.smoothScrollBy(0, holder.itemView.getTop() - AndroidUtilities.dp(7.0f));
                    }
                }
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.itemSize) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i2) {
                        return super.calculateDyToMakeVisible(view, i2) - (ChatAttachAlertPhotoLayout.this.gridView.getPaddingTop() - AndroidUtilities.dp(7.0f));
                    }

                    @Override
                    public int calculateTimeForDeceleration(int i2) {
                        return super.calculateTimeForDeceleration(i2) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.layoutManager = gridLayoutManager;
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i) {
                if (i == ChatAttachAlertPhotoLayout.this.adapter.itemsCount - 1) {
                    return ChatAttachAlertPhotoLayout.this.layoutManager.getSpanCount();
                }
                return ChatAttachAlertPhotoLayout.this.itemSize + (i % ChatAttachAlertPhotoLayout.this.itemsPerRow != ChatAttachAlertPhotoLayout.this.itemsPerRow + (-1) ? AndroidUtilities.dp(5.0f) : 0);
            }
        });
        this.gridView.setLayoutManager(this.layoutManager);
        this.gridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                ChatAttachAlertPhotoLayout.this.lambda$new$1(resourcesProvider, view, i);
            }
        });
        this.gridView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                boolean lambda$new$2;
                lambda$new$2 = ChatAttachAlertPhotoLayout.this.lambda$new$2(view, i);
                return lambda$new$2;
            }
        });
        RecyclerViewItemRangeSelector recyclerViewItemRangeSelector = new RecyclerViewItemRangeSelector(new RecyclerViewItemRangeSelector.RecyclerViewItemRangeSelectorDelegate() {
            @Override
            public void setSelected(View view, int i, boolean z2) {
                if (z2 == ChatAttachAlertPhotoLayout.this.shouldSelect && (view instanceof PhotoAttachPhotoCell)) {
                    ((PhotoAttachPhotoCell) view).callDelegate();
                }
            }

            @Override
            public boolean isSelected(int i) {
                MediaController.PhotoEntry photo = ChatAttachAlertPhotoLayout.this.adapter.getPhoto(i);
                return photo != null && ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photo.imageId));
            }

            @Override
            public boolean isIndexSelectable(int i) {
                return ChatAttachAlertPhotoLayout.this.adapter.getItemViewType(i) == 0;
            }

            @Override
            public void onStartStopSelection(boolean z2) {
                ChatAttachAlertPhotoLayout.this.alertOnlyOnce = z2 ? 1 : 0;
                ChatAttachAlertPhotoLayout.this.gridView.hideSelector(true);
            }
        });
        this.itemRangeSelector = recyclerViewItemRangeSelector;
        this.gridView.addOnItemTouchListener(recyclerViewItemRangeSelector);
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null, resourcesProvider);
        this.progressView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString("NoPhotos", R.string.NoPhotos));
        this.progressView.setOnTouchListener(null);
        this.progressView.setTextSize(16);
        addView(this.progressView, LayoutHelper.createFrame(-1, -2.0f));
        if (this.loading) {
            this.progressView.showProgress();
        } else {
            this.progressView.showTextView();
        }
        final Paint paint = new Paint(1);
        paint.setColor(-2468275);
        TextView textView2 = new TextView(this, context) {
            float alpha = 0.0f;
            boolean isIncr;

            @Override
            protected void onDraw(Canvas canvas) {
                paint.setAlpha((int) ((this.alpha * 130.0f) + 125.0f));
                if (!this.isIncr) {
                    float f = this.alpha - 0.026666667f;
                    this.alpha = f;
                    if (f <= 0.0f) {
                        this.alpha = 0.0f;
                        this.isIncr = true;
                    }
                } else {
                    float f2 = this.alpha + 0.026666667f;
                    this.alpha = f2;
                    if (f2 >= 1.0f) {
                        this.alpha = 1.0f;
                        this.isIncr = false;
                    }
                }
                super.onDraw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
                invalidate();
            }
        };
        this.recordTime = textView2;
        AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 1.0f, false);
        this.recordTime.setBackgroundResource(R.drawable.system);
        this.recordTime.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, PorterDuff.Mode.MULTIPLY));
        this.recordTime.setTextSize(1, 15.0f);
        this.recordTime.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.recordTime.setAlpha(0.0f);
        this.recordTime.setTextColor(-1);
        this.recordTime.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(this.recordTime, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    i7 = getMeasuredWidth() / 2;
                    i6 = getMeasuredHeight() / 2;
                    i10 = getMeasuredWidth() / 2;
                    int i11 = i6 / 2;
                    i8 = i6 + i11 + AndroidUtilities.dp(17.0f);
                    i9 = i11 - AndroidUtilities.dp(17.0f);
                    i5 = i10;
                } else {
                    i7 = getMeasuredWidth() / 2;
                    i6 = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    int i12 = i7 / 2;
                    i10 = i7 + i12 + AndroidUtilities.dp(17.0f);
                    i5 = i12 - AndroidUtilities.dp(17.0f);
                    i9 = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    i8 = i9;
                }
                int measuredHeight = (getMeasuredHeight() - ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    ChatAttachAlertPhotoLayout.this.tooltipTextView.layout(i7 - (ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredWidth() / 2), getMeasuredHeight(), (ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredWidth() / 2) + i7, getMeasuredHeight() + ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredHeight());
                } else {
                    ChatAttachAlertPhotoLayout.this.tooltipTextView.layout(i7 - (ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredWidth() / 2), measuredHeight, (ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredWidth() / 2) + i7, ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredHeight() + measuredHeight);
                }
                ChatAttachAlertPhotoLayout.this.shutterButton.layout(i7 - (ChatAttachAlertPhotoLayout.this.shutterButton.getMeasuredWidth() / 2), i6 - (ChatAttachAlertPhotoLayout.this.shutterButton.getMeasuredHeight() / 2), i7 + (ChatAttachAlertPhotoLayout.this.shutterButton.getMeasuredWidth() / 2), i6 + (ChatAttachAlertPhotoLayout.this.shutterButton.getMeasuredHeight() / 2));
                ChatAttachAlertPhotoLayout.this.switchCameraButton.layout(i10 - (ChatAttachAlertPhotoLayout.this.switchCameraButton.getMeasuredWidth() / 2), i8 - (ChatAttachAlertPhotoLayout.this.switchCameraButton.getMeasuredHeight() / 2), i10 + (ChatAttachAlertPhotoLayout.this.switchCameraButton.getMeasuredWidth() / 2), i8 + (ChatAttachAlertPhotoLayout.this.switchCameraButton.getMeasuredHeight() / 2));
                for (int i13 = 0; i13 < 2; i13++) {
                    ChatAttachAlertPhotoLayout.this.flashModeButton[i13].layout(i5 - (ChatAttachAlertPhotoLayout.this.flashModeButton[i13].getMeasuredWidth() / 2), i9 - (ChatAttachAlertPhotoLayout.this.flashModeButton[i13].getMeasuredHeight() / 2), (ChatAttachAlertPhotoLayout.this.flashModeButton[i13].getMeasuredWidth() / 2) + i5, (ChatAttachAlertPhotoLayout.this.flashModeButton[i13].getMeasuredHeight() / 2) + i9);
                }
            }
        };
        this.cameraPanel = frameLayout;
        frameLayout.setVisibility(8);
        this.cameraPanel.setAlpha(0.0f);
        container.addView(this.cameraPanel, LayoutHelper.createFrame(-1, 126, 83));
        TextView textView3 = new TextView(context);
        this.counterTextView = textView3;
        textView3.setBackgroundResource(R.drawable.photos_rounded);
        this.counterTextView.setVisibility(8);
        this.counterTextView.setTextColor(-1);
        this.counterTextView.setGravity(17);
        this.counterTextView.setPivotX(0.0f);
        this.counterTextView.setPivotY(0.0f);
        this.counterTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.counterTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.photos_arrow, 0);
        this.counterTextView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        this.counterTextView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        container.addView(this.counterTextView, LayoutHelper.createFrame(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        this.counterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlertPhotoLayout.this.lambda$new$3(view);
            }
        });
        ZoomControlView zoomControlView = new ZoomControlView(context);
        this.zoomControlView = zoomControlView;
        zoomControlView.setVisibility(8);
        this.zoomControlView.setAlpha(0.0f);
        container.addView(this.zoomControlView, LayoutHelper.createFrame(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        this.zoomControlView.setDelegate(new ZoomControlView.ZoomControlViewDelegate() {
            @Override
            public final void didSetZoom(float f) {
                ChatAttachAlertPhotoLayout.this.lambda$new$4(f);
            }
        });
        ShutterButton shutterButton = new ShutterButton(context);
        this.shutterButton = shutterButton;
        this.cameraPanel.addView(shutterButton, LayoutHelper.createFrame(84, 84, 17));
        this.shutterButton.setDelegate(new AnonymousClass10(container));
        this.shutterButton.setFocusable(true);
        this.shutterButton.setContentDescription(LocaleController.getString("AccDescrShutter", R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.switchCameraButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.cameraPanel.addView(this.switchCameraButton, LayoutHelper.createFrame(48, 48, 21));
        this.switchCameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlertPhotoLayout.this.lambda$new$5(view);
            }
        });
        this.switchCameraButton.setContentDescription(LocaleController.getString("AccDescrSwitchCamera", R.string.AccDescrSwitchCamera));
        for (int i = 0; i < 2; i++) {
            this.flashModeButton[i] = new ImageView(context);
            this.flashModeButton[i].setScaleType(ImageView.ScaleType.CENTER);
            this.flashModeButton[i].setVisibility(4);
            this.cameraPanel.addView(this.flashModeButton[i], LayoutHelper.createFrame(48, 48, 51));
            this.flashModeButton[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatAttachAlertPhotoLayout.this.lambda$new$6(view);
                }
            });
            ImageView imageView2 = this.flashModeButton[i];
            imageView2.setContentDescription("flash mode " + i);
        }
        TextView textView4 = new TextView(context);
        this.tooltipTextView = textView4;
        textView4.setTextSize(1, 15.0f);
        this.tooltipTextView.setTextColor(-1);
        this.tooltipTextView.setText(LocaleController.getString("TapForVideo", R.string.TapForVideo));
        this.tooltipTextView.setShadowLayer(AndroidUtilities.dp(3.33333f), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        this.tooltipTextView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.cameraPanel.addView(this.tooltipTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        RecyclerListView recyclerListView2 = new RecyclerListView(context, resourcesProvider) {
            @Override
            public void requestLayout() {
                if (!ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerViewIgnoreLayout) {
                    super.requestLayout();
                }
            }
        };
        this.cameraPhotoRecyclerView = recyclerListView2;
        recyclerListView2.setVerticalScrollBarEnabled(true);
        RecyclerListView recyclerListView3 = this.cameraPhotoRecyclerView;
        PhotoAttachAdapter photoAttachAdapter2 = new PhotoAttachAdapter(context, false);
        this.cameraAttachAdapter = photoAttachAdapter2;
        recyclerListView3.setAdapter(photoAttachAdapter2);
        this.cameraAttachAdapter.createCache();
        this.cameraPhotoRecyclerView.setClipToPadding(false);
        this.cameraPhotoRecyclerView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.cameraPhotoRecyclerView.setItemAnimator(null);
        this.cameraPhotoRecyclerView.setLayoutAnimation(null);
        this.cameraPhotoRecyclerView.setOverScrollMode(2);
        this.cameraPhotoRecyclerView.setVisibility(4);
        this.cameraPhotoRecyclerView.setAlpha(0.0f);
        container.addView(this.cameraPhotoRecyclerView, LayoutHelper.createFrame(-1, 80.0f));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, context, 0, false) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.cameraPhotoLayoutManager = linearLayoutManager;
        this.cameraPhotoRecyclerView.setLayoutManager(linearLayoutManager);
        this.cameraPhotoRecyclerView.setOnItemClickListener(ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda16.INSTANCE);
    }

    public void lambda$new$0(View view) {
        this.dropDownContainer.toggleSubMenu();
    }

    public void lambda$new$1(Theme.ResourcesProvider resourcesProvider, View view, int i) {
        BaseFragment baseFragment;
        ChatActivity chatActivity;
        int i2;
        if (this.mediaEnabled && (baseFragment = this.parentAlert.baseFragment) != null && baseFragment.getParentActivity() != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.adapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry && i == 0 && this.noCameraPermissions) {
                    try {
                        this.parentAlert.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } else if (this.noGalleryPermissions) {
                    try {
                        this.parentAlert.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
            if (i != 0 || this.selectedAlbumEntry != this.galleryAlbumEntry) {
                if (this.selectedAlbumEntry == this.galleryAlbumEntry) {
                    i--;
                }
                int i3 = i;
                ArrayList<Object> allPhotosArray = getAllPhotosArray();
                if (i3 >= 0 && i3 < allPhotosArray.size()) {
                    PhotoViewer.getInstance().setParentActivity(this.parentAlert.baseFragment.getParentActivity(), resourcesProvider);
                    PhotoViewer.getInstance().setParentAlert(this.parentAlert);
                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                    ChatAttachAlert chatAttachAlert = this.parentAlert;
                    photoViewer.setMaxSelectedPhotos(chatAttachAlert.maxSelectedPhotos, chatAttachAlert.allowOrder);
                    ChatAttachAlert chatAttachAlert2 = this.parentAlert;
                    if (chatAttachAlert2.avatarPicker != 0) {
                        chatActivity = null;
                        i2 = 1;
                    } else {
                        BaseFragment baseFragment2 = chatAttachAlert2.baseFragment;
                        if (baseFragment2 instanceof ChatActivity) {
                            chatActivity = (ChatActivity) baseFragment2;
                            i2 = 0;
                        } else {
                            chatActivity = null;
                            i2 = 4;
                        }
                    }
                    if (!chatAttachAlert2.delegate.needEnterComment()) {
                        AndroidUtilities.hideKeyboard(this.parentAlert.baseFragment.getFragmentView().findFocus());
                        AndroidUtilities.hideKeyboard(this.parentAlert.getContainer().findFocus());
                    }
                    if (selectedPhotos.size() > 0 && selectedPhotosOrder.size() > 0) {
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                        if (obj instanceof MediaController.PhotoEntry) {
                            ((MediaController.PhotoEntry) obj).caption = this.parentAlert.getCommentTextView().getText();
                        }
                        if (obj instanceof MediaController.SearchImage) {
                            ((MediaController.SearchImage) obj).caption = this.parentAlert.getCommentTextView().getText();
                        }
                    }
                    PhotoViewer.getInstance().openPhotoForSelect(allPhotosArray, i3, i2, false, this.photoViewerProvider, chatActivity);
                    if (captionForAllMedia()) {
                        PhotoViewer.getInstance().setCaption(this.parentAlert.getCommentTextView().getText());
                    }
                }
            } else if (SharedConfig.inappCamera) {
                openCamera(true);
            } else {
                ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = this.parentAlert.delegate;
                if (chatAttachViewDelegate != null) {
                    chatAttachViewDelegate.didPressedButton(0, false, true, 0, false);
                }
            }
        }
    }

    public boolean lambda$new$2(View view, int i) {
        if (i == 0 && this.selectedAlbumEntry == this.galleryAlbumEntry) {
            ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = this.parentAlert.delegate;
            if (chatAttachViewDelegate != null) {
                chatAttachViewDelegate.didPressedButton(0, false, true, 0, false);
            }
            return true;
        } else if (!(view instanceof PhotoAttachPhotoCell)) {
            return false;
        } else {
            RecyclerViewItemRangeSelector recyclerViewItemRangeSelector = this.itemRangeSelector;
            boolean z = !((PhotoAttachPhotoCell) view).isChecked();
            this.shouldSelect = z;
            recyclerViewItemRangeSelector.setIsActive(view, true, i, z);
            return false;
        }
    }

    public void lambda$new$3(View view) {
        if (this.cameraView != null) {
            openPhotoViewer(null, false, false);
            CameraController.getInstance().stopPreview(this.cameraView.getCameraSession());
        }
    }

    public void lambda$new$4(float f) {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            this.cameraZoom = f;
            cameraView.setZoom(f);
        }
        showZoomControls(true, true);
    }

    public class AnonymousClass10 implements ShutterButton.ShutterButtonDelegate {
        private File outputFile;
        final FrameLayout val$container;
        private boolean zoomingWas;

        AnonymousClass10(FrameLayout frameLayout) {
            this.val$container = frameLayout;
        }

        @Override
        public boolean shutterLongPressed() {
            BaseFragment baseFragment;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            if ((chatAttachAlert.avatarPicker == 2 || (chatAttachAlert.baseFragment instanceof ChatActivity)) && !chatAttachAlertPhotoLayout.takingPhoto && (baseFragment = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment) != null && baseFragment.getParentActivity() != null) {
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                if (chatAttachAlertPhotoLayout2.cameraView != null) {
                    if (Build.VERSION.SDK_INT < 23 || chatAttachAlertPhotoLayout2.parentAlert.baseFragment.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                        for (int i = 0; i < 2; i++) {
                            ChatAttachAlertPhotoLayout.this.flashModeButton[i].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        }
                        ViewPropertyAnimator duration = ChatAttachAlertPhotoLayout.this.switchCameraButton.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                        duration.setInterpolator(cubicBezierInterpolator).start();
                        ChatAttachAlertPhotoLayout.this.tooltipTextView.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                        BaseFragment baseFragment2 = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment;
                        this.outputFile = AndroidUtilities.generateVideoPath((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isSecretChat());
                        AndroidUtilities.updateViewVisibilityAnimated(ChatAttachAlertPhotoLayout.this.recordTime, true);
                        ChatAttachAlertPhotoLayout.this.recordTime.setText(AndroidUtilities.formatLongDuration(0));
                        ChatAttachAlertPhotoLayout.this.videoRecordTime = 0;
                        ChatAttachAlertPhotoLayout.this.videoRecordRunnable = new Runnable() {
                            @Override
                            public final void run() {
                                ChatAttachAlertPhotoLayout.AnonymousClass10.this.lambda$shutterLongPressed$0();
                            }
                        };
                        AndroidUtilities.lockOrientation(ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment.getParentActivity());
                        CameraController.getInstance().recordVideo(ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession(), this.outputFile, ChatAttachAlertPhotoLayout.this.parentAlert.avatarPicker != 0, new CameraController.VideoTakeCallback() {
                            @Override
                            public final void onFinishVideoRecording(String str, long j) {
                                ChatAttachAlertPhotoLayout.AnonymousClass10.this.lambda$shutterLongPressed$1(str, j);
                            }
                        }, new Runnable() {
                            @Override
                            public final void run() {
                                ChatAttachAlertPhotoLayout.AnonymousClass10.this.lambda$shutterLongPressed$2();
                            }
                        }, ChatAttachAlertPhotoLayout.this.cameraView);
                        ChatAttachAlertPhotoLayout.this.shutterButton.setState(ShutterButton.State.RECORDING, true);
                        ChatAttachAlertPhotoLayout.this.cameraView.runHaptic();
                        return true;
                    }
                    ChatAttachAlertPhotoLayout.this.requestingPermissions = true;
                    ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                }
            }
            return false;
        }

        public void lambda$shutterLongPressed$0() {
            if (ChatAttachAlertPhotoLayout.this.videoRecordRunnable != null) {
                ChatAttachAlertPhotoLayout.access$2408(ChatAttachAlertPhotoLayout.this);
                ChatAttachAlertPhotoLayout.this.recordTime.setText(AndroidUtilities.formatLongDuration(ChatAttachAlertPhotoLayout.this.videoRecordTime));
                AndroidUtilities.runOnUIThread(ChatAttachAlertPhotoLayout.this.videoRecordRunnable, 1000L);
            }
        }

        public void lambda$shutterLongPressed$1(String str, long j) {
            int i;
            int i2;
            MediaController.PhotoEntry photoEntry;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
            int i3;
            if (this.outputFile != null) {
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                if (chatAttachAlertPhotoLayout2.parentAlert.baseFragment != null && chatAttachAlertPhotoLayout2.cameraView != null) {
                    boolean unused = ChatAttachAlertPhotoLayout.mediaFromExternalCamera = false;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                        i3 = options.outWidth;
                        try {
                            i = options.outHeight;
                            i2 = i3;
                        } catch (Exception unused2) {
                            i2 = i3;
                            i = 0;
                            photoEntry = new MediaController.PhotoEntry(0, ChatAttachAlertPhotoLayout.access$3010(), 0L, this.outputFile.getAbsolutePath(), 0, true, i2, i, 0L);
                            photoEntry.duration = (int) j;
                            photoEntry.thumbPath = str;
                            chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                            if (chatAttachAlertPhotoLayout.parentAlert.avatarPicker != 0) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                photoEntry.cropState = cropState;
                                cropState.mirrored = true;
                                cropState.freeform = false;
                                cropState.lockedAspectRatio = 1.0f;
                            }
                            ChatAttachAlertPhotoLayout.this.openPhotoViewer(photoEntry, false, false);
                        }
                    } catch (Exception unused3) {
                        i3 = 0;
                    }
                    photoEntry = new MediaController.PhotoEntry(0, ChatAttachAlertPhotoLayout.access$3010(), 0L, this.outputFile.getAbsolutePath(), 0, true, i2, i, 0L);
                    photoEntry.duration = (int) j;
                    photoEntry.thumbPath = str;
                    chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                    if (chatAttachAlertPhotoLayout.parentAlert.avatarPicker != 0 && chatAttachAlertPhotoLayout.cameraView.isFrontface()) {
                        MediaController.CropState cropState2 = new MediaController.CropState();
                        photoEntry.cropState = cropState2;
                        cropState2.mirrored = true;
                        cropState2.freeform = false;
                        cropState2.lockedAspectRatio = 1.0f;
                    }
                    ChatAttachAlertPhotoLayout.this.openPhotoViewer(photoEntry, false, false);
                }
            }
        }

        public void lambda$shutterLongPressed$2() {
            AndroidUtilities.runOnUIThread(ChatAttachAlertPhotoLayout.this.videoRecordRunnable, 1000L);
        }

        @Override
        public void shutterCancel() {
            File file = this.outputFile;
            if (file != null) {
                file.delete();
                this.outputFile = null;
            }
            ChatAttachAlertPhotoLayout.this.resetRecordState();
            CameraController.getInstance().stopVideoRecording(ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession(), true);
        }

        @Override
        public void shutterReleased() {
            CameraView cameraView;
            if (!ChatAttachAlertPhotoLayout.this.takingPhoto && (cameraView = ChatAttachAlertPhotoLayout.this.cameraView) != null && cameraView.getCameraSession() != null) {
                boolean z = true;
                if (ChatAttachAlertPhotoLayout.this.shutterButton.getState() == ShutterButton.State.RECORDING) {
                    ChatAttachAlertPhotoLayout.this.resetRecordState();
                    CameraController.getInstance().stopVideoRecording(ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession(), false);
                    ChatAttachAlertPhotoLayout.this.shutterButton.setState(ShutterButton.State.DEFAULT, true);
                    return;
                }
                BaseFragment baseFragment = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment;
                final File generatePicturePath = AndroidUtilities.generatePicturePath((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isSecretChat(), null);
                final boolean isSameTakePictureOrientation = ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession().isSameTakePictureOrientation();
                CameraSession cameraSession = ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession();
                ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                if (!(chatAttachAlert.baseFragment instanceof ChatActivity) && chatAttachAlert.avatarPicker != 2) {
                    z = false;
                }
                cameraSession.setFlipFront(z);
                ChatAttachAlertPhotoLayout.this.takingPhoto = CameraController.getInstance().takePicture(generatePicturePath, ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession(), new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlertPhotoLayout.AnonymousClass10.this.lambda$shutterReleased$3(generatePicturePath, isSameTakePictureOrientation);
                    }
                });
                ChatAttachAlertPhotoLayout.this.cameraView.startTakePictureAnimation();
            }
        }

        public void lambda$shutterReleased$3(File file, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            BitmapFactory.Options options;
            ChatAttachAlertPhotoLayout.this.takingPhoto = false;
            if (file != null && ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment != null) {
                try {
                    int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1);
                    i = attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180;
                } catch (Exception e) {
                    FileLog.e(e);
                    i = 0;
                }
                boolean unused = ChatAttachAlertPhotoLayout.mediaFromExternalCamera = false;
                try {
                    options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                    i4 = options.outWidth;
                } catch (Exception unused2) {
                    i4 = 0;
                }
                try {
                    i2 = options.outHeight;
                    i3 = i4;
                } catch (Exception unused3) {
                    i3 = i4;
                    i2 = 0;
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, ChatAttachAlertPhotoLayout.access$3010(), 0L, file.getAbsolutePath(), i, false, i3, i2, 0L);
                    photoEntry.canDeleteAfter = true;
                    ChatAttachAlertPhotoLayout.this.openPhotoViewer(photoEntry, z, false);
                }
                MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, ChatAttachAlertPhotoLayout.access$3010(), 0L, file.getAbsolutePath(), i, false, i3, i2, 0L);
                photoEntry2.canDeleteAfter = true;
                ChatAttachAlertPhotoLayout.this.openPhotoViewer(photoEntry2, z, false);
            }
        }

        @Override
        public boolean onTranslationChanged(float f, float f2) {
            boolean z = this.val$container.getWidth() < this.val$container.getHeight();
            float f3 = z ? f : f2;
            float f4 = z ? f2 : f;
            if (!this.zoomingWas && Math.abs(f3) > Math.abs(f4)) {
                return ChatAttachAlertPhotoLayout.this.zoomControlView.getTag() == null;
            }
            if (f4 < 0.0f) {
                ChatAttachAlertPhotoLayout.this.showZoomControls(true, true);
                ChatAttachAlertPhotoLayout.this.zoomControlView.setZoom((-f4) / AndroidUtilities.dp(200.0f), true);
                this.zoomingWas = true;
                return false;
            }
            if (this.zoomingWas) {
                ChatAttachAlertPhotoLayout.this.zoomControlView.setZoom(0.0f, true);
            }
            if (f == 0.0f && f2 == 0.0f) {
                this.zoomingWas = false;
            }
            if (!this.zoomingWas) {
                return (f == 0.0f && f2 == 0.0f) ? false : true;
            }
            return false;
        }
    }

    public void lambda$new$5(View view) {
        CameraView cameraView;
        if (!this.takingPhoto && (cameraView = this.cameraView) != null && cameraView.isInited()) {
            this.canSaveCameraPreview = false;
            this.cameraView.switchCamera();
            this.cameraView.startSwitchingAnimation();
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.switchCameraButton, View.SCALE_X, 0.0f).setDuration(100L);
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ImageView imageView = ChatAttachAlertPhotoLayout.this.switchCameraButton;
                    CameraView cameraView2 = ChatAttachAlertPhotoLayout.this.cameraView;
                    imageView.setImageResource((cameraView2 == null || !cameraView2.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                    ObjectAnimator.ofFloat(ChatAttachAlertPhotoLayout.this.switchCameraButton, View.SCALE_X, 1.0f).setDuration(100L).start();
                }
            });
            duration.start();
        }
    }

    public void lambda$new$6(final View view) {
        CameraView cameraView;
        if (!this.flashAnimationInProgress && (cameraView = this.cameraView) != null && cameraView.isInited() && this.cameraOpened) {
            String currentFlashMode = this.cameraView.getCameraSession().getCurrentFlashMode();
            String nextFlashMode = this.cameraView.getCameraSession().getNextFlashMode();
            if (!currentFlashMode.equals(nextFlashMode)) {
                this.cameraView.getCameraSession().setCurrentFlashMode(nextFlashMode);
                this.flashAnimationInProgress = true;
                ImageView[] imageViewArr = this.flashModeButton;
                final ImageView imageView = imageViewArr[0] == view ? imageViewArr[1] : imageViewArr[0];
                imageView.setVisibility(0);
                setCameraFlashModeIcon(imageView, nextFlashMode);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(48.0f)), ObjectAnimator.ofFloat(imageView, View.TRANSLATION_Y, -AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChatAttachAlertPhotoLayout.this.flashAnimationInProgress = false;
                        view.setVisibility(4);
                        imageView.sendAccessibilityEvent(8);
                    }
                });
                animatorSet.start();
            }
        }
    }

    public static void lambda$new$7(View view, int i) {
        if (view instanceof PhotoAttachPhotoCell) {
            ((PhotoAttachPhotoCell) view).callDelegate();
        }
    }

    public int addToSelectedPhotos(MediaController.PhotoEntry photoEntry, int i) {
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        if (selectedPhotos.containsKey(valueOf)) {
            selectedPhotos.remove(valueOf);
            int indexOf = selectedPhotosOrder.indexOf(valueOf);
            if (indexOf >= 0) {
                selectedPhotosOrder.remove(indexOf);
            }
            updatePhotosCounter(false);
            updateCheckedPhotoIndices();
            if (i >= 0) {
                photoEntry.reset();
                this.photoViewerProvider.updatePhotoAtIndex(i);
            }
            return indexOf;
        }
        selectedPhotos.put(valueOf, photoEntry);
        selectedPhotosOrder.add(valueOf);
        updatePhotosCounter(true);
        return -1;
    }

    private void clearSelectedPhotos() {
        if (!selectedPhotos.isEmpty()) {
            for (Map.Entry<Object, Object> entry : selectedPhotos.entrySet()) {
                ((MediaController.PhotoEntry) entry.getValue()).reset();
            }
            selectedPhotos.clear();
            selectedPhotosOrder.clear();
        }
        if (!cameraPhotos.isEmpty()) {
            int size = cameraPhotos.size();
            for (int i = 0; i < size; i++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) cameraPhotos.get(i);
                new File(photoEntry.path).delete();
                if (photoEntry.imagePath != null) {
                    new File(photoEntry.imagePath).delete();
                }
                if (photoEntry.thumbPath != null) {
                    new File(photoEntry.thumbPath).delete();
                }
            }
            cameraPhotos.clear();
        }
        this.adapter.notifyDataSetChanged();
        this.cameraAttachAdapter.notifyDataSetChanged();
    }

    private void updateAlbumsDropDown() {
        final ArrayList<MediaController.AlbumEntry> arrayList;
        this.dropDownContainer.removeAllSubItems();
        if (this.mediaEnabled) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if ((chatAttachAlert.baseFragment instanceof ChatActivity) || chatAttachAlert.avatarPicker == 2) {
                arrayList = MediaController.allMediaAlbums;
            } else {
                arrayList = MediaController.allPhotoAlbums;
            }
            ArrayList<MediaController.AlbumEntry> arrayList2 = new ArrayList<>(arrayList);
            this.dropDownAlbums = arrayList2;
            Collections.sort(arrayList2, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$updateAlbumsDropDown$8;
                    lambda$updateAlbumsDropDown$8 = ChatAttachAlertPhotoLayout.lambda$updateAlbumsDropDown$8(arrayList, (MediaController.AlbumEntry) obj, (MediaController.AlbumEntry) obj2);
                    return lambda$updateAlbumsDropDown$8;
                }
            });
        } else {
            this.dropDownAlbums = new ArrayList<>();
        }
        if (this.dropDownAlbums.isEmpty()) {
            this.dropDown.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.dropDown.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.dropDownDrawable, (Drawable) null);
        int size = this.dropDownAlbums.size();
        for (int i = 0; i < size; i++) {
            this.dropDownContainer.addSubItem(i + 10, this.dropDownAlbums.get(i).bucketName);
        }
    }

    public static int lambda$updateAlbumsDropDown$8(ArrayList arrayList, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2) {
        int indexOf;
        int indexOf2;
        int i = albumEntry.bucketId;
        if (i == 0 && albumEntry2.bucketId != 0) {
            return -1;
        }
        if ((i == 0 || albumEntry2.bucketId != 0) && (indexOf = arrayList.indexOf(albumEntry)) <= (indexOf2 = arrayList.indexOf(albumEntry2))) {
            return indexOf < indexOf2 ? -1 : 0;
        }
        return 1;
    }

    private boolean processTouchEvent(MotionEvent motionEvent) {
        CameraView cameraView;
        if (motionEvent == null) {
            return false;
        }
        if ((!this.pressed && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
            this.zoomControlView.getHitRect(this.hitRect);
            if (this.zoomControlView.getTag() != null && this.hitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            if (!this.takingPhoto && !this.dragging) {
                if (motionEvent.getPointerCount() == 2) {
                    this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                    this.zooming = true;
                } else {
                    this.maybeStartDraging = true;
                    this.lastY = motionEvent.getY();
                    this.zooming = false;
                }
                this.zoomWas = false;
                this.pressed = true;
            }
        } else if (this.pressed) {
            if (motionEvent.getActionMasked() == 2) {
                if (!this.zooming || motionEvent.getPointerCount() != 2 || this.dragging) {
                    float y = motionEvent.getY();
                    float f = y - this.lastY;
                    if (this.maybeStartDraging) {
                        if (Math.abs(f) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                            this.maybeStartDraging = false;
                            this.dragging = true;
                        }
                    } else if (this.dragging && (cameraView = this.cameraView) != null) {
                        cameraView.setTranslationY(cameraView.getTranslationY() + f);
                        this.lastY = y;
                        this.zoomControlView.setTag(null);
                        Runnable runnable = this.zoomControlHideRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                            this.zoomControlHideRunnable = null;
                        }
                        if (this.cameraPanel.getTag() == null) {
                            this.cameraPanel.setTag(1);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ObjectAnimator.ofFloat(this.cameraPanel, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.zoomControlView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.counterTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.flashModeButton[0], View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.flashModeButton[1], View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.cameraPhotoRecyclerView, View.ALPHA, 0.0f));
                            animatorSet.setDuration(220L);
                            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            animatorSet.start();
                        }
                    }
                } else {
                    float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                    if (!this.zoomWas) {
                        if (Math.abs(hypot - this.pinchStartDistance) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                            this.pinchStartDistance = hypot;
                            this.zoomWas = true;
                        }
                    } else if (this.cameraView != null) {
                        this.pinchStartDistance = hypot;
                        float dp = this.cameraZoom + ((hypot - this.pinchStartDistance) / AndroidUtilities.dp(100.0f));
                        this.cameraZoom = dp;
                        if (dp < 0.0f) {
                            this.cameraZoom = 0.0f;
                        } else if (dp > 1.0f) {
                            this.cameraZoom = 1.0f;
                        }
                        this.zoomControlView.setZoom(this.cameraZoom, false);
                        this.parentAlert.getSheetContainer().invalidate();
                        this.cameraView.setZoom(this.cameraZoom);
                        showZoomControls(true, true);
                    }
                }
            } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                this.pressed = false;
                this.zooming = false;
                if (this.dragging) {
                    this.dragging = false;
                    CameraView cameraView2 = this.cameraView;
                    if (cameraView2 != null) {
                        if (Math.abs(cameraView2.getTranslationY()) > this.cameraView.getMeasuredHeight() / 6.0f) {
                            closeCamera(true);
                        } else {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.cameraView, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(this.cameraPanel, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.counterTextView, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.flashModeButton[0], View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.flashModeButton[1], View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.cameraPhotoRecyclerView, View.ALPHA, 1.0f));
                            animatorSet2.setDuration(250L);
                            animatorSet2.setInterpolator(this.interpolator);
                            animatorSet2.start();
                            this.cameraPanel.setTag(null);
                        }
                    }
                } else {
                    CameraView cameraView3 = this.cameraView;
                    if (cameraView3 != null && !this.zoomWas) {
                        cameraView3.getLocationOnScreen(this.viewPosition);
                        this.cameraView.focusToPoint((int) (motionEvent.getRawX() - this.viewPosition[0]), (int) (motionEvent.getRawY() - this.viewPosition[1]));
                    }
                }
            }
        }
        return true;
    }

    public void resetRecordState() {
        if (this.parentAlert.baseFragment != null) {
            for (int i = 0; i < 2; i++) {
                this.flashModeButton[i].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            }
            ViewPropertyAnimator duration = this.switchCameraButton.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.tooltipTextView.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            AndroidUtilities.updateViewVisibilityAnimated(this.recordTime, false);
            AndroidUtilities.cancelRunOnUIThread(this.videoRecordRunnable);
            this.videoRecordRunnable = null;
            AndroidUtilities.unlockOrientation(this.parentAlert.baseFragment.getParentActivity());
        }
    }

    protected void openPhotoViewer(MediaController.PhotoEntry photoEntry, boolean z, boolean z2) {
        ChatActivity chatActivity;
        int i;
        int i2;
        ArrayList<Object> arrayList;
        if (photoEntry != null) {
            cameraPhotos.add(photoEntry);
            selectedPhotos.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            selectedPhotosOrder.add(Integer.valueOf(photoEntry.imageId));
            this.parentAlert.updateCountButton(0);
            this.adapter.notifyDataSetChanged();
            this.cameraAttachAdapter.notifyDataSetChanged();
        }
        if (photoEntry != null && !z2 && cameraPhotos.size() > 1) {
            updatePhotosCounter(false);
            if (this.cameraView != null) {
                this.zoomControlView.setZoom(0.0f, false);
                this.cameraZoom = 0.0f;
                this.cameraView.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.cameraView.getCameraSession());
            }
        } else if (!cameraPhotos.isEmpty()) {
            this.cancelTakingPhotos = true;
            PhotoViewer.getInstance().setParentActivity(this.parentAlert.baseFragment.getParentActivity(), this.resourcesProvider);
            PhotoViewer.getInstance().setParentAlert(this.parentAlert);
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            photoViewer.setMaxSelectedPhotos(chatAttachAlert.maxSelectedPhotos, chatAttachAlert.allowOrder);
            ChatAttachAlert chatAttachAlert2 = this.parentAlert;
            int i3 = chatAttachAlert2.avatarPicker;
            if (i3 != 0) {
                chatActivity = null;
                i = 1;
            } else {
                BaseFragment baseFragment = chatAttachAlert2.baseFragment;
                if (baseFragment instanceof ChatActivity) {
                    chatActivity = (ChatActivity) baseFragment;
                    i = 2;
                } else {
                    chatActivity = null;
                    i = 5;
                }
            }
            if (i3 != 0) {
                ArrayList<Object> arrayList2 = new ArrayList<>();
                arrayList2.add(photoEntry);
                arrayList = arrayList2;
                i2 = 0;
            } else {
                ArrayList<Object> allPhotosArray = getAllPhotosArray();
                i2 = cameraPhotos.size() - 1;
                arrayList = allPhotosArray;
            }
            PhotoViewer.getInstance().openPhotoForSelect(arrayList, i2, i, false, new AnonymousClass15(z), chatActivity);
        }
    }

    public class AnonymousClass15 extends BasePhotoProvider {
        final boolean val$sameTakePictureOrientation;

        @Override
        public boolean canScrollAway() {
            return false;
        }

        @Override
        public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i) {
            return null;
        }

        AnonymousClass15(boolean z) {
            super();
            this.val$sameTakePictureOrientation = z;
        }

        @Override
        public void onOpen() {
            ChatAttachAlertPhotoLayout.this.pauseCameraPreview();
        }

        @Override
        public void onClose() {
            ChatAttachAlertPhotoLayout.this.resumeCameraPreview();
        }

        @Override
        public boolean cancelButtonPressed() {
            if (ChatAttachAlertPhotoLayout.this.cameraOpened && ChatAttachAlertPhotoLayout.this.cameraView != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlertPhotoLayout.AnonymousClass15.this.lambda$cancelButtonPressed$0();
                    }
                }, 1000L);
                ChatAttachAlertPhotoLayout.this.zoomControlView.setZoom(0.0f, false);
                ChatAttachAlertPhotoLayout.this.cameraZoom = 0.0f;
                ChatAttachAlertPhotoLayout.this.cameraView.setZoom(0.0f);
                CameraController.getInstance().startPreview(ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession());
            }
            if (ChatAttachAlertPhotoLayout.this.cancelTakingPhotos && ChatAttachAlertPhotoLayout.cameraPhotos.size() == 1) {
                int size = ChatAttachAlertPhotoLayout.cameraPhotos.size();
                for (int i = 0; i < size; i++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.cameraPhotos.get(i);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.cameraPhotos.clear();
                ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
                ChatAttachAlertPhotoLayout.selectedPhotos.clear();
                ChatAttachAlertPhotoLayout.this.counterTextView.setVisibility(4);
                ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView.setVisibility(8);
                ChatAttachAlertPhotoLayout.this.adapter.notifyDataSetChanged();
                ChatAttachAlertPhotoLayout.this.cameraAttachAdapter.notifyDataSetChanged();
                ChatAttachAlertPhotoLayout.this.parentAlert.updateCountButton(0);
            }
            return true;
        }

        public void lambda$cancelButtonPressed$0() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.cameraView != null && !chatAttachAlertPhotoLayout.parentAlert.isDismissed() && Build.VERSION.SDK_INT >= 21) {
                ChatAttachAlertPhotoLayout.this.cameraView.setSystemUiVisibility(1028);
            }
        }

        @Override
        public void needAddMorePhotos() {
            ChatAttachAlertPhotoLayout.this.cancelTakingPhotos = false;
            if (ChatAttachAlertPhotoLayout.mediaFromExternalCamera) {
                ChatAttachAlertPhotoLayout.this.parentAlert.delegate.didPressedButton(0, true, true, 0, false);
                return;
            }
            if (!ChatAttachAlertPhotoLayout.this.cameraOpened) {
                ChatAttachAlertPhotoLayout.this.openCamera(false);
            }
            ChatAttachAlertPhotoLayout.this.counterTextView.setVisibility(0);
            ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView.setVisibility(0);
            ChatAttachAlertPhotoLayout.this.counterTextView.setAlpha(1.0f);
            ChatAttachAlertPhotoLayout.this.updatePhotosCounter(false);
        }

        @Override
        public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, boolean z2) {
            if (!(ChatAttachAlertPhotoLayout.cameraPhotos.isEmpty() || ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment == null)) {
                if (videoEditedInfo != null && i >= 0 && i < ChatAttachAlertPhotoLayout.cameraPhotos.size()) {
                    ((MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.cameraPhotos.get(i)).editedInfo = videoEditedInfo;
                }
                BaseFragment baseFragment = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment;
                if (!(baseFragment instanceof ChatActivity) || !((ChatActivity) baseFragment).isSecretChat()) {
                    int size = ChatAttachAlertPhotoLayout.cameraPhotos.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        AndroidUtilities.addMediaToGallery(((MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.cameraPhotos.get(i3)).path);
                    }
                }
                ChatAttachAlertPhotoLayout.this.parentAlert.applyCaption();
                ChatAttachAlertPhotoLayout.this.closeCamera(false);
                ChatAttachAlertPhotoLayout.this.parentAlert.delegate.didPressedButton(z2 ? 4 : 8, true, z, i2, z2);
                ChatAttachAlertPhotoLayout.cameraPhotos.clear();
                ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
                ChatAttachAlertPhotoLayout.selectedPhotos.clear();
                ChatAttachAlertPhotoLayout.this.adapter.notifyDataSetChanged();
                ChatAttachAlertPhotoLayout.this.cameraAttachAdapter.notifyDataSetChanged();
                ChatAttachAlertPhotoLayout.this.parentAlert.dismiss(true);
            }
        }

        @Override
        public boolean scaleToFill() {
            BaseFragment baseFragment = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment;
            if (baseFragment == null || baseFragment.getParentActivity() == null) {
                return false;
            }
            return this.val$sameTakePictureOrientation || Settings.System.getInt(ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment.getParentActivity().getContentResolver(), "accelerometer_rotation", 0) == 1;
        }

        @Override
        public void willHidePhotoViewer() {
            int childCount = ChatAttachAlertPhotoLayout.this.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ChatAttachAlertPhotoLayout.this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    photoAttachPhotoCell.showImage();
                    photoAttachPhotoCell.showCheck(true);
                }
            }
        }

        @Override
        public boolean canCaptureMorePhotos() {
            return ChatAttachAlertPhotoLayout.this.parentAlert.maxSelectedPhotos != 1;
        }
    }

    public void showZoomControls(boolean z, boolean z2) {
        if ((this.zoomControlView.getTag() == null || !z) && (this.zoomControlView.getTag() != null || z)) {
            AnimatorSet animatorSet = this.zoomControlAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.zoomControlView.setTag(z ? 1 : null);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.zoomControlAnimation = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = this.zoomControlAnimation;
            Animator[] animatorArr = new Animator[1];
            ZoomControlView zoomControlView = this.zoomControlView;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(zoomControlView, property, fArr);
            animatorSet3.playTogether(animatorArr);
            this.zoomControlAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatAttachAlertPhotoLayout.this.zoomControlAnimation = null;
                }
            });
            this.zoomControlAnimation.start();
            if (z) {
                Runnable chatAttachAlertPhotoLayout$$ExternalSyntheticLambda4 = new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlertPhotoLayout.this.lambda$showZoomControls$10();
                    }
                };
                this.zoomControlHideRunnable = chatAttachAlertPhotoLayout$$ExternalSyntheticLambda4;
                AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout$$ExternalSyntheticLambda4, 2000L);
            }
        } else if (z) {
            Runnable runnable = this.zoomControlHideRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable chatAttachAlertPhotoLayout$$ExternalSyntheticLambda8 = new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertPhotoLayout.this.lambda$showZoomControls$9();
                }
            };
            this.zoomControlHideRunnable = chatAttachAlertPhotoLayout$$ExternalSyntheticLambda8;
            AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout$$ExternalSyntheticLambda8, 2000L);
        }
    }

    public void lambda$showZoomControls$9() {
        showZoomControls(false, true);
        this.zoomControlHideRunnable = null;
    }

    public void lambda$showZoomControls$10() {
        showZoomControls(false, true);
        this.zoomControlHideRunnable = null;
    }

    protected void updatePhotosCounter(boolean z) {
        if (this.counterTextView != null && this.parentAlert.avatarPicker == 0) {
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (Map.Entry<Object, Object> entry : selectedPhotos.entrySet()) {
                if (((MediaController.PhotoEntry) entry.getValue()).isVideo) {
                    z3 = true;
                } else {
                    z4 = true;
                }
                if (z3 && z4) {
                    break;
                }
            }
            int max = Math.max(1, selectedPhotos.size());
            if (z3 && z4) {
                this.counterTextView.setText(LocaleController.formatPluralString("Media", selectedPhotos.size(), new Object[0]).toUpperCase());
                if (max != this.currentSelectedCount || z) {
                    this.parentAlert.selectedTextView.setText(LocaleController.formatPluralString("MediaSelected", max, new Object[0]));
                }
            } else if (z3) {
                this.counterTextView.setText(LocaleController.formatPluralString("Videos", selectedPhotos.size(), new Object[0]).toUpperCase());
                if (max != this.currentSelectedCount || z) {
                    this.parentAlert.selectedTextView.setText(LocaleController.formatPluralString("VideosSelected", max, new Object[0]));
                }
            } else {
                this.counterTextView.setText(LocaleController.formatPluralString("Photos", selectedPhotos.size(), new Object[0]).toUpperCase());
                if (max != this.currentSelectedCount || z) {
                    this.parentAlert.selectedTextView.setText(LocaleController.formatPluralString("PhotosSelected", max, new Object[0]));
                }
            }
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (max > 1) {
                z2 = true;
            }
            chatAttachAlert.setCanOpenPreview(z2);
            this.currentSelectedCount = max;
        }
    }

    public PhotoAttachPhotoCell getCellForIndex(int i) {
        int childCount = this.gridView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.gridView.getChildAt(i2);
            if (childAt.getTop() < this.gridView.getMeasuredHeight() - this.parentAlert.getClipLayoutBottom() && (childAt instanceof PhotoAttachPhotoCell)) {
                PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                if (((Integer) photoAttachPhotoCell.getImageView().getTag()).intValue() == i) {
                    return photoAttachPhotoCell;
                }
            }
        }
        return null;
    }

    public void setCameraFlashModeIcon(ImageView imageView, String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3551:
                if (str.equals("on")) {
                    c = 0;
                    break;
                }
                break;
            case 109935:
                if (str.equals("off")) {
                    c = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(LocaleController.getString("AccDescrCameraFlashOn", R.string.AccDescrCameraFlashOn));
                return;
            case 1:
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(LocaleController.getString("AccDescrCameraFlashOff", R.string.AccDescrCameraFlashOff));
                return;
            case 2:
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(LocaleController.getString("AccDescrCameraFlashAuto", R.string.AccDescrCameraFlashAuto));
                return;
            default:
                return;
        }
    }

    public void checkCamera(boolean z) {
        PhotoAttachAdapter photoAttachAdapter;
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            boolean z2 = this.deviceHasGoodCamera;
            boolean z3 = this.noCameraPermissions;
            if (!SharedConfig.inappCamera) {
                this.deviceHasGoodCamera = false;
            } else if (Build.VERSION.SDK_INT >= 23) {
                boolean z4 = this.parentAlert.baseFragment.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
                this.noCameraPermissions = z4;
                if (z4) {
                    if (z) {
                        try {
                            this.parentAlert.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                        } catch (Exception unused) {
                        }
                    }
                    this.deviceHasGoodCamera = false;
                } else {
                    if (z || SharedConfig.hasCameraCache) {
                        CameraController.getInstance().initCamera(null);
                    }
                    this.deviceHasGoodCamera = CameraController.getInstance().isCameraInitied();
                }
            } else {
                if (z || SharedConfig.hasCameraCache) {
                    CameraController.getInstance().initCamera(null);
                }
                this.deviceHasGoodCamera = CameraController.getInstance().isCameraInitied();
            }
            if (!((z2 == this.deviceHasGoodCamera && z3 == this.noCameraPermissions) || (photoAttachAdapter = this.adapter) == null)) {
                photoAttachAdapter.notifyDataSetChanged();
            }
            if (this.parentAlert.isShowing() && this.deviceHasGoodCamera) {
                ChatAttachAlert chatAttachAlert = this.parentAlert;
                if (chatAttachAlert.baseFragment != null && chatAttachAlert.getBackDrawable().getAlpha() != 0 && !this.cameraOpened) {
                    showCamera();
                }
            }
        }
    }

    public void openCamera(boolean z) {
        CameraView cameraView = this.cameraView;
        if (cameraView != null && this.cameraInitAnimation == null && cameraView.isInited() && !this.parentAlert.isDismissed()) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            int i = 0;
            if (chatAttachAlert.avatarPicker == 2 || (chatAttachAlert.baseFragment instanceof ChatActivity)) {
                this.tooltipTextView.setVisibility(0);
            } else {
                this.tooltipTextView.setVisibility(8);
            }
            if (cameraPhotos.isEmpty()) {
                this.counterTextView.setVisibility(4);
                this.cameraPhotoRecyclerView.setVisibility(8);
            } else {
                this.counterTextView.setVisibility(0);
                this.cameraPhotoRecyclerView.setVisibility(0);
            }
            if (this.parentAlert.commentTextView.isKeyboardVisible() && isFocusable()) {
                this.parentAlert.commentTextView.closeKeyboard();
            }
            this.zoomControlView.setVisibility(0);
            this.zoomControlView.setAlpha(0.0f);
            this.cameraPanel.setVisibility(0);
            this.cameraPanel.setTag(null);
            int[] iArr = this.animateCameraValues;
            iArr[0] = 0;
            int i2 = this.itemSize;
            iArr[1] = i2;
            iArr[2] = i2;
            this.additionCloseCameraY = 0.0f;
            this.cameraExpanded = true;
            this.cameraView.setFpsLimit(-1);
            AndroidUtilities.hideKeyboard(this);
            AndroidUtilities.setLightNavigationBar(this.parentAlert.getWindow(), false);
            if (z) {
                setCameraOpenProgress(0.0f);
                this.cameraAnimationInProgress = true;
                this.animationIndex = NotificationCenter.getInstance(this.parentAlert.currentAccount).setAnimationInProgress(this.animationIndex, null);
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.cameraPanel, View.ALPHA, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.counterTextView, View.ALPHA, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.cameraPhotoRecyclerView, View.ALPHA, 1.0f));
                int i3 = 0;
                while (true) {
                    if (i3 >= 2) {
                        break;
                    } else if (this.flashModeButton[i3].getVisibility() == 0) {
                        arrayList.add(ObjectAnimator.ofFloat(this.flashModeButton[i3], View.ALPHA, 1.0f));
                        break;
                    } else {
                        i3++;
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(350L);
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        CameraView cameraView2;
                        CameraView cameraView3;
                        NotificationCenter.getInstance(ChatAttachAlertPhotoLayout.this.parentAlert.currentAccount).onAnimationFinish(ChatAttachAlertPhotoLayout.this.animationIndex);
                        ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress = false;
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 < 21 || (cameraView3 = ChatAttachAlertPhotoLayout.this.cameraView) == null) {
                            CameraView cameraView4 = ChatAttachAlertPhotoLayout.this.cameraView;
                            if (cameraView4 != null) {
                                cameraView4.invalidate();
                            }
                        } else {
                            cameraView3.invalidateOutline();
                        }
                        if (ChatAttachAlertPhotoLayout.this.cameraOpened) {
                            ChatAttachAlertPhotoLayout.this.parentAlert.delegate.onCameraOpened();
                        }
                        if (i4 >= 21 && (cameraView2 = ChatAttachAlertPhotoLayout.this.cameraView) != null) {
                            cameraView2.setSystemUiVisibility(1028);
                        }
                    }
                });
                animatorSet.start();
            } else {
                setCameraOpenProgress(1.0f);
                this.cameraPanel.setAlpha(1.0f);
                this.counterTextView.setAlpha(1.0f);
                this.cameraPhotoRecyclerView.setAlpha(1.0f);
                while (true) {
                    if (i >= 2) {
                        break;
                    } else if (this.flashModeButton[i].getVisibility() == 0) {
                        this.flashModeButton[i].setAlpha(1.0f);
                        break;
                    } else {
                        i++;
                    }
                }
                this.parentAlert.delegate.onCameraOpened();
                if (Build.VERSION.SDK_INT >= 21) {
                    this.cameraView.setSystemUiVisibility(1028);
                }
            }
            this.cameraOpened = true;
            this.cameraView.setImportantForAccessibility(2);
            if (Build.VERSION.SDK_INT >= 19) {
                this.gridView.setImportantForAccessibility(4);
            }
        }
    }

    public void loadGalleryPhotos() {
        MediaController.AlbumEntry albumEntry;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if ((chatAttachAlert.baseFragment instanceof ChatActivity) || chatAttachAlert.avatarPicker == 2) {
            albumEntry = MediaController.allMediaAlbumEntry;
        } else {
            albumEntry = MediaController.allPhotosAlbumEntry;
        }
        if (albumEntry == null && Build.VERSION.SDK_INT >= 21) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    public void showCamera() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (!chatAttachAlert.paused && this.mediaEnabled) {
            if (this.cameraView == null) {
                CameraView cameraView = new CameraView(chatAttachAlert.baseFragment.getParentActivity(), this.parentAlert.openWithFrontFaceCamera) {
                    @Override
                    public void dispatchDraw(Canvas canvas) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            super.dispatchDraw(canvas);
                            return;
                        }
                        if (ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                            float f = chatAttachAlertPhotoLayout.animationClipLeft + (chatAttachAlertPhotoLayout.cameraViewOffsetX * (1.0f - ChatAttachAlertPhotoLayout.this.cameraOpenProgress));
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                            float f2 = chatAttachAlertPhotoLayout2.animationClipTop + (chatAttachAlertPhotoLayout2.cameraViewOffsetY * (1.0f - ChatAttachAlertPhotoLayout.this.cameraOpenProgress));
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ChatAttachAlertPhotoLayout.this;
                            rectF.set(f, f2, chatAttachAlertPhotoLayout3.animationClipRight, chatAttachAlertPhotoLayout3.animationClipBottom);
                        } else if (ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress || ChatAttachAlertPhotoLayout.this.cameraOpened) {
                            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        } else {
                            AndroidUtilities.rectTmp.set(ChatAttachAlertPhotoLayout.this.cameraViewOffsetX, ChatAttachAlertPhotoLayout.this.cameraViewOffsetY, getMeasuredWidth(), getMeasuredHeight());
                        }
                        canvas.save();
                        canvas.clipRect(AndroidUtilities.rectTmp);
                        super.dispatchDraw(canvas);
                        canvas.restore();
                    }
                };
                this.cameraView = cameraView;
                BaseFragment baseFragment = this.parentAlert.baseFragment;
                cameraView.setRecordFile(AndroidUtilities.generateVideoPath((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isSecretChat()));
                this.cameraView.setFocusable(true);
                this.cameraView.setFpsLimit(30);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.cameraView.setOutlineProvider(new ViewOutlineProvider() {
                        @Override
                        public void getOutline(View view, Outline outline) {
                            if (ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress) {
                                RectF rectF = AndroidUtilities.rectTmp;
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                                float f = chatAttachAlertPhotoLayout.animationClipLeft + (chatAttachAlertPhotoLayout.cameraViewOffsetX * (1.0f - ChatAttachAlertPhotoLayout.this.cameraOpenProgress));
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                                float f2 = chatAttachAlertPhotoLayout2.animationClipTop + (chatAttachAlertPhotoLayout2.cameraViewOffsetY * (1.0f - ChatAttachAlertPhotoLayout.this.cameraOpenProgress));
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ChatAttachAlertPhotoLayout.this;
                                rectF.set(f, f2, chatAttachAlertPhotoLayout3.animationClipRight, chatAttachAlertPhotoLayout3.animationClipBottom);
                                outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            } else if (ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress || ChatAttachAlertPhotoLayout.this.cameraOpened) {
                                outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                            } else {
                                int dp = AndroidUtilities.dp(ChatAttachAlertPhotoLayout.this.parentAlert.cornerRadius * 8.0f);
                                outline.setRoundRect((int) ChatAttachAlertPhotoLayout.this.cameraViewOffsetX, (int) ChatAttachAlertPhotoLayout.this.cameraViewOffsetY, view.getMeasuredWidth() + dp, view.getMeasuredHeight() + dp, dp);
                            }
                        }
                    });
                    this.cameraView.setClipToOutline(true);
                }
                this.cameraView.setContentDescription(LocaleController.getString("AccDescrInstantCamera", R.string.AccDescrInstantCamera));
                FrameLayout container = this.parentAlert.getContainer();
                CameraView cameraView2 = this.cameraView;
                int i = this.itemSize;
                container.addView(cameraView2, 1, new FrameLayout.LayoutParams(i, i));
                this.cameraView.setDelegate(new CameraView.CameraViewDelegate() {
                    @Override
                    public void onCameraInit() {
                        int i2 = 4;
                        if (ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession().getCurrentFlashMode().equals(ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession().getNextFlashMode())) {
                            for (int i3 = 0; i3 < 2; i3++) {
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i3].setVisibility(4);
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i3].setAlpha(0.0f);
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i3].setTranslationY(0.0f);
                            }
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                            chatAttachAlertPhotoLayout.setCameraFlashModeIcon(chatAttachAlertPhotoLayout.flashModeButton[0], ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession().getCurrentFlashMode());
                            int i4 = 0;
                            while (i4 < 2) {
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i4].setVisibility(i4 == 0 ? 0 : 4);
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i4].setAlpha((i4 != 0 || !ChatAttachAlertPhotoLayout.this.cameraOpened) ? 0.0f : 1.0f);
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i4].setTranslationY(0.0f);
                                i4++;
                            }
                        }
                        ChatAttachAlertPhotoLayout.this.switchCameraButton.setImageResource(ChatAttachAlertPhotoLayout.this.cameraView.isFrontface() ? R.drawable.camera_revert1 : R.drawable.camera_revert2);
                        ImageView imageView = ChatAttachAlertPhotoLayout.this.switchCameraButton;
                        if (ChatAttachAlertPhotoLayout.this.cameraView.hasFrontFaceCamera()) {
                            i2 = 0;
                        }
                        imageView.setVisibility(i2);
                        if (!ChatAttachAlertPhotoLayout.this.cameraOpened) {
                            ChatAttachAlertPhotoLayout.this.cameraInitAnimation = new AnimatorSet();
                            ChatAttachAlertPhotoLayout.this.cameraInitAnimation.playTogether(ObjectAnimator.ofFloat(ChatAttachAlertPhotoLayout.this.cameraView, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(ChatAttachAlertPhotoLayout.this.cameraIcon, View.ALPHA, 0.0f, 1.0f));
                            ChatAttachAlertPhotoLayout.this.cameraInitAnimation.setDuration(180L);
                            ChatAttachAlertPhotoLayout.this.cameraInitAnimation.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (animator.equals(ChatAttachAlertPhotoLayout.this.cameraInitAnimation)) {
                                        ChatAttachAlertPhotoLayout.this.canSaveCameraPreview = true;
                                        ChatAttachAlertPhotoLayout.this.cameraInitAnimation = null;
                                        if (!ChatAttachAlertPhotoLayout.this.isHidden) {
                                            int childCount = ChatAttachAlertPhotoLayout.this.gridView.getChildCount();
                                            for (int i5 = 0; i5 < childCount; i5++) {
                                                View childAt = ChatAttachAlertPhotoLayout.this.gridView.getChildAt(i5);
                                                if (childAt instanceof PhotoAttachCameraCell) {
                                                    childAt.setVisibility(4);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {
                                    ChatAttachAlertPhotoLayout.this.cameraInitAnimation = null;
                                }
                            });
                            ChatAttachAlertPhotoLayout.this.cameraInitAnimation.start();
                        }
                    }
                });
                if (this.cameraIcon == null) {
                    FrameLayout frameLayout = new FrameLayout(this.parentAlert.baseFragment.getParentActivity()) {
                        @Override
                        protected void onDraw(Canvas canvas) {
                            int intrinsicWidth = ChatAttachAlertPhotoLayout.this.cameraDrawable.getIntrinsicWidth();
                            int intrinsicHeight = ChatAttachAlertPhotoLayout.this.cameraDrawable.getIntrinsicHeight();
                            int i2 = (ChatAttachAlertPhotoLayout.this.itemSize - intrinsicWidth) / 2;
                            int i3 = (ChatAttachAlertPhotoLayout.this.itemSize - intrinsicHeight) / 2;
                            if (ChatAttachAlertPhotoLayout.this.cameraViewOffsetY != 0.0f) {
                                i3 = (int) (i3 - ChatAttachAlertPhotoLayout.this.cameraViewOffsetY);
                            }
                            ChatAttachAlertPhotoLayout.this.cameraDrawable.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
                            ChatAttachAlertPhotoLayout.this.cameraDrawable.draw(canvas);
                        }
                    };
                    this.cameraIcon = frameLayout;
                    frameLayout.setWillNotDraw(false);
                    this.cameraIcon.setClipChildren(true);
                }
                FrameLayout container2 = this.parentAlert.getContainer();
                FrameLayout frameLayout2 = this.cameraIcon;
                int i2 = this.itemSize;
                container2.addView(frameLayout2, 2, new FrameLayout.LayoutParams(i2, i2));
                float f = 1.0f;
                this.cameraView.setAlpha(this.mediaEnabled ? 1.0f : 0.2f);
                this.cameraView.setEnabled(this.mediaEnabled);
                FrameLayout frameLayout3 = this.cameraIcon;
                if (!this.mediaEnabled) {
                    f = 0.2f;
                }
                frameLayout3.setAlpha(f);
                this.cameraIcon.setEnabled(this.mediaEnabled);
                if (this.isHidden) {
                    this.cameraView.setVisibility(8);
                    this.cameraIcon.setVisibility(8);
                }
                checkCameraViewPosition();
                invalidate();
            }
            ZoomControlView zoomControlView = this.zoomControlView;
            if (zoomControlView != null) {
                zoomControlView.setZoom(0.0f, false);
                this.cameraZoom = 0.0f;
            }
            this.cameraView.setTranslationX(this.cameraViewLocation[0]);
            this.cameraView.setTranslationY(this.cameraViewLocation[1] + this.currentPanTranslationY);
            this.cameraIcon.setTranslationX(this.cameraViewLocation[0]);
            this.cameraIcon.setTranslationY(this.cameraViewLocation[1] + this.cameraViewOffsetY + this.currentPanTranslationY);
        }
    }

    public void hideCamera(boolean z) {
        if (this.deviceHasGoodCamera && this.cameraView != null) {
            saveLastCameraBitmap();
            int childCount = this.gridView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachCameraCell) {
                    childAt.setVisibility(0);
                    ((PhotoAttachCameraCell) childAt).updateBitmap();
                    break;
                }
                i++;
            }
            this.cameraView.destroy(z, null);
            AnimatorSet animatorSet = this.cameraInitAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.cameraInitAnimation = null;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertPhotoLayout.this.lambda$hideCamera$11();
                }
            }, 300L);
            this.canSaveCameraPreview = false;
        }
    }

    public void lambda$hideCamera$11() {
        this.parentAlert.getContainer().removeView(this.cameraView);
        this.parentAlert.getContainer().removeView(this.cameraIcon);
        this.cameraView = null;
        this.cameraIcon = null;
    }

    private void saveLastCameraBitmap() {
        if (this.canSaveCameraPreview) {
            try {
                Bitmap bitmap = this.cameraView.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.cameraView.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7, 1, createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), createScaledBitmap.getRowBytes());
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg")));
                        createScaledBitmap.recycle();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onActivityResultFragment(int r29, android.content.Intent r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.onActivityResultFragment(int, android.content.Intent, java.lang.String):void");
    }

    public void closeCamera(boolean z) {
        if (!this.takingPhoto && this.cameraView != null) {
            int[] iArr = this.animateCameraValues;
            int i = this.itemSize;
            iArr[1] = i;
            iArr[2] = i;
            Runnable runnable = this.zoomControlHideRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.zoomControlHideRunnable = null;
            }
            AndroidUtilities.setLightNavigationBar(this.parentAlert.getWindow(), ((double) AndroidUtilities.computePerceivedBrightness(getThemedColor("windowBackgroundGray"))) > 0.721d);
            if (z) {
                this.additionCloseCameraY = this.cameraView.getTranslationY();
                this.cameraAnimationInProgress = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.cameraPanel, View.ALPHA, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.zoomControlView, View.ALPHA, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.counterTextView, View.ALPHA, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.cameraPhotoRecyclerView, View.ALPHA, 0.0f));
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        break;
                    } else if (this.flashModeButton[i2].getVisibility() == 0) {
                        arrayList.add(ObjectAnimator.ofFloat(this.flashModeButton[i2], View.ALPHA, 0.0f));
                        break;
                    } else {
                        i2++;
                    }
                }
                this.animationIndex = NotificationCenter.getInstance(this.parentAlert.currentAccount).setAnimationInProgress(this.animationIndex, null);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        CameraView cameraView;
                        NotificationCenter.getInstance(ChatAttachAlertPhotoLayout.this.parentAlert.currentAccount).onAnimationFinish(ChatAttachAlertPhotoLayout.this.animationIndex);
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                        chatAttachAlertPhotoLayout.cameraExpanded = false;
                        chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                        ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress = false;
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 < 21 || (cameraView = ChatAttachAlertPhotoLayout.this.cameraView) == null) {
                            CameraView cameraView2 = ChatAttachAlertPhotoLayout.this.cameraView;
                            if (cameraView2 != null) {
                                cameraView2.invalidate();
                            }
                        } else {
                            cameraView.invalidateOutline();
                        }
                        ChatAttachAlertPhotoLayout.this.cameraOpened = false;
                        if (ChatAttachAlertPhotoLayout.this.cameraPanel != null) {
                            ChatAttachAlertPhotoLayout.this.cameraPanel.setVisibility(8);
                        }
                        if (ChatAttachAlertPhotoLayout.this.zoomControlView != null) {
                            ChatAttachAlertPhotoLayout.this.zoomControlView.setVisibility(8);
                            ChatAttachAlertPhotoLayout.this.zoomControlView.setTag(null);
                        }
                        if (ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView != null) {
                            ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView.setVisibility(8);
                        }
                        CameraView cameraView3 = ChatAttachAlertPhotoLayout.this.cameraView;
                        if (cameraView3 != null) {
                            cameraView3.setFpsLimit(30);
                            if (i3 >= 21) {
                                ChatAttachAlertPhotoLayout.this.cameraView.setSystemUiVisibility(1024);
                            }
                        }
                    }
                });
                animatorSet.start();
            } else {
                this.cameraExpanded = false;
                setCameraOpenProgress(0.0f);
                this.animateCameraValues[0] = 0;
                setCameraOpenProgress(0.0f);
                this.cameraPanel.setAlpha(0.0f);
                this.cameraPanel.setVisibility(8);
                this.zoomControlView.setAlpha(0.0f);
                this.zoomControlView.setTag(null);
                this.zoomControlView.setVisibility(8);
                this.cameraPhotoRecyclerView.setAlpha(0.0f);
                this.counterTextView.setAlpha(0.0f);
                this.cameraPhotoRecyclerView.setVisibility(8);
                int i3 = 0;
                while (true) {
                    if (i3 >= 2) {
                        break;
                    } else if (this.flashModeButton[i3].getVisibility() == 0) {
                        this.flashModeButton[i3].setAlpha(0.0f);
                        break;
                    } else {
                        i3++;
                    }
                }
                this.cameraOpened = false;
                this.cameraView.setFpsLimit(30);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.cameraView.setSystemUiVisibility(1024);
                }
            }
            this.cameraView.setImportantForAccessibility(0);
            if (Build.VERSION.SDK_INT >= 19) {
                this.gridView.setImportantForAccessibility(0);
            }
        }
    }

    @Keep
    public void setCameraOpenProgress(float f) {
        int i;
        int i2;
        if (this.cameraView != null) {
            this.cameraOpenProgress = f;
            int[] iArr = this.animateCameraValues;
            float f2 = iArr[1];
            float f3 = iArr[2];
            Point point = AndroidUtilities.displaySize;
            int i3 = point.x;
            int i4 = point.y;
            float width = (this.parentAlert.getContainer().getWidth() - this.parentAlert.getLeftInset()) - this.parentAlert.getRightInset();
            float height = this.parentAlert.getContainer().getHeight();
            float[] fArr = this.cameraViewLocation;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = this.additionCloseCameraY;
            if (f == 0.0f) {
                this.cameraIcon.setTranslationX(fArr[0]);
                this.cameraIcon.setTranslationY(this.cameraViewLocation[1] + this.cameraViewOffsetY);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.cameraView.getLayoutParams();
            float textureHeight = this.cameraView.getTextureHeight(f2, f3) / this.cameraView.getTextureHeight(width, height);
            float f7 = f3 / height;
            float f8 = f2 / width;
            if (this.cameraExpanded) {
                i = (int) width;
                i2 = (int) height;
                float f9 = 1.0f - f;
                float f10 = (textureHeight * f9) + f;
                this.cameraView.getTextureView().setScaleX(f10);
                this.cameraView.getTextureView().setScaleY(f10);
                float f11 = f4 * f9;
                this.cameraView.setTranslationX((f11 + (f * 0.0f)) - (((1.0f - ((f8 * f9) + f)) * width) / 2.0f));
                float f12 = f5 * f9;
                this.cameraView.setTranslationY(((f6 * f) + f12) - (((1.0f - ((f7 * f9) + f)) * height) / 2.0f));
                this.animationClipTop = f12 - this.cameraView.getTranslationY();
                this.animationClipBottom = (((f5 + f3) * f9) - this.cameraView.getTranslationY()) + (height * f);
                this.animationClipLeft = f11 - this.cameraView.getTranslationX();
                this.animationClipRight = (((f4 + f2) * f9) - this.cameraView.getTranslationX()) + (width * f);
            } else {
                i = (int) f2;
                i2 = (int) f3;
                this.cameraView.getTextureView().setScaleX(1.0f);
                this.cameraView.getTextureView().setScaleY(1.0f);
                this.animationClipTop = 0.0f;
                this.animationClipBottom = height;
                this.animationClipLeft = 0.0f;
                this.animationClipRight = width;
                this.cameraView.setTranslationX(f4);
                this.cameraView.setTranslationY(f5);
            }
            if (f <= 0.5f) {
                this.cameraIcon.setAlpha(1.0f - (f / 0.5f));
            } else {
                this.cameraIcon.setAlpha(0.0f);
            }
            if (!(layoutParams.width == i && layoutParams.height == i2)) {
                layoutParams.width = i;
                layoutParams.height = i2;
                this.cameraView.requestLayout();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.cameraView.invalidateOutline();
            } else {
                this.cameraView.invalidate();
            }
        }
    }

    @Keep
    public float getCameraOpenProgress() {
        return this.cameraOpenProgress;
    }

    protected void checkCameraViewPosition() {
        TextView textView;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            CameraView cameraView = this.cameraView;
            if (cameraView != null) {
                cameraView.invalidateOutline();
            }
            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = this.gridView.findViewHolderForAdapterPosition(this.itemsPerRow - 1);
            if (findViewHolderForAdapterPosition2 != null) {
                findViewHolderForAdapterPosition2.itemView.invalidateOutline();
            }
            if ((!this.adapter.needCamera || !this.deviceHasGoodCamera || this.selectedAlbumEntry != this.galleryAlbumEntry) && (findViewHolderForAdapterPosition = this.gridView.findViewHolderForAdapterPosition(0)) != null) {
                findViewHolderForAdapterPosition.itemView.invalidateOutline();
            }
        }
        CameraView cameraView2 = this.cameraView;
        if (cameraView2 != null) {
            cameraView2.invalidate();
        }
        if (i >= 23 && (textView = this.recordTime) != null) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = getRootWindowInsets() == null ? AndroidUtilities.dp(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
        }
        if (this.deviceHasGoodCamera) {
            int childCount = this.gridView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = this.gridView.getChildAt(i2);
                if (childAt instanceof PhotoAttachCameraCell) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 < 19 || childAt.isAttachedToWindow()) {
                        float y = childAt.getY() + this.gridView.getY() + getY();
                        float y2 = this.parentAlert.getSheetContainer().getY() + y;
                        float x = childAt.getX() + this.gridView.getX() + getX() + this.parentAlert.getSheetContainer().getX();
                        if (i3 >= 23) {
                            x -= getRootWindowInsets().getSystemWindowInsetLeft();
                        }
                        float currentActionBarHeight = ((i3 < 21 || this.parentAlert.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight) + ActionBar.getCurrentActionBarHeight();
                        float f = y < currentActionBarHeight ? currentActionBarHeight - y : 0.0f;
                        if (f != this.cameraViewOffsetY) {
                            this.cameraViewOffsetY = f;
                            CameraView cameraView3 = this.cameraView;
                            if (cameraView3 != null) {
                                if (i3 >= 21) {
                                    cameraView3.invalidateOutline();
                                } else {
                                    cameraView3.invalidate();
                                }
                            }
                            FrameLayout frameLayout = this.cameraIcon;
                            if (frameLayout != null) {
                                frameLayout.invalidate();
                            }
                        }
                        float measuredHeight = (int) ((this.parentAlert.getSheetContainer().getMeasuredHeight() - this.parentAlert.buttonsRecyclerView.getMeasuredHeight()) + this.parentAlert.buttonsRecyclerView.getTranslationY());
                        if (childAt.getMeasuredHeight() + y > measuredHeight) {
                            this.cameraViewOffsetBottomY = (y + childAt.getMeasuredHeight()) - measuredHeight;
                        } else {
                            this.cameraViewOffsetBottomY = 0.0f;
                        }
                        float[] fArr = this.cameraViewLocation;
                        fArr[0] = x;
                        fArr[1] = y2;
                        applyCameraViewPosition();
                        return;
                    }
                } else {
                    i2++;
                }
            }
            if (!(this.cameraViewOffsetY == 0.0f && this.cameraViewOffsetX == 0.0f)) {
                this.cameraViewOffsetX = 0.0f;
                this.cameraViewOffsetY = 0.0f;
                CameraView cameraView4 = this.cameraView;
                if (cameraView4 != null) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        cameraView4.invalidateOutline();
                    } else {
                        cameraView4.invalidate();
                    }
                }
                FrameLayout frameLayout2 = this.cameraIcon;
                if (frameLayout2 != null) {
                    frameLayout2.invalidate();
                }
            }
            this.cameraViewLocation[0] = AndroidUtilities.dp(-400.0f);
            this.cameraViewLocation[1] = 0.0f;
            applyCameraViewPosition();
        }
    }

    private void applyCameraViewPosition() {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            if (!this.cameraOpened) {
                cameraView.setTranslationX(this.cameraViewLocation[0]);
                this.cameraView.setTranslationY(this.cameraViewLocation[1] + this.currentPanTranslationY);
            }
            this.cameraIcon.setTranslationX(this.cameraViewLocation[0]);
            this.cameraIcon.setTranslationY(this.cameraViewLocation[1] + this.cameraViewOffsetY + this.currentPanTranslationY);
            int i = this.itemSize;
            if (!this.cameraOpened) {
                this.cameraView.setClipTop((int) this.cameraViewOffsetY);
                this.cameraView.setClipBottom((int) this.cameraViewOffsetBottomY);
                final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.cameraView.getLayoutParams();
                if (!(layoutParams.height == i && layoutParams.width == i)) {
                    layoutParams.width = i;
                    layoutParams.height = i;
                    this.cameraView.setLayoutParams(layoutParams);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ChatAttachAlertPhotoLayout.this.lambda$applyCameraViewPosition$12(layoutParams);
                        }
                    });
                }
            }
            int i2 = this.itemSize;
            int i3 = (int) (i2 - this.cameraViewOffsetX);
            int i4 = (int) ((i2 - this.cameraViewOffsetY) - this.cameraViewOffsetBottomY);
            final FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.cameraIcon.getLayoutParams();
            if (layoutParams2.height != i4 || layoutParams2.width != i3) {
                layoutParams2.width = i3;
                layoutParams2.height = i4;
                this.cameraIcon.setLayoutParams(layoutParams2);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlertPhotoLayout.this.lambda$applyCameraViewPosition$13(layoutParams2);
                    }
                });
            }
        }
    }

    public void lambda$applyCameraViewPosition$12(FrameLayout.LayoutParams layoutParams) {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            cameraView.setLayoutParams(layoutParams);
        }
    }

    public void lambda$applyCameraViewPosition$13(FrameLayout.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.cameraIcon;
        if (frameLayout != null) {
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return selectedPhotos;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return selectedPhotosOrder;
    }

    public void updateSelected(HashMap<Object, Object> hashMap, ArrayList<Object> arrayList, boolean z) {
        selectedPhotos.clear();
        selectedPhotos.putAll(hashMap);
        selectedPhotosOrder.clear();
        selectedPhotosOrder.addAll(arrayList);
        if (z) {
            updatePhotosCounter(false);
            updateCheckedPhotoIndices();
            int childCount = this.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    int childAdapterPosition = this.gridView.getChildAdapterPosition(childAt);
                    if (this.adapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry) {
                        childAdapterPosition--;
                    }
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    if (this.parentAlert.avatarPicker != 0) {
                        photoAttachPhotoCell.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry photoEntryAtPosition = getPhotoEntryAtPosition(childAdapterPosition);
                    if (photoEntryAtPosition != null) {
                        boolean z2 = true;
                        boolean z3 = this.adapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry;
                        if (childAdapterPosition != this.adapter.getItemCount() - 1) {
                            z2 = false;
                        }
                        photoAttachPhotoCell.setPhotoEntry(photoEntryAtPosition, z3, z2);
                        ChatAttachAlert chatAttachAlert = this.parentAlert;
                        if (!(chatAttachAlert.baseFragment instanceof ChatActivity) || !chatAttachAlert.allowOrder) {
                            photoAttachPhotoCell.setChecked(-1, selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
                        } else {
                            photoAttachPhotoCell.setChecked(selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)), selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
                        }
                    }
                }
            }
        }
    }

    public void checkStorage() {
        if (this.noGalleryPermissions && Build.VERSION.SDK_INT >= 23) {
            boolean z = this.parentAlert.baseFragment.getParentActivity().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
            this.noGalleryPermissions = z;
            if (!z) {
                loadGalleryPhotos();
            }
            this.adapter.notifyDataSetChanged();
            this.cameraAttachAdapter.notifyDataSetChanged();
        }
    }

    @Override
    void scrollToTop() {
        this.gridView.smoothScrollToPosition(0);
    }

    @Override
    public void onMenuItemClick(int i) {
        TLRPC$Chat currentChat;
        if ((i == 0 || i == 1) && this.parentAlert.maxSelectedPhotos > 0 && selectedPhotosOrder.size() > 1) {
            BaseFragment baseFragment = this.parentAlert.baseFragment;
            if ((baseFragment instanceof ChatActivity) && (currentChat = ((ChatActivity) baseFragment).getCurrentChat()) != null && !ChatObject.hasAdminRights(currentChat) && currentChat.slowmode_enabled) {
                AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError), this.resourcesProvider).show();
                return;
            }
        }
        if (i == 0) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (chatAttachAlert.editingMessageObject == null) {
                BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
                if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.parentAlert.baseFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z, int i2) {
                            ChatAttachAlertPhotoLayout.this.lambda$onMenuItemClick$14(z, i2);
                        }
                    }, this.resourcesProvider);
                    return;
                }
            }
            this.parentAlert.applyCaption();
            this.parentAlert.delegate.didPressedButton(7, false, true, 0, false);
        } else if (i == 1) {
            ChatAttachAlert chatAttachAlert2 = this.parentAlert;
            if (chatAttachAlert2.editingMessageObject == null) {
                BaseFragment baseFragment3 = chatAttachAlert2.baseFragment;
                if ((baseFragment3 instanceof ChatActivity) && ((ChatActivity) baseFragment3).isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.parentAlert.baseFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z, int i2) {
                            ChatAttachAlertPhotoLayout.this.lambda$onMenuItemClick$15(z, i2);
                        }
                    }, this.resourcesProvider);
                    return;
                }
            }
            this.parentAlert.applyCaption();
            this.parentAlert.delegate.didPressedButton(4, true, true, 0, false);
        } else if (i == 2) {
            try {
                ChatAttachAlert chatAttachAlert3 = this.parentAlert;
                if (!(chatAttachAlert3.baseFragment instanceof ChatActivity) && chatAttachAlert3.avatarPicker != 2) {
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("image/*");
                    ChatAttachAlert chatAttachAlert4 = this.parentAlert;
                    if (chatAttachAlert4.avatarPicker != 0) {
                        chatAttachAlert4.baseFragment.startActivityForResult(intent, 14);
                    } else {
                        chatAttachAlert4.baseFragment.startActivityForResult(intent, 1);
                    }
                    this.parentAlert.dismiss(true);
                }
                Intent intent2 = new Intent();
                intent2.setType("video/*");
                intent2.setAction("android.intent.action.GET_CONTENT");
                intent2.putExtra("android.intent.extra.sizeLimit", FileLoader.DEFAULT_MAX_FILE_SIZE);
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                Intent createChooser = Intent.createChooser(intent3, null);
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
                ChatAttachAlert chatAttachAlert5 = this.parentAlert;
                if (chatAttachAlert5.avatarPicker != 0) {
                    chatAttachAlert5.baseFragment.startActivityForResult(createChooser, 14);
                } else {
                    chatAttachAlert5.baseFragment.startActivityForResult(createChooser, 1);
                }
                this.parentAlert.dismiss(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i == 3) {
            this.parentAlert.updatePhotoPreview(true);
        } else if (i >= 10) {
            MediaController.AlbumEntry albumEntry = this.dropDownAlbums.get(i - 10);
            this.selectedAlbumEntry = albumEntry;
            if (albumEntry == this.galleryAlbumEntry) {
                this.dropDown.setText(LocaleController.getString("ChatGallery", R.string.ChatGallery));
            } else {
                this.dropDown.setText(albumEntry.bucketName);
            }
            this.adapter.notifyDataSetChanged();
            this.cameraAttachAdapter.notifyDataSetChanged();
            this.layoutManager.scrollToPositionWithOffset(0, (-this.gridView.getPaddingTop()) + AndroidUtilities.dp(7.0f));
        }
    }

    public void lambda$onMenuItemClick$14(boolean z, int i) {
        this.parentAlert.applyCaption();
        this.parentAlert.delegate.didPressedButton(7, false, z, i, false);
    }

    public void lambda$onMenuItemClick$15(boolean z, int i) {
        this.parentAlert.applyCaption();
        this.parentAlert.delegate.didPressedButton(4, true, z, i, false);
    }

    @Override
    public int getSelectedItemsCount() {
        return selectedPhotosOrder.size();
    }

    @Override
    void onSelectedItemsCountChanged(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.onSelectedItemsCountChanged(int):void");
    }

    @Override
    public void applyCaption(CharSequence charSequence) {
        for (int i = 0; i < selectedPhotosOrder.size(); i++) {
            if (i == 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i));
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    photoEntry.caption = charSequence;
                    photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(new CharSequence[]{charSequence}, false);
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    searchImage.caption = charSequence;
                    searchImage.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(new CharSequence[]{charSequence}, false);
                }
            }
        }
    }

    public boolean captionForAllMedia() {
        int i = 0;
        for (int i2 = 0; i2 < selectedPhotosOrder.size(); i2++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i2));
            CharSequence charSequence = null;
            if (obj instanceof MediaController.PhotoEntry) {
                charSequence = ((MediaController.PhotoEntry) obj).caption;
            } else if (obj instanceof MediaController.SearchImage) {
                charSequence = ((MediaController.SearchImage) obj).caption;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                i++;
            }
        }
        return i <= 1;
    }

    @Override
    void onDestroy() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    @Override
    void onPause() {
        ShutterButton shutterButton = this.shutterButton;
        if (shutterButton != null) {
            if (!this.requestingPermissions) {
                if (this.cameraView != null && shutterButton.getState() == ShutterButton.State.RECORDING) {
                    resetRecordState();
                    CameraController.getInstance().stopVideoRecording(this.cameraView.getCameraSession(), false);
                    this.shutterButton.setState(ShutterButton.State.DEFAULT, true);
                }
                if (this.cameraOpened) {
                    closeCamera(false);
                }
                hideCamera(true);
                return;
            }
            if (this.cameraView != null && shutterButton.getState() == ShutterButton.State.RECORDING) {
                this.shutterButton.setState(ShutterButton.State.DEFAULT, true);
            }
            this.requestingPermissions = false;
        }
    }

    @Override
    public void onResume() {
        if (this.parentAlert.isShowing() && !this.parentAlert.isDismissed()) {
            checkCamera(false);
        }
    }

    @Override
    public int getListTopPadding() {
        return this.gridView.getPaddingTop();
    }

    @Override
    public int getCurrentItemTop() {
        if (this.gridView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.gridView;
            recyclerListView.setTopGlowOffset(recyclerListView.getPaddingTop());
            this.progressView.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = dp;
        }
        this.progressView.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - this.progressView.getMeasuredHeight()) / 2) + top);
        this.gridView.setTopGlowOffset(top);
        return top;
    }

    @Override
    int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(56.0f);
    }

    @Override
    void checkColors() {
        FrameLayout frameLayout = this.cameraIcon;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        String str = "voipgroup_actionBarItems";
        String str2 = this.forceDarkTheme ? str : "dialogTextBlack";
        Theme.setDrawableColor(this.cameraDrawable, getThemedColor("dialogCameraIcon"));
        this.progressView.setTextColor(getThemedColor("emptyListPlaceholder"));
        this.gridView.setGlowColor(getThemedColor("dialogScrollGlow"));
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.gridView.findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition != null) {
            View view = findViewHolderForAdapterPosition.itemView;
            if (view instanceof PhotoAttachCameraCell) {
                ((PhotoAttachCameraCell) view).getImageView().setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogCameraIcon"), PorterDuff.Mode.MULTIPLY));
            }
        }
        this.dropDown.setTextColor(getThemedColor(str2));
        this.dropDownContainer.setPopupItemsColor(getThemedColor(this.forceDarkTheme ? str : "actionBarDefaultSubmenuItem"), false);
        ActionBarMenuItem actionBarMenuItem = this.dropDownContainer;
        if (!this.forceDarkTheme) {
            str = "actionBarDefaultSubmenuItem";
        }
        actionBarMenuItem.setPopupItemsColor(getThemedColor(str), true);
        this.dropDownContainer.redrawPopup(getThemedColor(this.forceDarkTheme ? "voipgroup_actionBarUnscrolled" : "actionBarDefaultSubmenuBackground"));
        Theme.setDrawableColor(this.dropDownDrawable, getThemedColor(str2));
    }

    public void onInit(boolean z) {
        this.mediaEnabled = z;
        CameraView cameraView = this.cameraView;
        float f = 1.0f;
        if (cameraView != null) {
            cameraView.setAlpha(z ? 1.0f : 0.2f);
            this.cameraView.setEnabled(this.mediaEnabled);
        }
        FrameLayout frameLayout = this.cameraIcon;
        if (frameLayout != null) {
            if (!this.mediaEnabled) {
                f = 0.2f;
            }
            frameLayout.setAlpha(f);
            this.cameraIcon.setEnabled(this.mediaEnabled);
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        boolean z2 = true;
        if ((baseFragment instanceof ChatActivity) && chatAttachAlert.avatarPicker == 0) {
            this.galleryAlbumEntry = MediaController.allMediaAlbumEntry;
            if (this.mediaEnabled) {
                this.progressView.setText(LocaleController.getString("NoPhotos", R.string.NoPhotos));
                this.progressView.setLottie(0, 0, 0);
            } else {
                TLRPC$Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
                this.progressView.setLottie(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                if (ChatObject.isActionBannedByDefault(currentChat, 7)) {
                    this.progressView.setText(LocaleController.getString("GlobalAttachMediaRestricted", R.string.GlobalAttachMediaRestricted));
                } else if (AndroidUtilities.isBannedForever(currentChat.banned_rights)) {
                    this.progressView.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                } else {
                    this.progressView.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(currentChat.banned_rights.until_date)));
                }
            }
        } else if (chatAttachAlert.avatarPicker == 2) {
            this.galleryAlbumEntry = MediaController.allMediaAlbumEntry;
        } else {
            this.galleryAlbumEntry = MediaController.allPhotosAlbumEntry;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.parentAlert.baseFragment.getParentActivity().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                z2 = false;
            }
            this.noGalleryPermissions = z2;
        }
        if (this.galleryAlbumEntry != null) {
            for (int i = 0; i < Math.min(100, this.galleryAlbumEntry.photos.size()); i++) {
                this.galleryAlbumEntry.photos.get(i).reset();
            }
        }
        clearSelectedPhotos();
        updatePhotosCounter(false);
        this.cameraPhotoLayoutManager.scrollToPositionWithOffset(0, MediaController.VIDEO_BITRATE_480);
        this.layoutManager.scrollToPositionWithOffset(0, MediaController.VIDEO_BITRATE_480);
        this.dropDown.setText(LocaleController.getString("ChatGallery", R.string.ChatGallery));
        MediaController.AlbumEntry albumEntry = this.galleryAlbumEntry;
        this.selectedAlbumEntry = albumEntry;
        if (albumEntry != null) {
            this.loading = false;
            EmptyTextProgressView emptyTextProgressView = this.progressView;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
        }
        updateAlbumsDropDown();
    }

    @Override
    boolean canScheduleMessages() {
        boolean z;
        for (Map.Entry<Object, Object> entry : selectedPhotos.entrySet()) {
            Object value = entry.getValue();
            if (!(value instanceof MediaController.PhotoEntry)) {
                if ((value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0) {
                    z = true;
                    break;
                }
            } else if (((MediaController.PhotoEntry) value).ttl != 0) {
                z = true;
                break;
            }
        }
        z = false;
        return !z;
    }

    @Override
    void onButtonsTranslationYUpdated() {
        checkCameraViewPosition();
        invalidate();
    }

    @Override
    public void setTranslationY(float f) {
        if (this.parentAlert.getSheetAnimationType() == 1) {
            float f2 = (f / 40.0f) * (-0.1f);
            int childCount = this.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachCameraCell) {
                    PhotoAttachCameraCell photoAttachCameraCell = (PhotoAttachCameraCell) childAt;
                    float f3 = 1.0f + f2;
                    photoAttachCameraCell.getImageView().setScaleX(f3);
                    photoAttachCameraCell.getImageView().setScaleY(f3);
                } else if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    float f4 = 1.0f + f2;
                    photoAttachPhotoCell.getCheckBox().setScaleX(f4);
                    photoAttachPhotoCell.getCheckBox().setScaleY(f4);
                }
            }
        }
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public void requestLayout() {
        if (!this.ignoreLayout) {
            super.requestLayout();
        }
    }

    @Override
    void onShow(final ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        ViewPropertyAnimator viewPropertyAnimator = this.headerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.dropDownContainer.setVisibility(0);
        boolean z = attachAlertLayout instanceof ChatAttachAlertPhotoLayoutPreview;
        if (!z) {
            clearSelectedPhotos();
            this.dropDown.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = this.dropDown.animate().alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            this.headerAnimator = interpolator;
            interpolator.start();
        }
        this.parentAlert.actionBar.setTitle("");
        this.layoutManager.scrollToPositionWithOffset(0, 0);
        if (z) {
            this.gridView.post(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertPhotoLayout.this.lambda$onShow$16(attachAlertLayout);
                }
            });
        }
        checkCameraViewPosition();
        resumeCameraPreview();
    }

    public void lambda$onShow$16(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        int currentItemTop = attachAlertLayout.getCurrentItemTop();
        int listTopPadding = attachAlertLayout.getListTopPadding();
        RecyclerListView recyclerListView = this.gridView;
        if (currentItemTop > AndroidUtilities.dp(8.0f)) {
            listTopPadding -= currentItemTop;
        }
        recyclerListView.scrollBy(0, listTopPadding);
    }

    @Override
    void onShown() {
        this.isHidden = false;
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            cameraView.setVisibility(0);
        }
        FrameLayout frameLayout = this.cameraIcon;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (this.cameraView != null) {
            int childCount = this.gridView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachCameraCell) {
                    childAt.setVisibility(4);
                    break;
                }
                i++;
            }
        }
        if (this.checkCameraWhenShown) {
            this.checkCameraWhenShown = false;
            checkCamera(true);
        }
    }

    public void setCheckCameraWhenShown(boolean z) {
        this.checkCameraWhenShown = z;
    }

    @Override
    void onHideShowProgress(float f) {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            cameraView.setAlpha(f);
            this.cameraIcon.setAlpha(f);
            if (f != 0.0f && this.cameraView.getVisibility() != 0) {
                this.cameraView.setVisibility(0);
                this.cameraIcon.setVisibility(0);
            } else if (f == 0.0f && this.cameraView.getVisibility() != 4) {
                this.cameraView.setVisibility(4);
                this.cameraIcon.setVisibility(4);
            }
        }
    }

    @Override
    public void onHide() {
        this.isHidden = true;
        int childCount = this.gridView.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = this.gridView.getChildAt(i);
            if (childAt instanceof PhotoAttachCameraCell) {
                childAt.setVisibility(0);
                saveLastCameraBitmap();
                ((PhotoAttachCameraCell) childAt).updateBitmap();
                break;
            }
            i++;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.headerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.dropDown.animate().alpha(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.EASE_BOTH).withEndAction(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertPhotoLayout.this.lambda$onHide$17();
            }
        });
        this.headerAnimator = withEndAction;
        withEndAction.start();
        pauseCameraPreview();
    }

    public void lambda$onHide$17() {
        this.dropDownContainer.setVisibility(8);
    }

    public void pauseCameraPreview() {
        CameraSession cameraSession;
        try {
            CameraView cameraView = this.cameraView;
            if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                CameraController.getInstance().stopPreview(cameraSession);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void resumeCameraPreview() {
        CameraSession cameraSession;
        try {
            CameraView cameraView = this.cameraView;
            if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                CameraController.getInstance().startPreview(cameraSession);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void onHidden() {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            cameraView.setVisibility(8);
            this.cameraIcon.setVisibility(8);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.lastNotifyWidth != i5) {
            this.lastNotifyWidth = i5;
            PhotoAttachAdapter photoAttachAdapter = this.adapter;
            if (photoAttachAdapter != null) {
                photoAttachAdapter.notifyDataSetChanged();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        checkCameraViewPosition();
    }

    @Override
    public void onPreMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.onPreMeasure(int, int):void");
    }

    public void lambda$onPreMeasure$18() {
        this.adapter.notifyDataSetChanged();
    }

    @Override
    boolean canDismissWithTouchOutside() {
        return !this.cameraOpened;
    }

    @Override
    public void onContainerTranslationUpdated(float f) {
        this.currentPanTranslationY = f;
        checkCameraViewPosition();
        invalidate();
    }

    @Override
    void onOpenAnimationEnd() {
        checkCamera(true);
    }

    @Override
    void onDismissWithButtonClick(int i) {
        hideCamera((i == 0 || i == 2) ? false : true);
    }

    @Override
    public boolean onDismiss() {
        if (this.cameraAnimationInProgress) {
            return true;
        }
        if (this.cameraOpened) {
            closeCamera(true);
            return true;
        }
        hideCamera(true);
        return false;
    }

    @Override
    public boolean onSheetKeyDown(int i, KeyEvent keyEvent) {
        if (!this.cameraOpened) {
            return false;
        }
        if (i != 24 && i != 25 && i != 79 && i != 85) {
            return false;
        }
        this.shutterButton.getDelegate().shutterReleased();
        return true;
    }

    @Override
    public boolean onContainerViewTouchEvent(MotionEvent motionEvent) {
        if (this.cameraAnimationInProgress) {
            return true;
        }
        if (this.cameraOpened) {
            return processTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onCustomMeasure(View view, int i, int i2) {
        boolean z = i < i2;
        FrameLayout frameLayout = this.cameraIcon;
        if (view == frameLayout) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(this.itemSize, 1073741824), View.MeasureSpec.makeMeasureSpec((int) ((this.itemSize - this.cameraViewOffsetBottomY) - this.cameraViewOffsetY), 1073741824));
            return true;
        }
        CameraView cameraView = this.cameraView;
        if (view != cameraView) {
            FrameLayout frameLayout2 = this.cameraPanel;
            if (view == frameLayout2) {
                if (z) {
                    frameLayout2.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                } else {
                    frameLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                }
                return true;
            }
            ZoomControlView zoomControlView = this.zoomControlView;
            if (view == zoomControlView) {
                if (z) {
                    zoomControlView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                } else {
                    zoomControlView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                }
                return true;
            }
            RecyclerListView recyclerListView = this.cameraPhotoRecyclerView;
            if (view == recyclerListView) {
                this.cameraPhotoRecyclerViewIgnoreLayout = true;
                if (z) {
                    recyclerListView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (this.cameraPhotoLayoutManager.getOrientation() != 0) {
                        this.cameraPhotoRecyclerView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        this.cameraPhotoLayoutManager.setOrientation(0);
                        this.cameraAttachAdapter.notifyDataSetChanged();
                    }
                } else {
                    recyclerListView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                    if (this.cameraPhotoLayoutManager.getOrientation() != 1) {
                        this.cameraPhotoRecyclerView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        this.cameraPhotoLayoutManager.setOrientation(1);
                        this.cameraAttachAdapter.notifyDataSetChanged();
                    }
                }
                this.cameraPhotoRecyclerViewIgnoreLayout = false;
                return true;
            }
        } else if (this.cameraOpened && !this.cameraAnimationInProgress) {
            cameraView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2 + this.parentAlert.getBottomInset(), 1073741824));
            return true;
        }
        return false;
    }

    public boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        boolean z = i7 < i8;
        if (view == this.cameraPanel) {
            if (z) {
                if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                    this.cameraPanel.layout(0, i4 - AndroidUtilities.dp(222.0f), i7, i4 - AndroidUtilities.dp(96.0f));
                } else {
                    this.cameraPanel.layout(0, i4 - AndroidUtilities.dp(126.0f), i7, i4);
                }
            } else if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                this.cameraPanel.layout(i3 - AndroidUtilities.dp(222.0f), 0, i3 - AndroidUtilities.dp(96.0f), i8);
            } else {
                this.cameraPanel.layout(i3 - AndroidUtilities.dp(126.0f), 0, i3, i8);
            }
            return true;
        } else if (view == this.zoomControlView) {
            if (z) {
                if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                    this.zoomControlView.layout(0, i4 - AndroidUtilities.dp(310.0f), i7, i4 - AndroidUtilities.dp(260.0f));
                } else {
                    this.zoomControlView.layout(0, i4 - AndroidUtilities.dp(176.0f), i7, i4 - AndroidUtilities.dp(126.0f));
                }
            } else if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                this.zoomControlView.layout(i3 - AndroidUtilities.dp(310.0f), 0, i3 - AndroidUtilities.dp(260.0f), i8);
            } else {
                this.zoomControlView.layout(i3 - AndroidUtilities.dp(176.0f), 0, i3 - AndroidUtilities.dp(126.0f), i8);
            }
            return true;
        } else {
            TextView textView = this.counterTextView;
            if (view == textView) {
                if (z) {
                    i6 = (i7 - textView.getMeasuredWidth()) / 2;
                    i5 = i4 - AndroidUtilities.dp(167.0f);
                    this.counterTextView.setRotation(0.0f);
                    if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                        i5 -= AndroidUtilities.dp(96.0f);
                    }
                } else {
                    i6 = i3 - AndroidUtilities.dp(167.0f);
                    i5 = (i8 / 2) + (this.counterTextView.getMeasuredWidth() / 2);
                    this.counterTextView.setRotation(-90.0f);
                    if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                        i6 -= AndroidUtilities.dp(96.0f);
                    }
                }
                TextView textView2 = this.counterTextView;
                textView2.layout(i6, i5, textView2.getMeasuredWidth() + i6, this.counterTextView.getMeasuredHeight() + i5);
                return true;
            } else if (view != this.cameraPhotoRecyclerView) {
                return false;
            } else {
                if (z) {
                    int dp = i8 - AndroidUtilities.dp(88.0f);
                    view.layout(0, dp, view.getMeasuredWidth(), view.getMeasuredHeight() + dp);
                } else {
                    int dp2 = (i + i7) - AndroidUtilities.dp(88.0f);
                    view.layout(dp2, 0, view.getMeasuredWidth() + dp2, view.getMeasuredHeight());
                }
                return true;
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.albumsDidLoad) {
            if (this.adapter != null) {
                ChatAttachAlert chatAttachAlert = this.parentAlert;
                if ((chatAttachAlert.baseFragment instanceof ChatActivity) || chatAttachAlert.avatarPicker == 2) {
                    this.galleryAlbumEntry = MediaController.allMediaAlbumEntry;
                } else {
                    this.galleryAlbumEntry = MediaController.allPhotosAlbumEntry;
                }
                if (this.selectedAlbumEntry != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= MediaController.allMediaAlbums.size()) {
                            break;
                        }
                        MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i3);
                        int i4 = albumEntry.bucketId;
                        MediaController.AlbumEntry albumEntry2 = this.selectedAlbumEntry;
                        if (i4 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                            this.selectedAlbumEntry = albumEntry;
                            break;
                        }
                        i3++;
                    }
                } else {
                    this.selectedAlbumEntry = this.galleryAlbumEntry;
                }
                this.loading = false;
                this.progressView.showTextView();
                this.adapter.notifyDataSetChanged();
                this.cameraAttachAdapter.notifyDataSetChanged();
                if (!selectedPhotosOrder.isEmpty() && this.galleryAlbumEntry != null) {
                    int size = selectedPhotosOrder.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Integer num = (Integer) selectedPhotosOrder.get(i5);
                        Object obj = selectedPhotos.get(num);
                        MediaController.PhotoEntry photoEntry = this.galleryAlbumEntry.photosByIds.get(num.intValue());
                        if (photoEntry != null) {
                            if (obj instanceof MediaController.PhotoEntry) {
                                photoEntry.copyFrom((MediaController.PhotoEntry) obj);
                            }
                            selectedPhotos.put(num, photoEntry);
                        }
                    }
                }
                updateAlbumsDropDown();
            }
        } else if (i == NotificationCenter.cameraInitied) {
            checkCamera(false);
        }
    }

    public class PhotoAttachAdapter extends RecyclerListView.SelectionAdapter {
        private int itemsCount;
        private Context mContext;
        private boolean needCamera;
        private ArrayList<RecyclerListView.Holder> viewsCache = new ArrayList<>(8);

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public PhotoAttachAdapter(Context context, boolean z) {
            this.mContext = context;
            this.needCamera = z;
        }

        public void createCache() {
            for (int i = 0; i < 8; i++) {
                this.viewsCache.add(createHolder());
            }
        }

        public RecyclerListView.Holder createHolder() {
            PhotoAttachPhotoCell photoAttachPhotoCell = new PhotoAttachPhotoCell(this.mContext, ChatAttachAlertPhotoLayout.this.resourcesProvider);
            if (Build.VERSION.SDK_INT >= 21 && this == ChatAttachAlertPhotoLayout.this.adapter) {
                photoAttachPhotoCell.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        int intValue = ((Integer) ((PhotoAttachPhotoCell) view).getTag()).intValue();
                        if (PhotoAttachAdapter.this.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                            intValue++;
                        }
                        if (intValue == 0) {
                            int dp = AndroidUtilities.dp(ChatAttachAlertPhotoLayout.this.parentAlert.cornerRadius * 8.0f);
                            outline.setRoundRect(0, 0, view.getMeasuredWidth() + dp, view.getMeasuredHeight() + dp, dp);
                        } else if (intValue == ChatAttachAlertPhotoLayout.this.itemsPerRow - 1) {
                            int dp2 = AndroidUtilities.dp(ChatAttachAlertPhotoLayout.this.parentAlert.cornerRadius * 8.0f);
                            outline.setRoundRect(-dp2, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + dp2, dp2);
                        } else {
                            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        }
                    }
                });
                photoAttachPhotoCell.setClipToOutline(true);
            }
            photoAttachPhotoCell.setDelegate(new PhotoAttachPhotoCell.PhotoAttachPhotoCellDelegate() {
                @Override
                public final void onCheckClick(PhotoAttachPhotoCell photoAttachPhotoCell2) {
                    ChatAttachAlertPhotoLayout.PhotoAttachAdapter.this.lambda$createHolder$0(photoAttachPhotoCell2);
                }
            });
            return new RecyclerListView.Holder(photoAttachPhotoCell);
        }

        public void lambda$createHolder$0(PhotoAttachPhotoCell photoAttachPhotoCell) {
            TLRPC$Chat currentChat;
            if (ChatAttachAlertPhotoLayout.this.mediaEnabled && ChatAttachAlertPhotoLayout.this.parentAlert.avatarPicker == 0) {
                int intValue = ((Integer) photoAttachPhotoCell.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = photoAttachPhotoCell.getPhotoEntry();
                int i = 1;
                boolean z = !ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photoEntry.imageId));
                if (z && ChatAttachAlertPhotoLayout.this.parentAlert.maxSelectedPhotos >= 0) {
                    int size = ChatAttachAlertPhotoLayout.selectedPhotos.size();
                    ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                    if (size >= chatAttachAlert.maxSelectedPhotos) {
                        if (chatAttachAlert.allowOrder) {
                            BaseFragment baseFragment = chatAttachAlert.baseFragment;
                            if ((baseFragment instanceof ChatActivity) && (currentChat = ((ChatActivity) baseFragment).getCurrentChat()) != null && !ChatObject.hasAdminRights(currentChat) && currentChat.slowmode_enabled && ChatAttachAlertPhotoLayout.this.alertOnlyOnce != 2) {
                                AlertsCreator.createSimpleAlert(ChatAttachAlertPhotoLayout.this.getContext(), LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSelectSendError", R.string.SlowmodeSelectSendError), ChatAttachAlertPhotoLayout.this.resourcesProvider).show();
                                if (ChatAttachAlertPhotoLayout.this.alertOnlyOnce == 1) {
                                    ChatAttachAlertPhotoLayout.this.alertOnlyOnce = 2;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                int size2 = z ? ChatAttachAlertPhotoLayout.selectedPhotosOrder.size() : -1;
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlertPhotoLayout.this.parentAlert;
                if (!(chatAttachAlert2.baseFragment instanceof ChatActivity) || !chatAttachAlert2.allowOrder) {
                    photoAttachPhotoCell.setChecked(-1, z, true);
                } else {
                    photoAttachPhotoCell.setChecked(size2, z, true);
                }
                ChatAttachAlertPhotoLayout.this.addToSelectedPhotos(photoEntry, intValue);
                if (this == ChatAttachAlertPhotoLayout.this.cameraAttachAdapter) {
                    if (ChatAttachAlertPhotoLayout.this.adapter.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                        intValue++;
                    }
                    ChatAttachAlertPhotoLayout.this.adapter.notifyItemChanged(intValue);
                } else {
                    ChatAttachAlertPhotoLayout.this.cameraAttachAdapter.notifyItemChanged(intValue);
                }
                ChatAttachAlert chatAttachAlert3 = ChatAttachAlertPhotoLayout.this.parentAlert;
                if (!z) {
                    i = 2;
                }
                chatAttachAlert3.updateCountButton(i);
            }
        }

        public MediaController.PhotoEntry getPhoto(int i) {
            if (this.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                i--;
            }
            return ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            int i2 = 0;
            boolean z = true;
            if (itemViewType == 0) {
                if (this.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                    i--;
                }
                PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) viewHolder.itemView;
                if (this == ChatAttachAlertPhotoLayout.this.adapter) {
                    photoAttachPhotoCell.setItemSize(ChatAttachAlertPhotoLayout.this.itemSize);
                } else {
                    photoAttachPhotoCell.setIsVertical(ChatAttachAlertPhotoLayout.this.cameraPhotoLayoutManager.getOrientation() == 1);
                }
                if (ChatAttachAlertPhotoLayout.this.parentAlert.avatarPicker != 0) {
                    photoAttachPhotoCell.getCheckBox().setVisibility(8);
                }
                MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
                boolean z2 = this.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry;
                if (i != getItemCount() - 1) {
                    z = false;
                }
                photoAttachPhotoCell.setPhotoEntry(photoEntryAtPosition, z2, z);
                ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                if (!(chatAttachAlert.baseFragment instanceof ChatActivity) || !chatAttachAlert.allowOrder) {
                    photoAttachPhotoCell.setChecked(-1, ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
                } else {
                    photoAttachPhotoCell.setChecked(ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)), ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
                }
                photoAttachPhotoCell.getImageView().setTag(Integer.valueOf(i));
                photoAttachPhotoCell.setTag(Integer.valueOf(i));
            } else if (itemViewType == 1) {
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                chatAttachAlertPhotoLayout.cameraCell = (PhotoAttachCameraCell) viewHolder.itemView;
                CameraView cameraView = chatAttachAlertPhotoLayout.cameraView;
                if (cameraView == null || !cameraView.isInited() || ChatAttachAlertPhotoLayout.this.isHidden) {
                    ChatAttachAlertPhotoLayout.this.cameraCell.setVisibility(0);
                } else {
                    ChatAttachAlertPhotoLayout.this.cameraCell.setVisibility(4);
                }
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                chatAttachAlertPhotoLayout2.cameraCell.setItemSize(chatAttachAlertPhotoLayout2.itemSize);
            } else if (itemViewType == 3) {
                PhotoAttachPermissionCell photoAttachPermissionCell = (PhotoAttachPermissionCell) viewHolder.itemView;
                photoAttachPermissionCell.setItemSize(ChatAttachAlertPhotoLayout.this.itemSize);
                if (!this.needCamera || !ChatAttachAlertPhotoLayout.this.noCameraPermissions || i != 0) {
                    i2 = 1;
                }
                photoAttachPermissionCell.setType(i2);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0) {
                if (i == 1) {
                    ChatAttachAlertPhotoLayout.this.cameraCell = new PhotoAttachCameraCell(this.mContext, ChatAttachAlertPhotoLayout.this.resourcesProvider);
                    if (Build.VERSION.SDK_INT >= 21) {
                        ChatAttachAlertPhotoLayout.this.cameraCell.setOutlineProvider(new ViewOutlineProvider() {
                            @Override
                            public void getOutline(View view, Outline outline) {
                                int dp = AndroidUtilities.dp(ChatAttachAlertPhotoLayout.this.parentAlert.cornerRadius * 8.0f);
                                outline.setRoundRect(0, 0, view.getMeasuredWidth() + dp, view.getMeasuredHeight() + dp, dp);
                            }
                        });
                        ChatAttachAlertPhotoLayout.this.cameraCell.setClipToOutline(true);
                    }
                    return new RecyclerListView.Holder(ChatAttachAlertPhotoLayout.this.cameraCell);
                } else if (i != 2) {
                    return new RecyclerListView.Holder(new PhotoAttachPermissionCell(this.mContext, ChatAttachAlertPhotoLayout.this.resourcesProvider));
                } else {
                    return new RecyclerListView.Holder(new View(this.mContext) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(ChatAttachAlertPhotoLayout.this.gridExtraSpace, 1073741824));
                        }
                    });
                }
            } else if (this.viewsCache.isEmpty()) {
                return createHolder();
            } else {
                RecyclerListView.Holder holder = this.viewsCache.get(0);
                this.viewsCache.remove(0);
                return holder;
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof PhotoAttachCameraCell) {
                ((PhotoAttachCameraCell) view).updateBitmap();
            }
        }

        @Override
        public int getItemCount() {
            int i = 1;
            if (!ChatAttachAlertPhotoLayout.this.mediaEnabled) {
                return 1;
            }
            if (!this.needCamera || ChatAttachAlertPhotoLayout.this.selectedAlbumEntry != ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                i = 0;
            }
            if (ChatAttachAlertPhotoLayout.this.noGalleryPermissions && this == ChatAttachAlertPhotoLayout.this.adapter) {
                i++;
            }
            int size = i + ChatAttachAlertPhotoLayout.cameraPhotos.size();
            if (ChatAttachAlertPhotoLayout.this.selectedAlbumEntry != null) {
                size += ChatAttachAlertPhotoLayout.this.selectedAlbumEntry.photos.size();
            }
            if (this == ChatAttachAlertPhotoLayout.this.adapter) {
                size++;
            }
            this.itemsCount = size;
            return size;
        }

        @Override
        public int getItemViewType(int i) {
            if (!ChatAttachAlertPhotoLayout.this.mediaEnabled) {
                return 2;
            }
            if (this.needCamera && i == 0 && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                return ChatAttachAlertPhotoLayout.this.noCameraPermissions ? 3 : 1;
            }
            if (this == ChatAttachAlertPhotoLayout.this.adapter && i == this.itemsCount - 1) {
                return 2;
            }
            return ChatAttachAlertPhotoLayout.this.noGalleryPermissions ? 3 : 0;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            if (this == ChatAttachAlertPhotoLayout.this.adapter) {
                ChatAttachAlertPhotoLayout.this.progressView.setVisibility((!(getItemCount() == 1 && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == null) && ChatAttachAlertPhotoLayout.this.mediaEnabled) ? 4 : 0);
            }
        }
    }
}
