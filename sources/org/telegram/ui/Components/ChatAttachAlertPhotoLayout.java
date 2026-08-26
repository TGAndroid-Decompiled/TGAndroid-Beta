package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
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
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.PhotoAttachCameraCell;
import org.telegram.ui.Cells.PhotoAttachPermissionCell;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.AlbumButton;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.RichCaptionController$1$$ExternalSyntheticLambda0;

public class ChatAttachAlertPhotoLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int GAP = 2;
    public static final int PADDING = 2;
    private static final float RADIUS = 16.0f;
    private static final int SHOW_FAST_SCROLL_MIN_COUNT = 30;
    private static final int VIEW_TYPE_AVATAR_CONSTRUCTOR = 4;
    public static final int caption = 8;
    public static final int compress = 1;
    public static final int group = 0;
    private static boolean mediaFromExternalCamera = false;
    public static final int media_gap = 6;
    public static final int open_in = 4;
    public static final int preview = 7;
    public static final int preview_gap = 5;
    public static final int quality = 2;
    public static final int spoiler = 3;
    public static final int stars = 9;
    private PhotoAttachAdapter adapter;
    float additionCloseCameraY;
    private Runnable afterCameraInitRunnable;
    private int alertOnlyOnce;
    private int[] animateCameraValues;
    float animationClipBottom;
    float animationClipLeft;
    float animationClipRight;
    float animationClipTop;
    private boolean cameraAnimationInProgress;
    private PhotoAttachAdapter cameraAttachAdapter;
    boolean cameraExpanded;
    private AnimatorSet cameraInitAnimation;
    private float cameraOpenProgress;
    public boolean cameraOpened;
    private FrameLayout cameraPanel;
    private LinearLayoutManager cameraPhotoLayoutManager;
    private RecyclerListView cameraPhotoRecyclerView;
    private boolean cameraPhotoRecyclerViewIgnoreLayout;
    protected CameraViewInternal cameraView;
    private final CameraViewItemDecoration cameraViewItemDecoration;
    private float[] cameraViewLocation;
    private float cameraViewOffsetBottomY;
    private float cameraViewOffsetX;
    private float cameraViewOffsetY;
    private float cameraZoom;
    private boolean canSaveCameraPreview;
    private boolean cancelTakingPhotos;
    public MessagePreviewView.ToggleButton captionItem;
    private boolean checkCameraWhenShown;
    private ActionBarMenuSubItem compressItem;
    private TextView counterTextView;
    public int currentItemTop;
    private float currentPanTranslationY;
    private int currentSelectedCount;
    private boolean deviceHasGoodCamera;
    private boolean documentsEnabled;
    private boolean dragging;
    public TextView dropDown;
    private ArrayList<MediaController.AlbumEntry> dropDownAlbums;
    private ActionBarMenuItem dropDownContainer;
    private Drawable dropDownDrawable;
    private boolean flashAnimationInProgress;
    private ImageView[] flashModeButton;
    boolean forceDarkTheme;
    private MediaController.AlbumEntry galleryAlbumEntry;
    private int gridExtraSpace;
    public RecyclerListView gridView;
    private ViewPropertyAnimator headerAnimator;
    private Rect hitRect;
    private boolean ignoreLayout;
    private boolean includeVideosInGallery;
    private DecelerateInterpolator interpolator;
    private Boolean isCameraFrontfaceBeforeEnteringEditMode;
    private boolean isHidden;
    private RecyclerViewItemRangeSelector itemRangeSelector;
    private int itemSize;
    private int itemsPerRow;
    private int lastItemSize;
    private int lastNotifyWidth;
    private float lastY;
    private GridLayoutManager layoutManager;
    public int listAdditionalH;
    private boolean loading;
    private boolean maybeStartDraging;
    private boolean mediaEnabled;
    private final boolean needCamera;
    private boolean noCameraPermissions;
    private boolean noGalleryPermissions;
    private AnimationNotificationsLocker notificationsLocker;
    private boolean photoEnabled;
    public PhotoViewer.PhotoViewerProvider photoViewerProvider;
    private float pinchStartDistance;
    private boolean pressed;
    protected ActionBarMenuSubItem previewItem;
    private EmptyTextProgressView progressView;
    private ActionBarMenuSubItem qualityItem;
    private TextView recordTime;
    private boolean requestingPermissions;
    private MediaController.AlbumEntry selectedAlbumEntry;
    private boolean shouldSelect;
    private boolean showAvatarConstructor;
    private ShutterButton shutterButton;
    private ActionBarMenuSubItem spoilerItem;
    private ActionBarMenuSubItem starsItem;
    private ImageView switchCameraButton;
    private boolean takingPhoto;
    private TextView tooltipTextView;
    private boolean videoEnabled;
    private Runnable videoRecordRunnable;
    private int videoRecordTime;
    private int[] viewPosition;
    private AnimatorSet zoomControlAnimation;
    private Runnable zoomControlHideRunnable;
    private ZoomControlView zoomControlView;
    private boolean zoomWas;
    private boolean zooming;
    private static ArrayList<Object> cameraPhotos = new ArrayList<>();
    public static HashMap<Object, Object> selectedPhotos = new HashMap<>();
    public static ArrayList<Object> selectedPhotosOrder = new ArrayList<>();
    public static int lastImageId = -1;

    public class AnonymousClass1 extends BasePhotoProvider {
        public AnonymousClass1() {
            super(ChatAttachAlertPhotoLayout.this, null);
        }

        public void lambda$onClose$0() {
            ChatAttachAlertPhotoLayout.this.setCurrentSpoilerVisible(-1, true);
        }

        public void lambda$sendButtonPressed$1(boolean z, int i, boolean z2, Long l) throws FileNotFoundException {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            if (chatAttachAlert != null) {
                chatAttachAlert.setButtonPressed(true);
            }
            ChatAttachAlert chatAttachAlert2 = ChatAttachAlertPhotoLayout.this.parentAlert;
            chatAttachAlert2.delegate.didPressedButton(7, true, z, i, 0, 0L, chatAttachAlert2.isCaptionAbove(), z2, l.longValue());
            ChatAttachAlertPhotoLayout.selectedPhotos.clear();
            ChatAttachAlertPhotoLayout.cameraPhotos.clear();
            ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
            ChatAttachAlertPhotoLayout.selectedPhotos.clear();
            if (PhotoViewer.getInstance() != null) {
                PhotoViewer.getInstance().closePhoto(PhotoViewer.getInstance().closePhotoAfterSelectWithAnimation, false);
                PhotoViewer.getInstance().doneButtonPressed = true;
            }
        }

        @Override
        public boolean allowCaption() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return (chatAttachAlert.isPhotoPicker || chatAttachAlert.isPollAttach) ? false : true;
        }

        @Override
        public boolean canMoveCaptionAbove() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return chatAttachAlert != null && (chatAttachAlert.baseFragment instanceof ChatActivity);
        }

        @Override
        public boolean cancelButtonPressed() {
            return false;
        }

        @Override
        public long getDialogId() {
            BaseFragment baseFragment = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment;
            return baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getDialogId() : PhotoViewer.PhotoViewerProvider.CC.$default$getDialogId(this);
        }

        @Override
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            Utilities.Callback0Return<PhotoViewer.PlaceProviderObject> callback0Return;
            PhotoViewer.PlaceProviderObject placeProviderObjectRun;
            if (z2 && (callback0Return = ChatAttachAlertPhotoLayout.this.parentAlert.avatarWithBulletin) != null && (placeProviderObjectRun = callback0Return.run()) != null) {
                return placeProviderObjectRun;
            }
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
        public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i) {
            PhotoAttachPhotoCell cellForIndex = ChatAttachAlertPhotoLayout.this.getCellForIndex(i);
            if (cellForIndex != null) {
                return cellForIndex.getImageView().getImageReceiver().getBitmapSafe();
            }
            return null;
        }

        @Override
        public boolean isCaptionAbove() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return chatAttachAlert != null && chatAttachAlert.captionAbove;
        }

        @Override
        public boolean isEditingMessage() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return (chatAttachAlert == null || chatAttachAlert.editingMessageObject == null) ? false : true;
        }

        @Override
        public boolean isEditingMessageResend() {
            MessageObject messageObject;
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return (chatAttachAlert == null || (messageObject = chatAttachAlert.editingMessageObject) == null || !messageObject.needResendWhenEdit()) ? false : true;
        }

        @Override
        public void moveCaptionAbove(boolean z) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            if (chatAttachAlert == null || chatAttachAlert.captionAbove == z) {
                return;
            }
            chatAttachAlert.setCaptionAbove(z);
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            chatAttachAlertPhotoLayout.captionItem.setState(!chatAttachAlertPhotoLayout.parentAlert.captionAbove, true);
        }

        @Override
        public void onApplyCaption(CharSequence charSequence) {
            CharSequence charSequence2;
            ArrayList<TLRPC.MessageEntity> arrayList;
            if (ChatAttachAlertPhotoLayout.selectedPhotos.size() <= 0 || ChatAttachAlertPhotoLayout.selectedPhotosOrder.size() <= 0) {
                return;
            }
            Object obj = ChatAttachAlertPhotoLayout.selectedPhotos.get(ChatAttachAlertPhotoLayout.selectedPhotosOrder.get(0));
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                charSequence2 = photoEntry.caption;
                arrayList = photoEntry.entities;
            } else {
                charSequence2 = null;
                arrayList = null;
            }
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                charSequence2 = searchImage.caption;
                arrayList = searchImage.entities;
            }
            ArrayList<TLRPC.MessageEntity> arrayList2 = arrayList;
            if (charSequence2 != null && arrayList2 != null) {
                CharSequence spannableStringBuilder = !(charSequence2 instanceof Spannable) ? new SpannableStringBuilder(charSequence2) : charSequence2;
                MessageObject.addEntitiesToText(spannableStringBuilder, arrayList2, false, false, false, false);
                charSequence2 = spannableStringBuilder;
            }
            ChatAttachAlertPhotoLayout.this.parentAlert.getCommentView().setText(AnimatedEmojiSpan.cloneSpans(charSequence2, 3));
        }

        @Override
        public void onClose() {
            ChatAttachAlertPhotoLayout.this.resumeCameraPreview();
            AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 6), 150L);
            ChatAttachAlertPhotoLayout.this.onSelectedItemsCountChanged(getSelectedCount());
        }

        @Override
        public void onEditModeChanged(boolean z) {
            ChatAttachAlertPhotoLayout.this.onPhotoEditModeChanged(z);
        }

        @Override
        public void onOpen() {
            ChatAttachAlertPhotoLayout.this.pauseCameraPreview();
            ChatAttachAlertPhotoLayout.this.setCurrentSpoilerVisible(-1, true);
        }

        @Override
        public void onPreClose() {
            ChatAttachAlertPhotoLayout.this.setCurrentSpoilerVisible(-1, false);
        }

        @Override
        public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            chatAttachAlertPhotoLayout.parentAlert.sent = true;
            MediaController.PhotoEntry photoEntryAtPosition = chatAttachAlertPhotoLayout.getPhotoEntryAtPosition(i);
            if (photoEntryAtPosition != null) {
                photoEntryAtPosition.editedInfo = videoEditedInfo;
            }
            if (ChatAttachAlertPhotoLayout.selectedPhotos.isEmpty() && photoEntryAtPosition != null) {
                ChatAttachAlertPhotoLayout.this.addToSelectedPhotos(photoEntryAtPosition, -1);
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            if (chatAttachAlert.checkCaption(chatAttachAlert.getCommentView().getText())) {
                return;
            }
            ChatAttachAlertPhotoLayout.this.parentAlert.applyCaption();
            if (PhotoViewer.getInstance().hasCaptionForAllMedia) {
                HashMap<Object, Object> selectedPhotos = getSelectedPhotos();
                ArrayList<Object> selectedPhotosOrder = getSelectedPhotosOrder();
                if (!selectedPhotos.isEmpty()) {
                    for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i4 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.getInstance().captionForAllMedia};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (ChatAttachAlertPhotoLayout.this.parentAlert.checkCaption(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            ChatAttachAlert chatAttachAlert2 = ChatAttachAlertPhotoLayout.this.parentAlert;
            if (chatAttachAlert2 != null) {
                chatAttachAlert2.setButtonPressed(false);
            }
            if (PhotoViewer.getInstance() != null) {
                PhotoViewer.getInstance().closePhotoAfterSelect = false;
                PhotoViewer.getInstance().doneButtonPressed = false;
            }
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlertPhotoLayout.this.parentAlert;
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert3.currentAccount, chatAttachAlert3.getDialogId(), ChatAttachAlertPhotoLayout.this.parentAlert.getAdditionalMessagesCount() + getSelectedPhotos().size(), new ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0(this, z, i2, z2));
        }

        @Override
        public void updatePhotoAtIndex(int i) {
            PhotoAttachPhotoCell cellForIndex = ChatAttachAlertPhotoLayout.this.getCellForIndex(i);
            if (cellForIndex != null) {
                cellForIndex.getImageView().setOrientation(0, true);
                MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
                if (photoEntryAtPosition == null) {
                    return;
                }
                if (photoEntryAtPosition.coverPath != null) {
                    cellForIndex.getImageView().setImage(photoEntryAtPosition.coverPath, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                if (photoEntryAtPosition.thumbPath != null) {
                    cellForIndex.getImageView().setImage(photoEntryAtPosition.thumbPath, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                if (photoEntryAtPosition.path == null) {
                    cellForIndex.getImageView().setImageDrawable(Theme.chat_attachEmptyDrawable);
                    return;
                }
                cellForIndex.getImageView().setOrientation(photoEntryAtPosition.orientation, photoEntryAtPosition.invert, true);
                if (photoEntryAtPosition.isVideo) {
                    cellForIndex.getImageView().setImage("vthumb://" + photoEntryAtPosition.imageId + ":" + photoEntryAtPosition.path, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                cellForIndex.getImageView().setImage("thumb://" + photoEntryAtPosition.imageId + ":" + photoEntryAtPosition.path, null, Theme.chat_attachEmptyDrawable);
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
        public void willSwitchFromPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i) {
            PhotoAttachPhotoCell cellForIndex = ChatAttachAlertPhotoLayout.this.getCellForIndex(i);
            if (cellForIndex != null) {
                cellForIndex.showCheck(true);
            }
        }
    }

    public class AnonymousClass10 implements ShutterButton.ShutterButtonDelegate {
        private File outputFile;
        final FrameLayout val$container;
        final Theme.ResourcesProvider val$resourcesProvider;
        private boolean zoomingWas;

        public AnonymousClass10(Theme.ResourcesProvider resourcesProvider, FrameLayout frameLayout) {
            this.val$resourcesProvider = resourcesProvider;
            this.val$container = frameLayout;
        }

        public void lambda$shutterLongPressed$0() {
            if (ChatAttachAlertPhotoLayout.this.videoRecordRunnable == null) {
                return;
            }
            ChatAttachAlertPhotoLayout.access$3408(ChatAttachAlertPhotoLayout.this);
            ChatAttachAlertPhotoLayout.this.recordTime.setText(AndroidUtilities.formatLongDuration(ChatAttachAlertPhotoLayout.this.videoRecordTime));
            AndroidUtilities.runOnUIThread(ChatAttachAlertPhotoLayout.this.videoRecordRunnable, 1000L);
        }

        public void lambda$shutterLongPressed$1(String str, long j) {
            int i;
            int i2;
            if (this.outputFile != null) {
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                if (chatAttachAlertPhotoLayout.parentAlert.destroyed || chatAttachAlertPhotoLayout.cameraView == null) {
                    return;
                }
                boolean unused = ChatAttachAlertPhotoLayout.mediaFromExternalCamera = false;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                    i = options.outWidth;
                    try {
                        i2 = options.outHeight;
                    } catch (Exception unused2) {
                        i2 = 0;
                    }
                } catch (Exception unused3) {
                    i = 0;
                }
                int i3 = i;
                int i4 = ChatAttachAlertPhotoLayout.lastImageId;
                ChatAttachAlertPhotoLayout.lastImageId = i4 - 1;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i4, 0L, this.outputFile.getAbsolutePath(), 0, true, i3, i2, 0L);
                photoEntry.duration = (int) (j / 1000.0f);
                photoEntry.thumbPath = str;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                if (chatAttachAlertPhotoLayout2.parentAlert.avatarPicker != 0 && chatAttachAlertPhotoLayout2.cameraView.isFrontface()) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                ChatAttachAlertPhotoLayout.this.openPhotoViewer(photoEntry, false, false);
            }
        }

        public void lambda$shutterLongPressed$2() {
            AndroidUtilities.runOnUIThread(ChatAttachAlertPhotoLayout.this.videoRecordRunnable, 1000L);
        }

        public void lambda$shutterReleased$3(File file, boolean z, Integer num) {
            int i;
            int i2;
            ChatAttachAlertPhotoLayout.this.takingPhoto = false;
            if (file == null || ChatAttachAlertPhotoLayout.this.parentAlert.destroyed) {
                return;
            }
            boolean unused = ChatAttachAlertPhotoLayout.mediaFromExternalCamera = false;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                i = options.outWidth;
                try {
                    i2 = options.outHeight;
                } catch (Exception unused2) {
                    i2 = 0;
                }
            } catch (Exception unused3) {
                i = 0;
            }
            int i3 = i;
            int i4 = ChatAttachAlertPhotoLayout.lastImageId;
            ChatAttachAlertPhotoLayout.lastImageId = i4 - 1;
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i4, 0L, file.getAbsolutePath(), num.intValue() == -1 ? 0 : num.intValue(), false, i3, i2, 0L);
            photoEntry.canDeleteAfter = true;
            ChatAttachAlertPhotoLayout.this.openPhotoViewer(photoEntry, z, false);
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
            return (this.zoomingWas || (f == 0.0f && f2 == 0.0f)) ? false : true;
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
        public boolean shutterLongPressed() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            if ((chatAttachAlert.avatarPicker == 2 || (chatAttachAlert.baseFragment instanceof ChatActivity)) && !chatAttachAlertPhotoLayout.takingPhoto) {
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                ChatAttachAlert chatAttachAlert2 = chatAttachAlertPhotoLayout2.parentAlert;
                if (!chatAttachAlert2.destroyed && chatAttachAlertPhotoLayout2.cameraView != null && !chatAttachAlert2.isStickerMode) {
                    BaseFragment lastFragment = chatAttachAlert2.baseFragment;
                    if (lastFragment == null) {
                        lastFragment = LaunchActivity.getLastFragment();
                    }
                    if (lastFragment != null && lastFragment.getParentActivity() != null) {
                        if (!ChatAttachAlertPhotoLayout.this.videoEnabled) {
                            UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(ChatAttachAlertPhotoLayout.this.cameraView, this.val$resourcesProvider), R.string.GlobalAttachVideoRestricted);
                            return false;
                        }
                        if (Build.VERSION.SDK_INT >= 23 && ChatAttachAlertPhotoLayout.this.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                            ChatAttachAlertPhotoLayout.this.requestingPermissions = true;
                            lastFragment.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            return false;
                        }
                        for (int i = 0; i < 2; i++) {
                            ChatAttachAlertPhotoLayout.this.flashModeButton[i].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        }
                        ViewPropertyAnimator duration = ChatAttachAlertPhotoLayout.this.switchCameraButton.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                        duration.setInterpolator(cubicBezierInterpolator).start();
                        ChatAttachAlertPhotoLayout.this.tooltipTextView.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                        BaseFragment baseFragment = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment;
                        this.outputFile = AndroidUtilities.generateVideoPath((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isSecretChat());
                        AndroidUtilities.updateViewVisibilityAnimated(ChatAttachAlertPhotoLayout.this.recordTime, true);
                        ChatAttachAlertPhotoLayout.this.recordTime.setText(AndroidUtilities.formatLongDuration(0));
                        ChatAttachAlertPhotoLayout.this.videoRecordTime = 0;
                        final int i2 = 0;
                        ChatAttachAlertPhotoLayout.this.videoRecordRunnable = new Runnable(this) {
                            public final ChatAttachAlertPhotoLayout.AnonymousClass10 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        this.f$0.lambda$shutterLongPressed$0();
                                        break;
                                    default:
                                        this.f$0.lambda$shutterLongPressed$2();
                                        break;
                                }
                            }
                        };
                        AndroidUtilities.lockOrientation(lastFragment.getParentActivity());
                        CameraController cameraController = CameraController.getInstance();
                        Object cameraSessionObject = ChatAttachAlertPhotoLayout.this.cameraView.getCameraSessionObject();
                        File file = this.outputFile;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ChatAttachAlertPhotoLayout.this;
                        final int i3 = 1;
                        cameraController.recordVideo(cameraSessionObject, file, chatAttachAlertPhotoLayout3.parentAlert.avatarPicker != 0, new EmojiView$$ExternalSyntheticLambda21(this, 3), new Runnable(this) {
                            public final ChatAttachAlertPhotoLayout.AnonymousClass10 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        this.f$0.lambda$shutterLongPressed$0();
                                        break;
                                    default:
                                        this.f$0.lambda$shutterLongPressed$2();
                                        break;
                                }
                            }
                        }, chatAttachAlertPhotoLayout3.cameraView);
                        ChatAttachAlertPhotoLayout.this.shutterButton.setState(ShutterButton.State.RECORDING, true);
                        ChatAttachAlertPhotoLayout.this.cameraView.runHaptic();
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public void shutterReleased() {
            CameraViewInternal cameraViewInternal;
            if (ChatAttachAlertPhotoLayout.this.takingPhoto || (cameraViewInternal = ChatAttachAlertPhotoLayout.this.cameraView) == null || cameraViewInternal.getCameraSession() == null) {
                return;
            }
            if (ChatAttachAlertPhotoLayout.this.shutterButton.getState() == ShutterButton.State.RECORDING) {
                ChatAttachAlertPhotoLayout.this.resetRecordState();
                CameraController.getInstance().stopVideoRecording(ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession(), false);
                ChatAttachAlertPhotoLayout.this.shutterButton.setState(ShutterButton.State.DEFAULT, true);
            } else {
                if (!ChatAttachAlertPhotoLayout.this.photoEnabled) {
                    UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(ChatAttachAlertPhotoLayout.this.cameraView, this.val$resourcesProvider), R.string.GlobalAttachPhotoRestricted);
                    return;
                }
                BaseFragment baseFragment = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment;
                File fileGeneratePicturePath = AndroidUtilities.generatePicturePath((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isSecretChat(), null);
                boolean zIsSameTakePictureOrientation = ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession();
                ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                cameraSession.setFlipFront((chatAttachAlert.baseFragment instanceof ChatActivity) || chatAttachAlert.avatarPicker == 2);
                ChatAttachAlertPhotoLayout.this.takingPhoto = CameraController.getInstance().takePicture(fileGeneratePicturePath, false, ChatAttachAlertPhotoLayout.this.cameraView.getCameraSessionObject(), new ChatAttachAlertPhotoLayout$10$$ExternalSyntheticLambda2(this, fileGeneratePicturePath, zIsSameTakePictureOrientation));
                ChatAttachAlertPhotoLayout.this.cameraView.startTakePictureAnimation(true);
            }
        }
    }

    public class AnonymousClass15 extends BasePhotoProvider {
        final boolean val$sameTakePictureOrientation;

        public AnonymousClass15(boolean z) {
            super(ChatAttachAlertPhotoLayout.this, null);
            this.val$sameTakePictureOrientation = z;
        }

        public void lambda$cancelButtonPressed$0() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.cameraView == null || chatAttachAlertPhotoLayout.parentAlert.isDismissed()) {
                return;
            }
            ChatAttachAlertPhotoLayout.this.cameraView.setSystemUiVisibility(1028);
        }

        public void lambda$sendButtonPressed$1(boolean z, boolean z2, int i, Long l) throws FileNotFoundException {
            if (PhotoViewer.getInstance() != null) {
                PhotoViewer.getInstance().closePhotoAfterSelect = false;
                PhotoViewer.getInstance().doneButtonPressed = false;
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            chatAttachAlert.sent = true;
            chatAttachAlert.setButtonPressed(true);
            ChatAttachAlertPhotoLayout.this.closeCamera(false);
            ChatAttachAlert chatAttachAlert2 = ChatAttachAlertPhotoLayout.this.parentAlert;
            chatAttachAlert2.delegate.didPressedButton(z ? 4 : 8, true, z2, i, 0, 0L, chatAttachAlert2.isCaptionAbove(), z, l.longValue());
            ChatAttachAlertPhotoLayout.cameraPhotos.clear();
            ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
            ChatAttachAlertPhotoLayout.selectedPhotos.clear();
            ChatAttachAlertPhotoLayout.this.adapter.notifyDataSetChanged();
            ChatAttachAlertPhotoLayout.this.cameraAttachAdapter.notifyDataSetChanged();
            ChatAttachAlertPhotoLayout.this.parentAlert.dismiss(true);
            if (PhotoViewer.getInstance() != null) {
                PhotoViewer.getInstance().closePhoto(PhotoViewer.getInstance().closePhotoAfterSelectWithAnimation, false);
                PhotoViewer.getInstance().doneButtonPressed = true;
            }
        }

        @Override
        public boolean allowCaption() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return (chatAttachAlert.isPhotoPicker || chatAttachAlert.isPollAttach) ? false : true;
        }

        @Override
        public boolean canCaptureMorePhotos() {
            return ChatAttachAlertPhotoLayout.this.parentAlert.maxSelectedPhotos != 1;
        }

        @Override
        public boolean canScrollAway() {
            return false;
        }

        @Override
        public boolean cancelButtonPressed() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.cameraOpened && chatAttachAlertPhotoLayout.cameraView != null) {
                AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 7), 1000L);
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

        @Override
        public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i) {
            return null;
        }

        @Override
        public void needAddMorePhotos() {
            ChatAttachAlertPhotoLayout.this.cancelTakingPhotos = false;
            if (ChatAttachAlertPhotoLayout.mediaFromExternalCamera) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                chatAttachAlert.delegate.didPressedButton(0, true, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
                return;
            }
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (!chatAttachAlertPhotoLayout.cameraOpened) {
                chatAttachAlertPhotoLayout.openCamera(false);
            }
            ChatAttachAlertPhotoLayout.this.counterTextView.setVisibility(0);
            ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView.setVisibility(0);
            ChatAttachAlertPhotoLayout.this.counterTextView.setAlpha(1.0f);
            ChatAttachAlertPhotoLayout.this.updatePhotosCounter(false);
        }

        @Override
        public void onClose() {
            ChatAttachAlertPhotoLayout.this.resumeCameraPreview();
            ChatAttachAlertPhotoLayout.this.onSelectedItemsCountChanged(getSelectedCount());
        }

        @Override
        public void onEditModeChanged(boolean z) {
            ChatAttachAlertPhotoLayout.this.onPhotoEditModeChanged(z);
        }

        @Override
        public void onOpen() {
            ChatAttachAlertPhotoLayout.this.pauseCameraPreview();
        }

        @Override
        public boolean scaleToFill() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.parentAlert.destroyed) {
                return false;
            }
            return this.val$sameTakePictureOrientation || Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0) == 1;
        }

        @Override
        public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
            if (ChatAttachAlertPhotoLayout.cameraPhotos.isEmpty() || ChatAttachAlertPhotoLayout.this.parentAlert.destroyed) {
                return;
            }
            if (videoEditedInfo != null && i >= 0 && i < ChatAttachAlertPhotoLayout.cameraPhotos.size()) {
                ((MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.cameraPhotos.get(i)).editedInfo = videoEditedInfo;
            }
            BaseFragment baseFragment = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment;
            if (!(baseFragment instanceof ChatActivity) || !((ChatActivity) baseFragment).isSecretChat()) {
                int size = ChatAttachAlertPhotoLayout.cameraPhotos.size();
                for (int i4 = 0; i4 < size; i4++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.cameraPhotos.get(i4);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            ChatAttachAlertPhotoLayout.this.parentAlert.applyCaption();
            if (PhotoViewer.getInstance() != null) {
                PhotoViewer.getInstance().closePhotoAfterSelect = false;
                PhotoViewer.getInstance().doneButtonPressed = false;
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), ChatAttachAlertPhotoLayout.this.parentAlert.getAdditionalMessagesCount() + getSelectedCount(), new ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0(this, z2, z, i2));
        }

        @Override
        public void willHidePhotoViewer() {
            int childCount = ChatAttachAlertPhotoLayout.this.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ChatAttachAlertPhotoLayout.this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    photoAttachPhotoCell.imageView.getImageReceiver().setVisible(true, true);
                    photoAttachPhotoCell.showCheck(true);
                }
            }
        }
    }

    public class BasePhotoProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        private BasePhotoProvider() {
        }

        @Override
        public boolean allowLivePhotos() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return chatAttachAlert != null && chatAttachAlert.allowLivePhotos;
        }

        @Override
        public int getPhotoIndex(int i) {
            MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
            if (photoEntryAtPosition == null) {
                return -1;
            }
            return ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId));
        }

        @Override
        public int getSelectedCount() {
            return ChatAttachAlertPhotoLayout.selectedPhotos.size();
        }

        @Override
        public HashMap<Object, Object> getSelectedPhotos() {
            return ChatAttachAlertPhotoLayout.selectedPhotos;
        }

        @Override
        public ArrayList<Object> getSelectedPhotosOrder() {
            return ChatAttachAlertPhotoLayout.selectedPhotosOrder;
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
            if ((ChatAttachAlertPhotoLayout.this.parentAlert.maxSelectedPhotos >= 0 && ChatAttachAlertPhotoLayout.selectedPhotos.size() >= ChatAttachAlertPhotoLayout.this.parentAlert.maxSelectedPhotos && !isPhotoChecked(i)) || (photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i)) == null || ChatAttachAlertPhotoLayout.this.checkSendMediaEnabled(photoEntryAtPosition)) {
                return -1;
            }
            if (ChatAttachAlertPhotoLayout.selectedPhotos.size() + 1 > ChatAttachAlertPhotoLayout.this.maxCount()) {
                return -1;
            }
            int iAddToSelectedPhotos = ChatAttachAlertPhotoLayout.this.addToSelectedPhotos(photoEntryAtPosition, -1);
            if (iAddToSelectedPhotos == -1) {
                iAddToSelectedPhotos = ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId));
                z = true;
            } else {
                photoEntryAtPosition.editedInfo = null;
                z = false;
            }
            photoEntryAtPosition.editedInfo = videoEditedInfo;
            int childCount = ChatAttachAlertPhotoLayout.this.gridView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ChatAttachAlertPhotoLayout.this.gridView.getChildAt(i2);
                if ((childAt instanceof PhotoAttachPhotoCell) && ((Integer) childAt.getTag()).intValue() == i) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                    if (!(chatAttachAlert.baseFragment instanceof ChatActivity) || !chatAttachAlert.allowOrder) {
                        ((PhotoAttachPhotoCell) childAt).setChecked(-1, z, false);
                        break;
                    }
                    ((PhotoAttachPhotoCell) childAt).setChecked(iAddToSelectedPhotos, z, false);
                    break;
                }
            }
            int childCount2 = ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView.getChildAt(i3);
                if ((childAt2 instanceof PhotoAttachPhotoCell) && ((Integer) childAt2.getTag()).intValue() == i) {
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlertPhotoLayout.this.parentAlert;
                    if (!(chatAttachAlert2.baseFragment instanceof ChatActivity) || !chatAttachAlert2.allowOrder) {
                        ((PhotoAttachPhotoCell) childAt2).setChecked(-1, z, false);
                        break;
                    }
                    ((PhotoAttachPhotoCell) childAt2).setChecked(iAddToSelectedPhotos, z, false);
                    break;
                }
            }
            ChatAttachAlertPhotoLayout.this.parentAlert.updateCountButton(z ? 1 : 2);
            return iAddToSelectedPhotos;
        }

        @Override
        public void updatedLivePhotos() {
            ChatAttachAlertPhotoLayout.this.updateCells();
        }

        public BasePhotoProvider(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public class CameraViewInternal extends CameraView {
        Bulletin.Delegate bulletinDelegate;
        public boolean drawInDecoration;

        public CameraViewInternal(Context context, boolean z, boolean z2) {
            super(context, z, z2);
            this.bulletinDelegate = new Bulletin.Delegate() {
                @Override
                public final boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public final boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public final boolean clipWithGradient(int i) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
                }

                @Override
                public int getBottomOffset(int i) {
                    return ChatAttachAlertPhotoLayout.this.parentAlert.getBottomInset() + AndroidUtilities.dp(126.0f);
                }

                @Override
                public final int getLeftPadding() {
                    return Bulletin.Delegate.CC.$default$getLeftPadding(this);
                }

                @Override
                public final int getRightPadding() {
                    return Bulletin.Delegate.CC.$default$getRightPadding(this);
                }

                @Override
                public final int getTopOffset(int i) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
                }

                @Override
                public final void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public final void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public final void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }
            };
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            if (this.drawInDecoration || (!ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress && ChatAttachAlertPhotoLayout.this.cameraOpened)) {
                super.dispatchDraw(canvas);
                return;
            }
            float translationY = (ChatAttachAlertPhotoLayout.this.parentAlert.getContainerView().getTranslationY() + (ChatAttachAlertPhotoLayout.this.currentPanTranslationY + ChatAttachAlertPhotoLayout.this.parentAlert.getCommentTextViewTop())) - ChatAttachAlertPhotoLayout.this.cameraView.getTranslationY();
            MentionsContainerView mentionsContainerView = ChatAttachAlertPhotoLayout.this.parentAlert.mentionContainer;
            int iMin = (int) Math.min(translationY - (mentionsContainerView != null ? mentionsContainerView.clipBottom() + AndroidUtilities.dp(8.0f) : 0.0f), getMeasuredHeight());
            if (ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress) {
                RectF rectF = AndroidUtilities.rectTmp;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                float f = ((1.0f - ChatAttachAlertPhotoLayout.this.cameraOpenProgress) * chatAttachAlertPhotoLayout.cameraViewOffsetX) + chatAttachAlertPhotoLayout.animationClipLeft;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                float f2 = ((1.0f - ChatAttachAlertPhotoLayout.this.cameraOpenProgress) * chatAttachAlertPhotoLayout2.cameraViewOffsetY) + chatAttachAlertPhotoLayout2.animationClipTop;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ChatAttachAlertPhotoLayout.this;
                rectF.set(f, f2, chatAttachAlertPhotoLayout3.animationClipRight, AndroidUtilities.lerp(Math.min(iMin, chatAttachAlertPhotoLayout3.animationClipBottom), getMeasuredHeight(), ChatAttachAlertPhotoLayout.this.cameraOpenProgress));
            } else {
                if (!ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout4 = ChatAttachAlertPhotoLayout.this;
                    if (!chatAttachAlertPhotoLayout4.cameraOpened) {
                        AndroidUtilities.rectTmp.set(chatAttachAlertPhotoLayout4.cameraViewOffsetX, ChatAttachAlertPhotoLayout.this.cameraViewOffsetY, getMeasuredWidth(), Math.min(iMin, getMeasuredHeight()));
                        return;
                    }
                }
                AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(iMin, getMeasuredHeight()));
            }
            canvas.save();
            canvas.clipRect(AndroidUtilities.rectTmp);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            Bulletin.addDelegate(ChatAttachAlertPhotoLayout.this.cameraView, this.bulletinDelegate);
            ChatAttachAlertPhotoLayout.this.gridView.invalidate();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(ChatAttachAlertPhotoLayout.this.cameraView);
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
            ChatAttachAlertPhotoLayout.this.gridView.invalidate();
        }

        @Override
        public void showTexture(boolean z, boolean z2) {
            super.showTexture(z, z2);
            ChatAttachAlertPhotoLayout.this.gridView.invalidate();
        }
    }

    public class CameraViewItemDecoration extends RecyclerView.ItemDecoration implements IBlur3Capture {
        private final Drawable cameraDrawable;
        private final Path clipPath = new Path();
        private final RecyclerView parent;
        private Drawable placeholderDrawable;

        public CameraViewItemDecoration(RecyclerView recyclerView) {
            this.parent = recyclerView;
            this.cameraDrawable = ChatAttachAlertPhotoLayout.this.getContext().getResources().getDrawable(R.drawable.camera).mutate();
        }

        private void draw(Canvas canvas, RecyclerView recyclerView, IBlur3Hash iBlur3Hash, RectF rectF) {
            int top;
            CameraViewInternal cameraViewInternal;
            CameraViewInternal cameraViewInternal2;
            if (!ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress) {
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                if (!chatAttachAlertPhotoLayout.cameraOpened && chatAttachAlertPhotoLayout.adapter.hasCamera && !ChatAttachAlertPhotoLayout.this.noCameraPermissions && !ChatAttachAlertPhotoLayout.this.noGalleryPermissions) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(0);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        top = viewHolderFindViewHolderForAdapterPosition.itemView.getTop();
                    } else {
                        viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(ChatAttachAlertPhotoLayout.this.itemsPerRow);
                        if (viewHolderFindViewHolderForAdapterPosition == null) {
                            if (iBlur3Hash != null) {
                                ((Blur3HashImpl) iBlur3Hash).unsupported = true;
                                return;
                            }
                            return;
                        }
                        top = (viewHolderFindViewHolderForAdapterPosition.itemView.getTop() - AndroidUtilities.dp(2.0f)) - ChatAttachAlertPhotoLayout.this.itemSize;
                    }
                    int left = viewHolderFindViewHolderForAdapterPosition.itemView.getLeft();
                    int i = ChatAttachAlertPhotoLayout.this.itemSize + left;
                    int iDp = AndroidUtilities.dp(2.0f) + (ChatAttachAlertPhotoLayout.this.itemSize * 2) + top;
                    if (iBlur3Hash != null) {
                        Blur3HashImpl blur3HashImpl = (Blur3HashImpl) iBlur3Hash;
                        long jCalcHash = MediaDataController.calcHash(blur3HashImpl.hash, left);
                        blur3HashImpl.hash = jCalcHash;
                        long jCalcHash2 = MediaDataController.calcHash(jCalcHash, top);
                        blur3HashImpl.hash = jCalcHash2;
                        long jCalcHash3 = MediaDataController.calcHash(jCalcHash2, i);
                        blur3HashImpl.hash = jCalcHash3;
                        blur3HashImpl.hash = MediaDataController.calcHash(jCalcHash3, iDp);
                    }
                    if (rectF == null || rectF.intersects(left, top, i, iDp)) {
                        if (iBlur3Hash != null) {
                            Blur3HashImpl blur3HashImpl2 = (Blur3HashImpl) iBlur3Hash;
                            blur3HashImpl2.add(this.placeholderDrawable != null && ((cameraViewInternal2 = ChatAttachAlertPhotoLayout.this.cameraView) == null || !cameraViewInternal2.isInited() || ChatAttachAlertPhotoLayout.this.isHidden));
                            blur3HashImpl2.add(ChatAttachAlertPhotoLayout.this.cameraView != null);
                            blur3HashImpl2.add(this.cameraDrawable != null);
                        }
                        if (canvas == null) {
                            return;
                        }
                        float fDp = AndroidUtilities.dp(16.0f);
                        this.clipPath.rewind();
                        float f = left;
                        float f2 = top;
                        this.clipPath.addRoundRect(f, f2, i + fDp, iDp + fDp, fDp, fDp, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(this.clipPath);
                        if (this.placeholderDrawable != null && ((cameraViewInternal = ChatAttachAlertPhotoLayout.this.cameraView) == null || !cameraViewInternal.isInited() || ChatAttachAlertPhotoLayout.this.isHidden)) {
                            this.placeholderDrawable.setBounds(left, top, i, iDp);
                            this.placeholderDrawable.draw(canvas);
                        }
                        CameraViewInternal cameraViewInternal3 = ChatAttachAlertPhotoLayout.this.cameraView;
                        if (cameraViewInternal3 != null) {
                            cameraViewInternal3.drawInDecoration = true;
                            canvas.save();
                            canvas.clipRect(left, top, i, iDp);
                            canvas.translate(f, f2);
                            ChatAttachAlertPhotoLayout.this.cameraView.draw(canvas);
                            canvas.restore();
                            ChatAttachAlertPhotoLayout.this.cameraView.drawInDecoration = false;
                        }
                        if (this.cameraDrawable != null) {
                            int iDp2 = AndroidUtilities.dp(24.0f);
                            int iM = RichMessageLayout$$ExternalSyntheticOutline1.m(7.0f, i, iDp2);
                            int iDp3 = AndroidUtilities.dp(7.0f) + top;
                            this.cameraDrawable.setBounds(iM, iDp3, iM + iDp2, iDp2 + iDp3);
                            this.cameraDrawable.draw(canvas);
                        }
                        canvas.restore();
                        ChatAttachAlertPhotoLayout.this.gridView.invalidate();
                        return;
                    }
                    return;
                }
            }
            if (iBlur3Hash != null) {
                ((Blur3HashImpl) iBlur3Hash).unsupported = true;
            }
        }

        @Override
        public void capture(Canvas canvas, RectF rectF) {
            draw(canvas, this.parent, null, rectF);
        }

        @Override
        public void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
            draw(null, this.parent, iBlur3Hash, rectF);
        }

        @Override
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            draw(canvas, recyclerView, null, null);
        }

        public void updateBitmap() {
            Bitmap bitmapDecodeFile;
            try {
                bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
                bitmapDecodeFile = null;
            }
            if (bitmapDecodeFile != null) {
                this.placeholderDrawable = new BitmapDrawable(ChatAttachAlertPhotoLayout.this.getContext().getResources(), bitmapDecodeFile);
            } else {
                this.placeholderDrawable = ChatAttachAlertPhotoLayout.this.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
            }
            RecyclerListView recyclerListView = ChatAttachAlertPhotoLayout.this.gridView;
            if (recyclerListView != null) {
                recyclerListView.invalidate();
            }
        }
    }

    public class PhotoAttachAdapter extends RecyclerListView.FastScrollAdapter {
        private static final int VIEW_TYPE_CAMERA_PERMISSION_BUTTON = 8;
        private static final int VIEW_TYPE_CELL_PERMISSION = 3;
        private static final int VIEW_TYPE_EMPTY = 7;
        private boolean hasCamera;
        private boolean hasCameraSpaceRow;
        private boolean isInFastScroll;
        private int itemsCount;
        private final Context mContext;
        private final boolean needCamera;
        private int photosEndRow;
        private int photosStartRow;
        private final ArrayList<RecyclerListView.Holder> viewsCache = new ArrayList<>(8);

        public PhotoAttachAdapter(Context context, boolean z) {
            this.mContext = context;
            this.needCamera = z;
        }

        public MediaController.PhotoEntry getPhoto(int i) {
            if (this.hasCameraSpaceRow && i > ChatAttachAlertPhotoLayout.this.itemsPerRow) {
                i--;
            }
            if (this.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                i--;
            }
            return ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
        }

        public void lambda$createHolder$0(PhotoAttachPhotoCell photoAttachPhotoCell, PhotoAttachPhotoCell photoAttachPhotoCell2) {
            TLRPC.Chat currentChat;
            if (ChatAttachAlertPhotoLayout.this.mediaEnabled) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                if (chatAttachAlert.avatarPicker != 0 || chatAttachAlert.isPollAttach) {
                    return;
                }
                int iIntValue = ((Integer) photoAttachPhotoCell2.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = photoAttachPhotoCell2.getPhotoEntry();
                if (ChatAttachAlertPhotoLayout.this.checkSendMediaEnabled(photoEntry)) {
                    return;
                }
                if (ChatAttachAlertPhotoLayout.selectedPhotos.size() + 1 > ChatAttachAlertPhotoLayout.this.maxCount()) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                    BulletinFactory.of(chatAttachAlertPhotoLayout.parentAlert.sizeNotifierFrameLayout, chatAttachAlertPhotoLayout.resourcesProvider).createErrorBulletin(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0]))).show();
                    return;
                }
                boolean zContainsKey = ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photoEntry.imageId));
                boolean z = !zContainsKey;
                if (!zContainsKey && ChatAttachAlertPhotoLayout.this.parentAlert.maxSelectedPhotos >= 0) {
                    int size = ChatAttachAlertPhotoLayout.selectedPhotos.size();
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlertPhotoLayout.this.parentAlert;
                    if (size >= chatAttachAlert2.maxSelectedPhotos) {
                        if (chatAttachAlert2.allowOrder) {
                            BaseFragment baseFragment = chatAttachAlert2.baseFragment;
                            if (!(baseFragment instanceof ChatActivity) || (currentChat = ((ChatActivity) baseFragment).getCurrentChat()) == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled || ChatAttachAlertPhotoLayout.this.alertOnlyOnce == 2) {
                                return;
                            }
                            AlertsCreator.createSimpleAlert(ChatAttachAlertPhotoLayout.this.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), ChatAttachAlertPhotoLayout.this.resourcesProvider).show();
                            if (ChatAttachAlertPhotoLayout.this.alertOnlyOnce == 1) {
                                ChatAttachAlertPhotoLayout.this.alertOnlyOnce = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                int size2 = !zContainsKey ? ChatAttachAlertPhotoLayout.selectedPhotosOrder.size() : -1;
                ChatAttachAlert chatAttachAlert3 = ChatAttachAlertPhotoLayout.this.parentAlert;
                if ((chatAttachAlert3.baseFragment instanceof ChatActivity) && chatAttachAlert3.allowOrder) {
                    photoAttachPhotoCell2.setChecked(size2, z, true);
                } else {
                    photoAttachPhotoCell2.setChecked(-1, z, true);
                }
                ChatAttachAlertPhotoLayout.this.addToSelectedPhotos(photoEntry, iIntValue);
                if (this == ChatAttachAlertPhotoLayout.this.cameraAttachAdapter) {
                    if (ChatAttachAlertPhotoLayout.this.adapter.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                        iIntValue++;
                    }
                    if (ChatAttachAlertPhotoLayout.this.adapter.hasCameraSpaceRow && iIntValue >= ChatAttachAlertPhotoLayout.this.itemsPerRow) {
                        iIntValue++;
                    }
                    ChatAttachAlertPhotoLayout.this.adapter.lambda$onBindViewHolder$31(iIntValue);
                } else {
                    ChatAttachAlertPhotoLayout.this.cameraAttachAdapter.lambda$onBindViewHolder$31(iIntValue);
                }
                ChatAttachAlertPhotoLayout.this.parentAlert.updateCountButton(zContainsKey ? 2 : 1);
                photoAttachPhotoCell.setHasSpoiler(photoEntry.hasSpoiler);
                photoAttachPhotoCell.setHighQuality(photoEntry.isHighQuality());
                photoAttachPhotoCell.setStarsPrice(photoEntry.starsAmount, ChatAttachAlertPhotoLayout.selectedPhotos.size() > 1);
            }
        }

        public void lambda$onCreateViewHolder$3(Long l) {
            ChatAttachAlertPhotoLayout.this.showAvatarConstructorFragment(null, null, l.longValue());
            ChatAttachAlertPhotoLayout.this.parentAlert.lambda$showGiftOfferSheet$15();
        }

        public void createCache() {
            for (int i = 0; i < 8; i++) {
                this.viewsCache.add(createHolder());
            }
        }

        public RecyclerListView.Holder createHolder() {
            PhotoAttachPhotoCell photoAttachPhotoCell = new PhotoAttachPhotoCell(this.mContext, ChatAttachAlertPhotoLayout.this.resourcesProvider);
            if (this == ChatAttachAlertPhotoLayout.this.adapter) {
                photoAttachPhotoCell.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        PhotoAttachPhotoCell photoAttachPhotoCell2 = (PhotoAttachPhotoCell) view;
                        if (photoAttachPhotoCell2.getTag() == null) {
                            return;
                        }
                        int iIntValue = ((Integer) photoAttachPhotoCell2.getTag()).intValue();
                        if (PhotoAttachAdapter.this.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry && !ChatAttachAlertPhotoLayout.this.noCameraPermissions) {
                            iIntValue++;
                        }
                        if (ChatAttachAlertPhotoLayout.this.showAvatarConstructor) {
                            iIntValue++;
                        }
                        if (iIntValue == 0) {
                            int iDp = AndroidUtilities.dp(16.0f);
                            outline.setRoundRect(0, 0, view.getMeasuredWidth() + iDp, view.getMeasuredHeight() + iDp, iDp);
                        } else if (iIntValue != ChatAttachAlertPhotoLayout.this.itemsPerRow - 1) {
                            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        } else {
                            int iDp2 = AndroidUtilities.dp(16.0f);
                            outline.setRoundRect(-iDp2, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + iDp2, iDp2);
                        }
                    }
                });
                photoAttachPhotoCell.setClipToOutline(true);
            }
            photoAttachPhotoCell.setFastScrollDelegate(new EmojiView$$ExternalSyntheticLambda21(this, 4));
            photoAttachPhotoCell.setDelegate(new AIEditorAlert$$ExternalSyntheticLambda34(3, this, photoAttachPhotoCell));
            return new RecyclerListView.Holder(photoAttachPhotoCell);
        }

        @Override
        public boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            return !(ChatAttachAlertPhotoLayout.cameraPhotos.isEmpty() && (ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == null || ChatAttachAlertPhotoLayout.this.selectedAlbumEntry.photos.isEmpty())) && ChatAttachAlertPhotoLayout.this.parentAlert.pinnedToTop && getTotalItemsCount() > 30;
        }

        @Override
        public int getItemCount() {
            if (!ChatAttachAlertPhotoLayout.this.mediaEnabled) {
                return 1;
            }
            int size = 0;
            this.hasCamera = false;
            this.hasCameraSpaceRow = false;
            if (ChatAttachAlertPhotoLayout.this.noGalleryPermissions && this == ChatAttachAlertPhotoLayout.this.adapter) {
                return 2;
            }
            if (this.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                this.hasCamera = true;
                size = 1;
            }
            if (ChatAttachAlertPhotoLayout.this.showAvatarConstructor) {
                size++;
            }
            if (ChatAttachAlertPhotoLayout.this.noGalleryPermissions && this == ChatAttachAlertPhotoLayout.this.adapter) {
                size++;
            }
            this.photosStartRow = size;
            if (!ChatAttachAlertPhotoLayout.this.noGalleryPermissions) {
                size += ChatAttachAlertPhotoLayout.cameraPhotos.size();
                if (ChatAttachAlertPhotoLayout.this.selectedAlbumEntry != null) {
                    size += ChatAttachAlertPhotoLayout.this.selectedAlbumEntry.photos.size();
                }
            }
            this.photosEndRow = size;
            if (this.hasCamera && size > ChatAttachAlertPhotoLayout.this.itemsPerRow && !ChatAttachAlertPhotoLayout.this.noCameraPermissions) {
                this.hasCameraSpaceRow = true;
                size++;
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
            if (ChatAttachAlertPhotoLayout.this.noGalleryPermissions && this == ChatAttachAlertPhotoLayout.this.adapter) {
                return i == 0 ? 7 : 2;
            }
            if (this.needCamera && i == 0 && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                return ChatAttachAlertPhotoLayout.this.noCameraPermissions ? 8 : 1;
            }
            if (this.hasCameraSpaceRow && i == ChatAttachAlertPhotoLayout.this.itemsPerRow) {
                return 5;
            }
            int i2 = (!this.hasCameraSpaceRow || i <= ChatAttachAlertPhotoLayout.this.itemsPerRow) ? i : i - 1;
            if (this.needCamera) {
                i2--;
            }
            if (ChatAttachAlertPhotoLayout.this.showAvatarConstructor && i2 == 0) {
                return 4;
            }
            if (this == ChatAttachAlertPhotoLayout.this.adapter && i == this.itemsCount - 1) {
                return 2;
            }
            return ChatAttachAlertPhotoLayout.this.noGalleryPermissions ? 3 : 0;
        }

        @Override
        public String getLetter(int i) {
            MediaController.PhotoEntry photo = getPhoto(i);
            if (photo == null) {
                if (i <= this.photosStartRow) {
                    if (!ChatAttachAlertPhotoLayout.cameraPhotos.isEmpty()) {
                        photo = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.cameraPhotos.get(0);
                    } else if (ChatAttachAlertPhotoLayout.this.selectedAlbumEntry != null && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry.photos != null) {
                        photo = ChatAttachAlertPhotoLayout.this.selectedAlbumEntry.photos.get(0);
                    }
                } else if (!ChatAttachAlertPhotoLayout.this.selectedAlbumEntry.photos.isEmpty()) {
                    photo = ChatAttachAlertPhotoLayout.this.selectedAlbumEntry.photos.get(ChatAttachAlertPhotoLayout.this.selectedAlbumEntry.photos.size() - 1);
                }
            }
            if (photo == null) {
                return "";
            }
            long j = photo.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j /= 1000;
            }
            return LocaleController.formatYearMont(j, true);
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            float fCeil = (((int) (Math.ceil(getTotalItemsCount() / ChatAttachAlertPhotoLayout.this.itemsPerRow) * ((double) measuredHeight))) - (recyclerListView.getMeasuredHeight() - currentActionBarHeight)) * f;
            float f2 = measuredHeight;
            iArr[0] = ChatAttachAlertPhotoLayout.this.itemsPerRow * ((int) (fCeil / f2));
            int paddingTop = recyclerListView.getPaddingTop() + ((int) (fCeil % f2)) + ((int) ((1.0f - f) * currentActionBarHeight));
            iArr[1] = paddingTop;
            if (iArr[0] != 0 || paddingTop >= ChatAttachAlertPhotoLayout.this.getListTopPadding()) {
                return;
            }
            iArr[1] = ChatAttachAlertPhotoLayout.this.getListTopPadding() + currentActionBarHeight;
        }

        @Override
        public float getScrollProgress(RecyclerListView recyclerListView) {
            int i = ChatAttachAlertPhotoLayout.this.itemsPerRow;
            int iCeil = (int) Math.ceil(this.itemsCount / i);
            if (recyclerListView.getChildCount() == 0) {
                return 0.0f;
            }
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            View childAt = recyclerListView.getChildAt(0);
            int childAdapterPosition = recyclerListView.getChildAdapterPosition(childAt);
            if (childAdapterPosition < 0) {
                return 0.0f;
            }
            return Utilities.clamp((((childAdapterPosition / i) * measuredHeight) - childAt.getTop()) / ((iCeil * measuredHeight) - (recyclerListView.getMeasuredHeight() - ActionBar.getCurrentActionBarHeight())), 1.0f, 0.0f);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public boolean isInFastScroll() {
            return this.isInFastScroll;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            if (this == ChatAttachAlertPhotoLayout.this.adapter) {
                ChatAttachAlertPhotoLayout.this.progressView.setVisibility((!(getItemCount() == 1 && !ChatAttachAlertPhotoLayout.this.noGalleryPermissions && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == null) && ChatAttachAlertPhotoLayout.this.mediaEnabled) ? 4 : 0);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ((PhotoAttachCameraCell) viewHolder.itemView).setItemSize(ChatAttachAlertPhotoLayout.this.itemSize);
                    return;
                }
                if (itemViewType != 3) {
                    if (itemViewType != 7) {
                        return;
                    }
                    ((GalleryEmptyView) viewHolder.itemView).setUseAnEmojiVisible(ChatAttachAlertPhotoLayout.this.showAvatarConstructor);
                    return;
                } else {
                    PhotoAttachPermissionCell photoAttachPermissionCell = (PhotoAttachPermissionCell) viewHolder.itemView;
                    photoAttachPermissionCell.setItemSize(ChatAttachAlertPhotoLayout.this.itemSize);
                    photoAttachPermissionCell.setType((this.needCamera && ChatAttachAlertPhotoLayout.this.noCameraPermissions && i == 0) ? 0 : 1);
                    return;
                }
            }
            if (this.hasCameraSpaceRow && i > ChatAttachAlertPhotoLayout.this.itemsPerRow) {
                i--;
            }
            if (this.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry) {
                i--;
            }
            if (ChatAttachAlertPhotoLayout.this.showAvatarConstructor) {
                i--;
            }
            PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) viewHolder.itemView;
            if (this == ChatAttachAlertPhotoLayout.this.adapter) {
                photoAttachPhotoCell.setItemSize(ChatAttachAlertPhotoLayout.this.itemSize);
            } else {
                photoAttachPhotoCell.setIsVertical(ChatAttachAlertPhotoLayout.this.cameraPhotoLayoutManager.getOrientation() == 1);
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            if (chatAttachAlert.avatarPicker != 0 || chatAttachAlert.storyMediaPicker || chatAttachAlert.isPollAttach) {
                photoAttachPhotoCell.getCheckBox().setVisibility(8);
            } else {
                photoAttachPhotoCell.getCheckBox().setVisibility(0);
            }
            MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
            if (photoEntryAtPosition == null) {
                return;
            }
            boolean z = ChatAttachAlertPhotoLayout.selectedPhotos.size() > 1;
            boolean z2 = this.needCamera && ChatAttachAlertPhotoLayout.this.selectedAlbumEntry == ChatAttachAlertPhotoLayout.this.galleryAlbumEntry;
            boolean z3 = i == getItemCount() - 1;
            ChatAttachAlert chatAttachAlert2 = ChatAttachAlertPhotoLayout.this.parentAlert;
            photoAttachPhotoCell.setPhotoEntry(photoEntryAtPosition, z, z2, z3, chatAttachAlert2 != null && chatAttachAlert2.allowLivePhotos);
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlertPhotoLayout.this.parentAlert;
            if ((chatAttachAlert3.baseFragment instanceof ChatActivity) && chatAttachAlert3.allowOrder) {
                photoAttachPhotoCell.setChecked(ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)), ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
            } else {
                photoAttachPhotoCell.setChecked(-1, ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
            }
            if (!ChatAttachAlertPhotoLayout.this.videoEnabled && photoEntryAtPosition.isVideo) {
                photoAttachPhotoCell.setAlpha(0.3f);
            } else if (ChatAttachAlertPhotoLayout.this.photoEnabled || photoEntryAtPosition.isVideo) {
                photoAttachPhotoCell.setAlpha(1.0f);
            } else {
                photoAttachPhotoCell.setAlpha(0.3f);
            }
            photoAttachPhotoCell.getImageView().setTag(Integer.valueOf(i));
            photoAttachPhotoCell.setTag(Integer.valueOf(i));
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                if (this.viewsCache.isEmpty()) {
                    return createHolder();
                }
                RecyclerListView.Holder holder = this.viewsCache.get(0);
                this.viewsCache.remove(0);
                return holder;
            }
            if (i == 1) {
                PhotoAttachCameraCell photoAttachCameraCell = new PhotoAttachCameraCell(this.mContext);
                photoAttachCameraCell.setFocusable(true);
                photoAttachCameraCell.itemSize = AndroidUtilities.dp(0.0f);
                return new RecyclerListView.Holder(photoAttachCameraCell);
            }
            if (i == 2) {
                return new RecyclerListView.Holder(new View(this.mContext) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(ChatAttachAlertPhotoLayout.this.gridExtraSpace, 1073741824));
                    }
                });
            }
            if (i == 4) {
                return new RecyclerListView.Holder(new AvatarConstructorPreviewCell(this.mContext, ChatAttachAlertPhotoLayout.this.parentAlert.forUser) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ChatAttachAlertPhotoLayout.this.itemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(ChatAttachAlertPhotoLayout.this.itemSize, 1073741824));
                    }
                });
            }
            if (i == 5) {
                return new RecyclerListView.Holder(new View(this.mContext));
            }
            if (i == 7) {
                Context context = this.mContext;
                ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                GalleryEmptyView galleryEmptyView = new GalleryEmptyView(context, chatAttachAlert.currentAccount, chatAttachAlert.forUser);
                galleryEmptyView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(400.0f)));
                galleryEmptyView.setGravity(17);
                galleryEmptyView.isClickable();
                galleryEmptyView.doOnCameraAccess(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(ChatAttachAlertPhotoLayout.this, 1));
                galleryEmptyView.doOnGalleryAccessClick(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(ChatAttachAlertPhotoLayout.this, 2));
                galleryEmptyView.doOnEmojiButton(new PasscodeView$$ExternalSyntheticLambda8(this, 1));
                return new RecyclerListView.Holder(galleryEmptyView);
            }
            if (i != 8) {
                return new RecyclerListView.Holder(new PhotoAttachPermissionCell(this.mContext, ChatAttachAlertPhotoLayout.this.resourcesProvider));
            }
            FrameLayout frameLayout = new FrameLayout(this.mContext);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(this.mContext, true, ChatAttachAlertPhotoLayout.this.resourcesProvider);
            buttonWithCounterView.setUseWrapContent(true);
            buttonWithCounterView.setRound();
            buttonWithCounterView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.camera), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
            buttonWithCounterView.setText(spannableStringBuilder, false);
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new RecyclerListView.Holder(frameLayout);
        }

        @Override
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            super.onFinishFastScroll(recyclerListView);
            this.isInFastScroll = false;
            if (recyclerListView != null) {
                int childCount = recyclerListView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    recyclerListView.getChildAt(i).invalidate();
                }
            }
        }

        @Override
        public void onStartFastScroll() {
            super.onStartFastScroll();
            this.isInFastScroll = true;
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.itemView instanceof PhotoAttachCameraCell) {
                ChatAttachAlertPhotoLayout.this.cameraViewItemDecoration.updateBitmap();
            }
        }
    }

    public ChatAttachAlertPhotoLayout(ChatAttachAlert chatAttachAlert, Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.flashModeButton = new ImageView[2];
        this.cameraViewLocation = new float[2];
        this.viewPosition = new int[2];
        this.animateCameraValues = new int[5];
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.isCameraFrontfaceBeforeEnteringEditMode = null;
        this.hitRect = new Rect();
        int iDp = AndroidUtilities.dp(80.0f);
        this.itemSize = iDp;
        this.lastItemSize = iDp;
        this.itemsPerRow = 3;
        this.loading = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.photoViewerProvider = new AnonymousClass1();
        int i = 0;
        Object[] objArr = 0;
        this.currentItemTop = 0;
        this.forceDarkTheme = z;
        this.needCamera = z2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        BottomSheet.ContainerView container = chatAttachAlert.getContainer();
        ChatAttachAlert chatAttachAlert2 = this.parentAlert;
        this.showAvatarConstructor = chatAttachAlert2.avatarPicker != 0;
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, chatAttachAlert2.actionBar.createMenu(), 0, 0, resourcesProvider) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(ChatAttachAlertPhotoLayout.this.dropDown.getText());
            }
        };
        this.dropDownContainer = actionBarMenuItem;
        actionBarMenuItem.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        layoutParamsCreateFrame.topMargin = AndroidUtilities.statusBarHeight;
        this.parentAlert.actionBar.addView(this.dropDownContainer, 0, layoutParamsCreateFrame);
        final int i2 = 0;
        this.dropDownContainer.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$1(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$8(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$5(view);
                        break;
                    default:
                        this.f$0.lambda$new$7(view);
                        break;
                }
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
        TextView textView2 = this.dropDown;
        int i3 = Theme.key_dialogTextBlack;
        textView2.setTextColor(getThemedColor(i3));
        this.dropDown.setText(LocaleController.getString(R.string.ChatGallery));
        this.dropDown.setTypeface(AndroidUtilities.bold());
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.dropDownDrawable = drawableMutate;
        int themedColor = getThemedColor(i3);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        this.dropDown.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        this.dropDownContainer.addView(this.dropDown, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        checkCamera(false);
        MessagePreviewView.ToggleButton toggleButton = new MessagePreviewView.ToggleButton(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), resourcesProvider);
        this.captionItem = toggleButton;
        toggleButton.setState(!this.parentAlert.captionAbove, false);
        this.previewItem = this.parentAlert.selectedMenuItem.addSubItem(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.parentAlert.selectedMenuItem.addColoredGap(5);
        this.parentAlert.selectedMenuItem.addSubItem(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.compressItem = this.parentAlert.selectedMenuItem.addSubItem(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.parentAlert.selectedMenuItem.addSubItem(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.parentAlert.selectedMenuItem.addColoredGap(6);
        this.spoilerItem = this.parentAlert.selectedMenuItem.addSubItem(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.qualityItem = this.parentAlert.selectedMenuItem.addSubItem(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        this.parentAlert.selectedMenuItem.addSubItem(8, this.captionItem);
        this.starsItem = this.parentAlert.selectedMenuItem.addSubItem(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.parentAlert.selectedMenuItem.setFitSubItems(true);
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ChatAttachAlertPhotoLayout.this.parentAlert.scrollOffsetY[0] - AndroidUtilities.dp(80.0f)) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            }

            @Override
            public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
                super.onLayout(z3, i4, i5, i6, i7);
                PhotoViewer.getInstance().checkCurrentImageVisibility();
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ChatAttachAlertPhotoLayout.this.parentAlert.scrollOffsetY[0] - AndroidUtilities.dp(80.0f)) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.gridView = recyclerListView;
        recyclerListView.setFastScrollEnabled(1);
        this.gridView.setFastScrollVisible(true);
        this.gridView.getFastScroll().setAlpha(0.0f);
        this.gridView.getFastScroll().usePadding = false;
        this.gridView.getFastScroll().topOffset = ActionBar.getCurrentActionBarHeight();
        RecyclerListView recyclerListView2 = this.gridView;
        PhotoAttachAdapter photoAttachAdapter = new PhotoAttachAdapter(context, z2);
        this.adapter = photoAttachAdapter;
        recyclerListView2.setAdapter(photoAttachAdapter);
        RecyclerListView recyclerListView3 = this.gridView;
        CameraViewItemDecoration cameraViewItemDecoration = new CameraViewItemDecoration(recyclerListView3);
        this.cameraViewItemDecoration = cameraViewItemDecoration;
        recyclerListView3.addItemDecoration(cameraViewItemDecoration);
        this.adapter.createCache();
        this.gridView.setClipToPadding(false);
        this.gridView.lambda$onCellEnter$52(null);
        this.gridView.setLayoutAnimation(null);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            boolean parentPinnedToTop;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                RecyclerListView.Holder holder;
                if (i4 == 0) {
                    int iDp2 = AndroidUtilities.dp(13.0f);
                    ActionBarMenuItem actionBarMenuItem2 = ChatAttachAlertPhotoLayout.this.parentAlert.selectedMenuItem;
                    int iDp3 = iDp2 + (actionBarMenuItem2 != null ? AndroidUtilities.dp(actionBarMenuItem2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = ChatAttachAlertPhotoLayout.this.parentAlert.getBackgroundPaddingTop();
                    if (((ChatAttachAlertPhotoLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - iDp3) + backgroundPaddingTop >= (ChatAttachAlertPhotoLayout.this.parentAlert.topCommentContainer.getAlpha() * ChatAttachAlertPhotoLayout.this.parentAlert.topCommentContainer.getMeasuredHeight()) + ActionBar.getCurrentActionBarHeight() || (holder = (RecyclerListView.Holder) ChatAttachAlertPhotoLayout.this.gridView.findViewHolderForAdapterPosition(0)) == null || holder.itemView.getTop() <= ChatAttachAlertPhotoLayout.this.getTopScrollOffset()) {
                        return;
                    }
                    ChatAttachAlertPhotoLayout.this.gridView.smoothScrollBy(0, holder.itemView.getTop() - ChatAttachAlertPhotoLayout.this.getTopScrollOffset());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                if (ChatAttachAlertPhotoLayout.this.gridView.getChildCount() <= 0) {
                    return;
                }
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                chatAttachAlertPhotoLayout.parentAlert.updateLayout(chatAttachAlertPhotoLayout, true, i5);
                if (ChatAttachAlertPhotoLayout.this.adapter.getTotalItemsCount() > 30) {
                    boolean z3 = this.parentPinnedToTop;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                    boolean z4 = chatAttachAlertPhotoLayout2.parentAlert.pinnedToTop;
                    if (z3 != z4) {
                        this.parentPinnedToTop = z4;
                        OKLCH.m(chatAttachAlertPhotoLayout2.gridView.getFastScroll().animate(), this.parentPinnedToTop ? 1.0f : 0.0f, 100L);
                    }
                } else {
                    ChatAttachAlertPhotoLayout.this.gridView.getFastScroll().setAlpha(0.0f);
                }
                if (i5 != 0) {
                    ChatAttachAlertPhotoLayout.this.checkCameraViewPosition();
                }
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.itemSize) {
            {
                super(i);
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i4) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i5) {
                        return super.calculateDyToMakeVisible(view, i5) - (ChatAttachAlertPhotoLayout.this.gridView.getPaddingTop() - ChatAttachAlertPhotoLayout.this.getTopScrollOffset());
                    }

                    @Override
                    public int calculateTimeForDeceleration(int i5) {
                        return super.calculateTimeForDeceleration(i5) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i4);
                startSmoothScroll(linearSmoothScroller);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = gridLayoutManager;
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i4) {
                if (i4 == ChatAttachAlertPhotoLayout.this.adapter.itemsCount - 1 || ((ChatAttachAlertPhotoLayout.this.noGalleryPermissions || ChatAttachAlertPhotoLayout.this.noCameraPermissions) && i4 == 0)) {
                    return ChatAttachAlertPhotoLayout.this.layoutManager.getSpanCount();
                }
                if (ChatAttachAlertPhotoLayout.this.noCameraPermissions) {
                    i4--;
                }
                return ChatAttachAlertPhotoLayout.this.itemSize + (i4 % ChatAttachAlertPhotoLayout.this.itemsPerRow != ChatAttachAlertPhotoLayout.this.itemsPerRow + (-1) ? AndroidUtilities.dp(2.0f) : 0);
            }
        });
        this.gridView.setLayoutManager(this.layoutManager);
        this.gridView.setOnItemClickListener(new AlertsCreator$$ExternalSyntheticLambda136(this, z2, resourcesProvider));
        this.gridView.setOnItemLongClickListener(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(this, 0));
        RecyclerViewItemRangeSelector recyclerViewItemRangeSelector = new RecyclerViewItemRangeSelector(new RecyclerViewItemRangeSelector.RecyclerViewItemRangeSelectorDelegate() {
            @Override
            public int getItemCount() {
                return ChatAttachAlertPhotoLayout.this.adapter.getItemCount();
            }

            @Override
            public boolean isIndexSelectable(int i4) {
                return ChatAttachAlertPhotoLayout.this.adapter.getItemViewType(i4) == 0;
            }

            @Override
            public boolean isSelected(int i4) {
                MediaController.PhotoEntry photo = ChatAttachAlertPhotoLayout.this.adapter.getPhoto(i4);
                return photo != null && ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photo.imageId));
            }

            @Override
            public void onStartStopSelection(boolean z3) {
                ChatAttachAlertPhotoLayout.this.alertOnlyOnce = z3 ? 1 : 0;
                ChatAttachAlertPhotoLayout.this.gridView.hideSelector(true);
            }

            @Override
            public void setSelected(View view, int i4, boolean z3) {
                if (z3 == ChatAttachAlertPhotoLayout.this.shouldSelect && (view instanceof PhotoAttachPhotoCell)) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
                    photoAttachPhotoCell.delegate.onCheckClick(photoAttachPhotoCell);
                }
            }
        });
        this.itemRangeSelector = recyclerViewItemRangeSelector;
        this.gridView.addOnItemTouchListener(recyclerViewItemRangeSelector);
        RecyclerListView recyclerListView4 = this.gridView;
        this.iBlur3Capture = recyclerListView4;
        this.iBlur3CaptureView = recyclerListView4;
        this.occupyNavigationBar = true;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null, resourcesProvider);
        this.progressView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString(R.string.NoPhotos));
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
        TextView textView3 = new TextView(context) {
            float alpha = 0.0f;
            boolean isIncr;

            @Override
            public void onDraw(Canvas canvas) {
                paint.setAlpha((int) ((this.alpha * 130.0f) + 125.0f));
                if (this.isIncr) {
                    float f = this.alpha + 0.026666667f;
                    this.alpha = f;
                    if (f >= 1.0f) {
                        this.alpha = 1.0f;
                        this.isIncr = false;
                    }
                } else {
                    float f2 = this.alpha - 0.026666667f;
                    this.alpha = f2;
                    if (f2 <= 0.0f) {
                        this.alpha = 0.0f;
                        this.isIncr = true;
                    }
                }
                super.onDraw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
                invalidate();
            }
        };
        this.recordTime = textView3;
        AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 1.0f, false);
        this.recordTime.setBackgroundResource(R.drawable.system);
        this.recordTime.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        this.recordTime.setTextSize(1, 15.0f);
        this.recordTime.setTypeface(AndroidUtilities.bold());
        this.recordTime.setAlpha(0.0f);
        this.recordTime.setTextColor(-1);
        this.recordTime.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(this.recordTime, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
                int measuredWidth;
                int measuredHeight;
                int iDp2;
                int measuredHeight2;
                int measuredWidth2;
                int iDp3;
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    measuredWidth2 = getMeasuredWidth() / 2;
                    int i8 = measuredHeight / 2;
                    measuredHeight2 = AndroidUtilities.dp(17.0f) + measuredHeight + i8;
                    iDp3 = i8 - AndroidUtilities.dp(17.0f);
                    iDp2 = measuredWidth2;
                } else {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    int i9 = measuredWidth / 2;
                    int iDp4 = measuredWidth + i9 + AndroidUtilities.dp(17.0f);
                    iDp2 = i9 - AndroidUtilities.dp(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    measuredWidth2 = iDp4;
                    iDp3 = measuredHeight2;
                }
                int measuredHeight3 = (getMeasuredHeight() - ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    ChatAttachAlertPhotoLayout.this.tooltipTextView.layout(measuredWidth - (ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredWidth() / 2), getMeasuredHeight(), (ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredWidth() / 2) + measuredWidth, ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    ChatAttachAlertPhotoLayout.this.tooltipTextView.layout(measuredWidth - (ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredWidth() / 2), measuredHeight3, (ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredWidth() / 2) + measuredWidth, ChatAttachAlertPhotoLayout.this.tooltipTextView.getMeasuredHeight() + measuredHeight3);
                }
                ChatAttachAlertPhotoLayout.this.shutterButton.layout(measuredWidth - (ChatAttachAlertPhotoLayout.this.shutterButton.getMeasuredWidth() / 2), measuredHeight - (ChatAttachAlertPhotoLayout.this.shutterButton.getMeasuredHeight() / 2), (ChatAttachAlertPhotoLayout.this.shutterButton.getMeasuredWidth() / 2) + measuredWidth, (ChatAttachAlertPhotoLayout.this.shutterButton.getMeasuredHeight() / 2) + measuredHeight);
                ChatAttachAlertPhotoLayout.this.switchCameraButton.layout(measuredWidth2 - (ChatAttachAlertPhotoLayout.this.switchCameraButton.getMeasuredWidth() / 2), measuredHeight2 - (ChatAttachAlertPhotoLayout.this.switchCameraButton.getMeasuredHeight() / 2), (ChatAttachAlertPhotoLayout.this.switchCameraButton.getMeasuredWidth() / 2) + measuredWidth2, (ChatAttachAlertPhotoLayout.this.switchCameraButton.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i10 = 0; i10 < 2; i10++) {
                    ChatAttachAlertPhotoLayout.this.flashModeButton[i10].layout(iDp2 - (ChatAttachAlertPhotoLayout.this.flashModeButton[i10].getMeasuredWidth() / 2), iDp3 - (ChatAttachAlertPhotoLayout.this.flashModeButton[i10].getMeasuredHeight() / 2), (ChatAttachAlertPhotoLayout.this.flashModeButton[i10].getMeasuredWidth() / 2) + iDp2, (ChatAttachAlertPhotoLayout.this.flashModeButton[i10].getMeasuredHeight() / 2) + iDp3);
                }
            }
        };
        this.cameraPanel = frameLayout;
        frameLayout.setVisibility(8);
        this.cameraPanel.setAlpha(0.0f);
        container.addView(this.cameraPanel, LayoutHelper.createFrame(-1, 126, 83));
        TextView textView4 = new TextView(context);
        this.counterTextView = textView4;
        textView4.setBackgroundResource(R.drawable.photos_rounded);
        this.counterTextView.setVisibility(8);
        this.counterTextView.setTextColor(-1);
        this.counterTextView.setGravity(17);
        this.counterTextView.setPivotX(0.0f);
        this.counterTextView.setPivotY(0.0f);
        this.counterTextView.setTypeface(AndroidUtilities.bold());
        this.counterTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.photos_arrow, 0);
        this.counterTextView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        this.counterTextView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        container.addView(this.counterTextView, LayoutHelper.createFrame(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        final int i4 = 2;
        this.counterTextView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$1(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$8(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$5(view);
                        break;
                    default:
                        this.f$0.lambda$new$7(view);
                        break;
                }
            }
        });
        ZoomControlView zoomControlView = new ZoomControlView(context);
        this.zoomControlView = zoomControlView;
        zoomControlView.setVisibility(8);
        this.zoomControlView.setAlpha(0.0f);
        container.addView(this.zoomControlView, LayoutHelper.createFrame(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        this.zoomControlView.setDelegate(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(this, 3));
        ShutterButton shutterButton = new ShutterButton(context);
        this.shutterButton = shutterButton;
        this.cameraPanel.addView(shutterButton, LayoutHelper.createFrame(84, 84, 17));
        this.shutterButton.setDelegate(new AnonymousClass10(resourcesProvider, container));
        this.shutterButton.setFocusable(true);
        this.shutterButton.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.switchCameraButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.cameraPanel.addView(this.switchCameraButton, LayoutHelper.createFrame(48, 48, 21));
        final int i5 = 3;
        this.switchCameraButton.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f$0.lambda$new$1(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$8(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$5(view);
                        break;
                    default:
                        this.f$0.lambda$new$7(view);
                        break;
                }
            }
        });
        this.switchCameraButton.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i6 = 0; i6 < 2; i6++) {
            this.flashModeButton[i6] = new ImageView(context);
            this.flashModeButton[i6].setScaleType(ImageView.ScaleType.CENTER);
            this.flashModeButton[i6].setVisibility(4);
            this.cameraPanel.addView(this.flashModeButton[i6], LayoutHelper.createFrame(48, 48, 51));
            final int i7 = 1;
            this.flashModeButton[i6].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$8(view);
                            break;
                        case 2:
                            this.f$0.lambda$new$5(view);
                            break;
                        default:
                            this.f$0.lambda$new$7(view);
                            break;
                    }
                }
            });
            this.flashModeButton[i6].setContentDescription("flash mode " + i6);
        }
        TextView textView5 = new TextView(context);
        this.tooltipTextView = textView5;
        textView5.setTextSize(1, 15.0f);
        this.tooltipTextView.setTextColor(-1);
        this.tooltipTextView.setText(LocaleController.getString(R.string.TapForVideo));
        this.tooltipTextView.setShadowLayer(AndroidUtilities.dp(3.33333f), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        this.tooltipTextView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.cameraPanel.addView(this.tooltipTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        RecyclerListView recyclerListView5 = new RecyclerListView(context, resourcesProvider) {
            @Override
            public void requestLayout() {
                if (ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerViewIgnoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.cameraPhotoRecyclerView = recyclerListView5;
        recyclerListView5.setVerticalScrollBarEnabled(true);
        RecyclerListView recyclerListView6 = this.cameraPhotoRecyclerView;
        PhotoAttachAdapter photoAttachAdapter2 = new PhotoAttachAdapter(context, false);
        this.cameraAttachAdapter = photoAttachAdapter2;
        recyclerListView6.setAdapter(photoAttachAdapter2);
        this.cameraAttachAdapter.createCache();
        this.cameraPhotoRecyclerView.setClipToPadding(false);
        this.cameraPhotoRecyclerView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.cameraPhotoRecyclerView.lambda$onCellEnter$52(null);
        this.cameraPhotoRecyclerView.setLayoutAnimation(null);
        this.cameraPhotoRecyclerView.setOverScrollMode(2);
        this.cameraPhotoRecyclerView.setVisibility(4);
        this.cameraPhotoRecyclerView.setAlpha(0.0f);
        container.addView(this.cameraPhotoRecyclerView, LayoutHelper.createFrame(-1, 80.0f));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, objArr == true ? 1 : 0) {
            {
                super(i, z);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.cameraPhotoLayoutManager = linearLayoutManager;
        this.cameraPhotoRecyclerView.setLayoutManager(linearLayoutManager);
        this.cameraPhotoRecyclerView.setOnItemClickListener(new AudioPlayerAlert$$ExternalSyntheticLambda35(1));
    }

    public static int access$3408(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        int i = chatAttachAlertPhotoLayout.videoRecordTime;
        chatAttachAlertPhotoLayout.videoRecordTime = i + 1;
        return i;
    }

    public static void access$6700(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        chatAttachAlertPhotoLayout.requestGalleryPermission();
    }

    public static void access$6800(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        chatAttachAlertPhotoLayout.openCameraWithPermissionCheck();
    }

    public int addToSelectedPhotos(MediaController.PhotoEntry photoEntry, int i) {
        Integer numValueOf = Integer.valueOf(photoEntry.imageId);
        if (selectedPhotos.containsKey(numValueOf)) {
            photoEntry.starsAmount = 0L;
            photoEntry.hasSpoiler = false;
            photoEntry.discardLivePhoto = null;
            photoEntry.highQuality = null;
            selectedPhotos.remove(numValueOf);
            int iIndexOf = selectedPhotosOrder.indexOf(numValueOf);
            if (iIndexOf >= 0) {
                selectedPhotosOrder.remove(iIndexOf);
            }
            updatePhotosCounter(false);
            updateCheckedPhotoIndices();
            if (i >= 0) {
                photoEntry.reset();
                this.photoViewerProvider.updatePhotoAtIndex(i);
            }
            return iIndexOf;
        }
        photoEntry.starsAmount = getStarsPrice();
        photoEntry.hasSpoiler = getStarsPrice() > 0;
        photoEntry.isChatPreviewSpoilerRevealed = false;
        photoEntry.isAttachSpoilerRevealed = false;
        if (hasLivePhotos()) {
            photoEntry.discardLivePhoto = Boolean.valueOf(!areLivePhotosEnabled());
        }
        photoEntry.highQuality = Boolean.valueOf(photoEntry.isHighQuality());
        boolean zCheckSelectedCount = checkSelectedCount(true);
        selectedPhotos.put(numValueOf, photoEntry);
        selectedPhotosOrder.add(numValueOf);
        if (zCheckSelectedCount) {
            updateCheckedPhotos();
            return -1;
        }
        updatePhotosCounter(true);
        return -1;
    }

    private void applyCameraViewPosition() {
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            if (!this.cameraOpened) {
                cameraViewInternal.setTranslationX(this.cameraViewLocation[0]);
            }
            int i = this.itemSize;
            int iDp = AndroidUtilities.dp(2.0f) + (i * 2);
            if (this.cameraOpened) {
                return;
            }
            this.cameraView.setClipTop((int) this.cameraViewOffsetY);
            this.cameraView.setClipBottom((int) this.cameraViewOffsetBottomY);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.cameraView.getLayoutParams();
            if (layoutParams.height == iDp && layoutParams.width == i) {
                return;
            }
            layoutParams.width = i;
            layoutParams.height = iDp;
            this.cameraView.setLayoutParams(layoutParams);
            AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda7(16, this, layoutParams));
        }
    }

    private boolean checkSelectedCount(boolean z) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z2 = false;
        while (selectedPhotos.size() > 10 - (z ? 1 : 0) && !selectedPhotosOrder.isEmpty()) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            addToSelectedPhotos((MediaController.PhotoEntry) obj, -1);
            z2 = true;
        }
        return z2;
    }

    public boolean checkSendMediaEnabled(MediaController.PhotoEntry photoEntry) {
        if (!this.videoEnabled && photoEntry.isVideo) {
            if (this.parentAlert.checkCanRemoveRestrictionsByBoosts()) {
                return true;
            }
            UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(this.parentAlert.sizeNotifierFrameLayout, this.resourcesProvider), R.string.GlobalAttachVideoRestricted);
            return true;
        }
        if (this.photoEnabled || photoEntry.isVideo) {
            return false;
        }
        if (this.parentAlert.checkCanRemoveRestrictionsByBoosts()) {
            return true;
        }
        UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(this.parentAlert.sizeNotifierFrameLayout, this.resourcesProvider), R.string.GlobalAttachPhotoRestricted);
        return true;
    }

    public PhotoAttachPhotoCell getCellForIndex(int i) {
        int childCount = this.gridView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.gridView.getChildAt(i2);
            if (childAt.getTop() < this.gridView.getMeasuredHeight() - this.parentAlert.getClipLayoutBottom() && (childAt instanceof PhotoAttachPhotoCell)) {
                PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                if (photoAttachPhotoCell.getImageView().getTag() != null && ((Integer) photoAttachPhotoCell.getImageView().getTag()).intValue() == i) {
                    return photoAttachPhotoCell;
                }
            }
        }
        return null;
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
        MediaController.AlbumEntry albumEntry = this.selectedAlbumEntry;
        if (albumEntry == null || i2 >= albumEntry.photos.size()) {
            return null;
        }
        return this.selectedAlbumEntry.photos.get(i2);
    }

    public int getTopScrollOffset() {
        return ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.listAdditionalH;
    }

    private boolean isNoGalleryPermissions() {
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        if (activityFindActivity == null) {
            activityFindActivity = this.parentAlert.baseFragment.getParentActivity();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return false;
        }
        if (activityFindActivity == null) {
            return true;
        }
        if (i < 33 || (activityFindActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activityFindActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
            return i < 33 && activityFindActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
        }
        return true;
    }

    public void lambda$applyCameraViewPosition$17(FrameLayout.LayoutParams layoutParams) {
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.setLayoutParams(layoutParams);
        }
    }

    public void lambda$hideCamera$16() {
        this.parentAlert.getContainer().removeView(this.cameraView);
        this.cameraView = null;
    }

    public void lambda$new$1(View view) {
        this.dropDownContainer.toggleSubMenu();
    }

    public void lambda$new$2(int i, BaseFragment baseFragment, ArrayList arrayList, int i2, ChatActivity chatActivity) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.isPhotoPicker && !chatAttachAlert.isStickerMode) {
            PhotoViewer.getInstance().setParentActivity(baseFragment);
            PhotoViewer.getInstance().setMaxSelectedPhotos(0, false);
            i = 3;
        }
        PhotoViewer.getInstance().openPhotoForSelect(arrayList, i2, this.parentAlert.isPollAttach ? 13 : i, false, this.photoViewerProvider, this.parentAlert.isPollAttach ? null : chatActivity);
        PhotoViewer.getInstance().setAvatarFor(this.parentAlert.getAvatarFor());
        ChatAttachAlert chatAttachAlert2 = this.parentAlert;
        if (chatAttachAlert2.isPhotoPicker && !chatAttachAlert2.isStickerMode) {
            PhotoViewer.getInstance().closePhotoAfterSelect = false;
        } else if (chatAttachAlert2.avatarPicker != 0) {
            PhotoViewer.getInstance().closePhotoAfterSelect = true;
            PhotoViewer.getInstance().closePhotoAfterSelectWithAnimation = this.parentAlert.avatarWithBulletin != null;
        }
        if (this.parentAlert.isStickerMode) {
            PhotoViewer.getInstance().enableStickerMode(null, null, false, this.parentAlert.customStickerHandler);
        }
        if (captionForAllMedia()) {
            PhotoViewer.getInstance().setCaption(this.parentAlert.getCommentView().getText());
        }
    }

    public void lambda$new$3(boolean z, Theme.ResourcesProvider resourcesProvider, View view, int i, float f, float f2) {
        int i2;
        ChatActivity chatActivity;
        boolean z2;
        Object obj;
        long j;
        boolean z3;
        Object obj2;
        int i3 = i;
        if (this.mediaEnabled) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (chatAttachAlert.destroyed) {
                return;
            }
            BaseFragment lastFragment = chatAttachAlert.baseFragment;
            if (lastFragment == null) {
                lastFragment = LaunchActivity.getLastFragment();
            }
            BaseFragment baseFragment = lastFragment;
            if (baseFragment == null || (view instanceof GalleryEmptyView)) {
                return;
            }
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 23) {
                try {
                    if (this.adapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry && i3 == 0 && this.noCameraPermissions) {
                        baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } else if (this.noGalleryPermissions) {
                        if (i4 >= 33) {
                            baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                            return;
                        } else {
                            baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            if (this.adapter.hasCameraSpaceRow && i3 == this.itemsPerRow) {
                openCameraByClick();
                return;
            }
            if (i3 == 0 && z && this.selectedAlbumEntry == this.galleryAlbumEntry) {
                openCameraByClick();
                return;
            }
            if (this.adapter.hasCameraSpaceRow && i3 > this.itemsPerRow) {
                i3--;
            }
            if (this.selectedAlbumEntry == this.galleryAlbumEntry && z) {
                i3--;
            }
            ChatActivity chatActivity2 = null;
            if (this.showAvatarConstructor) {
                if (i3 == 0) {
                    if (!(view instanceof AvatarConstructorPreviewCell)) {
                        return;
                    }
                    showAvatarConstructorFragment((AvatarConstructorPreviewCell) view, null);
                    this.parentAlert.lambda$showGiftOfferSheet$15();
                }
                i3--;
            }
            int i5 = i3;
            ArrayList<Object> allPhotosArray = getAllPhotosArray();
            if (i5 < 0 || i5 >= allPhotosArray.size()) {
                return;
            }
            ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = this.parentAlert.delegate;
            if (chatAttachViewDelegate != null && chatAttachViewDelegate.selectItemOnClicking() && (allPhotosArray.get(i5) instanceof MediaController.PhotoEntry)) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) allPhotosArray.get(i5);
                selectedPhotos.clear();
                if (photoEntry != null) {
                    addToSelectedPhotos(photoEntry, -1);
                }
                this.parentAlert.applyCaption();
                ChatAttachAlert chatAttachAlert2 = this.parentAlert;
                chatAttachAlert2.delegate.didPressedButton(7, true, true, 0, 0, 0L, chatAttachAlert2.isCaptionAbove(), false, 0L);
                selectedPhotos.clear();
                cameraPhotos.clear();
                selectedPhotosOrder.clear();
                selectedPhotos.clear();
                return;
            }
            PhotoViewer.getInstance().setParentActivity(baseFragment, resourcesProvider);
            PhotoViewer.getInstance().setParentAlert(this.parentAlert);
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            ChatAttachAlert chatAttachAlert3 = this.parentAlert;
            photoViewer.setMaxSelectedPhotos(chatAttachAlert3.maxSelectedPhotos, chatAttachAlert3.allowOrder);
            ChatAttachAlert chatAttachAlert4 = this.parentAlert;
            if (!chatAttachAlert4.isPhotoPicker || !chatAttachAlert4.isStickerMode) {
                if (chatAttachAlert4.avatarPicker != 0) {
                    chatActivity = null;
                    i2 = 1;
                } else {
                    BaseFragment baseFragment2 = chatAttachAlert4.baseFragment;
                    if (baseFragment2 instanceof ChatActivity) {
                        chatActivity2 = (ChatActivity) baseFragment2;
                    } else if (!chatAttachAlert4.allowEnterCaption) {
                        i2 = 4;
                    }
                    chatActivity = chatActivity2;
                    i2 = 0;
                }
                if (!chatAttachAlert4.delegate.needEnterComment()) {
                    AndroidUtilities.hideKeyboard(baseFragment.getFragmentView().findFocus());
                    AndroidUtilities.hideKeyboard(this.parentAlert.getContainer().findFocus());
                }
                if (selectedPhotos.size() > 0 && selectedPhotosOrder.size() > 0) {
                    obj2 = selectedPhotos.get(selectedPhotosOrder.get(0));
                    if (obj2 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj2).caption = this.parentAlert.getCommentView().getText();
                    }
                    if (obj2 instanceof MediaController.SearchImage) {
                        ((MediaController.SearchImage) obj2).caption = this.parentAlert.getCommentView().getText();
                    }
                }
                if (this.parentAlert.getAvatarFor() != null) {
                    if (allPhotosArray.get(i5) instanceof MediaController.PhotoEntry) {
                        z3 = ((MediaController.PhotoEntry) allPhotosArray.get(i5)).isVideo;
                    } else {
                        z3 = false;
                    }
                    this.parentAlert.getAvatarFor().isVideo = z3;
                }
                z2 = !(allPhotosArray.get(i5) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) allPhotosArray.get(i5)).hasSpoiler;
                obj = allPhotosArray.get(i5);
                if ((obj instanceof MediaController.PhotoEntry) || !checkSendMediaEnabled((MediaController.PhotoEntry) obj)) {
                    if (z2) {
                        setCurrentSpoilerVisible(i5, false);
                    }
                    RichCaptionController$1$$ExternalSyntheticLambda0 richCaptionController$1$$ExternalSyntheticLambda0 = new RichCaptionController$1$$ExternalSyntheticLambda0(this, i2, baseFragment, allPhotosArray, i5, chatActivity);
                    if (z2) {
                        j = 250;
                    } else {
                        j = 0;
                    }
                    AndroidUtilities.runOnUIThread(richCaptionController$1$$ExternalSyntheticLambda0, j);
                }
                return;
            }
            BaseFragment baseFragment3 = chatAttachAlert4.baseFragment;
            i2 = 11;
            if (baseFragment3 instanceof ChatActivity) {
                chatActivity2 = (ChatActivity) baseFragment3;
            }
            chatActivity = chatActivity2;
            if (!chatAttachAlert4.delegate.needEnterComment()) {
                AndroidUtilities.hideKeyboard(baseFragment.getFragmentView().findFocus());
                AndroidUtilities.hideKeyboard(this.parentAlert.getContainer().findFocus());
            }
            if (selectedPhotos.size() > 0) {
                obj2 = selectedPhotos.get(selectedPhotosOrder.get(0));
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).caption = this.parentAlert.getCommentView().getText();
                }
                if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).caption = this.parentAlert.getCommentView().getText();
                }
            }
            if (this.parentAlert.getAvatarFor() != null) {
                if (allPhotosArray.get(i5) instanceof MediaController.PhotoEntry) {
                    z3 = ((MediaController.PhotoEntry) allPhotosArray.get(i5)).isVideo;
                } else {
                    z3 = false;
                }
                this.parentAlert.getAvatarFor().isVideo = z3;
            }
            if (allPhotosArray.get(i5) instanceof MediaController.PhotoEntry) {
            }
            obj = allPhotosArray.get(i5);
            if (obj instanceof MediaController.PhotoEntry) {
            }
            if (z2) {
                setCurrentSpoilerVisible(i5, false);
            }
            RichCaptionController$1$$ExternalSyntheticLambda0 richCaptionController$1$$ExternalSyntheticLambda1 = new RichCaptionController$1$$ExternalSyntheticLambda0(this, i2, baseFragment, allPhotosArray, i5, chatActivity);
            if (z2) {
                j = 250;
            } else {
                j = 0;
            }
            AndroidUtilities.runOnUIThread(richCaptionController$1$$ExternalSyntheticLambda1, j);
        }
    }

    public boolean lambda$new$4(View view, int i) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.storyMediaPicker) {
            return false;
        }
        if (i == 0 && this.selectedAlbumEntry == this.galleryAlbumEntry) {
            ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = chatAttachAlert.delegate;
            if (chatAttachViewDelegate != null) {
                chatAttachViewDelegate.didPressedButton(0, false, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
            }
            return true;
        }
        if (view instanceof PhotoAttachPhotoCell) {
            RecyclerViewItemRangeSelector recyclerViewItemRangeSelector = this.itemRangeSelector;
            boolean z = !((PhotoAttachPhotoCell) view).checkBox.isChecked();
            this.shouldSelect = z;
            recyclerViewItemRangeSelector.setIsActive(view, true, i, z);
        }
        return false;
    }

    public void lambda$new$5(View view) {
        if (this.cameraView == null) {
            return;
        }
        openPhotoViewer(null, false, false);
        CameraController.getInstance().stopPreview(this.cameraView.getCameraSessionObject());
    }

    public void lambda$new$6(float f) {
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            this.cameraZoom = f;
            cameraViewInternal.setZoom(f);
        }
        showZoomControls(true, true);
    }

    public void lambda$new$7(View view) {
        CameraViewInternal cameraViewInternal;
        if (this.takingPhoto || (cameraViewInternal = this.cameraView) == null || !cameraViewInternal.isInited()) {
            return;
        }
        this.canSaveCameraPreview = false;
        this.cameraView.switchCamera();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ImageView imageView = ChatAttachAlertPhotoLayout.this.switchCameraButton;
                CameraViewInternal cameraViewInternal2 = ChatAttachAlertPhotoLayout.this.cameraView;
                imageView.setImageResource((cameraViewInternal2 == null || !cameraViewInternal2.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(ChatAttachAlertPhotoLayout.this.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
            }
        });
        duration.start();
    }

    public void lambda$new$8(final View view) {
        CameraViewInternal cameraViewInternal;
        if (this.flashAnimationInProgress || (cameraViewInternal = this.cameraView) == null || !cameraViewInternal.isInited() || !this.cameraOpened) {
            return;
        }
        String currentFlashMode = this.cameraView.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = this.cameraView.getCameraSession().getNextFlashMode();
        if (currentFlashMode.equals(nextFlashMode)) {
            return;
        }
        this.cameraView.getCameraSession().setCurrentFlashMode(nextFlashMode);
        this.flashAnimationInProgress = true;
        ImageView[] imageViewArr = this.flashModeButton;
        final ImageView imageView = imageViewArr[0];
        if (imageView == view) {
            imageView = imageViewArr[1];
        }
        imageView.setVisibility(0);
        setCameraFlashModeIcon(imageView, nextFlashMode);
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {0.0f, AndroidUtilities.dp(48.0f)};
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
        Property property2 = View.ALPHA;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
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

    public static void lambda$new$9(View view, int i) {
        if (view instanceof PhotoAttachPhotoCell) {
            PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
            photoAttachPhotoCell.delegate.onCheckClick(photoAttachPhotoCell);
        }
    }

    public void lambda$onHide$28() {
        this.dropDownContainer.setVisibility(8);
    }

    public void lambda$onMenuItemClick$18(boolean z, int i, int i2) {
        this.parentAlert.applyCaption();
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.delegate.didPressedButton(7, false, z, i, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
    }

    public void lambda$onMenuItemClick$19(Long l) {
        this.parentAlert.applyCaption();
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.delegate.didPressedButton(7, false, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, l.longValue());
    }

    public void lambda$onMenuItemClick$20(boolean z, int i, int i2) {
        this.parentAlert.applyCaption();
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.delegate.didPressedButton(4, true, z, i, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
    }

    public void lambda$onMenuItemClick$21(Long l) {
        this.parentAlert.applyCaption();
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.delegate.didPressedButton(4, true, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, l.longValue());
    }

    public void lambda$onMenuItemClick$22(boolean z) {
        this.spoilerItem.setText(LocaleController.getString(z ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
        if (z) {
            this.spoilerItem.setIcon(R.drawable.msg_spoiler_off);
        } else {
            this.spoilerItem.setAnimatedIcon(R.raw.photo_spoiler);
        }
        if (z) {
            this.parentAlert.selectedMenuItem.hideSubItem(1);
            if (getSelectedItemsCount() <= 1) {
                this.parentAlert.selectedMenuItem.hideSubItem(6);
                return;
            }
            return;
        }
        this.parentAlert.selectedMenuItem.showSubItem(1);
        if (getSelectedItemsCount() <= 1) {
            this.parentAlert.selectedMenuItem.showSubItem(6);
        }
    }

    public static void lambda$onMenuItemClick$23(List list, boolean z, View view) {
        if (view instanceof PhotoAttachPhotoCell) {
            PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
            MediaController.PhotoEntry photoEntry = photoAttachPhotoCell.getPhotoEntry();
            photoAttachPhotoCell.setHasSpoiler(photoEntry != null && list.contains(Integer.valueOf(photoEntry.imageId)) && z);
        }
    }

    public void lambda$onMenuItemClick$24(boolean z) {
        this.qualityItem.setText(LocaleController.getString(z ? R.string.SendInStandardQuality : R.string.SendInHighQuality));
        if (z) {
            this.qualityItem.setIcon(R.drawable.menu_quality_sd);
        } else {
            this.qualityItem.setIcon(R.drawable.menu_quality_hd);
        }
    }

    public static void lambda$onMenuItemClick$25(List list, boolean z, View view) {
        if (view instanceof PhotoAttachPhotoCell) {
            PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
            MediaController.PhotoEntry photoEntry = photoAttachPhotoCell.getPhotoEntry();
            photoAttachPhotoCell.setHighQuality(photoEntry != null && list.contains(Integer.valueOf(photoEntry.imageId)) && z);
        }
    }

    public void lambda$onMenuItemClick$26(Long l, Runnable runnable) {
        runnable.run();
        setStarsPrice(l.longValue());
    }

    public void lambda$onPreMeasure$29() {
        this.adapter.notifyDataSetChanged();
    }

    public void lambda$onShow$27(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        int currentItemTop = attachAlertLayout.getCurrentItemTop();
        int listTopPadding = attachAlertLayout.getListTopPadding();
        RecyclerListView recyclerListView = this.gridView;
        if (currentItemTop > AndroidUtilities.dp(8.0f)) {
            listTopPadding -= currentItemTop;
        }
        recyclerListView.scrollBy(0, listTopPadding);
    }

    public void lambda$setCurrentSpoilerVisible$0(MediaController.PhotoEntry photoEntry, boolean z, View view) {
        if (view instanceof PhotoAttachPhotoCell) {
            PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
            if (photoAttachPhotoCell.getPhotoEntry() == photoEntry) {
                photoAttachPhotoCell.setHasSpoiler(z, Float.valueOf(250.0f));
                photoAttachPhotoCell.setStarsPrice(getStarsPrice(), selectedPhotos.size() > 1);
            }
        }
    }

    public void lambda$showAvatarConstructorFragment$10(AvatarConstructorFragment avatarConstructorFragment, AvatarConstructorFragment.BackgroundGradient backgroundGradient, long j, TLRPC.Document document, AvatarConstructorFragment.PreviewView previewView) {
        int i;
        MediaController.PhotoEntry photoEntry;
        VideoEditedInfo.MediaEntity mediaEntity;
        TLRPC.Document documentFindDocument;
        selectedPhotos.clear();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        GradientTools gradientTools = new GradientTools();
        if (backgroundGradient != null) {
            gradientTools.setColors(backgroundGradient.color1, backgroundGradient.color2, backgroundGradient.color3, backgroundGradient.color4);
        } else {
            int[] iArr = AvatarConstructorFragment.defaultColors[0];
            gradientTools.setColors(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        gradientTools.setBounds(0.0f, 0.0f, 800.0f, 800.0f);
        canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, gradientTools.paint);
        File file = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "avatar_background.png");
        try {
            file.createNewFile();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArray);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i2 = (int) 120.00001f;
        int i3 = (int) 560.0f;
        ImageReceiver imageReceiver = previewView.getImageReceiver();
        if (imageReceiver.getAnimation() != null) {
            Bitmap firstFrame = imageReceiver.getAnimation().getFirstFrame(null);
            ImageReceiver imageReceiver2 = new ImageReceiver();
            imageReceiver2.setImageBitmap(firstFrame);
            float f = i2;
            i = 4;
            float f2 = i3;
            imageReceiver2.setImageCoords(f, f, f2, f2);
            imageReceiver2.setRoundRadius((int) (f2 * 0.13f));
            imageReceiver2.draw(canvas);
            imageReceiver2.clearImage();
            firstFrame.recycle();
        } else {
            i = 4;
            if (imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
            }
            float f3 = i2;
            float f4 = i3;
            imageReceiver.setImageCoords(f3, f3, f4, f4);
            imageReceiver.setRoundRadius((int) (f4 * 0.13f));
            imageReceiver.draw(canvas);
        }
        File file2 = new File(FileLoader.getDirectory(i), SharedConfig.getLastLocalId() + "avatar_background.png");
        try {
            file2.createNewFile();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            fileOutputStream2.write(byteArray2);
            fileOutputStream2.flush();
            fileOutputStream2.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (previewView.hasAnimation()) {
            photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, false, 0, 0, 0L);
            photoEntry.thumbPath = file2.getPath();
            if (previewView.documentId != 0) {
                TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                tL_videoSizeEmojiMarkup.emoji_id = previewView.documentId;
                tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(previewView.backgroundGradient.color1));
                int i4 = previewView.backgroundGradient.color2;
                if (i4 != 0) {
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i4));
                }
                int i5 = previewView.backgroundGradient.color3;
                if (i5 != 0) {
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i5));
                }
                int i6 = previewView.backgroundGradient.color4;
                if (i6 != 0) {
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i6));
                }
                photoEntry.emojiMarkup = tL_videoSizeEmojiMarkup;
            } else {
                if (previewView.document != null) {
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                    TLRPC.Document document2 = previewView.document;
                    tL_videoSizeStickerMarkup.sticker_id = document2.id;
                    tL_videoSizeStickerMarkup.stickerset = MessageObject.getInputStickerSet(document2);
                    tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(previewView.backgroundGradient.color1));
                    int i7 = previewView.backgroundGradient.color2;
                    if (i7 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i7));
                    }
                    int i8 = previewView.backgroundGradient.color3;
                    if (i8 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i8));
                    }
                    int i9 = previewView.backgroundGradient.color4;
                    if (i9 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i9));
                    }
                    photoEntry.emojiMarkup = tL_videoSizeStickerMarkup;
                }
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                photoEntry.editedInfo = videoEditedInfo;
                videoEditedInfo.originalPath = file.getPath();
                VideoEditedInfo videoEditedInfo2 = photoEntry.editedInfo;
                videoEditedInfo2.resultWidth = 800;
                videoEditedInfo2.resultHeight = 800;
                videoEditedInfo2.originalWidth = 800;
                videoEditedInfo2.originalHeight = 800;
                videoEditedInfo2.isPhoto = true;
                videoEditedInfo2.bitrate = -1;
                videoEditedInfo2.muted = true;
                videoEditedInfo2.startTime = 0L;
                videoEditedInfo2.start = 0L;
                videoEditedInfo2.endTime = previewView.getDuration();
                VideoEditedInfo videoEditedInfo3 = photoEntry.editedInfo;
                videoEditedInfo3.framerate = 30;
                videoEditedInfo3.avatarStartTime = 0L;
                long j2 = videoEditedInfo3.endTime;
                videoEditedInfo3.estimatedSize = (int) ((j2 / 1000.0f) * 115200.0f);
                videoEditedInfo3.estimatedDuration = j2;
                mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                if (document == null) {
                    documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j);
                } else {
                    documentFindDocument = document;
                }
                if (documentFindDocument == null) {
                    return;
                }
                mediaEntity.viewWidth = i3;
                mediaEntity.viewHeight = i3;
                mediaEntity.width = 0.7f;
                mediaEntity.height = 0.7f;
                mediaEntity.x = 0.15f;
                mediaEntity.y = 0.15f;
                mediaEntity.document = documentFindDocument;
                mediaEntity.parentObject = null;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentFindDocument, true).getAbsolutePath();
                mediaEntity.roundRadius = 0.13f;
                if (MessageObject.isAnimatedStickerDocument(documentFindDocument, true) || MessageObject.isVideoStickerDocument(documentFindDocument)) {
                    mediaEntity.subType = (byte) (mediaEntity.subType | (MessageObject.isAnimatedStickerDocument(documentFindDocument, true) ? (byte) 1 : (byte) 4));
                }
                if (MessageObject.isTextColorEmoji(documentFindDocument)) {
                    mediaEntity.color = -1;
                    mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                }
                photoEntry.editedInfo.mediaEntities = new ArrayList<>();
                photoEntry.editedInfo.mediaEntities.add(mediaEntity);
            }
            VideoEditedInfo videoEditedInfo4 = new VideoEditedInfo();
            photoEntry.editedInfo = videoEditedInfo4;
            videoEditedInfo4.originalPath = file.getPath();
            VideoEditedInfo videoEditedInfo5 = photoEntry.editedInfo;
            videoEditedInfo5.resultWidth = 800;
            videoEditedInfo5.resultHeight = 800;
            videoEditedInfo5.originalWidth = 800;
            videoEditedInfo5.originalHeight = 800;
            videoEditedInfo5.isPhoto = true;
            videoEditedInfo5.bitrate = -1;
            videoEditedInfo5.muted = true;
            videoEditedInfo5.startTime = 0L;
            videoEditedInfo5.start = 0L;
            videoEditedInfo5.endTime = previewView.getDuration();
            VideoEditedInfo videoEditedInfo6 = photoEntry.editedInfo;
            videoEditedInfo6.framerate = 30;
            videoEditedInfo6.avatarStartTime = 0L;
            long j3 = videoEditedInfo6.endTime;
            videoEditedInfo6.estimatedSize = (int) ((j3 / 1000.0f) * 115200.0f);
            videoEditedInfo6.estimatedDuration = j3;
            mediaEntity = new VideoEditedInfo.MediaEntity();
            mediaEntity.type = (byte) 0;
            if (document == null) {
                documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j);
            } else {
                documentFindDocument = document;
            }
            if (documentFindDocument == null) {
                return;
            }
            mediaEntity.viewWidth = i3;
            mediaEntity.viewHeight = i3;
            mediaEntity.width = 0.7f;
            mediaEntity.height = 0.7f;
            mediaEntity.x = 0.15f;
            mediaEntity.y = 0.15f;
            mediaEntity.document = documentFindDocument;
            mediaEntity.parentObject = null;
            mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentFindDocument, true).getAbsolutePath();
            mediaEntity.roundRadius = 0.13f;
            if (MessageObject.isAnimatedStickerDocument(documentFindDocument, true)) {
                mediaEntity.subType = (byte) (mediaEntity.subType | (MessageObject.isAnimatedStickerDocument(documentFindDocument, true) ? (byte) 1 : (byte) 4));
            } else {
                mediaEntity.subType = (byte) (mediaEntity.subType | (MessageObject.isAnimatedStickerDocument(documentFindDocument, true) ? (byte) 1 : (byte) 4));
            }
            if (MessageObject.isTextColorEmoji(documentFindDocument)) {
                mediaEntity.color = -1;
                mediaEntity.subType = (byte) (mediaEntity.subType | 8);
            }
            photoEntry.editedInfo.mediaEntities = new ArrayList<>();
            photoEntry.editedInfo.mediaEntities.add(mediaEntity);
        } else {
            photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, false, 0, 0, 0L);
        }
        selectedPhotos.put(-1, photoEntry);
        selectedPhotosOrder.add(-1);
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.delegate.didPressedButton(7, true, false, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
        if (avatarConstructorFragment.finishOnDone) {
            return;
        }
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (baseFragment != null) {
            baseFragment.removeSelfFromStack();
        }
        avatarConstructorFragment.finishFragment();
    }

    public void lambda$showZoomControls$14() {
        showZoomControls(false, true);
        this.zoomControlHideRunnable = null;
    }

    public void lambda$showZoomControls$15() {
        showZoomControls(false, true);
        this.zoomControlHideRunnable = null;
    }

    public static int lambda$updateAlbumsDropDown$12(ArrayList arrayList, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2) {
        int iIndexOf;
        int iIndexOf2;
        int i = albumEntry.bucketId;
        if (i == 0 && albumEntry2.bucketId != 0) {
            return -1;
        }
        if ((i == 0 || albumEntry2.bucketId != 0) && (iIndexOf = arrayList.indexOf(albumEntry)) <= (iIndexOf2 = arrayList.indexOf(albumEntry2))) {
            return iIndexOf < iIndexOf2 ? -1 : 0;
        }
        return 1;
    }

    public void lambda$updateAlbumsDropDown$13(int i, View view) {
        this.parentAlert.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
        this.dropDownContainer.toggleSubMenu();
    }

    public static void lambda$updatePhotoStarsPrice$11(View view) {
        if (view instanceof PhotoAttachPhotoCell) {
            PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
            photoAttachPhotoCell.setHasSpoiler(photoAttachPhotoCell.getPhotoEntry() != null && photoAttachPhotoCell.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
            photoAttachPhotoCell.setHighQuality(photoAttachPhotoCell.getPhotoEntry() != null && photoAttachPhotoCell.getPhotoEntry().isHighQuality());
            photoAttachPhotoCell.setStarsPrice(photoAttachPhotoCell.getPhotoEntry() != null ? photoAttachPhotoCell.getPhotoEntry().starsAmount : 0L, selectedPhotos.size() > 1);
        }
    }

    public int maxCount() {
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getChatMode() == 5) {
            return this.parentAlert.baseFragment.getMessagesController().config.quickReplyMessagesLimit.get() - ((ChatActivity) this.parentAlert.baseFragment).messages.size();
        }
        return Integer.MAX_VALUE;
    }

    public void onPhotoEditModeChanged(boolean z) {
    }

    public void openCamera(boolean z) {
        CameraViewInternal cameraViewInternal;
        if (this.cameraView == null || this.cameraInitAnimation != null || this.parentAlert.isDismissed()) {
            return;
        }
        this.cameraView.initTexture();
        if (shouldLoadAllMedia()) {
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
        if (this.parentAlert.getCommentView().isKeyboardVisible() && isFocusable()) {
            this.parentAlert.getCommentView().closeKeyboard();
        }
        this.zoomControlView.setVisibility(0);
        this.zoomControlView.setAlpha(0.0f);
        this.cameraPanel.setVisibility(0);
        this.cameraPanel.setTag(null);
        int[] iArr = this.animateCameraValues;
        iArr[0] = 0;
        int i = this.itemSize;
        iArr[1] = i;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i * 2);
        this.additionCloseCameraY = 0.0f;
        this.cameraExpanded = true;
        CameraViewInternal cameraViewInternal2 = this.cameraView;
        if (cameraViewInternal2 != null) {
            cameraViewInternal2.setFpsLimit(-1);
        }
        AndroidUtilities.hideKeyboard(this);
        AndroidUtilities.setLightNavigationBar((Dialog) this.parentAlert, false);
        this.parentAlert.getWindow().addFlags(128);
        if (z) {
            setCameraOpenProgress(0.0f);
            this.cameraAnimationInProgress = true;
            RecyclerListView recyclerListView = this.gridView;
            if (recyclerListView != null) {
                recyclerListView.invalidate();
            }
            this.notificationsLocker.lock();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.cameraPanel, (Property<FrameLayout, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.counterTextView, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.cameraPhotoRecyclerView, (Property<RecyclerListView, Float>) property, 1.0f));
            for (int i2 = 0; i2 < 2; i2++) {
                if (this.flashModeButton[i2].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(this.flashModeButton[i2], (Property<ImageView, Float>) property, 1.0f));
                    break;
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatAttachAlertPhotoLayout.this.notificationsLocker.unlock();
                    ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress = false;
                    CameraViewInternal cameraViewInternal3 = ChatAttachAlertPhotoLayout.this.cameraView;
                    if (cameraViewInternal3 != null) {
                        cameraViewInternal3.invalidateOutline();
                        ChatAttachAlertPhotoLayout.this.cameraView.invalidate();
                    }
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                    if (chatAttachAlertPhotoLayout.cameraOpened) {
                        chatAttachAlertPhotoLayout.parentAlert.delegate.onCameraOpened();
                    }
                    CameraViewInternal cameraViewInternal4 = ChatAttachAlertPhotoLayout.this.cameraView;
                    if (cameraViewInternal4 != null) {
                        cameraViewInternal4.setSystemUiVisibility(1028);
                    }
                    RecyclerListView recyclerListView2 = ChatAttachAlertPhotoLayout.this.gridView;
                    if (recyclerListView2 != null) {
                        recyclerListView2.invalidate();
                    }
                }
            });
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            this.cameraPanel.setAlpha(1.0f);
            this.counterTextView.setAlpha(1.0f);
            this.cameraPhotoRecyclerView.setAlpha(1.0f);
            for (int i3 = 0; i3 < 2; i3++) {
                if (this.flashModeButton[i3].getVisibility() == 0) {
                    this.flashModeButton[i3].setAlpha(1.0f);
                    break;
                }
            }
            this.parentAlert.delegate.onCameraOpened();
            CameraViewInternal cameraViewInternal3 = this.cameraView;
            if (cameraViewInternal3 != null) {
                cameraViewInternal3.setSystemUiVisibility(1028);
            }
        }
        this.cameraOpened = true;
        CameraViewInternal cameraViewInternal4 = this.cameraView;
        if (cameraViewInternal4 != null) {
            cameraViewInternal4.setImportantForAccessibility(2);
        }
        this.gridView.setImportantForAccessibility(4);
        this.gridView.invalidate();
        if (LiteMode.isEnabled(360928) || (cameraViewInternal = this.cameraView) == null || !cameraViewInternal.isInited()) {
            return;
        }
        this.cameraView.showTexture(true, z);
    }

    private void openCameraByClick() {
        if (SharedConfig.inappCamera) {
            openCamera(true);
            return;
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = chatAttachAlert.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.didPressedButton(0, false, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
        }
    }

    public void openCameraWithPermissionCheck() {
        if (Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(this.parentAlert.baseFragment.getParentActivity(), "android.permission.CAMERA") == 0) {
            openCameraByClick();
        } else {
            try {
                this.parentAlert.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
            } catch (Exception unused) {
            }
        }
    }

    public void pauseCameraPreview() {
        try {
            if (this.cameraView != null) {
                CameraController.getInstance().stopPreview(this.cameraView.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private boolean processTouchEvent(MotionEvent motionEvent) {
        CameraViewInternal cameraViewInternal;
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
            int actionMasked = motionEvent.getActionMasked();
            Property property = View.ALPHA;
            if (actionMasked == 2) {
                if (this.zooming && motionEvent.getPointerCount() == 2 && !this.dragging) {
                    float fHypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                    if (this.zoomWas) {
                        if (this.cameraView != null) {
                            float fDp = (fHypot - this.pinchStartDistance) / AndroidUtilities.dp(100.0f);
                            this.pinchStartDistance = fHypot;
                            float f = this.cameraZoom + fDp;
                            this.cameraZoom = f;
                            if (f < 0.0f) {
                                this.cameraZoom = 0.0f;
                            } else if (f > 1.0f) {
                                this.cameraZoom = 1.0f;
                            }
                            this.zoomControlView.setZoom(this.cameraZoom, false);
                            this.parentAlert.getSheetContainer().invalidate();
                            this.cameraView.setZoom(this.cameraZoom);
                            showZoomControls(true, true);
                        }
                    } else if (Math.abs(fHypot - this.pinchStartDistance) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                        this.pinchStartDistance = fHypot;
                        this.zoomWas = true;
                    }
                } else {
                    float y = motionEvent.getY();
                    float f2 = y - this.lastY;
                    if (this.maybeStartDraging) {
                        if (Math.abs(f2) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                            this.maybeStartDraging = false;
                            this.dragging = true;
                        }
                    } else if (this.dragging && (cameraViewInternal = this.cameraView) != null) {
                        cameraViewInternal.setTranslationY(cameraViewInternal.getTranslationY() + f2);
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
                            animatorSet.playTogether(ObjectAnimator.ofFloat(this.cameraPanel, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.zoomControlView, (Property<ZoomControlView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.counterTextView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.flashModeButton[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.flashModeButton[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.cameraPhotoRecyclerView, (Property<RecyclerListView, Float>) property, 0.0f));
                            animatorSet.setDuration(220L);
                            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            animatorSet.start();
                        }
                    }
                }
            } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                this.pressed = false;
                this.zooming = false;
                if (this.dragging) {
                    this.dragging = false;
                    CameraViewInternal cameraViewInternal2 = this.cameraView;
                    if (cameraViewInternal2 != null) {
                        if (Math.abs(cameraViewInternal2.getTranslationY()) > this.cameraView.getMeasuredHeight() / 6.0f) {
                            closeCamera(true);
                        } else {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.cameraView, (Property<CameraViewInternal, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(this.cameraPanel, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.counterTextView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.flashModeButton[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.flashModeButton[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.cameraPhotoRecyclerView, (Property<RecyclerListView, Float>) property, 1.0f));
                            animatorSet2.setDuration(250L);
                            animatorSet2.setInterpolator(this.interpolator);
                            animatorSet2.start();
                            this.cameraPanel.setTag(null);
                        }
                    }
                } else {
                    CameraViewInternal cameraViewInternal3 = this.cameraView;
                    if (cameraViewInternal3 != null && !this.zoomWas) {
                        cameraViewInternal3.getLocationOnScreen(this.viewPosition);
                        this.cameraView.focusToPoint((int) (motionEvent.getRawX() - this.viewPosition[0]), (int) (motionEvent.getRawY() - this.viewPosition[1]));
                    }
                }
            }
        }
        return true;
    }

    public void requestGalleryPermission() {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                this.parentAlert.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
            } else if (i >= 23) {
                this.parentAlert.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            }
        } catch (Exception unused) {
        }
    }

    public void resetRecordState() {
        if (this.parentAlert.destroyed) {
            return;
        }
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
        AndroidUtilities.unlockOrientation(AndroidUtilities.findActivity(getContext()));
    }

    public void resumeCameraPreview() {
        try {
            checkCamera(false);
            if (this.cameraView != null) {
                CameraController.getInstance().startPreview(this.cameraView.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void saveLastCameraBitmap() {
        if (this.canSaveCameraPreview) {
            try {
                Bitmap bitmap = this.cameraView.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.cameraView.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                    if (bitmapCreateScaledBitmap != null) {
                        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                            bitmapCreateBitmap.recycle();
                        }
                        Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        bitmapCreateScaledBitmap.recycle();
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setCameraFlashModeIcon(ImageView imageView, String str) {
        str.getClass();
        switch (str) {
            case "on":
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
                break;
            case "off":
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
                break;
            case "auto":
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                break;
        }
    }

    public void setCurrentSpoilerVisible(int i, final boolean z) {
        PhotoViewer photoViewer = PhotoViewer.getInstance();
        if (i == -1) {
            i = photoViewer.getCurrentIndex();
        }
        List<Object> imagesArrLocals = photoViewer.getImagesArrLocals();
        if (imagesArrLocals == null || imagesArrLocals.isEmpty() || i >= imagesArrLocals.size() || !(imagesArrLocals.get(i) instanceof MediaController.PhotoEntry) || !((MediaController.PhotoEntry) imagesArrLocals.get(i)).hasSpoiler) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) imagesArrLocals.get(i);
        this.gridView.forAllChild(new Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.lambda$setCurrentSpoilerVisible$0(photoEntry, z, (View) obj);
            }
        });
    }

    private boolean shouldLoadAllMedia() {
        if (this.includeVideosInGallery) {
            return true;
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.isPhotoPicker) {
            return false;
        }
        return (chatAttachAlert.baseFragment instanceof ChatActivity) || chatAttachAlert.storyMediaPicker || chatAttachAlert.avatarPicker == 2;
    }

    public void showZoomControls(boolean z, boolean z2) {
        if ((this.zoomControlView.getTag() != null && z) || (this.zoomControlView.getTag() == null && !z)) {
            if (z) {
                Runnable runnable = this.zoomControlHideRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12 chatAttachAlertPhotoLayout$$ExternalSyntheticLambda12 = new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(this, 4);
                this.zoomControlHideRunnable = chatAttachAlertPhotoLayout$$ExternalSyntheticLambda12;
                AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout$$ExternalSyntheticLambda12, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.zoomControlAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.zoomControlView.setTag(z ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.zoomControlAnimation = animatorSet2;
        animatorSet2.setDuration(180L);
        this.zoomControlAnimation.playTogether(ObjectAnimator.ofFloat(this.zoomControlView, (Property<ZoomControlView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.zoomControlAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChatAttachAlertPhotoLayout.this.zoomControlAnimation = null;
            }
        });
        this.zoomControlAnimation.start();
        if (z) {
            ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12 chatAttachAlertPhotoLayout$$ExternalSyntheticLambda13 = new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(this, 5);
            this.zoomControlHideRunnable = chatAttachAlertPhotoLayout$$ExternalSyntheticLambda13;
            AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout$$ExternalSyntheticLambda13, 2000L);
        }
    }

    private void updateAlbumsDropDown() {
        this.dropDownContainer.removeAllSubItems();
        if (this.mediaEnabled) {
            ArrayList<MediaController.AlbumEntry> arrayList = shouldLoadAllMedia() ? MediaController.allMediaAlbums : MediaController.allPhotoAlbums;
            ArrayList<MediaController.AlbumEntry> arrayList2 = new ArrayList<>(arrayList);
            this.dropDownAlbums = arrayList2;
            Collections.sort(arrayList2, new EmojiView$23$$ExternalSyntheticLambda1(arrayList, 1));
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
            MediaController.AlbumEntry albumEntry = this.dropDownAlbums.get(i);
            AlbumButton albumButton = new AlbumButton(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.resourcesProvider);
            this.dropDownContainer.getPopupLayout().addView(albumButton);
            albumButton.setOnClickListener(new ReportAlert$$ExternalSyntheticLambda1(this, i + 10, 4));
        }
    }

    public void updateCells() {
        if (this.gridView != null) {
            for (int i = 0; i < this.gridView.getChildCount(); i++) {
                View childAt = this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    ((PhotoAttachPhotoCell) childAt).imageView.invalidate();
                }
            }
        }
    }

    private void updatePhotoStarsPrice() {
        this.gridView.forAllChild(new SearchTagsList$$ExternalSyntheticLambda2(1));
    }

    private void updateStarsItem() {
        if (this.starsItem == null) {
            return;
        }
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            this.starsItem.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
            this.starsItem.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
        } else {
            this.starsItem.setText(LocaleController.getString(R.string.PaidMediaButton));
            this.starsItem.setSubtext(null);
        }
    }

    @Override
    public void applyCaption(CharSequence charSequence) {
        Object obj;
        for (int i = 0; i < selectedPhotosOrder.size(); i++) {
            if (i == 0) {
                Object obj2 = selectedPhotosOrder.get(i);
                Object obj3 = selectedPhotos.get(obj2);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntryClone = ((MediaController.PhotoEntry) obj3).clone();
                    CharSequence[] charSequenceArr = {charSequence};
                    photoEntryClone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                    photoEntryClone.caption = charSequenceArr[0];
                    obj = photoEntryClone;
                } else if (obj3 instanceof MediaController.SearchImage) {
                    obj = obj3;
                    MediaController.SearchImage searchImageClone = ((MediaController.SearchImage) obj3).clone();
                    CharSequence[] charSequenceArr2 = {charSequence};
                    searchImageClone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr2, false);
                    searchImageClone.caption = charSequenceArr2[0];
                    obj = searchImageClone;
                }
                obj = obj3;
                selectedPhotos.put(obj2, obj);
            }
        }
    }

    public boolean areLivePhotosEnabled() {
        if (selectedPhotos.isEmpty()) {
            return false;
        }
        for (Map.Entry<Object, Object> entry : selectedPhotos.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                if (photoEntry.isLivePhoto() && photoEntry.isUnalivePhoto()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean canDismissWithTouchOutside() {
        return !this.cameraOpened;
    }

    @Override
    public boolean canScheduleMessages() {
        Iterator<Map.Entry<Object, Object>> it = selectedPhotos.entrySet().iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            if (value instanceof MediaController.PhotoEntry) {
                if (((MediaController.PhotoEntry) value).ttl != 0) {
                    return false;
                }
            } else if ((value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean captionForAllMedia() {
        int i = 0;
        for (int i2 = 0; i2 < selectedPhotosOrder.size(); i2++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i2));
            if (!TextUtils.isEmpty(obj instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) obj).caption : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).caption : null)) {
                i++;
            }
        }
        return i <= 1;
    }

    public void checkCamera(boolean z) {
        PhotoAttachAdapter photoAttachAdapter;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.destroyed || !this.needCamera) {
            return;
        }
        boolean z2 = this.deviceHasGoodCamera;
        boolean z3 = this.noCameraPermissions;
        BaseFragment lastFragment = chatAttachAlert.baseFragment;
        if (lastFragment == null) {
            lastFragment = LaunchActivity.getLastFragment();
        }
        if (lastFragment == null || lastFragment.getParentActivity() == null) {
            return;
        }
        if (!SharedConfig.inappCamera) {
            this.deviceHasGoodCamera = false;
        } else if (Build.VERSION.SDK_INT >= 23) {
            boolean z4 = lastFragment.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
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
        if ((z2 != this.deviceHasGoodCamera || z3 != this.noCameraPermissions) && (photoAttachAdapter = this.adapter) != null) {
            photoAttachAdapter.notifyDataSetChanged();
        }
        ChatAttachAlert chatAttachAlert2 = this.parentAlert;
        if (chatAttachAlert2.destroyed || !chatAttachAlert2.isShowing() || !this.deviceHasGoodCamera || this.parentAlert.getBackDrawable().getAlpha() == 0 || this.cameraOpened) {
            return;
        }
        showCamera();
    }

    public void checkCameraViewPosition() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        TextView textView;
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().stickerMakerView != null && PhotoViewer.getInstance().stickerMakerView.isThanosInProgress) {
            return;
        }
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.invalidateOutline();
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = this.gridView.findViewHolderForAdapterPosition(this.itemsPerRow - 1);
        if (viewHolderFindViewHolderForAdapterPosition2 != null) {
            viewHolderFindViewHolderForAdapterPosition2.itemView.invalidateOutline();
        }
        if ((!this.adapter.needCamera || !this.deviceHasGoodCamera || this.selectedAlbumEntry != this.galleryAlbumEntry) && (viewHolderFindViewHolderForAdapterPosition = this.gridView.findViewHolderForAdapterPosition(0)) != null) {
            viewHolderFindViewHolderForAdapterPosition.itemView.invalidateOutline();
        }
        CameraViewInternal cameraViewInternal2 = this.cameraView;
        if (cameraViewInternal2 != null) {
            cameraViewInternal2.invalidate();
        }
        if (Build.VERSION.SDK_INT >= 23 && (textView = this.recordTime) != null) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = getRootWindowInsets() == null ? AndroidUtilities.dp(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
        }
        if (this.deviceHasGoodCamera) {
            int childCount = this.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachCameraCell) {
                    if (!childAt.isAttachedToWindow()) {
                        break;
                    }
                    float y = getY() + this.gridView.getY() + childAt.getY();
                    float y2 = this.parentAlert.getSheetContainer().getY() + y;
                    float x = this.parentAlert.getSheetContainer().getX() + getX() + this.gridView.getX() + childAt.getX();
                    if (Build.VERSION.SDK_INT >= 23) {
                        x -= getRootWindowInsets().getSystemWindowInsetLeft();
                    }
                    float alpha = (this.parentAlert.topCommentContainer.getAlpha() * this.parentAlert.topCommentContainer.getMeasuredHeight()) + ActionBar.getCurrentActionBarHeight() + (!this.parentAlert.inBubbleMode ? AndroidUtilities.statusBarHeight : 0);
                    MentionsContainerView mentionsContainerView = this.parentAlert.mentionContainer;
                    if (mentionsContainerView != null && mentionsContainerView.isReversed()) {
                        alpha = Math.max(alpha, (this.parentAlert.mentionContainer.clipTop() + this.parentAlert.mentionContainer.getY()) - this.parentAlert.currentPanTranslationY);
                    }
                    float f = y < alpha ? alpha - y : 0.0f;
                    if (f != this.cameraViewOffsetY) {
                        this.cameraViewOffsetY = f;
                        CameraViewInternal cameraViewInternal3 = this.cameraView;
                        if (cameraViewInternal3 != null) {
                            cameraViewInternal3.invalidateOutline();
                            this.cameraView.invalidate();
                        }
                    }
                    float translationY = (int) (this.parentAlert.buttonsRecyclerView.getTranslationY() + (this.parentAlert.getSheetContainer().getMeasuredHeight() - this.parentAlert.buttonsRecyclerView.getMeasuredHeight()));
                    MentionsContainerView mentionsContainerView2 = this.parentAlert.mentionContainer;
                    if (mentionsContainerView2 != null) {
                        translationY -= mentionsContainerView2.clipBottom() - AndroidUtilities.dp(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y > translationY) {
                        this.cameraViewOffsetBottomY = Math.min(-AndroidUtilities.dp(5.0f), y - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.cameraViewOffsetBottomY = 0.0f;
                    }
                    float[] fArr = this.cameraViewLocation;
                    fArr[0] = x;
                    fArr[1] = y2;
                    applyCameraViewPosition();
                    return;
                }
            }
            if (this.cameraViewOffsetY != 0.0f || this.cameraViewOffsetX != 0.0f) {
                this.cameraViewOffsetX = 0.0f;
                this.cameraViewOffsetY = 0.0f;
                CameraViewInternal cameraViewInternal4 = this.cameraView;
                if (cameraViewInternal4 != null) {
                    cameraViewInternal4.invalidateOutline();
                    this.cameraView.invalidate();
                }
            }
            this.cameraViewLocation[0] = AndroidUtilities.dp(-400.0f);
            this.cameraViewLocation[1] = 0.0f;
            applyCameraViewPosition();
        }
    }

    @Override
    public void checkColors() {
        int i = this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack;
        this.progressView.setTextColor(getThemedColor(Theme.key_emptyListPlaceholder));
        this.gridView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.gridView.findViewHolderForAdapterPosition(0);
        this.dropDown.setTextColor(getThemedColor(i));
        this.dropDownContainer.setPopupItemsColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_actionBarDefaultSubmenuItem), false);
        this.dropDownContainer.setPopupItemsColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_actionBarDefaultSubmenuItem), true);
        this.dropDownContainer.redrawPopup(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarUnscrolled : Theme.key_actionBarDefaultSubmenuBackground));
        Theme.setDrawableColor(getThemedColor(i), this.dropDownDrawable);
    }

    public void checkStorage() {
        if (!this.noGalleryPermissions || Build.VERSION.SDK_INT < 23) {
            return;
        }
        boolean zIsNoGalleryPermissions = isNoGalleryPermissions();
        this.noGalleryPermissions = zIsNoGalleryPermissions;
        if (!zIsNoGalleryPermissions) {
            loadGalleryPhotos();
        }
        this.adapter.notifyDataSetChanged();
        this.cameraAttachAdapter.notifyDataSetChanged();
    }

    public void clearSelectedPhotos() {
        this.spoilerItem.setText(LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.spoilerItem.setAnimatedIcon(R.raw.photo_spoiler);
        this.parentAlert.selectedMenuItem.showSubItem(1);
        if (!selectedPhotos.isEmpty()) {
            Iterator<Map.Entry<Object, Object>> it = selectedPhotos.entrySet().iterator();
            while (it.hasNext()) {
                ((MediaController.PhotoEntry) it.next().getValue()).reset();
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

    public void closeCamera(boolean z) {
        CameraViewInternal cameraViewInternal;
        if (this.takingPhoto || this.cameraView == null) {
            return;
        }
        int[] iArr = this.animateCameraValues;
        int i = this.itemSize;
        iArr[1] = i;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i * 2);
        Runnable runnable = this.zoomControlHideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.zoomControlHideRunnable = null;
        }
        AndroidUtilities.setLightNavigationBar(this.parentAlert, ((double) AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundGray))) > 0.721d);
        if (z) {
            this.additionCloseCameraY = this.cameraView.getTranslationY();
            this.cameraAnimationInProgress = true;
            RecyclerListView recyclerListView = this.gridView;
            if (recyclerListView != null) {
                recyclerListView.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.cameraPanel, (Property<FrameLayout, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.zoomControlView, (Property<ZoomControlView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.counterTextView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.cameraPhotoRecyclerView, (Property<RecyclerListView, Float>) property, 0.0f));
            for (int i2 = 0; i2 < 2; i2++) {
                if (this.flashModeButton[i2].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(this.flashModeButton[i2], (Property<ImageView, Float>) property, 0.0f));
                    break;
                }
            }
            this.notificationsLocker.lock();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatAttachAlertPhotoLayout.this.notificationsLocker.unlock();
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                    chatAttachAlertPhotoLayout.cameraExpanded = false;
                    chatAttachAlertPhotoLayout.parentAlert.getWindow().clearFlags(128);
                    ChatAttachAlertPhotoLayout.this.setCameraOpenProgress(0.0f);
                    ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress = false;
                    RecyclerListView recyclerListView2 = ChatAttachAlertPhotoLayout.this.gridView;
                    if (recyclerListView2 != null) {
                        recyclerListView2.invalidate();
                    }
                    CameraViewInternal cameraViewInternal2 = ChatAttachAlertPhotoLayout.this.cameraView;
                    if (cameraViewInternal2 != null) {
                        cameraViewInternal2.invalidateOutline();
                        ChatAttachAlertPhotoLayout.this.cameraView.invalidate();
                    }
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                    chatAttachAlertPhotoLayout2.cameraOpened = false;
                    if (chatAttachAlertPhotoLayout2.cameraPanel != null) {
                        ChatAttachAlertPhotoLayout.this.cameraPanel.setVisibility(8);
                    }
                    if (ChatAttachAlertPhotoLayout.this.zoomControlView != null) {
                        ChatAttachAlertPhotoLayout.this.zoomControlView.setVisibility(8);
                        ChatAttachAlertPhotoLayout.this.zoomControlView.setTag(null);
                    }
                    if (ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView != null) {
                        ChatAttachAlertPhotoLayout.this.cameraPhotoRecyclerView.setVisibility(8);
                    }
                    CameraViewInternal cameraViewInternal3 = ChatAttachAlertPhotoLayout.this.cameraView;
                    if (cameraViewInternal3 != null) {
                        cameraViewInternal3.setFpsLimit(30);
                        ChatAttachAlertPhotoLayout.this.cameraView.setSystemUiVisibility(1024);
                    }
                }
            });
            animatorSet.start();
        } else {
            this.cameraExpanded = false;
            this.parentAlert.getWindow().clearFlags(128);
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
            for (int i3 = 0; i3 < 2; i3++) {
                if (this.flashModeButton[i3].getVisibility() == 0) {
                    this.flashModeButton[i3].setAlpha(0.0f);
                    break;
                }
            }
            this.cameraOpened = false;
            CameraViewInternal cameraViewInternal2 = this.cameraView;
            if (cameraViewInternal2 != null) {
                cameraViewInternal2.setFpsLimit(30);
                this.cameraView.setSystemUiVisibility(1024);
            }
            RecyclerListView recyclerListView2 = this.gridView;
            if (recyclerListView2 != null) {
                recyclerListView2.invalidate();
            }
        }
        CameraViewInternal cameraViewInternal3 = this.cameraView;
        if (cameraViewInternal3 != null) {
            cameraViewInternal3.setImportantForAccessibility(0);
        }
        this.gridView.setImportantForAccessibility(0);
        if (LiteMode.isEnabled(360928) || (cameraViewInternal = this.cameraView) == null) {
            return;
        }
        cameraViewInternal.showTexture(false, z);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ChatAttachAlert chatAttachAlert;
        if (i != NotificationCenter.albumsDidLoad) {
            if (i == NotificationCenter.cameraInitied) {
                checkCamera(false);
                return;
            }
            return;
        }
        if (this.adapter != null) {
            if (shouldLoadAllMedia()) {
                this.galleryAlbumEntry = MediaController.allMediaAlbumEntry;
            } else {
                this.galleryAlbumEntry = MediaController.allPhotosAlbumEntry;
            }
            if (this.selectedAlbumEntry == null || ((chatAttachAlert = this.parentAlert) != null && chatAttachAlert.isStickerMode)) {
                this.selectedAlbumEntry = this.galleryAlbumEntry;
            } else if (shouldLoadAllMedia()) {
                for (int i3 = 0; i3 < MediaController.allMediaAlbums.size(); i3++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i3);
                    int i4 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.selectedAlbumEntry;
                    if (i4 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.selectedAlbumEntry = albumEntry;
                        break;
                    }
                }
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
    }

    public ArrayList<Object> getAllPhotosArray() {
        if (this.selectedAlbumEntry == null) {
            return !cameraPhotos.isEmpty() ? cameraPhotos : new ArrayList<>(0);
        }
        if (cameraPhotos.isEmpty()) {
            return this.selectedAlbumEntry.photos;
        }
        ArrayList<Object> arrayList = new ArrayList<>(cameraPhotos.size() + this.selectedAlbumEntry.photos.size());
        arrayList.addAll(cameraPhotos);
        arrayList.addAll(this.selectedAlbumEntry.photos);
        return arrayList;
    }

    @Override
    public int getButtonsHideOffset() {
        return ActionBar.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.cameraOpenProgress;
    }

    @Override
    public int getCurrentItemTop() {
        if (this.gridView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.gridView;
            int paddingTop = recyclerListView.getPaddingTop();
            this.currentItemTop = paddingTop;
            recyclerListView.setTopGlowOffset(paddingTop);
            this.progressView.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - this.listAdditionalH;
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        this.progressView.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - this.progressView.getMeasuredHeight()) / 2.0f) + top);
        this.gridView.setTopGlowOffset(top);
        this.currentItemTop = top;
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.gridView.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return selectedPhotosOrder.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return selectedPhotos;
    }

    public int getSelectedPhotosCount() {
        int i = 0;
        for (Object obj : selectedPhotos.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoEntry.isVideo && photoEntry.editedInfo == null) {
                    i++;
                }
            }
        }
        return i;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i = 0;
        for (Object obj : selectedPhotos.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isHighQuality() && !photoEntry.isVideo && photoEntry.editedInfo == null) {
                    i++;
                }
            }
        }
        return i;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return selectedPhotosOrder;
    }

    public long getStarsPrice() {
        Iterator<Map.Entry<Object, Object>> it = selectedPhotos.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) it.next().getValue()).starsAmount;
        }
        return 0L;
    }

    public boolean hasLivePhotos() {
        if (selectedPhotos.isEmpty()) {
            return false;
        }
        for (Map.Entry<Object, Object> entry : selectedPhotos.entrySet()) {
            if ((entry.getValue() instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) entry.getValue()).isLivePhoto()) {
                return true;
            }
        }
        return false;
    }

    public void hideCamera(boolean z) {
        if (!this.deviceHasGoodCamera || this.cameraView == null) {
            return;
        }
        saveLastCameraBitmap();
        this.cameraViewItemDecoration.updateBitmap();
        this.cameraView.destroy(z, null);
        AnimatorSet animatorSet = this.cameraInitAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.cameraInitAnimation = null;
        }
        AndroidUtilities.runOnUIThread(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(this, 0), 300L);
        this.canSaveCameraPreview = false;
    }

    public void loadGalleryPhotos() {
        if ((shouldLoadAllMedia() ? MediaController.allMediaAlbumEntry : MediaController.allPhotosAlbumEntry) == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    @Override
    public int needsActionBar() {
        return 1;
    }

    public void onActivityResultFragment(int i, Intent intent, String str) {
        String path;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i2;
        int i3;
        String str2 = str;
        if (this.parentAlert.destroyed) {
            return;
        }
        mediaFromExternalCamera = true;
        if (i == 0) {
            PhotoViewer.getInstance().setParentActivity(this.parentAlert.baseFragment.getParentActivity(), this.resourcesProvider);
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            photoViewer.setMaxSelectedPhotos(chatAttachAlert.maxSelectedPhotos, chatAttachAlert.allowOrder);
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str2);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str2).getAbsolutePath(), options);
                i2 = options.outWidth;
                try {
                    i3 = options.outHeight;
                } catch (Exception unused) {
                    i3 = 0;
                }
            } catch (Exception unused2) {
                i2 = 0;
            }
            int i4 = i2;
            int i5 = lastImageId;
            lastImageId = i5 - 1;
            MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i5, 0L, str2, ((Integer) imageOrientation.first).intValue(), false, i4, i3, 0L).setOrientation(imageOrientation);
            orientation.canDeleteAfter = true;
            openPhotoViewer(orientation, false, true);
            return;
        }
        if (i != 2) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("pic path " + str2);
        }
        String absolutePath = null;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        Intent intent2 = (intent == null || str2 == null || !Theme.ResourcesProvider.CC.m(str2)) ? intent : null;
        if (intent2 != null) {
            Uri data = intent2.getData();
            if (data == null) {
                path = str2;
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("video record uri " + data.toString());
                }
                path = AndroidUtilities.getPath(data);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("resolved path = " + path);
                }
                if (path == null || !Theme.ResourcesProvider.CC.m(path)) {
                    path = str2;
                }
            }
            BaseFragment baseFragment = this.parentAlert.baseFragment;
            if (!(baseFragment instanceof ChatActivity) || !((ChatActivity) baseFragment).isSecretChat()) {
                AndroidUtilities.addMediaToGallery(str2);
            }
            str2 = null;
        } else {
            path = null;
        }
        if (path != null || str2 == null || !Theme.ResourcesProvider.CC.m(str2)) {
            str2 = path;
        }
        long jCeil = 0;
        try {
            try {
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(str2);
                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                            jCeil = strExtractMetadata != null ? (int) Math.ceil(Long.parseLong(strExtractMetadata) / 1000.0f) : 0L;
                            mediaMetadataRetriever.release();
                        } catch (Exception e) {
                            e = e;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            FileLog.e(e);
                            if (mediaMetadataRetriever2 != null) {
                                mediaMetadataRetriever2.release();
                            }
                            Bitmap bitmapCreateVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str2, 1);
                            File file = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                            bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file));
                            SharedConfig.saveConfig();
                            int i6 = lastImageId;
                            lastImageId = i6 - 1;
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i6, 0L, str2, 0, true, bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), 0L);
                            photoEntry.duration = (int) jCeil;
                            absolutePath = file.getAbsolutePath();
                            photoEntry.thumbPath = absolutePath;
                            openPhotoViewer(photoEntry, false, true);
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (mediaMetadataRetriever == 0) {
                                throw th2;
                            }
                            try {
                                mediaMetadataRetriever.release();
                                throw th2;
                            } catch (Exception e2) {
                                FileLog.e(e2);
                                throw th2;
                            }
                        }
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file));
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
            Bitmap bitmapCreateVideoThumbnail2 = SendMessagesHelper.createVideoThumbnail(str2, 1);
            File file2 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
            SharedConfig.saveConfig();
            int i7 = lastImageId;
            lastImageId = i7 - 1;
            MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i7, 0L, str2, 0, true, bitmapCreateVideoThumbnail2.getWidth(), bitmapCreateVideoThumbnail2.getHeight(), 0L);
            photoEntry2.duration = (int) jCeil;
            absolutePath = file2.getAbsolutePath();
            photoEntry2.thumbPath = absolutePath;
            openPhotoViewer(photoEntry2, false, true);
        } catch (Throwable th4) {
            th = th4;
            mediaMetadataRetriever = absolutePath;
        }
    }

    @Override
    public void onButtonsTranslationYUpdated() {
        checkCameraViewPosition();
        invalidate();
    }

    @Override
    public void onContainerTranslationUpdated(float f) {
        this.currentPanTranslationY = f;
        checkCameraViewPosition();
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.invalidateOutline();
            this.cameraView.invalidate();
        }
        invalidate();
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

    @Override
    public boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        int iDp;
        int measuredWidth;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean z = i5 < i6;
        int i7 = AndroidUtilities.navigationBarHeight;
        if (view == this.cameraPanel) {
            if (z) {
                if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                    this.cameraPanel.layout(0, RichMessageLayout$$ExternalSyntheticOutline1.m(222.0f, i4, i7), i5, RichMessageLayout$$ExternalSyntheticOutline1.m(96.0f, i4, i7));
                } else {
                    this.cameraPanel.layout(0, RichMessageLayout$$ExternalSyntheticOutline1.m(126.0f, i4, i7), i5, i4 - i7);
                }
            } else if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                this.cameraPanel.layout(RichMessageLayout$$ExternalSyntheticOutline1.m(222.0f, i3, i7), 0, i3 - AndroidUtilities.dp(96.0f), i6 - i7);
            } else {
                this.cameraPanel.layout(RichMessageLayout$$ExternalSyntheticOutline1.m(126.0f, i3, i7), 0, i3, i6 - i7);
            }
            return true;
        }
        if (view == this.zoomControlView) {
            if (z) {
                if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                    this.zoomControlView.layout(0, RichMessageLayout$$ExternalSyntheticOutline1.m(310.0f, i4, i7), i5, RichMessageLayout$$ExternalSyntheticOutline1.m(260.0f, i4, i7));
                } else {
                    this.zoomControlView.layout(0, RichMessageLayout$$ExternalSyntheticOutline1.m(176.0f, i4, i7), i5, RichMessageLayout$$ExternalSyntheticOutline1.m(126.0f, i4, i7));
                }
            } else if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                this.zoomControlView.layout(RichMessageLayout$$ExternalSyntheticOutline1.m(310.0f, i3, i7), 0, i3 - AndroidUtilities.dp(260.0f), i6 - i7);
            } else {
                this.zoomControlView.layout(RichMessageLayout$$ExternalSyntheticOutline1.m(176.0f, i3, i7), 0, i3 - AndroidUtilities.dp(126.0f), i6 - i7);
            }
            return true;
        }
        TextView textView = this.counterTextView;
        if (view != textView) {
            if (view != this.cameraPhotoRecyclerView) {
                return false;
            }
            if (z) {
                int iM = RichMessageLayout$$ExternalSyntheticOutline1.m(88.0f, i6, i7);
                view.layout(0, iM, view.getMeasuredWidth(), view.getMeasuredHeight() + iM);
            } else {
                int iDp2 = (i + i5) - AndroidUtilities.dp(88.0f);
                view.layout(iDp2, 0, view.getMeasuredWidth() + iDp2, view.getMeasuredHeight());
            }
            return true;
        }
        if (z) {
            iDp = (i5 - textView.getMeasuredWidth()) / 2;
            int iDp3 = i4 - AndroidUtilities.dp(167.0f);
            this.counterTextView.setRotation(0.0f);
            if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                iDp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = iDp3 - i7;
        } else {
            iDp = i3 - AndroidUtilities.dp(167.0f);
            measuredWidth = (this.counterTextView.getMeasuredWidth() / 2) + (i6 / 2);
            this.counterTextView.setRotation(-90.0f);
            if (this.cameraPhotoRecyclerView.getVisibility() == 0) {
                iDp -= AndroidUtilities.dp(96.0f);
            }
        }
        TextView textView2 = this.counterTextView;
        textView2.layout(iDp, measuredWidth, textView2.getMeasuredWidth() + iDp, this.counterTextView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override
    public boolean onCustomMeasure(View view, int i, int i2) {
        boolean z = i < i2;
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (view != cameraViewInternal) {
            FrameLayout frameLayout = this.cameraPanel;
            if (view == frameLayout) {
                if (z) {
                    frameLayout.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                } else {
                    frameLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
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
            cameraViewInternal.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public void onDestroy() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
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
    public void onDismissWithButtonClick(int i) {
        hideCamera((i == 0 || i == 2) ? false : true);
    }

    @Override
    public void onHidden() {
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.setVisibility(8);
        }
        for (Map.Entry<Object, Object> entry : selectedPhotos.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.adapter.notifyDataSetChanged();
    }

    @Override
    public void onHide() {
        this.isHidden = true;
        int childCount = this.gridView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.gridView.getChildAt(i) instanceof PhotoAttachCameraCell) {
                saveLastCameraBitmap();
                break;
            }
            this.cameraViewItemDecoration.updateBitmap();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.headerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = this.dropDown.animate().alpha(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.EASE_BOTH).withEndAction(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(this, 6));
        this.headerAnimator = viewPropertyAnimatorWithEndAction;
        viewPropertyAnimatorWithEndAction.start();
        pauseCameraPreview();
    }

    @Override
    public void onHideShowProgress(float f) {
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.setAlpha(f);
            if (f != 0.0f && this.cameraView.getVisibility() != 0) {
                this.cameraView.setVisibility(0);
            } else {
                if (f != 0.0f || this.cameraView.getVisibility() == 4) {
                    return;
                }
                this.cameraView.setVisibility(4);
            }
        }
    }

    @Override
    public void onInit(boolean z, boolean z2, boolean z3) {
        boolean z4 = z || z2;
        this.mediaEnabled = z4;
        this.videoEnabled = z;
        this.photoEnabled = z2;
        this.documentsEnabled = z3;
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.setAlpha(z4 ? 1.0f : 0.2f);
            this.cameraView.setEnabled(this.mediaEnabled);
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if ((chatAttachAlert.baseFragment instanceof ChatActivity) || chatAttachAlert.getChat() != null) {
            ChatAttachAlert chatAttachAlert2 = this.parentAlert;
            if (chatAttachAlert2.avatarPicker == 0) {
                this.galleryAlbumEntry = MediaController.allMediaAlbumEntry;
                if (this.mediaEnabled) {
                    this.progressView.setText(LocaleController.getString(R.string.NoPhotos));
                    this.progressView.setLottie(0, 0, 0);
                } else {
                    TLRPC.Chat chat = chatAttachAlert2.getChat();
                    this.progressView.setLottie(R.raw.media_forbidden, 150, 150);
                    if (ChatObject.isActionBannedByDefault(chat, 7)) {
                        this.progressView.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                        this.progressView.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        this.progressView.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                }
            } else if (shouldLoadAllMedia()) {
                this.galleryAlbumEntry = MediaController.allMediaAlbumEntry;
            } else {
                this.galleryAlbumEntry = MediaController.allPhotosAlbumEntry;
            }
        } else if (shouldLoadAllMedia()) {
            this.galleryAlbumEntry = MediaController.allMediaAlbumEntry;
        } else {
            this.galleryAlbumEntry = MediaController.allPhotosAlbumEntry;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.noGalleryPermissions = isNoGalleryPermissions();
        }
        if (this.galleryAlbumEntry != null) {
            for (int i = 0; i < Math.min(100, this.galleryAlbumEntry.photos.size()); i++) {
                this.galleryAlbumEntry.photos.get(i).reset();
            }
        }
        clearSelectedPhotos();
        updatePhotosCounter(false);
        this.cameraPhotoLayoutManager.scrollToPositionWithOffset(0, 1000000);
        this.layoutManager.scrollToPositionWithOffset(0, 1000000);
        this.dropDown.setText(LocaleController.getString(R.string.ChatGallery));
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMenuItemClick(int i) {
        TLRPC.Chat chat;
        boolean z;
        boolean z2;
        int i2 = 9;
        int i3 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i4 = 1;
        if (i == 8) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            chatAttachAlert.setCaptionAbove(!chatAttachAlert.captionAbove);
            this.captionItem.setState(!this.parentAlert.captionAbove, true);
            return;
        }
        if ((i == 0 || i == 1) && this.parentAlert.maxSelectedPhotos > 0 && selectedPhotosOrder.size() > 1 && (chat = this.parentAlert.getChat()) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
            AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), this.resourcesProvider).show();
            return;
        }
        if (i == 0) {
            ChatAttachAlert chatAttachAlert2 = this.parentAlert;
            if (chatAttachAlert2.editingMessageObject == null) {
                BaseFragment baseFragment = chatAttachAlert2.baseFragment;
                if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.parentAlert.baseFragment).getDialogId(), new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(this, i4), this.resourcesProvider);
                    return;
                }
            }
            ChatAttachAlert chatAttachAlert3 = this.parentAlert;
            int i5 = chatAttachAlert3.currentAccount;
            long dialogId = chatAttachAlert3.getDialogId();
            int additionalMessagesCount = this.parentAlert.getAdditionalMessagesCount() + selectedPhotos.size();
            final Object[] objArr3 = objArr2 == true ? 1 : 0;
            AlertsCreator.ensurePaidMessageConfirmation(i5, dialogId, additionalMessagesCount, new Utilities.Callback(this) {
                public final ChatAttachAlertPhotoLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (objArr3) {
                        case 0:
                            this.f$0.lambda$onMenuItemClick$19((Long) obj);
                            break;
                        default:
                            this.f$0.lambda$onMenuItemClick$21((Long) obj);
                            break;
                    }
                }
            });
            return;
        }
        if (i == 1) {
            ChatAttachAlert chatAttachAlert4 = this.parentAlert;
            if (chatAttachAlert4.editingMessageObject == null) {
                BaseFragment baseFragment2 = chatAttachAlert4.baseFragment;
                if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.parentAlert.baseFragment).getDialogId(), new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(this, i3), this.resourcesProvider);
                    return;
                }
            }
            ChatAttachAlert chatAttachAlert5 = this.parentAlert;
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert5.currentAccount, chatAttachAlert5.getDialogId(), this.parentAlert.getAdditionalMessagesCount() + selectedPhotos.size(), new Utilities.Callback(this) {
                public final ChatAttachAlertPhotoLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$onMenuItemClick$19((Long) obj);
                            break;
                        default:
                            this.f$0.lambda$onMenuItemClick$21((Long) obj);
                            break;
                    }
                }
            });
            return;
        }
        if (i == 3) {
            if (this.parentAlert.getPhotoPreviewLayout() != null) {
                this.parentAlert.getPhotoPreviewLayout().startMediaCrossfade();
            }
            Iterator<Map.Entry<Object, Object>> it = selectedPhotos.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((MediaController.PhotoEntry) it.next().getValue()).hasSpoiler) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            final boolean z3 = !z2;
            final Object[] objArr4 = objArr == true ? 1 : 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final ChatAttachAlertPhotoLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (objArr4) {
                        case 0:
                            this.f$0.lambda$onMenuItemClick$22(z3);
                            break;
                        default:
                            this.f$0.lambda$onMenuItemClick$24(z3);
                            break;
                    }
                }
            }, 200L);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Object, Object> entry : selectedPhotos.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    photoEntry.hasSpoiler = z3;
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                    photoEntry.isAttachSpoilerRevealed = false;
                    arrayList.add(Integer.valueOf(photoEntry.imageId));
                }
            }
            this.gridView.forAllChild(new Bulletin$2$$ExternalSyntheticLambda2(arrayList, z3, i4));
            if (this.parentAlert.getCurrentAttachLayout() != this) {
                this.adapter.notifyDataSetChanged();
            }
            if (this.parentAlert.getPhotoPreviewLayout() != null) {
                this.parentAlert.getPhotoPreviewLayout().invalidateGroupsView();
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.parentAlert.getPhotoPreviewLayout() != null) {
                this.parentAlert.getPhotoPreviewLayout().startMediaCrossfade();
            }
            Iterator<Map.Entry<Object, Object>> it2 = selectedPhotos.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((MediaController.PhotoEntry) it2.next().getValue()).isHighQuality()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            final boolean z4 = !z;
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final ChatAttachAlertPhotoLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$onMenuItemClick$22(z4);
                            break;
                        default:
                            this.f$0.lambda$onMenuItemClick$24(z4);
                            break;
                    }
                }
            }, 200L);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<Object, Object> entry2 : selectedPhotos.entrySet()) {
                if (entry2.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) entry2.getValue();
                    photoEntry2.highQuality = Boolean.valueOf(z4);
                    photoEntry2.isChatPreviewSpoilerRevealed = false;
                    photoEntry2.isAttachSpoilerRevealed = false;
                    arrayList2.add(Integer.valueOf(photoEntry2.imageId));
                }
            }
            this.gridView.forAllChild(new Bulletin$2$$ExternalSyntheticLambda2(arrayList2, z4, i3));
            if (this.parentAlert.getCurrentAttachLayout() != this) {
                this.adapter.notifyDataSetChanged();
            }
            if (this.parentAlert.getPhotoPreviewLayout() != null) {
                this.parentAlert.getPhotoPreviewLayout().invalidateGroupsView();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 7) {
                ChatAttachAlert chatAttachAlert6 = this.parentAlert;
                chatAttachAlert6.updatePhotoPreview(chatAttachAlert6.getCurrentAttachLayout() != this.parentAlert.getPhotoPreviewLayout());
                return;
            }
            if (i == 9) {
                StarsIntroActivity.showMediaPriceSheet(getContext(), getStarsPrice(), true, new EmojiView$$ExternalSyntheticLambda18(this, i2), this.resourcesProvider);
                return;
            }
            if (i >= 10) {
                MediaController.AlbumEntry albumEntry = this.dropDownAlbums.get(i - 10);
                this.selectedAlbumEntry = albumEntry;
                if (albumEntry == this.galleryAlbumEntry) {
                    this.dropDown.setText(LocaleController.getString(R.string.ChatGallery));
                } else {
                    this.dropDown.setText(albumEntry.bucketName);
                }
                this.adapter.notifyDataSetChanged();
                this.cameraAttachAdapter.notifyDataSetChanged();
                this.layoutManager.scrollToPositionWithOffset(0, -(this.gridView.getPaddingTop() - getTopScrollOffset()));
                return;
            }
            return;
        }
        try {
            if (shouldLoadAllMedia()) {
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                Intent intent2 = new Intent("android.intent.action.PICK");
                intent2.setType("image/*");
                Intent intentCreateChooser = Intent.createChooser(intent2, null);
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                ChatAttachAlert chatAttachAlert7 = this.parentAlert;
                if (chatAttachAlert7.avatarPicker != 0) {
                    chatAttachAlert7.baseFragment.startActivityForResult(intentCreateChooser, 14);
                } else {
                    chatAttachAlert7.baseFragment.startActivityForResult(intentCreateChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                ChatAttachAlert chatAttachAlert8 = this.parentAlert;
                if (chatAttachAlert8.avatarPicker != 0) {
                    chatAttachAlert8.baseFragment.startActivityForResult(intent3, 14);
                } else {
                    chatAttachAlert8.baseFragment.startActivityForResult(intent3, 1);
                }
            }
            this.parentAlert.dismiss(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        checkCamera(chatAttachAlert != null && (chatAttachAlert.baseFragment instanceof ChatActivity));
    }

    @Override
    public void onPanTransitionStart(boolean z, int i) {
        super.onPanTransitionStart(z, i);
        checkCameraViewPosition();
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.invalidateOutline();
            this.cameraView.invalidate();
        }
    }

    @Override
    public void onPause() {
        ShutterButton shutterButton = this.shutterButton;
        if (shutterButton == null) {
            return;
        }
        if (this.requestingPermissions) {
            if (this.cameraView != null && shutterButton.getState() == ShutterButton.State.RECORDING) {
                this.shutterButton.setState(ShutterButton.State.DEFAULT, true);
            }
            this.requestingPermissions = false;
            return;
        }
        if (this.cameraView != null && shutterButton.getState() == ShutterButton.State.RECORDING) {
            resetRecordState();
            CameraController.getInstance().stopVideoRecording(this.cameraView.getCameraSession(), false);
            this.shutterButton.setState(ShutterButton.State.DEFAULT, true);
        }
        if (this.cameraOpened) {
            closeCamera(false);
        }
        hideCamera(true);
    }

    @Override
    public void onPreMeasure(int i, int i2) {
        int iM;
        int i3;
        this.ignoreLayout = true;
        int i4 = this.itemsPerRow;
        if (AndroidUtilities.isTablet()) {
            this.itemsPerRow = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.itemsPerRow = 4;
            } else {
                this.itemsPerRow = 3;
            }
        }
        this.listAdditionalH = AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
        ((FrameLayout.LayoutParams) this.gridView.getLayoutParams()).topMargin = -this.listAdditionalH;
        int iDp = (i - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f);
        int i5 = this.itemsPerRow;
        int i6 = iDp / i5;
        this.itemSize = i6;
        if (this.lastItemSize != i6 || i4 != i5) {
            this.lastItemSize = i6;
            AndroidUtilities.runOnUIThread(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(this, 3));
        }
        this.layoutManager.setSpanCount(Math.max(1, ((this.itemsPerRow - 1) * AndroidUtilities.dp(2.0f)) + (this.itemSize * this.itemsPerRow)));
        int iCeil = (int) Math.ceil((this.adapter.getItemCount() - 1) / this.itemsPerRow);
        if (this.noGalleryPermissions) {
            iM = AndroidUtilities.dp(400.0f);
        } else {
            iM = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2.0f, iCeil - 1, this.itemSize * iCeil);
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        int iM2 = MessageObject$$ExternalSyntheticOutline0.m(6.0f, (((i2 - iM) - currentActionBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(12.0f), 0);
        if (this.gridExtraSpace != iM2) {
            this.gridExtraSpace = iM2;
            this.adapter.notifyDataSetChanged();
        }
        if (AndroidUtilities.isTablet()) {
            i3 = (i2 / 5) * 2;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i3 = (int) (i2 / 3.5f);
            } else {
                i3 = (i2 / 5) * 2;
            }
        }
        int iDp2 = ((i3 + currentActionBarHeight) - AndroidUtilities.dp(52.0f)) + this.listAdditionalH;
        if (iDp2 < 0) {
            iDp2 = 0;
        }
        if (this.gridView.getPaddingTop() != iDp2 || this.gridView.getPaddingBottom() != this.listPaddingBottom) {
            this.gridView.setPadding(AndroidUtilities.dp(2.0f), iDp2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(48.0f) + this.listPaddingBottom);
        }
        this.dropDown.setTextSize(17.0f);
        this.ignoreLayout = false;
    }

    @Override
    public void onResume() {
        if (!this.parentAlert.isShowing() || this.parentAlert.isDismissed() || PhotoViewer.getInstance().isVisible()) {
            return;
        }
        checkCamera(false);
    }

    @Override
    public void onSelectedItemsCountChanged(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ChatAttachAlert chatAttachAlert;
        ChatAttachAlert chatAttachAlert2;
        if (i <= 1 || this.parentAlert.editingMessageObject != null) {
            this.parentAlert.selectedMenuItem.hideSubItem(0);
            if (i == 0) {
                this.parentAlert.selectedMenuItem.showSubItem(4);
                this.parentAlert.selectedMenuItem.hideSubItem(1);
            } else {
                if (this.documentsEnabled && getStarsPrice() <= 0) {
                    ChatAttachAlert chatAttachAlert3 = this.parentAlert;
                    if (chatAttachAlert3.editingMessageObject == null) {
                        chatAttachAlert3.selectedMenuItem.showSubItem(1);
                        z = false;
                        z2 = true;
                    }
                }
                this.parentAlert.selectedMenuItem.hideSubItem(1);
            }
            z = false;
            z2 = false;
        } else {
            if (getStarsPrice() <= 0) {
                this.parentAlert.selectedMenuItem.showSubItem(0);
                z = true;
            } else {
                this.parentAlert.selectedMenuItem.hideSubItem(0);
                z = false;
            }
            if (!this.documentsEnabled || getStarsPrice() > 0) {
                this.parentAlert.selectedMenuItem.hideSubItem(1);
                z2 = false;
            } else {
                this.parentAlert.selectedMenuItem.showSubItem(1);
                z2 = true;
            }
        }
        if (i != 0) {
            this.parentAlert.selectedMenuItem.hideSubItem(4);
        }
        if (i > 1) {
            this.parentAlert.selectedMenuItem.showSubItem(5);
            this.parentAlert.selectedMenuItem.showSubItem(7);
            this.compressItem.setText(LocaleController.getString(R.string.SendAsFiles));
        } else {
            this.parentAlert.selectedMenuItem.hideSubItem(5);
            this.parentAlert.selectedMenuItem.hideSubItem(7);
            if (i != 0) {
                this.compressItem.setText(LocaleController.getString(R.string.SendAsFile));
            }
        }
        if (i > 0 && getStarsPrice() <= 0) {
            ChatAttachAlert chatAttachAlert4 = this.parentAlert;
            if (chatAttachAlert4 != null) {
                BaseFragment baseFragment = chatAttachAlert4.baseFragment;
                z3 = (baseFragment instanceof ChatActivity) && !((ChatActivity) baseFragment).isSecretChat();
            }
        }
        boolean z5 = i > 0 && (chatAttachAlert2 = this.parentAlert) != null && chatAttachAlert2.hasCaption() && (this.parentAlert.baseFragment instanceof ChatActivity);
        if (i > 0 && (chatAttachAlert = this.parentAlert) != null) {
            BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
            z4 = (baseFragment2 instanceof ChatActivity) && ChatObject.isChannelAndNotMegaGroup(((ChatActivity) baseFragment2).getCurrentChat()) && ((ChatActivity) this.parentAlert.baseFragment).getCurrentChatInfo() != null && ((ChatActivity) this.parentAlert.baseFragment).getCurrentChatInfo().paid_media_allowed;
        }
        if (z3) {
            ChatAttachAlert chatAttachAlert5 = this.parentAlert;
            if (chatAttachAlert5 != null) {
                chatAttachAlert5.selectedMenuItem.showSubItem(3);
            }
        } else {
            this.spoilerItem.setText(LocaleController.getString(R.string.EnablePhotoSpoiler));
            this.spoilerItem.setAnimatedIcon(R.raw.photo_spoiler);
            this.parentAlert.selectedMenuItem.hideSubItem(3);
        }
        if (this.parentAlert != null) {
            if (getSelectedPhotosCount() == i) {
                if (getSelectedPhotosHighQualityCount() > 0) {
                    this.qualityItem.setText(LocaleController.getString(R.string.SendInStandardQuality));
                    this.qualityItem.setIcon(R.drawable.menu_quality_sd);
                } else {
                    this.qualityItem.setText(LocaleController.getString(R.string.SendInHighQuality));
                    this.qualityItem.setIcon(R.drawable.menu_quality_hd);
                }
                this.parentAlert.selectedMenuItem.showSubItem(2);
            } else {
                this.parentAlert.selectedMenuItem.hideSubItem(2);
            }
        }
        if (z5) {
            this.captionItem.setVisibility(0);
        } else {
            this.captionItem.setVisibility(8);
        }
        if ((z3 || z5) && (z2 || z)) {
            this.parentAlert.selectedMenuItem.showSubItem(6);
        } else {
            this.parentAlert.selectedMenuItem.hideSubItem(6);
        }
        if (!z4) {
            this.parentAlert.selectedMenuItem.hideSubItem(9);
            return;
        }
        updateStarsItem();
        updatePhotoStarsPrice();
        this.parentAlert.selectedMenuItem.showSubItem(9);
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
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        ViewPropertyAnimator viewPropertyAnimator = this.headerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.dropDownContainer.setVisibility(0);
        boolean z = attachAlertLayout instanceof ChatAttachAlertPhotoLayoutPreview;
        if (z) {
            ViewPropertyAnimator interpolator = this.dropDown.animate().alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            this.headerAnimator = interpolator;
            interpolator.start();
        } else {
            clearSelectedPhotos();
            this.dropDown.setAlpha(1.0f);
        }
        this.parentAlert.actionBar.setTitle("");
        this.layoutManager.scrollToPositionWithOffset(0, 0);
        if (z) {
            this.gridView.post(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda25(this, (ChatAttachAlertPhotoLayoutPreview) attachAlertLayout));
        }
        checkCameraViewPosition();
        resumeCameraPreview();
    }

    @Override
    public void onShown() {
        this.isHidden = false;
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.setVisibility(0);
        }
        if (this.checkCameraWhenShown) {
            this.checkCameraWhenShown = false;
            checkCamera(true);
        }
    }

    public void openPhotoViewer(MediaController.PhotoEntry photoEntry, boolean z, boolean z2) {
        int i;
        ChatActivity chatActivity;
        ChatActivity chatActivity2;
        int i2;
        ArrayList<Object> arrayList;
        int size;
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
                CameraController.getInstance().startPreview(this.cameraView.getCameraSessionObject());
                return;
            }
            return;
        }
        if (cameraPhotos.isEmpty()) {
            return;
        }
        this.cancelTakingPhotos = true;
        BaseFragment lastFragment = this.parentAlert.baseFragment;
        if (lastFragment == null) {
            lastFragment = LaunchActivity.getLastFragment();
        }
        if (lastFragment == null) {
            return;
        }
        PhotoViewer.getInstance().setParentActivity(lastFragment.getParentActivity(), this.resourcesProvider);
        PhotoViewer.getInstance().setParentAlert(this.parentAlert);
        PhotoViewer photoViewer = PhotoViewer.getInstance();
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        photoViewer.setMaxSelectedPhotos(chatAttachAlert.maxSelectedPhotos, chatAttachAlert.allowOrder);
        ChatAttachAlert chatAttachAlert2 = this.parentAlert;
        if (chatAttachAlert2.isPhotoPicker && chatAttachAlert2.isStickerMode) {
            chatActivity = (ChatActivity) chatAttachAlert2.baseFragment;
            i = 11;
        } else if (chatAttachAlert2.avatarPicker != 0) {
            chatActivity = null;
            i = 1;
        } else {
            BaseFragment baseFragment = chatAttachAlert2.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                chatActivity = (ChatActivity) baseFragment;
                i = 2;
            } else {
                i = 5;
                chatActivity = null;
            }
        }
        boolean z3 = chatAttachAlert2.isPollAttach;
        if (z3) {
            chatActivity2 = null;
            i2 = 13;
        } else {
            chatActivity2 = chatActivity;
            i2 = i;
        }
        if (chatAttachAlert2.avatarPicker != 0 || z3) {
            arrayList = new ArrayList<>();
            arrayList.add(photoEntry);
            size = 0;
        } else {
            arrayList = getAllPhotosArray();
            size = cameraPhotos.size() - 1;
        }
        ArrayList<Object> arrayList2 = arrayList;
        if (this.parentAlert.getAvatarFor() != null && photoEntry != null) {
            this.parentAlert.getAvatarFor().isVideo = photoEntry.isVideo;
        }
        PhotoViewer.getInstance().openPhotoForSelect(arrayList2, size, i2, false, new AnonymousClass15(z), chatActivity2);
        PhotoViewer.getInstance().setAvatarFor(this.parentAlert.getAvatarFor());
        if (this.parentAlert.isStickerMode) {
            PhotoViewer.getInstance().enableStickerMode(null, null, false, this.parentAlert.customStickerHandler);
            PhotoViewer.getInstance().prepareSegmentImage();
        }
    }

    public void pauseCamera(boolean z) {
        if (!this.needCamera || this.noCameraPermissions) {
            return;
        }
        if (!z) {
            showCamera();
            return;
        }
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            this.isCameraFrontfaceBeforeEnteringEditMode = Boolean.valueOf(cameraViewInternal.isFrontface());
            hideCamera(true);
        }
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void scrollToTop() {
        this.gridView.smoothScrollToPosition(0);
    }

    public void setCameraOpenProgress(float f) {
        int i;
        int i2;
        if (this.cameraView == null) {
            return;
        }
        this.cameraOpenProgress = f;
        int[] iArr = this.animateCameraValues;
        float f2 = iArr[1];
        float f3 = iArr[2];
        int i3 = AndroidUtilities.displaySize.x;
        float width = (this.parentAlert.getContainer().getWidth() - this.parentAlert.getLeftInset()) - this.parentAlert.getRightInset();
        float height = this.parentAlert.getContainer().getHeight();
        float[] fArr = this.cameraViewLocation;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = this.additionCloseCameraY;
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
            float f11 = ((1.0f - ((f7 * f9) + f)) * height) / 2.0f;
            float f12 = ((1.0f - ((f8 * f9) + f)) * width) / 2.0f;
            float f13 = f4 * f9;
            this.cameraView.setTranslationX(((0.0f * f) + f13) - f12);
            float f14 = f5 * f9;
            this.cameraView.setTranslationY(((f6 * f) + f14) - f11);
            this.animationClipTop = f14 - this.cameraView.getTranslationY();
            this.animationClipBottom = (height * f) + (((f5 + f3) * f9) - this.cameraView.getTranslationY());
            this.animationClipLeft = f13 - this.cameraView.getTranslationX();
            this.animationClipRight = (width * f) + (((f4 + f2) * f9) - this.cameraView.getTranslationX());
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
        if (layoutParams.width != i || layoutParams.height != i2) {
            layoutParams.width = i;
            layoutParams.height = i2;
            this.cameraView.requestLayout();
        }
        this.cameraView.invalidateOutline();
        this.cameraView.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z) {
        this.checkCameraWhenShown = z;
    }

    public void setIncludeVideosInGallery(boolean z) {
        this.includeVideosInGallery = z;
    }

    public void setStarsPrice(long j) {
        if (!selectedPhotos.isEmpty()) {
            Iterator<Map.Entry<Object, Object>> it = selectedPhotos.entrySet().iterator();
            while (it.hasNext()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) it.next().getValue();
                photoEntry.starsAmount = j;
                photoEntry.hasSpoiler = j > 0;
                photoEntry.isChatPreviewSpoilerRevealed = false;
                photoEntry.isAttachSpoilerRevealed = false;
            }
        }
        onSelectedItemsCountChanged(getSelectedItemsCount());
        if (checkSelectedCount(false)) {
            updateCheckedPhotos();
        }
    }

    @Override
    public void setTranslationY(float f) {
        if (this.parentAlert.getSheetAnimationType() == 1) {
            float f2 = (f / 40.0f) * (-0.1f);
            int childCount = this.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    float f3 = 1.0f + f2;
                    photoAttachPhotoCell.getCheckBox().setScaleX(f3);
                    photoAttachPhotoCell.getCheckBox().setScaleY(f3);
                }
            }
        }
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        invalidate();
    }

    public void showAvatarConstructorFragment(AvatarConstructorPreviewCell avatarConstructorPreviewCell, TLRPC.VideoSize videoSize) {
        showAvatarConstructorFragment(avatarConstructorPreviewCell, videoSize, 0L);
    }

    public void showCamera() {
        if (!this.parentAlert.paused && this.mediaEnabled && CameraView.isCameraAllowed()) {
            if (this.cameraView == null) {
                boolean z = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.isCameraFrontfaceBeforeEnteringEditMode;
                CameraViewInternal cameraViewInternal = new CameraViewInternal(context, bool != null ? bool.booleanValue() : this.parentAlert.openWithFrontFaceCamera, z);
                this.cameraView = cameraViewInternal;
                BaseFragment baseFragment = this.parentAlert.baseFragment;
                cameraViewInternal.setRecordFile(AndroidUtilities.generateVideoPath((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isSecretChat()));
                this.cameraView.setFocusable(true);
                this.cameraView.setFpsLimit(30);
                this.cameraView.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        float commentTextViewTop = ChatAttachAlertPhotoLayout.this.parentAlert.getCommentTextViewTop();
                        MentionsContainerView mentionsContainerView = ChatAttachAlertPhotoLayout.this.parentAlert.mentionContainer;
                        int iMin = (int) Math.min((ChatAttachAlertPhotoLayout.this.parentAlert.getContainerView().getTranslationY() + (ChatAttachAlertPhotoLayout.this.currentPanTranslationY + (commentTextViewTop - (mentionsContainerView != null ? mentionsContainerView.clipBottom() + AndroidUtilities.dp(16.0f) : 0.0f)))) - ChatAttachAlertPhotoLayout.this.cameraView.getTranslationY(), view.getMeasuredHeight());
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                        if (chatAttachAlertPhotoLayout.cameraOpened) {
                            iMin = view.getMeasuredHeight();
                        } else if (chatAttachAlertPhotoLayout.cameraAnimationInProgress) {
                            iMin = AndroidUtilities.lerp(iMin, view.getMeasuredHeight(), ChatAttachAlertPhotoLayout.this.cameraOpenProgress);
                        }
                        if (!ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress) {
                            if (ChatAttachAlertPhotoLayout.this.cameraAnimationInProgress || ChatAttachAlertPhotoLayout.this.cameraOpened) {
                                outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(iMin, view.getMeasuredHeight()));
                                return;
                            } else {
                                int iDp = AndroidUtilities.dp(16.0f);
                                outline.setRoundRect((int) ChatAttachAlertPhotoLayout.this.cameraViewOffsetX, (int) ChatAttachAlertPhotoLayout.this.cameraViewOffsetY, view.getMeasuredWidth() + iDp, Math.min(iMin, view.getMeasuredHeight()) + iDp, iDp);
                                return;
                            }
                        }
                        RectF rectF = AndroidUtilities.rectTmp;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                        float f = ((1.0f - ChatAttachAlertPhotoLayout.this.cameraOpenProgress) * chatAttachAlertPhotoLayout2.cameraViewOffsetX) + chatAttachAlertPhotoLayout2.animationClipLeft;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ChatAttachAlertPhotoLayout.this;
                        float f2 = ((1.0f - ChatAttachAlertPhotoLayout.this.cameraOpenProgress) * chatAttachAlertPhotoLayout3.cameraViewOffsetY) + chatAttachAlertPhotoLayout3.animationClipTop;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout4 = ChatAttachAlertPhotoLayout.this;
                        rectF.set(f, f2, chatAttachAlertPhotoLayout4.animationClipRight, chatAttachAlertPhotoLayout4.animationClipBottom);
                        outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(iMin, (int) rectF.bottom));
                    }
                });
                this.cameraView.setClipToOutline(true);
                this.cameraView.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                BottomSheet.ContainerView container = this.parentAlert.getContainer();
                CameraViewInternal cameraViewInternal2 = this.cameraView;
                int i = this.itemSize;
                container.addView(cameraViewInternal2, 1, new FrameLayout.LayoutParams(i, i));
                this.cameraView.setDelegate(new CameraView.CameraViewDelegate() {
                    @Override
                    public void onCameraInit() {
                        String currentFlashMode = ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession().getCurrentFlashMode();
                        String nextFlashMode = ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession().getNextFlashMode();
                        if (currentFlashMode == null || nextFlashMode == null) {
                            return;
                        }
                        if (currentFlashMode.equals(nextFlashMode)) {
                            for (int i2 = 0; i2 < 2; i2++) {
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i2].setVisibility(4);
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i2].setAlpha(0.0f);
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i2].setTranslationY(0.0f);
                            }
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                            chatAttachAlertPhotoLayout.setCameraFlashModeIcon(chatAttachAlertPhotoLayout.flashModeButton[0], ChatAttachAlertPhotoLayout.this.cameraView.getCameraSession().getCurrentFlashMode());
                            int i3 = 0;
                            while (i3 < 2) {
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i3].setVisibility(i3 == 0 ? 0 : 4);
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i3].setAlpha((i3 == 0 && ChatAttachAlertPhotoLayout.this.cameraOpened) ? 1.0f : 0.0f);
                                ChatAttachAlertPhotoLayout.this.flashModeButton[i3].setTranslationY(0.0f);
                                i3++;
                            }
                        }
                        ChatAttachAlertPhotoLayout.this.switchCameraButton.setImageResource(ChatAttachAlertPhotoLayout.this.cameraView.isFrontface() ? R.drawable.camera_revert1 : R.drawable.camera_revert2);
                        ChatAttachAlertPhotoLayout.this.switchCameraButton.setVisibility(ChatAttachAlertPhotoLayout.this.cameraView.hasFrontFaceCamera() ? 0 : 4);
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                        if (!chatAttachAlertPhotoLayout2.cameraOpened) {
                            chatAttachAlertPhotoLayout2.cameraInitAnimation = new AnimatorSet();
                            ChatAttachAlertPhotoLayout.this.cameraInitAnimation.playTogether(ObjectAnimator.ofFloat(ChatAttachAlertPhotoLayout.this.cameraView, (Property<CameraViewInternal, Float>) View.ALPHA, 0.0f, 1.0f));
                            ChatAttachAlertPhotoLayout.this.cameraInitAnimation.setDuration(180L);
                            ChatAttachAlertPhotoLayout.this.cameraInitAnimation.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationCancel(Animator animator) {
                                    ChatAttachAlertPhotoLayout.this.cameraInitAnimation = null;
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (animator.equals(ChatAttachAlertPhotoLayout.this.cameraInitAnimation)) {
                                        ChatAttachAlertPhotoLayout.this.canSaveCameraPreview = true;
                                        ChatAttachAlertPhotoLayout.this.cameraInitAnimation = null;
                                    }
                                }
                            });
                            ChatAttachAlertPhotoLayout.this.cameraInitAnimation.start();
                        }
                        if (ChatAttachAlertPhotoLayout.this.afterCameraInitRunnable != null) {
                            ChatAttachAlertPhotoLayout.this.afterCameraInitRunnable.run();
                        }
                    }
                });
                this.cameraView.setAlpha(this.mediaEnabled ? 1.0f : 0.2f);
                this.cameraView.setEnabled(this.mediaEnabled);
                if (this.isHidden) {
                    this.cameraView.setVisibility(8);
                }
                if (!this.cameraOpened) {
                    checkCameraViewPosition();
                }
                RecyclerListView recyclerListView = this.gridView;
                if (recyclerListView != null) {
                    recyclerListView.invalidate();
                }
                invalidate();
            }
            ZoomControlView zoomControlView = this.zoomControlView;
            if (zoomControlView != null) {
                zoomControlView.setZoom(0.0f, false);
                this.cameraZoom = 0.0f;
            }
            if (this.cameraOpened) {
                return;
            }
            this.cameraView.setTranslationX(this.cameraViewLocation[0]);
        }
    }

    public void toggleLivePhotos(boolean z) {
        if (selectedPhotos.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Object, Object>> it = selectedPhotos.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                SharedConfig.photoLiveDefault = z;
                editorEdit.putBoolean("photoLiveDefault", z).apply();
                updateCells();
                return;
            }
            Map.Entry<Object, Object> next = it.next();
            if (next.getValue() instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) next.getValue();
                if (photoEntry.isLivePhoto()) {
                    photoEntry.discardLivePhoto = Boolean.valueOf(!z);
                    for (int i = 0; i < this.gridView.getChildCount(); i++) {
                        View childAt = this.gridView.getChildAt(i);
                        if (childAt instanceof PhotoAttachPhotoCell) {
                            PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                            if (photoAttachPhotoCell.getPhotoEntry() == photoEntry) {
                                photoAttachPhotoCell.getImageView().invalidate();
                            }
                        }
                    }
                }
            }
        }
    }

    public void updateAvatarPicker() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        this.showAvatarConstructor = (chatAttachAlert.avatarPicker == 0 || chatAttachAlert.isPhotoPicker) ? false : true;
    }

    public void updateCheckedPhotoIndices() {
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

    public void updateCheckedPhotos() {
        if (this.parentAlert.baseFragment instanceof ChatActivity) {
            int childCount = this.gridView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = this.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    int childAdapterPosition = this.gridView.getChildAdapterPosition(childAt);
                    if (this.adapter.hasCameraSpaceRow && childAdapterPosition > this.itemsPerRow) {
                        childAdapterPosition--;
                    }
                    if (this.adapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry) {
                        childAdapterPosition--;
                    }
                    MediaController.PhotoEntry photoEntryAtPosition = getPhotoEntryAtPosition(childAdapterPosition);
                    photoAttachPhotoCell.setHasSpoiler(photoEntryAtPosition != null && photoEntryAtPosition.hasSpoiler);
                    photoAttachPhotoCell.setHighQuality(photoEntryAtPosition != null && photoEntryAtPosition.isHighQuality());
                    ChatAttachAlert chatAttachAlert = this.parentAlert;
                    if ((chatAttachAlert.baseFragment instanceof ChatActivity) && chatAttachAlert.allowOrder) {
                        photoAttachPhotoCell.setChecked(photoEntryAtPosition != null ? selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)) : -1, photoEntryAtPosition != null && selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), true);
                    } else {
                        photoAttachPhotoCell.setChecked(-1, photoEntryAtPosition != null && selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), true);
                    }
                }
                i++;
            }
            int childCount2 = this.cameraPhotoRecyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = this.cameraPhotoRecyclerView.getChildAt(i2);
                if (childAt2 instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell2 = (PhotoAttachPhotoCell) childAt2;
                    int childAdapterPosition2 = this.cameraPhotoRecyclerView.getChildAdapterPosition(childAt2);
                    if (this.adapter.hasCameraSpaceRow && childAdapterPosition2 > this.itemsPerRow) {
                        childAdapterPosition2--;
                    }
                    if (this.adapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry) {
                        childAdapterPosition2--;
                    }
                    MediaController.PhotoEntry photoEntryAtPosition2 = getPhotoEntryAtPosition(childAdapterPosition2);
                    photoAttachPhotoCell2.setHasSpoiler(photoEntryAtPosition2 != null && photoEntryAtPosition2.hasSpoiler);
                    photoAttachPhotoCell2.setHighQuality(photoEntryAtPosition2 != null && photoEntryAtPosition2.isHighQuality());
                    ChatAttachAlert chatAttachAlert2 = this.parentAlert;
                    if ((chatAttachAlert2.baseFragment instanceof ChatActivity) && chatAttachAlert2.allowOrder) {
                        photoAttachPhotoCell2.setChecked(photoEntryAtPosition2 != null ? selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition2.imageId)) : -1, photoEntryAtPosition2 != null && selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition2.imageId)), true);
                    } else {
                        photoAttachPhotoCell2.setChecked(-1, photoEntryAtPosition2 != null && selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition2.imageId)), true);
                    }
                }
            }
        }
    }

    public void updatePhotosCounter(boolean z) {
        if (this.counterTextView != null) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (chatAttachAlert.avatarPicker != 0 || chatAttachAlert.storyMediaPicker || chatAttachAlert.isPollAttach) {
                return;
            }
            Iterator<Map.Entry<Object, Object>> it = selectedPhotos.entrySet().iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                if (((MediaController.PhotoEntry) it.next().getValue()).isVideo) {
                    z2 = true;
                } else {
                    z3 = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
            int iMax = Math.max(1, selectedPhotos.size());
            if (z2 && z3) {
                this.counterTextView.setText(LocaleController.formatPluralString("Media", selectedPhotos.size(), new Object[0]).toUpperCase());
                if (iMax != this.currentSelectedCount || z) {
                    this.parentAlert.selectedTextView.setText(LocaleController.formatPluralString("MediaSelected", iMax, new Object[0]));
                }
            } else if (z2) {
                this.counterTextView.setText(LocaleController.formatPluralString("Videos", selectedPhotos.size(), new Object[0]).toUpperCase());
                if (iMax != this.currentSelectedCount || z) {
                    this.parentAlert.selectedTextView.setText(LocaleController.formatPluralString("VideosSelected", iMax, new Object[0]));
                }
            } else {
                this.counterTextView.setText(LocaleController.formatPluralString("Photos", selectedPhotos.size(), new Object[0]).toUpperCase());
                if (iMax != this.currentSelectedCount || z) {
                    this.parentAlert.selectedTextView.setText(LocaleController.formatPluralString("PhotosSelected", iMax, new Object[0]));
                }
            }
            this.parentAlert.setCanOpenPreview(iMax > 1);
            this.currentSelectedCount = iMax;
        }
    }

    public void updateSelected(HashMap<Object, Object> map, ArrayList<Object> arrayList, boolean z) {
        selectedPhotos.clear();
        selectedPhotos.putAll(map);
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
                    if (this.adapter.hasCameraSpaceRow && childAdapterPosition > this.itemsPerRow) {
                        childAdapterPosition--;
                    }
                    if (this.adapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry) {
                        childAdapterPosition--;
                    }
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    ChatAttachAlert chatAttachAlert = this.parentAlert;
                    if (chatAttachAlert.avatarPicker != 0 || chatAttachAlert.isPollAttach) {
                        photoAttachPhotoCell.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry photoEntryAtPosition = getPhotoEntryAtPosition(childAdapterPosition);
                    if (photoEntryAtPosition != null) {
                        boolean z2 = selectedPhotos.size() > 1;
                        boolean z3 = this.adapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry;
                        boolean z4 = childAdapterPosition == this.adapter.getItemCount() - 1;
                        ChatAttachAlert chatAttachAlert2 = this.parentAlert;
                        photoAttachPhotoCell.setPhotoEntry(photoEntryAtPosition, z2, z3, z4, chatAttachAlert2 != null && chatAttachAlert2.allowLivePhotos);
                        ChatAttachAlert chatAttachAlert3 = this.parentAlert;
                        if ((chatAttachAlert3.baseFragment instanceof ChatActivity) && chatAttachAlert3.allowOrder) {
                            photoAttachPhotoCell.setChecked(selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)), selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
                        } else {
                            photoAttachPhotoCell.setChecked(-1, selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
                        }
                    }
                }
            }
        }
    }

    public void showAvatarConstructorFragment(AvatarConstructorPreviewCell avatarConstructorPreviewCell, TLRPC.VideoSize videoSize, long j) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        AvatarConstructorFragment avatarConstructorFragment = new AvatarConstructorFragment(chatAttachAlert.parentImageUpdater, chatAttachAlert.getAvatarFor());
        avatarConstructorFragment.finishOnDone = this.parentAlert.getAvatarFor() == null || this.parentAlert.getAvatarFor().type != 2;
        this.parentAlert.baseFragment.presentFragment(avatarConstructorFragment);
        if (avatarConstructorPreviewCell != null) {
            avatarConstructorFragment.startFrom(avatarConstructorPreviewCell);
        }
        if (videoSize != null) {
            avatarConstructorFragment.startFrom(videoSize);
        }
        if (j != 0) {
            avatarConstructorFragment.startFrom(j, this.parentAlert.forUser);
        }
        avatarConstructorFragment.setDelegate(new AIEditorAlert$$ExternalSyntheticLambda34(21, this, avatarConstructorFragment));
    }
}
