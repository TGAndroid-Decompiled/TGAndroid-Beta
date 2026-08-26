package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
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
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuItem$$ExternalSyntheticLambda2;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.PhotoAttachCameraCell;
import org.telegram.ui.Cells.PhotoAttachPermissionCell;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda189;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatUsersActivity$8$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda31;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda91;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.QrActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda105;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.AlbumButton;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.GalleryListView$$ExternalSyntheticLambda9;
import org.telegram.ui.ThemePreviewActivity;

public final class ChatAttachAlertPhotoLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean mediaFromExternalCamera;
    public final PhotoAttachAdapter adapter;
    public float additionCloseCameraY;
    public int alertOnlyOnce;
    public final int[] animateCameraValues;
    public float animationClipBottom;
    public float animationClipLeft;
    public float animationClipRight;
    public float animationClipTop;
    public boolean cameraAnimationInProgress;
    public final PhotoAttachAdapter cameraAttachAdapter;
    public boolean cameraExpanded;
    public AnimatorSet cameraInitAnimation;
    public float cameraOpenProgress;
    public boolean cameraOpened;
    public final ChatActivity.AnonymousClass60 cameraPanel;
    public final PhotoViewer.AnonymousClass36 cameraPhotoLayoutManager;
    public final AnonymousClass3 cameraPhotoRecyclerView;
    public boolean cameraPhotoRecyclerViewIgnoreLayout;
    public CameraViewInternal cameraView;
    public final CameraViewItemDecoration cameraViewItemDecoration;
    public final float[] cameraViewLocation;
    public float cameraViewOffsetBottomY;
    public float cameraViewOffsetY;
    public float cameraZoom;
    public boolean canSaveCameraPreview;
    public boolean cancelTakingPhotos;
    public final MessagePreviewView.ToggleButton captionItem;
    public boolean checkCameraWhenShown;
    public final ActionBarMenuSubItem compressItem;
    public final TextView counterTextView;
    public float currentPanTranslationY;
    public int currentSelectedCount;
    public boolean deviceHasGoodCamera;
    public boolean documentsEnabled;
    public boolean dragging;
    public final TextView dropDown;
    public ArrayList dropDownAlbums;
    public final ThemePreviewActivity.AnonymousClass9 dropDownContainer;
    public final Drawable dropDownDrawable;
    public boolean flashAnimationInProgress;
    public final ImageView[] flashModeButton;
    public final boolean forceDarkTheme;
    public MediaController.AlbumEntry galleryAlbumEntry;
    public int gridExtraSpace;
    public final AnonymousClass3 gridView;
    public ViewPropertyAnimator headerAnimator;
    public final Rect hitRect;
    public boolean ignoreLayout;
    public boolean includeVideosInGallery;
    public final DecelerateInterpolator interpolator;
    public Boolean isCameraFrontfaceBeforeEnteringEditMode;
    public boolean isHidden;
    public final RecyclerViewItemRangeSelector itemRangeSelector;
    public int itemSize;
    public int itemsPerRow;
    public int lastItemSize;
    public int lastNotifyWidth;
    public float lastY;
    public final StickersAlert.AnonymousClass7 layoutManager;
    public int listAdditionalH;
    public boolean loading;
    public boolean maybeStartDraging;
    public boolean mediaEnabled;
    public final boolean needCamera;
    public boolean noCameraPermissions;
    public boolean noGalleryPermissions;
    public final AnimationNotificationsLocker notificationsLocker;
    public boolean photoEnabled;
    public final AnonymousClass1 photoViewerProvider;
    public float pinchStartDistance;
    public boolean pressed;
    public final ActionBarMenuSubItem previewItem;
    public final EmptyTextProgressView progressView;
    public final ActionBarMenuSubItem qualityItem;
    public final AnonymousClass8 recordTime;
    public boolean requestingPermissions;
    public MediaController.AlbumEntry selectedAlbumEntry;
    public boolean shouldSelect;
    public boolean showAvatarConstructor;
    public final ShutterButton shutterButton;
    public final ActionBarMenuSubItem spoilerItem;
    public final ActionBarMenuSubItem starsItem;
    public final ImageView switchCameraButton;
    public boolean takingPhoto;
    public final TextView tooltipTextView;
    public boolean videoEnabled;
    public ChatAttachAlertPhotoLayout$10$$ExternalSyntheticLambda3 videoRecordRunnable;
    public int videoRecordTime;
    public final int[] viewPosition;
    public AnimatorSet zoomControlAnimation;
    public Runnable zoomControlHideRunnable;
    public final ZoomControlView zoomControlView;
    public boolean zoomWas;
    public boolean zooming;
    public static final ArrayList cameraPhotos = new ArrayList();
    public static final HashMap selectedPhotos = new HashMap();
    public static final ArrayList selectedPhotosOrder = new ArrayList();
    public static int lastImageId = -1;

    public final class AnonymousClass1 extends BasePhotoProvider {
        public AnonymousClass1() {
            super();
        }

        @Override
        public final boolean allowCaption() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return (chatAttachAlert.isPhotoPicker || chatAttachAlert.isPollAttach) ? false : true;
        }

        @Override
        public final boolean canMoveCaptionAbove() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return chatAttachAlert != null && (chatAttachAlert.baseFragment instanceof ChatActivity);
        }

        @Override
        public final long getDialogId() {
            BaseFragment baseFragment = ChatAttachAlertPhotoLayout.this.parentAlert.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                return ((ChatActivity) baseFragment).getDialogId();
            }
            return 0L;
        }

        @Override
        public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            StarGiftSheet$$ExternalSyntheticLambda105 starGiftSheet$$ExternalSyntheticLambda105;
            PhotoViewer.PlaceProviderObject closeIntoObject;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (z2 && (starGiftSheet$$ExternalSyntheticLambda105 = chatAttachAlertPhotoLayout.parentAlert.avatarWithBulletin) != null && (closeIntoObject = ((ImageUpdater.ImageUpdaterDelegate) starGiftSheet$$ExternalSyntheticLambda105.f$0).getCloseIntoObject()) != null) {
                return closeIntoObject;
            }
            PhotoAttachPhotoCell photoAttachPhotoCellAccess$1100 = ChatAttachAlertPhotoLayout.access$1100(chatAttachAlertPhotoLayout, i);
            if (photoAttachPhotoCellAccess$1100 == null) {
                return null;
            }
            int[] iArr = new int[2];
            photoAttachPhotoCellAccess$1100.getImageView().getLocationInWindow(iArr);
            int i2 = Build.VERSION.SDK_INT;
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            if (i2 < 26) {
                iArr[0] = iArr[0] - chatAttachAlert.getLeftInset();
            }
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = chatAttachAlertPhotoLayout.gridView;
            ImageReceiver imageReceiver = photoAttachPhotoCellAccess$1100.getImageView().getImageReceiver();
            placeProviderObject.imageReceiver = imageReceiver;
            placeProviderObject.thumb = imageReceiver.getBitmapSafe();
            placeProviderObject.scale = photoAttachPhotoCellAccess$1100.getScale();
            placeProviderObject.clipBottomAddition = (int) chatAttachAlert.getClipLayoutBottom();
            photoAttachPhotoCellAccess$1100.showCheck(false);
            return placeProviderObject;
        }

        @Override
        public final ImageReceiver.BitmapHolder getThumbForPhoto(int i) {
            PhotoAttachPhotoCell photoAttachPhotoCellAccess$1100 = ChatAttachAlertPhotoLayout.access$1100(ChatAttachAlertPhotoLayout.this, i);
            if (photoAttachPhotoCellAccess$1100 != null) {
                return photoAttachPhotoCellAccess$1100.getImageView().getImageReceiver().getBitmapSafe();
            }
            return null;
        }

        @Override
        public final boolean isCaptionAbove() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return chatAttachAlert != null && chatAttachAlert.captionAbove;
        }

        @Override
        public final boolean isEditingMessage() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return (chatAttachAlert == null || chatAttachAlert.editingMessageObject == null) ? false : true;
        }

        @Override
        public final boolean isEditingMessageResend() {
            MessageObject messageObject;
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return (chatAttachAlert == null || (messageObject = chatAttachAlert.editingMessageObject) == null || !messageObject.needResendWhenEdit()) ? false : true;
        }

        @Override
        public final void moveCaptionAbove(boolean z) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            if (chatAttachAlert == null || chatAttachAlert.captionAbove == z) {
                return;
            }
            chatAttachAlert.setCaptionAbove(z, true);
            chatAttachAlertPhotoLayout.captionItem.setState(!chatAttachAlertPhotoLayout.parentAlert.captionAbove, true);
        }

        @Override
        public final void onApplyCaption(CharSequence charSequence) {
            CharSequence charSequence2;
            ArrayList<TLRPC.MessageEntity> arrayList;
            HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
            if (map.size() > 0) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.selectedPhotosOrder;
                if (arrayList2.size() > 0) {
                    Object obj = map.get(arrayList2.get(0));
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
                    ArrayList<TLRPC.MessageEntity> arrayList3 = arrayList;
                    if (charSequence2 != null && arrayList3 != null) {
                        CharSequence spannableStringBuilder = !(charSequence2 instanceof Spannable) ? new SpannableStringBuilder(charSequence2) : charSequence2;
                        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList3, false, false, false, false);
                        charSequence2 = spannableStringBuilder;
                    }
                    ChatAttachAlertPhotoLayout.this.parentAlert.getCommentView().setText(AnimatedEmojiSpan.cloneSpans(charSequence2, 3));
                }
            }
        }

        @Override
        public final void onClose() {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            chatAttachAlertPhotoLayout.resumeCameraPreview();
            AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 15), 150L);
            chatAttachAlertPhotoLayout.onSelectedItemsCountChanged(ChatAttachAlertPhotoLayout.selectedPhotos.size());
        }

        @Override
        public final void onEditModeChanged() {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            ChatAttachAlertPhotoLayout.this.getClass();
        }

        @Override
        public final void onOpen() {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            chatAttachAlertPhotoLayout.pauseCameraPreview();
            chatAttachAlertPhotoLayout.setCurrentSpoilerVisible(-1, true);
        }

        @Override
        public final void onPreClose() {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            ChatAttachAlertPhotoLayout.this.setCurrentSpoilerVisible(-1, false);
        }

        @Override
        public final void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            chatAttachAlertPhotoLayout.parentAlert.sent = true;
            boolean z3 = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            MediaController.PhotoEntry photoEntryAtPosition = chatAttachAlertPhotoLayout.getPhotoEntryAtPosition(i);
            if (photoEntryAtPosition != null) {
                photoEntryAtPosition.editedInfo = videoEditedInfo;
            }
            HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
            if (map.isEmpty() && photoEntryAtPosition != null) {
                chatAttachAlertPhotoLayout.addToSelectedPhotos(photoEntryAtPosition, -1);
            }
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            Editable text = chatAttachAlert.getCommentView().getText();
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            if (baseFragment instanceof ChatActivity ? ChatActivityEnterView.checkPremiumAnimatedEmoji(chatAttachAlert.currentAccount, ((ChatActivity) baseFragment).getDialogId(), baseFragment, text) : false) {
                return;
            }
            chatAttachAlert.applyCaption();
            if (PhotoViewer.getInstance().hasCaptionForAllMedia) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.selectedPhotosOrder;
                if (!map.isEmpty()) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        Object obj = map.get(arrayList.get(i4));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i4 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.getInstance().captionForAllMedia};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
                                if (baseFragment2 instanceof ChatActivity ? ChatActivityEnterView.checkPremiumAnimatedEmoji(chatAttachAlert.currentAccount, ((ChatActivity) baseFragment2).getDialogId(), chatAttachAlert.baseFragment, charSequence) : false) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (chatAttachAlert != null) {
                chatAttachAlert.buttonPressed = false;
            }
            PhotoViewer.getInstance();
            PhotoViewer.getInstance().closePhotoAfterSelect = false;
            PhotoViewer.getInstance().doneButtonPressed = false;
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + ChatAttachAlertPhotoLayout.selectedPhotos.size(), new ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0(this, z, i2, z2), 0L);
        }

        @Override
        public final void updatePhotoAtIndex(int i) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            PhotoAttachPhotoCell photoAttachPhotoCellAccess$1100 = ChatAttachAlertPhotoLayout.access$1100(chatAttachAlertPhotoLayout, i);
            if (photoAttachPhotoCellAccess$1100 != null) {
                photoAttachPhotoCellAccess$1100.getImageView().imageReceiver.setOrientation(0, true);
                MediaController.PhotoEntry photoEntryAtPosition = chatAttachAlertPhotoLayout.getPhotoEntryAtPosition(i);
                if (photoEntryAtPosition == null) {
                    return;
                }
                if (photoEntryAtPosition.coverPath != null) {
                    photoAttachPhotoCellAccess$1100.getImageView().setImage(photoEntryAtPosition.coverPath, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                if (photoEntryAtPosition.thumbPath != null) {
                    photoAttachPhotoCellAccess$1100.getImageView().setImage(photoEntryAtPosition.thumbPath, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                if (photoEntryAtPosition.path == null) {
                    photoAttachPhotoCellAccess$1100.getImageView().setImageDrawable(Theme.chat_attachEmptyDrawable);
                    return;
                }
                photoAttachPhotoCellAccess$1100.getImageView().imageReceiver.setOrientation(photoEntryAtPosition.orientation, photoEntryAtPosition.invert, true);
                if (photoEntryAtPosition.isVideo) {
                    photoAttachPhotoCellAccess$1100.getImageView().setImage("vthumb://" + photoEntryAtPosition.imageId + ":" + photoEntryAtPosition.path, null, Theme.chat_attachEmptyDrawable);
                    return;
                }
                photoAttachPhotoCellAccess$1100.getImageView().setImage("thumb://" + photoEntryAtPosition.imageId + ":" + photoEntryAtPosition.path, null, Theme.chat_attachEmptyDrawable);
            }
        }

        @Override
        public final void willHidePhotoViewer() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            int childCount = chatAttachAlertPhotoLayout.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = chatAttachAlertPhotoLayout.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    ((PhotoAttachPhotoCell) childAt).showCheck(true);
                }
            }
        }

        @Override
        public final void willSwitchFromPhoto(int i) {
            PhotoAttachPhotoCell photoAttachPhotoCellAccess$1100 = ChatAttachAlertPhotoLayout.access$1100(ChatAttachAlertPhotoLayout.this, i);
            if (photoAttachPhotoCellAccess$1100 != null) {
                photoAttachPhotoCellAccess$1100.showCheck(true);
            }
        }
    }

    public final class AnonymousClass10 implements ShutterButton.ShutterButtonDelegate {
        public File outputFile;
        public final BottomSheet.ContainerView val$container;
        public final Theme.ResourcesProvider val$resourcesProvider;
        public boolean zoomingWas;

        public AnonymousClass10(Theme.ResourcesProvider resourcesProvider, BottomSheet.ContainerView containerView) {
            this.val$resourcesProvider = resourcesProvider;
            this.val$container = containerView;
        }

        public final void shutterReleased() {
            CameraViewInternal cameraViewInternal;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.takingPhoto || (cameraViewInternal = chatAttachAlertPhotoLayout.cameraView) == null || cameraViewInternal.getCameraSession() == null) {
                return;
            }
            ShutterButton shutterButton = chatAttachAlertPhotoLayout.shutterButton;
            if (shutterButton.getState() == ShutterButton.State.RECORDING) {
                chatAttachAlertPhotoLayout.resetRecordState();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.cameraView.getCameraSession(), false);
                shutterButton.setState(ShutterButton.State.DEFAULT);
            } else {
                if (!chatAttachAlertPhotoLayout.photoEnabled) {
                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.GlobalAttachPhotoRestricted, new BulletinFactory(chatAttachAlertPhotoLayout.cameraView, this.val$resourcesProvider), null);
                    return;
                }
                ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                File fileGeneratePicturePath = AndroidUtilities.generatePicturePath((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isSecretChat(), null);
                boolean zIsSameTakePictureOrientation = chatAttachAlertPhotoLayout.cameraView.getCameraSession().isSameTakePictureOrientation();
                chatAttachAlertPhotoLayout.cameraView.getCameraSession().setFlipFront((chatAttachAlert.baseFragment instanceof ChatActivity) || chatAttachAlert.avatarPicker == 2);
                chatAttachAlertPhotoLayout.takingPhoto = CameraController.getInstance().takePicture(fileGeneratePicturePath, false, chatAttachAlertPhotoLayout.cameraView.getCameraSessionObject(), new PhotoViewer$$ExternalSyntheticLambda91(this, fileGeneratePicturePath, zIsSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.cameraView.startTakePictureAnimation(true);
            }
        }
    }

    public final class AnonymousClass15 extends BasePhotoProvider {
        public final boolean val$sameTakePictureOrientation;

        public AnonymousClass15(boolean z) {
            super();
            this.val$sameTakePictureOrientation = z;
        }

        @Override
        public final boolean allowCaption() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return (chatAttachAlert.isPhotoPicker || chatAttachAlert.isPollAttach) ? false : true;
        }

        @Override
        public final boolean canCaptureMorePhotos() {
            return ChatAttachAlertPhotoLayout.this.parentAlert.maxSelectedPhotos != 1;
        }

        @Override
        public final boolean canScrollAway() {
            return false;
        }

        @Override
        public final boolean cancelButtonPressed() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.cameraOpened && chatAttachAlertPhotoLayout.cameraView != null) {
                AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 16), 1000L);
                chatAttachAlertPhotoLayout.zoomControlView.setZoom(0.0f, false);
                chatAttachAlertPhotoLayout.cameraZoom = 0.0f;
                chatAttachAlertPhotoLayout.cameraView.setZoom(0.0f);
                CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.cameraView.getCameraSession());
            }
            if (chatAttachAlertPhotoLayout.cancelTakingPhotos) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.cameraPhotos;
                if (arrayList.size() == 1) {
                    int size = arrayList.size();
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
                    chatAttachAlertPhotoLayout.counterTextView.setVisibility(4);
                    chatAttachAlertPhotoLayout.cameraPhotoRecyclerView.setVisibility(8);
                    chatAttachAlertPhotoLayout.adapter.notifyDataSetChanged();
                    chatAttachAlertPhotoLayout.cameraAttachAdapter.notifyDataSetChanged();
                    chatAttachAlertPhotoLayout.parentAlert.updateCountButton(0);
                }
            }
            return true;
        }

        @Override
        public final ImageReceiver.BitmapHolder getThumbForPhoto(int i) {
            return null;
        }

        @Override
        public final void needAddMorePhotos() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            chatAttachAlertPhotoLayout.cancelTakingPhotos = false;
            if (ChatAttachAlertPhotoLayout.mediaFromExternalCamera) {
                ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
                chatAttachAlert.delegate.didPressedButton(0, true, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
                return;
            }
            if (!chatAttachAlertPhotoLayout.cameraOpened) {
                chatAttachAlertPhotoLayout.openCamera(false);
            }
            TextView textView = chatAttachAlertPhotoLayout.counterTextView;
            textView.setVisibility(0);
            chatAttachAlertPhotoLayout.cameraPhotoRecyclerView.setVisibility(0);
            textView.setAlpha(1.0f);
            chatAttachAlertPhotoLayout.updatePhotosCounter(false);
        }

        @Override
        public final void onClose() {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            chatAttachAlertPhotoLayout.resumeCameraPreview();
            chatAttachAlertPhotoLayout.onSelectedItemsCountChanged(ChatAttachAlertPhotoLayout.selectedPhotos.size());
        }

        @Override
        public final void onEditModeChanged() {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            ChatAttachAlertPhotoLayout.this.getClass();
        }

        @Override
        public final void onOpen() {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            ChatAttachAlertPhotoLayout.this.pauseCameraPreview();
        }

        @Override
        public final boolean scaleToFill() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (!chatAttachAlertPhotoLayout.parentAlert.destroyed) {
                int i = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
                if (this.val$sameTakePictureOrientation || i == 1) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public final void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.cameraPhotos;
            if (arrayList.isEmpty()) {
                return;
            }
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.parentAlert.destroyed) {
                return;
            }
            if (videoEditedInfo != null && i >= 0 && i < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i)).editedInfo = videoEditedInfo;
            }
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            if (!(baseFragment instanceof ChatActivity) || !((ChatActivity) baseFragment).isSecretChat()) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.cameraPhotos.get(i4);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            chatAttachAlert.applyCaption();
            PhotoViewer.getInstance();
            PhotoViewer.getInstance().closePhotoAfterSelect = false;
            PhotoViewer.getInstance().doneButtonPressed = false;
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + ChatAttachAlertPhotoLayout.selectedPhotos.size(), new ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0(this, z2, z, i2), 0L);
        }

        @Override
        public final void willHidePhotoViewer() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            int childCount = chatAttachAlertPhotoLayout.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = chatAttachAlertPhotoLayout.gridView.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    photoAttachPhotoCell.imageView.getImageReceiver().setVisible(true, true);
                    photoAttachPhotoCell.showCheck(true);
                }
            }
        }
    }

    public final class AnonymousClass16 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ChatAttachAlertPhotoLayout this$0;

        public AnonymousClass16(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i) {
            this.$r8$classId = i;
            this.this$0 = chatAttachAlertPhotoLayout;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.zoomControlAnimation = null;
                    break;
                case 1:
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.this$0;
                    chatAttachAlertPhotoLayout.notificationsLocker.unlock();
                    chatAttachAlertPhotoLayout.cameraAnimationInProgress = false;
                    CameraViewInternal cameraViewInternal = chatAttachAlertPhotoLayout.cameraView;
                    if (cameraViewInternal != null) {
                        cameraViewInternal.invalidateOutline();
                        chatAttachAlertPhotoLayout.cameraView.invalidate();
                    }
                    if (chatAttachAlertPhotoLayout.cameraOpened) {
                        chatAttachAlertPhotoLayout.parentAlert.delegate.onCameraOpened();
                    }
                    CameraViewInternal cameraViewInternal2 = chatAttachAlertPhotoLayout.cameraView;
                    if (cameraViewInternal2 != null) {
                        cameraViewInternal2.setSystemUiVisibility(1028);
                    }
                    AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.gridView;
                    if (anonymousClass3 != null) {
                        anonymousClass3.invalidate();
                    }
                    break;
                default:
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.this$0;
                    chatAttachAlertPhotoLayout2.notificationsLocker.unlock();
                    chatAttachAlertPhotoLayout2.cameraExpanded = false;
                    chatAttachAlertPhotoLayout2.parentAlert.getWindow().clearFlags(128);
                    chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                    chatAttachAlertPhotoLayout2.cameraAnimationInProgress = false;
                    AnonymousClass3 anonymousClass4 = chatAttachAlertPhotoLayout2.gridView;
                    if (anonymousClass4 != null) {
                        anonymousClass4.invalidate();
                    }
                    CameraViewInternal cameraViewInternal3 = chatAttachAlertPhotoLayout2.cameraView;
                    if (cameraViewInternal3 != null) {
                        cameraViewInternal3.invalidateOutline();
                        chatAttachAlertPhotoLayout2.cameraView.invalidate();
                    }
                    chatAttachAlertPhotoLayout2.cameraOpened = false;
                    ChatActivity.AnonymousClass60 anonymousClass60 = chatAttachAlertPhotoLayout2.cameraPanel;
                    if (anonymousClass60 != null) {
                        anonymousClass60.setVisibility(8);
                    }
                    ZoomControlView zoomControlView = chatAttachAlertPhotoLayout2.zoomControlView;
                    if (zoomControlView != null) {
                        zoomControlView.setVisibility(8);
                        chatAttachAlertPhotoLayout2.zoomControlView.setTag(null);
                    }
                    AnonymousClass3 anonymousClass5 = chatAttachAlertPhotoLayout2.cameraPhotoRecyclerView;
                    if (anonymousClass5 != null) {
                        anonymousClass5.setVisibility(8);
                    }
                    CameraViewInternal cameraViewInternal4 = chatAttachAlertPhotoLayout2.cameraView;
                    if (cameraViewInternal4 != null) {
                        cameraViewInternal4.setFpsLimit(30);
                        chatAttachAlertPhotoLayout2.cameraView.setSystemUiVisibility(1024);
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass19 implements CameraView.CameraViewDelegate {
        public AnonymousClass19() {
        }

        @Override
        public final void onCameraInit() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            String currentFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getCurrentFlashMode();
            String nextFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getNextFlashMode();
            if (currentFlashMode == null || nextFlashMode == null) {
                return;
            }
            boolean zEquals = currentFlashMode.equals(nextFlashMode);
            ImageView[] imageViewArr = chatAttachAlertPhotoLayout.flashModeButton;
            if (zEquals) {
                for (int i = 0; i < 2; i++) {
                    imageViewArr[i].setVisibility(4);
                    imageViewArr[i].setAlpha(0.0f);
                    imageViewArr[i].setTranslationY(0.0f);
                }
            } else {
                ImageView imageView = imageViewArr[0];
                String currentFlashMode2 = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getCurrentFlashMode();
                currentFlashMode2.getClass();
                switch (currentFlashMode2) {
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
                int i2 = 0;
                while (i2 < 2) {
                    imageViewArr[i2].setVisibility(i2 == 0 ? 0 : 4);
                    imageViewArr[i2].setAlpha((i2 == 0 && chatAttachAlertPhotoLayout.cameraOpened) ? 1.0f : 0.0f);
                    imageViewArr[i2].setTranslationY(0.0f);
                    i2++;
                }
            }
            ImageView imageView2 = chatAttachAlertPhotoLayout.switchCameraButton;
            imageView2.setImageResource(chatAttachAlertPhotoLayout.cameraView.isFrontface() ? R.drawable.camera_revert1 : R.drawable.camera_revert2);
            imageView2.setVisibility(chatAttachAlertPhotoLayout.cameraView.hasFrontFaceCamera() ? 0 : 4);
            if (chatAttachAlertPhotoLayout.cameraOpened) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            chatAttachAlertPhotoLayout.cameraInitAnimation = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.cameraView, (Property<CameraViewInternal, Float>) View.ALPHA, 0.0f, 1.0f));
            chatAttachAlertPhotoLayout.cameraInitAnimation.setDuration(180L);
            chatAttachAlertPhotoLayout.cameraInitAnimation.addListener(new CheckBox.AnonymousClass1(this, 18));
            chatAttachAlertPhotoLayout.cameraInitAnimation.start();
        }
    }

    public abstract class BasePhotoProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        public BasePhotoProvider() {
        }

        @Override
        public final boolean allowLivePhotos() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
            return chatAttachAlert != null && chatAttachAlert.allowLivePhotos;
        }

        @Override
        public final int getPhotoIndex(int i) {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
            if (photoEntryAtPosition == null) {
                return -1;
            }
            return ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId));
        }

        @Override
        public final int getSelectedCount() {
            return ChatAttachAlertPhotoLayout.selectedPhotos.size();
        }

        @Override
        public final HashMap getSelectedPhotos() {
            return ChatAttachAlertPhotoLayout.selectedPhotos;
        }

        @Override
        public final ArrayList getSelectedPhotosOrder() {
            return ChatAttachAlertPhotoLayout.selectedPhotosOrder;
        }

        @Override
        public final boolean isPhotoChecked(int i) {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            MediaController.PhotoEntry photoEntryAtPosition = ChatAttachAlertPhotoLayout.this.getPhotoEntryAtPosition(i);
            return photoEntryAtPosition != null && ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photoEntryAtPosition.imageId));
        }

        @Override
        public final int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
            boolean z;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            int i2 = chatAttachAlertPhotoLayout.parentAlert.maxSelectedPhotos;
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            if (i2 < 0 || ChatAttachAlertPhotoLayout.selectedPhotos.size() < chatAttachAlert.maxSelectedPhotos || isPhotoChecked(i)) {
                boolean z2 = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
                MediaController.PhotoEntry photoEntryAtPosition = chatAttachAlertPhotoLayout.getPhotoEntryAtPosition(i);
                if (photoEntryAtPosition != null && !chatAttachAlertPhotoLayout.checkSendMediaEnabled(photoEntryAtPosition)) {
                    int size = ChatAttachAlertPhotoLayout.selectedPhotos.size() + 1;
                    BaseFragment baseFragment = chatAttachAlert.baseFragment;
                    if (size <= (((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).chatMode == 5) ? baseFragment.getMessagesController().config.quickReplyMessagesLimit.get() - ((ChatActivity) chatAttachAlert.baseFragment).messages.size() : Integer.MAX_VALUE)) {
                        int iAddToSelectedPhotos = chatAttachAlertPhotoLayout.addToSelectedPhotos(photoEntryAtPosition, -1);
                        if (iAddToSelectedPhotos == -1) {
                            iAddToSelectedPhotos = ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId));
                            z = true;
                        } else {
                            photoEntryAtPosition.editedInfo = null;
                            z = false;
                        }
                        photoEntryAtPosition.editedInfo = videoEditedInfo;
                        AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.gridView;
                        int childCount = anonymousClass3.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = anonymousClass3.getChildAt(i3);
                            if ((childAt instanceof PhotoAttachPhotoCell) && ((Integer) childAt.getTag()).intValue() == i) {
                                if (!(chatAttachAlert.baseFragment instanceof ChatActivity) || !chatAttachAlert.allowOrder) {
                                    ((PhotoAttachPhotoCell) childAt).setChecked(-1, z, false);
                                    break;
                                }
                                ((PhotoAttachPhotoCell) childAt).setChecked(iAddToSelectedPhotos, z, false);
                                break;
                            }
                        }
                        AnonymousClass3 anonymousClass4 = chatAttachAlertPhotoLayout.cameraPhotoRecyclerView;
                        int childCount2 = anonymousClass4.getChildCount();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            View childAt2 = anonymousClass4.getChildAt(i4);
                            if ((childAt2 instanceof PhotoAttachPhotoCell) && ((Integer) childAt2.getTag()).intValue() == i) {
                                if (!(chatAttachAlert.baseFragment instanceof ChatActivity) || !chatAttachAlert.allowOrder) {
                                    ((PhotoAttachPhotoCell) childAt2).setChecked(-1, z, false);
                                    break;
                                }
                                ((PhotoAttachPhotoCell) childAt2).setChecked(iAddToSelectedPhotos, z, false);
                                break;
                            }
                        }
                        chatAttachAlert.updateCountButton(z ? 1 : 2);
                        return iAddToSelectedPhotos;
                    }
                }
            }
            return -1;
        }

        @Override
        public final void updatedLivePhotos() {
            boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.gridView == null) {
                return;
            }
            int i = 0;
            while (true) {
                AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.gridView;
                if (i >= anonymousClass3.getChildCount()) {
                    return;
                }
                View childAt = anonymousClass3.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    ((PhotoAttachPhotoCell) childAt).imageView.invalidate();
                }
                i++;
            }
        }
    }

    public final class CameraViewInternal extends CameraView {
        public final ChatActivity.AnonymousClass103 bulletinDelegate;
        public boolean drawInDecoration;

        public CameraViewInternal(Context context, boolean z, boolean z2) {
            super(context, z, z2);
            this.bulletinDelegate = new ChatActivity.AnonymousClass103(this, 6);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            if (AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            if (!this.drawInDecoration) {
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                if (chatAttachAlertPhotoLayout.cameraAnimationInProgress || !chatAttachAlertPhotoLayout.cameraOpened) {
                    ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
                    float translationY = (chatAttachAlert.getContainerView().getTranslationY() + (chatAttachAlert.commentTextViewLocation[1] + chatAttachAlertPhotoLayout.currentPanTranslationY)) - chatAttachAlertPhotoLayout.cameraView.getTranslationY();
                    ChatAttachAlert.AnonymousClass36 anonymousClass36 = chatAttachAlert.mentionContainer;
                    int iMin = (int) Math.min(translationY - (anonymousClass36 != null ? anonymousClass36.clipBottom() + AndroidUtilities.dp(8.0f) : 0.0f), getMeasuredHeight());
                    boolean z = chatAttachAlertPhotoLayout.cameraAnimationInProgress;
                    if (z) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f = chatAttachAlertPhotoLayout.animationClipLeft;
                        float f2 = 1.0f - chatAttachAlertPhotoLayout.cameraOpenProgress;
                        rectF.set((0.0f * f2) + f, (f2 * chatAttachAlertPhotoLayout.cameraViewOffsetY) + chatAttachAlertPhotoLayout.animationClipTop, chatAttachAlertPhotoLayout.animationClipRight, AndroidUtilities.lerp(Math.min(iMin, chatAttachAlertPhotoLayout.animationClipBottom), getMeasuredHeight(), chatAttachAlertPhotoLayout.cameraOpenProgress));
                    } else {
                        if (!z && !chatAttachAlertPhotoLayout.cameraOpened) {
                            AndroidUtilities.rectTmp.set(0.0f, chatAttachAlertPhotoLayout.cameraViewOffsetY, getMeasuredWidth(), Math.min(iMin, getMeasuredHeight()));
                            return;
                        }
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(iMin, getMeasuredHeight()));
                    }
                    canvas.save();
                    canvas.clipRect(AndroidUtilities.rectTmp);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            Bulletin.addDelegate(chatAttachAlertPhotoLayout.cameraView, this.bulletinDelegate);
            chatAttachAlertPhotoLayout.gridView.invalidate();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(ChatAttachAlertPhotoLayout.this.cameraView);
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
            invalidate();
        }

        @Override
        public final void showTexture(boolean z, boolean z2) {
            super.showTexture(z, z2);
            invalidate();
        }
    }

    public final class CameraViewItemDecoration extends RecyclerView.ItemDecoration implements IBlur3Capture {
        public final Drawable cameraDrawable;
        public final Path clipPath = new Path();
        public final AnonymousClass3 parent;
        public Drawable placeholderDrawable;

        public CameraViewItemDecoration(AnonymousClass3 anonymousClass3) {
            this.parent = anonymousClass3;
            this.cameraDrawable = ChatAttachAlertPhotoLayout.this.getContext().getResources().getDrawable(R.drawable.camera).mutate();
        }

        @Override
        public final void capture(Canvas canvas, RectF rectF) {
            draw(canvas, this.parent, null, rectF);
        }

        @Override
        public final void captureCalculateHash(Blur3HashImpl blur3HashImpl, RectF rectF) {
            draw(null, this.parent, blur3HashImpl, rectF);
        }

        public final void draw(Canvas canvas, RecyclerView recyclerView, Blur3HashImpl blur3HashImpl, RectF rectF) {
            int top;
            CameraViewInternal cameraViewInternal;
            CameraViewInternal cameraViewInternal2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.cameraAnimationInProgress || chatAttachAlertPhotoLayout.cameraOpened || !chatAttachAlertPhotoLayout.adapter.hasCamera || chatAttachAlertPhotoLayout.noCameraPermissions || chatAttachAlertPhotoLayout.noGalleryPermissions) {
                if (blur3HashImpl != null) {
                    blur3HashImpl.unsupported = true;
                    return;
                }
                return;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(0);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                top = viewHolderFindViewHolderForAdapterPosition.itemView.getTop();
            } else {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(chatAttachAlertPhotoLayout.itemsPerRow);
                if (viewHolderFindViewHolderForAdapterPosition == null) {
                    if (blur3HashImpl != null) {
                        blur3HashImpl.unsupported = true;
                        return;
                    }
                    return;
                }
                top = (viewHolderFindViewHolderForAdapterPosition.itemView.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.itemSize;
            }
            int left = viewHolderFindViewHolderForAdapterPosition.itemView.getLeft();
            int i = chatAttachAlertPhotoLayout.itemSize;
            int i2 = left + i;
            int iDp = AndroidUtilities.dp(2.0f) + (i * 2) + top;
            if (blur3HashImpl != null) {
                long jCalcHash = MediaDataController.calcHash(blur3HashImpl.hash, left);
                blur3HashImpl.hash = jCalcHash;
                long jCalcHash2 = MediaDataController.calcHash(jCalcHash, top);
                blur3HashImpl.hash = jCalcHash2;
                long jCalcHash3 = MediaDataController.calcHash(jCalcHash2, i2);
                blur3HashImpl.hash = jCalcHash3;
                blur3HashImpl.hash = MediaDataController.calcHash(jCalcHash3, iDp);
            }
            if (rectF == null || rectF.intersects(left, top, i2, iDp)) {
                Drawable drawable = this.cameraDrawable;
                if (blur3HashImpl != null) {
                    blur3HashImpl.add(this.placeholderDrawable != null && ((cameraViewInternal2 = chatAttachAlertPhotoLayout.cameraView) == null || !cameraViewInternal2.isInited() || chatAttachAlertPhotoLayout.isHidden));
                    blur3HashImpl.add(chatAttachAlertPhotoLayout.cameraView != null);
                    blur3HashImpl.add(drawable != null);
                }
                if (canvas == null) {
                    return;
                }
                float fDp = AndroidUtilities.dp(16.0f);
                Path path = this.clipPath;
                path.rewind();
                float f = left;
                float f2 = top;
                path.addRoundRect(f, f2, i2 + fDp, iDp + fDp, fDp, fDp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (this.placeholderDrawable != null && ((cameraViewInternal = chatAttachAlertPhotoLayout.cameraView) == null || !cameraViewInternal.isInited() || chatAttachAlertPhotoLayout.isHidden)) {
                    this.placeholderDrawable.setBounds(left, top, i2, iDp);
                    this.placeholderDrawable.draw(canvas);
                }
                CameraViewInternal cameraViewInternal3 = chatAttachAlertPhotoLayout.cameraView;
                if (cameraViewInternal3 != null) {
                    cameraViewInternal3.drawInDecoration = true;
                    canvas.save();
                    canvas.clipRect(left, top, i2, iDp);
                    canvas.translate(f, f2);
                    chatAttachAlertPhotoLayout.cameraView.draw(canvas);
                    canvas.restore();
                    chatAttachAlertPhotoLayout.cameraView.drawInDecoration = false;
                }
                if (drawable != null) {
                    int iDp2 = AndroidUtilities.dp(24.0f);
                    int iM = RichMessageLayout$$ExternalSyntheticOutline2.m(i2, 7.0f, iDp2);
                    int iDp3 = AndroidUtilities.dp(7.0f) + top;
                    drawable.setBounds(iM, iDp3, iM + iDp2, iDp2 + iDp3);
                    drawable.draw(canvas);
                }
                canvas.restore();
                chatAttachAlertPhotoLayout.gridView.invalidate();
            }
        }

        @Override
        public final void onDraw(Canvas canvas, RecyclerView recyclerView) {
            draw(canvas, recyclerView, null, null);
        }

        public final void updateBitmap() {
            Bitmap bitmapDecodeFile;
            try {
                bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
                bitmapDecodeFile = null;
            }
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (bitmapDecodeFile != null) {
                this.placeholderDrawable = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmapDecodeFile);
            } else {
                this.placeholderDrawable = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
            }
            AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.gridView;
            if (anonymousClass3 != null) {
                anonymousClass3.invalidate();
            }
        }
    }

    public final class PhotoAttachAdapter extends RecyclerListView.FastScrollAdapter {
        public boolean hasCamera;
        public boolean hasCameraSpaceRow;
        public boolean isInFastScroll;
        public int itemsCount;
        public final Context mContext;
        public final boolean needCamera;
        public int photosStartRow;
        public final ArrayList viewsCache = new ArrayList(8);

        public PhotoAttachAdapter(Context context, boolean z) {
            this.mContext = context;
            this.needCamera = z;
        }

        public final RecyclerListView.Holder createHolder() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            PhotoAttachPhotoCell photoAttachPhotoCell = new PhotoAttachPhotoCell(this.mContext, chatAttachAlertPhotoLayout.resourcesProvider);
            if (this == chatAttachAlertPhotoLayout.adapter) {
                photoAttachPhotoCell.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public final void getOutline(View view, Outline outline) {
                        PhotoAttachPhotoCell photoAttachPhotoCell2 = (PhotoAttachPhotoCell) view;
                        if (photoAttachPhotoCell2.getTag() == null) {
                            return;
                        }
                        int iIntValue = ((Integer) photoAttachPhotoCell2.getTag()).intValue();
                        PhotoAttachAdapter photoAttachAdapter = PhotoAttachAdapter.this;
                        boolean z = photoAttachAdapter.needCamera;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                        if (z && chatAttachAlertPhotoLayout2.selectedAlbumEntry == chatAttachAlertPhotoLayout2.galleryAlbumEntry && !chatAttachAlertPhotoLayout2.noCameraPermissions) {
                            iIntValue++;
                        }
                        if (chatAttachAlertPhotoLayout2.showAvatarConstructor) {
                            iIntValue++;
                        }
                        if (iIntValue == 0) {
                            int iDp = AndroidUtilities.dp(16.0f);
                            outline.setRoundRect(0, 0, view.getMeasuredWidth() + iDp, view.getMeasuredHeight() + iDp, iDp);
                        } else if (iIntValue != chatAttachAlertPhotoLayout2.itemsPerRow - 1) {
                            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        } else {
                            int iDp2 = AndroidUtilities.dp(16.0f);
                            outline.setRoundRect(-iDp2, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + iDp2, iDp2);
                        }
                    }
                });
                photoAttachPhotoCell.setClipToOutline(true);
            }
            photoAttachPhotoCell.setFastScrollDelegate(new ColorPicker$$ExternalSyntheticLambda6(this, 16));
            photoAttachPhotoCell.setDelegate(new ChatActivity$$ExternalSyntheticLambda189(28, this, photoAttachPhotoCell));
            return new RecyclerListView.Holder(photoAttachPhotoCell);
        }

        @Override
        public final boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            MediaController.AlbumEntry albumEntry;
            boolean zIsEmpty = ChatAttachAlertPhotoLayout.cameraPhotos.isEmpty();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            return !(zIsEmpty && ((albumEntry = chatAttachAlertPhotoLayout.selectedAlbumEntry) == null || albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.parentAlert.pinnedToTop && getItemCount() > 30;
        }

        @Override
        public final int getItemCount() {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (!chatAttachAlertPhotoLayout.mediaEnabled) {
                return 1;
            }
            int size = 0;
            this.hasCamera = false;
            this.hasCameraSpaceRow = false;
            boolean z = chatAttachAlertPhotoLayout.noGalleryPermissions;
            PhotoAttachAdapter photoAttachAdapter = chatAttachAlertPhotoLayout.adapter;
            if (z && this == photoAttachAdapter) {
                return 2;
            }
            if (this.needCamera && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry) {
                this.hasCamera = true;
                size = 1;
            }
            if (chatAttachAlertPhotoLayout.showAvatarConstructor) {
                size++;
            }
            if (z && this == photoAttachAdapter) {
                size++;
            }
            this.photosStartRow = size;
            if (!z) {
                size += ChatAttachAlertPhotoLayout.cameraPhotos.size();
                MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.selectedAlbumEntry;
                if (albumEntry != null) {
                    size += albumEntry.photos.size();
                }
            }
            if (this.hasCamera && size > chatAttachAlertPhotoLayout.itemsPerRow && !chatAttachAlertPhotoLayout.noCameraPermissions) {
                this.hasCameraSpaceRow = true;
                size++;
            }
            if (this == photoAttachAdapter) {
                size++;
            }
            this.itemsCount = size;
            return size;
        }

        @Override
        public final int getItemViewType(int i) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (!chatAttachAlertPhotoLayout.mediaEnabled) {
                return 2;
            }
            boolean z = chatAttachAlertPhotoLayout.noGalleryPermissions;
            PhotoAttachAdapter photoAttachAdapter = chatAttachAlertPhotoLayout.adapter;
            if (z && this == photoAttachAdapter) {
                return i == 0 ? 7 : 2;
            }
            boolean z2 = this.needCamera;
            if (z2 && i == 0 && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry) {
                return chatAttachAlertPhotoLayout.noCameraPermissions ? 8 : 1;
            }
            boolean z3 = this.hasCameraSpaceRow;
            if (z3 && i == chatAttachAlertPhotoLayout.itemsPerRow) {
                return 5;
            }
            int i2 = (!z3 || i <= chatAttachAlertPhotoLayout.itemsPerRow) ? i : i - 1;
            if (z2) {
                i2--;
            }
            if (chatAttachAlertPhotoLayout.showAvatarConstructor && i2 == 0) {
                return 4;
            }
            if (this == photoAttachAdapter && i == this.itemsCount - 1) {
                return 2;
            }
            return z ? 3 : 0;
        }

        @Override
        public final String getLetter(int i) {
            ArrayList<MediaController.PhotoEntry> arrayList;
            MediaController.PhotoEntry photo = getPhoto(i);
            if (photo == null) {
                int i2 = this.photosStartRow;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                if (i <= i2) {
                    ArrayList arrayList2 = ChatAttachAlertPhotoLayout.cameraPhotos;
                    if (arrayList2.isEmpty()) {
                        MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.selectedAlbumEntry;
                        if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                            photo = arrayList.get(0);
                        }
                    } else {
                        photo = (MediaController.PhotoEntry) arrayList2.get(0);
                    }
                } else if (!chatAttachAlertPhotoLayout.selectedAlbumEntry.photos.isEmpty()) {
                    photo = (MediaController.PhotoEntry) zziq.m(1, chatAttachAlertPhotoLayout.selectedAlbumEntry.photos);
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

        public final MediaController.PhotoEntry getPhoto(int i) {
            boolean z = this.hasCameraSpaceRow;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (z && i > chatAttachAlertPhotoLayout.itemsPerRow) {
                i--;
            }
            if (this.needCamera && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry) {
                i--;
            }
            boolean z2 = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
            return chatAttachAlertPhotoLayout.getPhotoEntryAtPosition(i);
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            float itemCount = getItemCount();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            float fCeil = (((int) (Math.ceil(itemCount / chatAttachAlertPhotoLayout.itemsPerRow) * ((double) measuredHeight))) - (recyclerListView.getMeasuredHeight() - currentActionBarHeight)) * f;
            float f2 = measuredHeight;
            iArr[0] = ((int) (fCeil / f2)) * chatAttachAlertPhotoLayout.itemsPerRow;
            int paddingTop = recyclerListView.getPaddingTop() + ((int) (fCeil % f2)) + ((int) ((1.0f - f) * currentActionBarHeight));
            iArr[1] = paddingTop;
            if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
                return;
            }
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }

        @Override
        public final float getScrollProgress(RecyclerListView recyclerListView) {
            int i = ChatAttachAlertPhotoLayout.this.itemsPerRow;
            int iCeil = (int) Math.ceil(this.itemsCount / i);
            if (recyclerListView.getChildCount() != 0) {
                int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
                View childAt = recyclerListView.getChildAt(0);
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    return Utilities.clamp((((childAdapterPosition / i) * measuredHeight) - childAt.getTop()) / ((iCeil * measuredHeight) - (recyclerListView.getMeasuredHeight() - ActionBar.getCurrentActionBarHeight())), 1.0f, 0.0f);
                }
            }
            return 0.0f;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (this == chatAttachAlertPhotoLayout.adapter) {
                chatAttachAlertPhotoLayout.progressView.setVisibility((!(getItemCount() == 1 && !chatAttachAlertPhotoLayout.noGalleryPermissions && chatAttachAlertPhotoLayout.selectedAlbumEntry == null) && chatAttachAlertPhotoLayout.mediaEnabled) ? 4 : 0);
            }
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            boolean z = this.needCamera;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 == 1) {
                    ((PhotoAttachCameraCell) view).setItemSize(chatAttachAlertPhotoLayout.itemSize);
                    return;
                }
                if (i2 != 3) {
                    if (i2 != 7) {
                        return;
                    }
                    ((GalleryEmptyView) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.showAvatarConstructor);
                    return;
                } else {
                    PhotoAttachPermissionCell photoAttachPermissionCell = (PhotoAttachPermissionCell) view;
                    photoAttachPermissionCell.setItemSize(chatAttachAlertPhotoLayout.itemSize);
                    photoAttachPermissionCell.setType((z && chatAttachAlertPhotoLayout.noCameraPermissions && i == 0) ? 0 : 1);
                    return;
                }
            }
            if (this.hasCameraSpaceRow && i > chatAttachAlertPhotoLayout.itemsPerRow) {
                i--;
            }
            if (z && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry) {
                i--;
            }
            if (chatAttachAlertPhotoLayout.showAvatarConstructor) {
                i--;
            }
            PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
            if (this == chatAttachAlertPhotoLayout.adapter) {
                photoAttachPhotoCell.setItemSize(chatAttachAlertPhotoLayout.itemSize);
            } else {
                photoAttachPhotoCell.setIsVertical(chatAttachAlertPhotoLayout.cameraPhotoLayoutManager.mOrientation == 1);
            }
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            if (chatAttachAlert.avatarPicker != 0 || chatAttachAlert.storyMediaPicker || chatAttachAlert.isPollAttach) {
                photoAttachPhotoCell.getCheckBox().setVisibility(8);
            } else {
                photoAttachPhotoCell.getCheckBox().setVisibility(0);
            }
            MediaController.PhotoEntry photoEntryAtPosition = chatAttachAlertPhotoLayout.getPhotoEntryAtPosition(i);
            if (photoEntryAtPosition == null) {
                return;
            }
            HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
            photoAttachPhotoCell.setPhotoEntry(photoEntryAtPosition, map.size() > 1, z && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry, i == getItemCount() - 1, chatAttachAlert != null && chatAttachAlert.allowLivePhotos);
            if ((chatAttachAlert.baseFragment instanceof ChatActivity) && chatAttachAlert.allowOrder) {
                photoAttachPhotoCell.setChecked(ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)), map.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
            } else {
                photoAttachPhotoCell.setChecked(-1, map.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
            }
            if (!chatAttachAlertPhotoLayout.videoEnabled && photoEntryAtPosition.isVideo) {
                photoAttachPhotoCell.setAlpha(0.3f);
            } else if (chatAttachAlertPhotoLayout.photoEnabled || photoEntryAtPosition.isVideo) {
                photoAttachPhotoCell.setAlpha(1.0f);
            } else {
                photoAttachPhotoCell.setAlpha(0.3f);
            }
            photoAttachPhotoCell.getImageView().setTag(Integer.valueOf(i));
            photoAttachPhotoCell.setTag(Integer.valueOf(i));
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                ArrayList arrayList = this.viewsCache;
                if (arrayList.isEmpty()) {
                    return createHolder();
                }
                RecyclerListView.Holder holder = (RecyclerListView.Holder) arrayList.get(0);
                arrayList.remove(0);
                return holder;
            }
            Context context = this.mContext;
            if (i == 1) {
                PhotoAttachCameraCell photoAttachCameraCell = new PhotoAttachCameraCell(context);
                photoAttachCameraCell.setFocusable(true);
                photoAttachCameraCell.itemSize = AndroidUtilities.dp(0.0f);
                return new RecyclerListView.Holder(photoAttachCameraCell);
            }
            if (i == 2) {
                return new RecyclerListView.Holder(new QrActivity.AnonymousClass2(this, context, 5));
            }
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (i == 4) {
                chatAttachAlertPhotoLayout.parentAlert.getClass();
                return new RecyclerListView.Holder(new AvatarConstructorPreviewCell(context) {
                    @Override
                    public final void onMeasure(int i2, int i3) {
                        PhotoAttachAdapter photoAttachAdapter = PhotoAttachAdapter.this;
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ChatAttachAlertPhotoLayout.this.itemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(ChatAttachAlertPhotoLayout.this.itemSize, 1073741824));
                    }
                });
            }
            if (i == 5) {
                return new RecyclerListView.Holder(new View(context));
            }
            if (i == 7) {
                GalleryEmptyView galleryEmptyView = new GalleryEmptyView(context, chatAttachAlertPhotoLayout.parentAlert.currentAccount);
                galleryEmptyView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(400.0f)));
                galleryEmptyView.setGravity(17);
                galleryEmptyView.isClickable();
                galleryEmptyView.cameraAccessButton.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(chatAttachAlertPhotoLayout, 5), 21));
                galleryEmptyView.galleryAccessButton.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(chatAttachAlertPhotoLayout, 6), 22));
                galleryEmptyView.useAnEmojiButton.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(27, galleryEmptyView, new DialogCell$$ExternalSyntheticLambda6(this, 16)));
                return new RecyclerListView.Holder(galleryEmptyView);
            }
            if (i != 8) {
                return new RecyclerListView.Holder(new PhotoAttachPermissionCell(context, chatAttachAlertPhotoLayout.resourcesProvider));
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, chatAttachAlertPhotoLayout.resourcesProvider, true);
            buttonWithCounterView.setUseWrapContent(true);
            buttonWithCounterView.setRoundRadius(24);
            buttonWithCounterView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.camera), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
            buttonWithCounterView.setText(spannableStringBuilder, false, true);
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new RecyclerListView.Holder(frameLayout);
        }

        @Override
        public final void onFinishFastScroll(RecyclerListView recyclerListView) {
            this.isInFastScroll = false;
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                recyclerListView.getChildAt(i).invalidate();
            }
        }

        @Override
        public final void onStartFastScroll() {
            this.isInFastScroll = true;
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.itemView instanceof PhotoAttachCameraCell) {
                ChatAttachAlertPhotoLayout.this.cameraViewItemDecoration.updateBitmap();
            }
        }
    }

    public ChatAttachAlertPhotoLayout(ChatAttachAlert chatAttachAlert, Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, chatAttachAlert);
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
        this.forceDarkTheme = z;
        this.needCamera = z2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        BottomSheet.ContainerView container = chatAttachAlert.getContainer();
        ChatAttachAlert chatAttachAlert2 = this.parentAlert;
        int i = 0;
        this.showAvatarConstructor = chatAttachAlert2.avatarPicker != 0;
        ThemePreviewActivity.AnonymousClass9 anonymousClass9 = new ThemePreviewActivity.AnonymousClass9(this, context, chatAttachAlert2.actionBar.createMenu(), resourcesProvider, 1);
        this.dropDownContainer = anonymousClass9;
        anonymousClass9.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        layoutParamsCreateFrame.topMargin = AndroidUtilities.statusBarHeight;
        this.parentAlert.actionBar.addView(anonymousClass9, 0, layoutParamsCreateFrame);
        final int i2 = 0;
        anonymousClass9.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal;
                ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal2;
                final ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
                switch (i2) {
                    case 0:
                        chatAttachAlertPhotoLayout.dropDownContainer.toggleSubMenu(null, null);
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.flashAnimationInProgress && (cameraViewInternal = chatAttachAlertPhotoLayout.cameraView) != null && cameraViewInternal.isInited() && chatAttachAlertPhotoLayout.cameraOpened) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.cameraView.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.flashAnimationInProgress = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.flashModeButton;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                nextFlashMode.getClass();
                                switch (nextFlashMode) {
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
                                AnimatorSet animatorSet = new AnimatorSet();
                                float[] fArr = {0.0f, AndroidUtilities.dp(48.0f)};
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                animatorSet.addListener(new EmojiView.AnonymousClass35(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        if (chatAttachAlertPhotoLayout.cameraView != null) {
                            chatAttachAlertPhotoLayout.openPhotoViewer(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.cameraView.getCameraSessionObject());
                            break;
                        }
                        break;
                    default:
                        if (!chatAttachAlertPhotoLayout.takingPhoto && (cameraViewInternal2 = chatAttachAlertPhotoLayout.cameraView) != null && cameraViewInternal2.isInited()) {
                            chatAttachAlertPhotoLayout.canSaveCameraPreview = false;
                            chatAttachAlertPhotoLayout.cameraView.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                                    ImageView imageView2 = chatAttachAlertPhotoLayout2.switchCameraButton;
                                    CameraViewInternal cameraViewInternal3 = chatAttachAlertPhotoLayout2.cameraView;
                                    imageView2.setImageResource((cameraViewInternal3 == null || !cameraViewInternal3.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                                    ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout2.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                                }
                            });
                            duration.start();
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.dropDown = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i3 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i3, this.resourcesProvider));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.dropDownDrawable = drawableMutate;
        int color = Theme.getColor(i3, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        anonymousClass9.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
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
        ActionBarMenuItem actionBarMenuItem = this.parentAlert.selectedMenuItem;
        actionBarMenuItem.createPopupLayout();
        toggleButton.setMinimumWidth(AndroidUtilities.dp(196.0f));
        toggleButton.setTag(8);
        actionBarMenuItem.popupLayout.linearLayout.addView(toggleButton);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) toggleButton.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        toggleButton.setLayoutParams(layoutParams);
        toggleButton.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda2(actionBarMenuItem, 2));
        this.starsItem = this.parentAlert.selectedMenuItem.addSubItem(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.parentAlert.selectedMenuItem.setFitSubItems(true);
        final int i4 = 0;
        ?? r0 = new RecyclerListView(this, context, resourcesProvider) {
            public final ChatAttachAlertPhotoLayout this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                switch (i4) {
                    case 0:
                        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.this$0.parentAlert.scrollOffsetY[0] - AndroidUtilities.dp(80.0f)) {
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                        return false;
                    default:
                        return super.onInterceptTouchEvent(motionEvent);
                }
            }

            @Override
            public void onLayout(boolean z3, int i5, int i6, int i7, int i8) {
                switch (i4) {
                    case 0:
                        super.onLayout(z3, i5, i6, i7, i8);
                        PhotoViewer.getInstance().checkCurrentImageVisibility();
                        break;
                    default:
                        super.onLayout(z3, i5, i6, i7, i8);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i4) {
                    case 0:
                        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.this$0.parentAlert.scrollOffsetY[0] - AndroidUtilities.dp(80.0f)) {
                            return super.onTouchEvent(motionEvent);
                        }
                        return false;
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }

            @Override
            public void requestLayout() {
                switch (i4) {
                    case 1:
                        if (!this.this$0.cameraPhotoRecyclerViewIgnoreLayout) {
                            super.requestLayout();
                            break;
                        }
                        break;
                    default:
                        super.requestLayout();
                        break;
                }
            }
        };
        this.gridView = r0;
        r0.setFastScrollEnabled(1);
        r0.setFastScrollVisible(true);
        r0.getFastScroll().setAlpha(0.0f);
        r0.getFastScroll().usePadding = false;
        r0.getFastScroll().topOffset = ActionBar.getCurrentActionBarHeight();
        PhotoAttachAdapter photoAttachAdapter = new PhotoAttachAdapter(context, z2);
        this.adapter = photoAttachAdapter;
        r0.setAdapter(photoAttachAdapter);
        CameraViewItemDecoration cameraViewItemDecoration = new CameraViewItemDecoration(r0);
        this.cameraViewItemDecoration = cameraViewItemDecoration;
        r0.addItemDecoration(cameraViewItemDecoration);
        for (int i5 = 0; i5 < 8; i5++) {
            photoAttachAdapter.viewsCache.add(photoAttachAdapter.createHolder());
        }
        r0.setClipToPadding(false);
        r0.setItemAnimator(null);
        r0.setLayoutAnimation(null);
        r0.setVerticalScrollBarEnabled(false);
        r0.setGlowColor(Theme.getColor(Theme.key_dialogScrollGlow, this.resourcesProvider));
        addView((View) r0, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        r0.setOnScrollListener(new CacheControlActivity.AnonymousClass5(this, 1));
        int i6 = 2;
        StickersAlert.AnonymousClass7 anonymousClass7 = new StickersAlert.AnonymousClass7(this, this.itemSize, i6);
        this.layoutManager = anonymousClass7;
        anonymousClass7.mSpanSizeLookup = new PeerColorActivity.Page.AnonymousClass2(this, i6);
        r0.setLayoutManager(anonymousClass7);
        r0.setOnItemClickListener(new LoginActivity$$ExternalSyntheticLambda31(this, z2, resourcesProvider, 9));
        r0.setOnItemLongClickListener(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(this, 0));
        RecyclerViewItemRangeSelector recyclerViewItemRangeSelector = new RecyclerViewItemRangeSelector(new RecyclerViewItemRangeSelector.RecyclerViewItemRangeSelectorDelegate() {
            @Override
            public final boolean isIndexSelectable(int i7) {
                return ChatAttachAlertPhotoLayout.this.adapter.getItemViewType(i7) == 0;
            }

            @Override
            public final boolean isSelected(int i7) {
                MediaController.PhotoEntry photo = ChatAttachAlertPhotoLayout.this.adapter.getPhoto(i7);
                return photo != null && ChatAttachAlertPhotoLayout.selectedPhotos.containsKey(Integer.valueOf(photo.imageId));
            }

            @Override
            public final void onStartStopSelection(boolean z3) {
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                chatAttachAlertPhotoLayout.alertOnlyOnce = z3 ? 1 : 0;
                chatAttachAlertPhotoLayout.gridView.hideSelector(true);
            }

            @Override
            public final void setSelected(View view, boolean z3) {
                if (z3 == ChatAttachAlertPhotoLayout.this.shouldSelect && (view instanceof PhotoAttachPhotoCell)) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
                    photoAttachPhotoCell.delegate.onCheckClick(photoAttachPhotoCell);
                }
            }
        });
        this.itemRangeSelector = recyclerViewItemRangeSelector;
        r0.mOnItemTouchListeners.add(recyclerViewItemRangeSelector);
        this.iBlur3Capture = r0;
        this.iBlur3CaptureView = r0;
        this.occupyNavigationBar = true;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, resourcesProvider);
        this.progressView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString(R.string.NoPhotos));
        emptyTextProgressView.setOnTouchListener(null);
        emptyTextProgressView.setTextSize(16);
        addView(emptyTextProgressView, LayoutHelper.createFrame(-2.0f, -1));
        if (this.loading) {
            emptyTextProgressView.showProgress();
        } else {
            emptyTextProgressView.showTextView();
        }
        final Paint paint = new Paint(1);
        paint.setColor(-2468275);
        ?? r1 = new TextView(context) {
            public float alpha = 0.0f;
            public boolean isIncr;

            @Override
            public final void onDraw(Canvas canvas) {
                int i7 = (int) ((this.alpha * 130.0f) + 125.0f);
                Paint paint2 = paint;
                paint2.setAlpha(i7);
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
                canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint2);
                invalidate();
            }
        };
        this.recordTime = r1;
        AndroidUtilities.updateViewVisibilityAnimated(r1, false, 1.0f, false);
        r1.setBackgroundResource(R.drawable.system);
        r1.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        r1.setTextSize(1, 15.0f);
        r1.setTypeface(AndroidUtilities.bold());
        r1.setAlpha(0.0f);
        r1.setTextColor(-1);
        r1.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView((View) r1, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 10);
        this.cameraPanel = anonymousClass60;
        anonymousClass60.setVisibility(8);
        anonymousClass60.setAlpha(0.0f);
        container.addView(anonymousClass60, LayoutHelper.createFrame(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.counterTextView = textView2;
        textView2.setBackgroundResource(R.drawable.photos_rounded);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.photos_arrow, 0);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        container.addView(textView2, LayoutHelper.createFrame(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        final int i7 = 2;
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal;
                ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal2;
                final ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
                switch (i7) {
                    case 0:
                        chatAttachAlertPhotoLayout.dropDownContainer.toggleSubMenu(null, null);
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.flashAnimationInProgress && (cameraViewInternal = chatAttachAlertPhotoLayout.cameraView) != null && cameraViewInternal.isInited() && chatAttachAlertPhotoLayout.cameraOpened) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.cameraView.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.flashAnimationInProgress = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.flashModeButton;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                nextFlashMode.getClass();
                                switch (nextFlashMode) {
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
                                AnimatorSet animatorSet = new AnimatorSet();
                                float[] fArr = {0.0f, AndroidUtilities.dp(48.0f)};
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                animatorSet.addListener(new EmojiView.AnonymousClass35(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        if (chatAttachAlertPhotoLayout.cameraView != null) {
                            chatAttachAlertPhotoLayout.openPhotoViewer(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.cameraView.getCameraSessionObject());
                            break;
                        }
                        break;
                    default:
                        if (!chatAttachAlertPhotoLayout.takingPhoto && (cameraViewInternal2 = chatAttachAlertPhotoLayout.cameraView) != null && cameraViewInternal2.isInited()) {
                            chatAttachAlertPhotoLayout.canSaveCameraPreview = false;
                            chatAttachAlertPhotoLayout.cameraView.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                                    ImageView imageView2 = chatAttachAlertPhotoLayout2.switchCameraButton;
                                    CameraViewInternal cameraViewInternal3 = chatAttachAlertPhotoLayout2.cameraView;
                                    imageView2.setImageResource((cameraViewInternal3 == null || !cameraViewInternal3.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                                    ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout2.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                                }
                            });
                            duration.start();
                            break;
                        }
                        break;
                }
            }
        });
        ZoomControlView zoomControlView = new ZoomControlView(context);
        this.zoomControlView = zoomControlView;
        zoomControlView.setVisibility(8);
        zoomControlView.setAlpha(0.0f);
        container.addView(zoomControlView, LayoutHelper.createFrame(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        zoomControlView.setDelegate(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(this, 3));
        ShutterButton shutterButton = new ShutterButton(context);
        this.shutterButton = shutterButton;
        anonymousClass60.addView(shutterButton, LayoutHelper.createFrame(84, 84, 17));
        shutterButton.setDelegate(new AnonymousClass10(resourcesProvider, container));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.switchCameraButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anonymousClass60.addView(imageView, LayoutHelper.createFrame(48, 48, 21));
        final int i8 = 3;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal;
                ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal2;
                final ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
                switch (i8) {
                    case 0:
                        chatAttachAlertPhotoLayout.dropDownContainer.toggleSubMenu(null, null);
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.flashAnimationInProgress && (cameraViewInternal = chatAttachAlertPhotoLayout.cameraView) != null && cameraViewInternal.isInited() && chatAttachAlertPhotoLayout.cameraOpened) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.cameraView.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.flashAnimationInProgress = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.flashModeButton;
                                ImageView imageView2 = imageViewArr[0];
                                if (imageView2 == view) {
                                    imageView2 = imageViewArr[1];
                                }
                                imageView2.setVisibility(0);
                                nextFlashMode.getClass();
                                switch (nextFlashMode) {
                                    case "on":
                                        imageView2.setImageResource(R.drawable.flash_on);
                                        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
                                        break;
                                    case "off":
                                        imageView2.setImageResource(R.drawable.flash_off);
                                        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
                                        break;
                                    case "auto":
                                        imageView2.setImageResource(R.drawable.flash_auto);
                                        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                                        break;
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                float[] fArr = {0.0f, AndroidUtilities.dp(48.0f)};
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                animatorSet.addListener(new EmojiView.AnonymousClass35(chatAttachAlertPhotoLayout, view, imageView2, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        if (chatAttachAlertPhotoLayout.cameraView != null) {
                            chatAttachAlertPhotoLayout.openPhotoViewer(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.cameraView.getCameraSessionObject());
                            break;
                        }
                        break;
                    default:
                        if (!chatAttachAlertPhotoLayout.takingPhoto && (cameraViewInternal2 = chatAttachAlertPhotoLayout.cameraView) != null && cameraViewInternal2.isInited()) {
                            chatAttachAlertPhotoLayout.canSaveCameraPreview = false;
                            chatAttachAlertPhotoLayout.cameraView.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                                    ImageView imageView3 = chatAttachAlertPhotoLayout2.switchCameraButton;
                                    CameraViewInternal cameraViewInternal3 = chatAttachAlertPhotoLayout2.cameraView;
                                    imageView3.setImageResource((cameraViewInternal3 == null || !cameraViewInternal3.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                                    ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout2.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                                }
                            });
                            duration.start();
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i9 = 0; i9 < 2; i9++) {
            this.flashModeButton[i9] = new ImageView(context);
            this.flashModeButton[i9].setScaleType(ImageView.ScaleType.CENTER);
            this.flashModeButton[i9].setVisibility(4);
            this.cameraPanel.addView(this.flashModeButton[i9], LayoutHelper.createFrame(48, 48, 51));
            final int i10 = 1;
            this.flashModeButton[i9].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal;
                    ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal2;
                    final ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
                    switch (i10) {
                        case 0:
                            chatAttachAlertPhotoLayout.dropDownContainer.toggleSubMenu(null, null);
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.flashAnimationInProgress && (cameraViewInternal = chatAttachAlertPhotoLayout.cameraView) != null && cameraViewInternal.isInited() && chatAttachAlertPhotoLayout.cameraOpened) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.cameraView.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.cameraView.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.flashAnimationInProgress = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.flashModeButton;
                                    ImageView imageView2 = imageViewArr[0];
                                    if (imageView2 == view) {
                                        imageView2 = imageViewArr[1];
                                    }
                                    imageView2.setVisibility(0);
                                    nextFlashMode.getClass();
                                    switch (nextFlashMode) {
                                        case "on":
                                            imageView2.setImageResource(R.drawable.flash_on);
                                            imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
                                            break;
                                        case "off":
                                            imageView2.setImageResource(R.drawable.flash_off);
                                            imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
                                            break;
                                        case "auto":
                                            imageView2.setImageResource(R.drawable.flash_auto);
                                            imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                                            break;
                                    }
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    float[] fArr = {0.0f, AndroidUtilities.dp(48.0f)};
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
                                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                    animatorSet.addListener(new EmojiView.AnonymousClass35(chatAttachAlertPhotoLayout, view, imageView2, 3));
                                    animatorSet.start();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            if (chatAttachAlertPhotoLayout.cameraView != null) {
                                chatAttachAlertPhotoLayout.openPhotoViewer(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.cameraView.getCameraSessionObject());
                                break;
                            }
                            break;
                        default:
                            if (!chatAttachAlertPhotoLayout.takingPhoto && (cameraViewInternal2 = chatAttachAlertPhotoLayout.cameraView) != null && cameraViewInternal2.isInited()) {
                                chatAttachAlertPhotoLayout.canSaveCameraPreview = false;
                                chatAttachAlertPhotoLayout.cameraView.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public final void onAnimationEnd(Animator animator) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                                        ImageView imageView3 = chatAttachAlertPhotoLayout2.switchCameraButton;
                                        CameraViewInternal cameraViewInternal3 = chatAttachAlertPhotoLayout2.cameraView;
                                        imageView3.setImageResource((cameraViewInternal3 == null || !cameraViewInternal3.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                                        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout2.switchCameraButton, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                                    }
                                });
                                duration.start();
                                break;
                            }
                            break;
                    }
                }
            });
            this.flashModeButton[i9].setContentDescription("flash mode " + i9);
        }
        TextView textView3 = new TextView(context);
        this.tooltipTextView = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(zzlm.m(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.cameraPanel.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        final int i11 = 1;
        ?? r2 = new RecyclerListView(this, context, resourcesProvider) {
            public final ChatAttachAlertPhotoLayout this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                switch (i11) {
                    case 0:
                        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.this$0.parentAlert.scrollOffsetY[0] - AndroidUtilities.dp(80.0f)) {
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                        return false;
                    default:
                        return super.onInterceptTouchEvent(motionEvent);
                }
            }

            @Override
            public void onLayout(boolean z3, int i12, int i13, int i14, int i15) {
                switch (i11) {
                    case 0:
                        super.onLayout(z3, i12, i13, i14, i15);
                        PhotoViewer.getInstance().checkCurrentImageVisibility();
                        break;
                    default:
                        super.onLayout(z3, i12, i13, i14, i15);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i11) {
                    case 0:
                        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.this$0.parentAlert.scrollOffsetY[0] - AndroidUtilities.dp(80.0f)) {
                            return super.onTouchEvent(motionEvent);
                        }
                        return false;
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }

            @Override
            public void requestLayout() {
                switch (i11) {
                    case 1:
                        if (!this.this$0.cameraPhotoRecyclerViewIgnoreLayout) {
                            super.requestLayout();
                            break;
                        }
                        break;
                    default:
                        super.requestLayout();
                        break;
                }
            }
        };
        this.cameraPhotoRecyclerView = r2;
        r2.setVerticalScrollBarEnabled(true);
        PhotoAttachAdapter photoAttachAdapter2 = new PhotoAttachAdapter(context, false);
        this.cameraAttachAdapter = photoAttachAdapter2;
        r2.setAdapter(photoAttachAdapter2);
        for (int i12 = 0; i12 < 8; i12++) {
            photoAttachAdapter2.viewsCache.add(photoAttachAdapter2.createHolder());
        }
        r2.setClipToPadding(false);
        r2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        r2.setItemAnimator(null);
        r2.setLayoutAnimation(null);
        r2.setOverScrollMode(2);
        r2.setVisibility(4);
        r2.setAlpha(0.0f);
        container.addView((View) r2, LayoutHelper.createFrame(80.0f, -1));
        PhotoViewer.AnonymousClass36 anonymousClass36 = new PhotoViewer.AnonymousClass36(i, 6, null == true ? 1 : 0);
        this.cameraPhotoLayoutManager = anonymousClass36;
        r2.setLayoutManager(anonymousClass36);
        r2.setOnItemClickListener(new AuctionBidSheet$$ExternalSyntheticLambda6(2));
    }

    public static PhotoAttachPhotoCell access$1100(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i) {
        int childCount = chatAttachAlertPhotoLayout.gridView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.gridView;
            View childAt = anonymousClass3.getChildAt(i2);
            if (childAt.getTop() < anonymousClass3.getMeasuredHeight() - chatAttachAlertPhotoLayout.parentAlert.getClipLayoutBottom() && (childAt instanceof PhotoAttachPhotoCell)) {
                PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                if (photoAttachPhotoCell.getImageView().getTag() != null && ((Integer) photoAttachPhotoCell.getImageView().getTag()).intValue() == i) {
                    return photoAttachPhotoCell;
                }
            }
        }
        return null;
    }

    public static boolean areLivePhotosEnabled() {
        HashMap map = selectedPhotos;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                if (photoEntry.isLivePhoto() && photoEntry.isUnalivePhoto()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean captionForAllMedia() {
        CharSequence charSequence;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = selectedPhotosOrder;
            if (i >= arrayList.size()) {
                break;
            }
            Object obj = selectedPhotos.get(arrayList.get(i));
            if (obj instanceof MediaController.PhotoEntry) {
                charSequence = ((MediaController.PhotoEntry) obj).caption;
            } else {
                charSequence = obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).caption : null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                i2++;
            }
            i++;
        }
        return i2 <= 1;
    }

    public int getTopScrollOffset() {
        return ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.listAdditionalH;
    }

    public final int addToSelectedPhotos(MediaController.PhotoEntry photoEntry, int i) {
        Integer numValueOf = Integer.valueOf(photoEntry.imageId);
        HashMap map = selectedPhotos;
        boolean zContainsKey = map.containsKey(numValueOf);
        ArrayList arrayList = selectedPhotosOrder;
        if (zContainsKey) {
            photoEntry.starsAmount = 0L;
            photoEntry.hasSpoiler = false;
            photoEntry.discardLivePhoto = null;
            photoEntry.highQuality = null;
            map.remove(numValueOf);
            int iIndexOf = arrayList.indexOf(numValueOf);
            if (iIndexOf >= 0) {
                arrayList.remove(iIndexOf);
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
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if ((entry.getValue() instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) entry.getValue()).isLivePhoto()) {
                    photoEntry.discardLivePhoto = Boolean.valueOf(!areLivePhotosEnabled());
                    break;
                }
            }
        }
        photoEntry.highQuality = Boolean.valueOf(photoEntry.isHighQuality());
        boolean zCheckSelectedCount = checkSelectedCount(true);
        map.put(numValueOf, photoEntry);
        arrayList.add(numValueOf);
        if (zCheckSelectedCount) {
            updateCheckedPhotos();
            return -1;
        }
        updatePhotosCounter(true);
        return -1;
    }

    public final void applyCameraViewPosition() {
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
            AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(8, this, layoutParams));
        }
    }

    @Override
    public final void applyCaption(Editable editable) {
        Object obj;
        int i = 0;
        while (true) {
            ArrayList arrayList = selectedPhotosOrder;
            if (i >= arrayList.size()) {
                return;
            }
            if (i == 0) {
                Object obj2 = arrayList.get(i);
                HashMap map = selectedPhotos;
                Object obj3 = map.get(obj2);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntryClone = ((MediaController.PhotoEntry) obj3).clone();
                    CharSequence[] charSequenceArr = {editable};
                    photoEntryClone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                    photoEntryClone.caption = charSequenceArr[0];
                    obj = photoEntryClone;
                } else if (obj3 instanceof MediaController.SearchImage) {
                    obj = obj3;
                    MediaController.SearchImage searchImageClone = ((MediaController.SearchImage) obj3).clone();
                    CharSequence[] charSequenceArr2 = {editable};
                    searchImageClone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr2, false);
                    searchImageClone.caption = charSequenceArr2[0];
                    obj = searchImageClone;
                }
                obj = obj3;
                map.put(obj2, obj);
            }
            i++;
        }
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.cameraOpened;
    }

    @Override
    public final boolean canScheduleMessages() {
        Iterator it = selectedPhotos.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
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

    public final void checkCamera(boolean z) {
        PhotoAttachAdapter photoAttachAdapter;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.destroyed || !this.needCamera) {
            return;
        }
        boolean z2 = this.deviceHasGoodCamera;
        boolean z3 = this.noCameraPermissions;
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        BaseFragment lastFragment = baseFragment == null ? LaunchActivity.getLastFragment() : baseFragment;
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
                        baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
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
        if (chatAttachAlert.destroyed || !chatAttachAlert.isShowing() || !this.deviceHasGoodCamera || chatAttachAlert.getBackDrawable().getAlpha() == 0 || this.cameraOpened) {
            return;
        }
        showCamera();
    }

    public final void checkCameraViewPosition() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        float[] fArr;
        AnonymousClass8 anonymousClass8;
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().stickerMakerView != null && PhotoViewer.getInstance().stickerMakerView.isThanosInProgress) {
            return;
        }
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.invalidateOutline();
        }
        int i = this.itemsPerRow - 1;
        AnonymousClass3 anonymousClass3 = this.gridView;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = anonymousClass3.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition2 != null) {
            viewHolderFindViewHolderForAdapterPosition2.itemView.invalidateOutline();
        }
        if ((!this.adapter.needCamera || !this.deviceHasGoodCamera || this.selectedAlbumEntry != this.galleryAlbumEntry) && (viewHolderFindViewHolderForAdapterPosition = anonymousClass3.findViewHolderForAdapterPosition(0)) != null) {
            viewHolderFindViewHolderForAdapterPosition.itemView.invalidateOutline();
        }
        CameraViewInternal cameraViewInternal2 = this.cameraView;
        if (cameraViewInternal2 != null) {
            cameraViewInternal2.invalidate();
        }
        if (Build.VERSION.SDK_INT >= 23 && (anonymousClass8 = this.recordTime) != null) {
            ((ViewGroup.MarginLayoutParams) anonymousClass8.getLayoutParams()).topMargin = getRootWindowInsets() == null ? AndroidUtilities.dp(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
        }
        if (this.deviceHasGoodCamera) {
            int childCount = anonymousClass3.getChildCount();
            int i2 = 0;
            while (true) {
                fArr = this.cameraViewLocation;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = anonymousClass3.getChildAt(i2);
                if (childAt instanceof PhotoAttachCameraCell) {
                    if (!childAt.isAttachedToWindow()) {
                        break;
                    }
                    float y = getY() + anonymousClass3.getY() + childAt.getY();
                    ChatAttachAlert chatAttachAlert = this.parentAlert;
                    float y2 = chatAttachAlert.getSheetContainer().getY() + y;
                    float x = chatAttachAlert.getSheetContainer().getX() + getX() + anonymousClass3.getX() + childAt.getX();
                    if (Build.VERSION.SDK_INT >= 23) {
                        x -= getRootWindowInsets().getSystemWindowInsetLeft();
                    }
                    float currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + (!chatAttachAlert.inBubbleMode ? AndroidUtilities.statusBarHeight : 0);
                    IntroActivity.AnonymousClass1 anonymousClass1 = chatAttachAlert.topCommentContainer;
                    float alpha = (anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight()) + currentActionBarHeight;
                    ChatAttachAlert.AnonymousClass36 anonymousClass36 = chatAttachAlert.mentionContainer;
                    if (anonymousClass36 != null && anonymousClass36.isReversed()) {
                        float y3 = chatAttachAlert.mentionContainer.getY();
                        ChatAttachAlert.AnonymousClass36 anonymousClass37 = chatAttachAlert.mentionContainer;
                        alpha = Math.max(alpha, (((anonymousClass37.getVisibility() == 0 && anonymousClass37.isReversed()) ? anonymousClass37.containerBottom : 0.0f) + y3) - chatAttachAlert.currentPanTranslationY);
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
                    int measuredHeight = chatAttachAlert.getSheetContainer().getMeasuredHeight();
                    ChatAttachAlert.AnonymousClass15 anonymousClass15 = chatAttachAlert.buttonsRecyclerView;
                    float translationY = (int) (anonymousClass15.getTranslationY() + (measuredHeight - anonymousClass15.getMeasuredHeight()));
                    ChatAttachAlert.AnonymousClass36 anonymousClass38 = chatAttachAlert.mentionContainer;
                    if (anonymousClass38 != null) {
                        translationY -= anonymousClass38.clipBottom() - AndroidUtilities.dp(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y > translationY) {
                        this.cameraViewOffsetBottomY = Math.min(-AndroidUtilities.dp(5.0f), y - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.cameraViewOffsetBottomY = 0.0f;
                    }
                    fArr[0] = x;
                    fArr[1] = y2;
                    applyCameraViewPosition();
                    return;
                }
                i2++;
            }
            if (this.cameraViewOffsetY != 0.0f) {
                this.cameraViewOffsetY = 0.0f;
                CameraViewInternal cameraViewInternal4 = this.cameraView;
                if (cameraViewInternal4 != null) {
                    cameraViewInternal4.invalidateOutline();
                    this.cameraView.invalidate();
                }
            }
            fArr[0] = AndroidUtilities.dp(-400.0f);
            fArr[1] = 0.0f;
            applyCameraViewPosition();
        }
    }

    @Override
    public final void checkColors() {
        boolean z = this.forceDarkTheme;
        int i = z ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack;
        int i2 = Theme.key_emptyListPlaceholder;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.progressView.setTextColor(Theme.getColor(i2, resourcesProvider));
        int color = Theme.getColor(Theme.key_dialogScrollGlow, resourcesProvider);
        AnonymousClass3 anonymousClass3 = this.gridView;
        anonymousClass3.setGlowColor(color);
        anonymousClass3.findViewHolderForAdapterPosition(0);
        this.dropDown.setTextColor(Theme.getColor(i, resourcesProvider));
        int color2 = Theme.getColor(z ? Theme.key_voipgroup_actionBarItems : Theme.key_actionBarDefaultSubmenuItem, resourcesProvider);
        ThemePreviewActivity.AnonymousClass9 anonymousClass9 = this.dropDownContainer;
        anonymousClass9.setPopupItemsColor(color2, false);
        anonymousClass9.setPopupItemsColor(Theme.getColor(z ? Theme.key_voipgroup_actionBarItems : Theme.key_actionBarDefaultSubmenuItem, resourcesProvider), true);
        anonymousClass9.redrawPopup(Theme.getColor(z ? Theme.key_voipgroup_actionBarUnscrolled : Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
        Theme.setDrawableColor(Theme.getColor(i, resourcesProvider), this.dropDownDrawable);
    }

    public final boolean checkSelectedCount(boolean z) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            HashMap map = selectedPhotos;
            if (map.size() <= 10 - (z ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = selectedPhotosOrder;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = map.get(arrayList.get(0));
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            addToSelectedPhotos((MediaController.PhotoEntry) obj, -1);
            z2 = true;
        }
        return z2;
    }

    public final boolean checkSendMediaEnabled(MediaController.PhotoEntry photoEntry) {
        boolean z = this.videoEnabled;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (!z && photoEntry.isVideo) {
            if (chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                return true;
            }
            UserNameResolver$$ExternalSyntheticOutline0.m(R.string.GlobalAttachVideoRestricted, new BulletinFactory(chatAttachAlert.sizeNotifierFrameLayout, resourcesProvider), null);
            return true;
        }
        if (this.photoEnabled || photoEntry.isVideo) {
            return false;
        }
        if (chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
            return true;
        }
        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.GlobalAttachPhotoRestricted, new BulletinFactory(chatAttachAlert.sizeNotifierFrameLayout, resourcesProvider), null);
        return true;
    }

    public final void checkStorage() {
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

    public final void clearSelectedPhotos() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        ActionBarMenuSubItem actionBarMenuSubItem = this.spoilerItem;
        actionBarMenuSubItem.setText(string);
        actionBarMenuSubItem.setAnimatedIcon(R.raw.photo_spoiler);
        this.parentAlert.selectedMenuItem.showSubItem$1(1);
        HashMap map = selectedPhotos;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).reset();
            }
            map.clear();
            selectedPhotosOrder.clear();
        }
        ArrayList arrayList = cameraPhotos;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i);
                new File(photoEntry.path).delete();
                if (photoEntry.imagePath != null) {
                    new File(photoEntry.imagePath).delete();
                }
                if (photoEntry.thumbPath != null) {
                    new File(photoEntry.thumbPath).delete();
                }
            }
            arrayList.clear();
        }
        this.adapter.notifyDataSetChanged();
        this.cameraAttachAdapter.notifyDataSetChanged();
    }

    public final void closeCamera(boolean z) {
        CameraViewInternal cameraViewInternal;
        int i = 2;
        if (this.takingPhoto || this.cameraView == null) {
            return;
        }
        int i2 = this.itemSize;
        int[] iArr = this.animateCameraValues;
        iArr[1] = i2;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i2 * 2);
        Runnable runnable = this.zoomControlHideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.zoomControlHideRunnable = null;
        }
        boolean z2 = ((double) AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider))) > 0.721d;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        AndroidUtilities.setLightNavigationBar(chatAttachAlert, z2);
        TextView textView = this.counterTextView;
        AnonymousClass3 anonymousClass3 = this.cameraPhotoRecyclerView;
        ChatActivity.AnonymousClass60 anonymousClass60 = this.cameraPanel;
        AnonymousClass3 anonymousClass4 = this.gridView;
        ImageView[] imageViewArr = this.flashModeButton;
        ZoomControlView zoomControlView = this.zoomControlView;
        if (z) {
            this.additionCloseCameraY = this.cameraView.getTranslationY();
            this.cameraAnimationInProgress = true;
            if (anonymousClass4 != null) {
                anonymousClass4.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(zoomControlView, (Property<ZoomControlView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass3, (Property<AnonymousClass3, Float>) property, 0.0f));
            for (int i3 = 0; i3 < 2; i3++) {
                if (imageViewArr[i3].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i3], (Property<ImageView, Float>) property, 0.0f));
                    break;
                }
            }
            this.notificationsLocker.lock();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet.addListener(new AnonymousClass16(this, i));
            animatorSet.start();
        } else {
            this.cameraExpanded = false;
            chatAttachAlert.getWindow().clearFlags(128);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            anonymousClass60.setAlpha(0.0f);
            anonymousClass60.setVisibility(8);
            zoomControlView.setAlpha(0.0f);
            zoomControlView.setTag(null);
            zoomControlView.setVisibility(8);
            anonymousClass3.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            anonymousClass3.setVisibility(8);
            for (int i4 = 0; i4 < 2; i4++) {
                if (imageViewArr[i4].getVisibility() == 0) {
                    imageViewArr[i4].setAlpha(0.0f);
                    break;
                }
            }
            this.cameraOpened = false;
            CameraViewInternal cameraViewInternal2 = this.cameraView;
            if (cameraViewInternal2 != null) {
                cameraViewInternal2.setFpsLimit(30);
                this.cameraView.setSystemUiVisibility(1024);
            }
            if (anonymousClass4 != null) {
                anonymousClass4.invalidate();
            }
        }
        CameraViewInternal cameraViewInternal3 = this.cameraView;
        if (cameraViewInternal3 != null) {
            cameraViewInternal3.setImportantForAccessibility(0);
        }
        anonymousClass4.setImportantForAccessibility(0);
        if (LiteMode.isEnabled(360928) || (cameraViewInternal = this.cameraView) == null) {
            return;
        }
        cameraViewInternal.showTexture(false, z);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ChatAttachAlert chatAttachAlert;
        if (i != NotificationCenter.albumsDidLoad) {
            if (i == NotificationCenter.cameraInitied) {
                checkCamera(false);
                return;
            }
            return;
        }
        PhotoAttachAdapter photoAttachAdapter = this.adapter;
        if (photoAttachAdapter != null) {
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
            photoAttachAdapter.notifyDataSetChanged();
            this.cameraAttachAdapter.notifyDataSetChanged();
            ArrayList arrayList = selectedPhotosOrder;
            if (!arrayList.isEmpty() && this.galleryAlbumEntry != null) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Integer num = (Integer) arrayList.get(i5);
                    HashMap map = selectedPhotos;
                    Object obj = map.get(num);
                    MediaController.PhotoEntry photoEntry = this.galleryAlbumEntry.photosByIds.get(num.intValue());
                    if (photoEntry != null) {
                        if (obj instanceof MediaController.PhotoEntry) {
                            photoEntry.copyFrom((MediaController.PhotoEntry) obj);
                        }
                        map.put(num, photoEntry);
                    }
                }
            }
            updateAlbumsDropDown();
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        MediaController.AlbumEntry albumEntry = this.selectedAlbumEntry;
        ArrayList<Object> arrayList = cameraPhotos;
        if (albumEntry == null) {
            return !arrayList.isEmpty() ? arrayList : new ArrayList<>(0);
        }
        if (arrayList.isEmpty()) {
            return this.selectedAlbumEntry.photos;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.selectedAlbumEntry.photos.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.selectedAlbumEntry.photos);
        return arrayList2;
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
        AnonymousClass3 anonymousClass3 = this.gridView;
        int childCount = anonymousClass3.getChildCount();
        EmptyTextProgressView emptyTextProgressView = this.progressView;
        if (childCount <= 0) {
            anonymousClass3.setTopGlowOffset(anonymousClass3.getPaddingTop());
            emptyTextProgressView.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = anonymousClass3.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass3.findContainingViewHolder(childAt);
        int top = childAt.getTop() - this.listAdditionalH;
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        emptyTextProgressView.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - emptyTextProgressView.getMeasuredHeight()) / 2.0f) + top);
        anonymousClass3.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return getPaddingTop();
    }

    public final MediaController.PhotoEntry getPhotoEntryAtPosition(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = cameraPhotos;
        int size = arrayList.size();
        if (i < size) {
            return (MediaController.PhotoEntry) arrayList.get(i);
        }
        int i2 = i - size;
        MediaController.AlbumEntry albumEntry = this.selectedAlbumEntry;
        if (albumEntry == null || i2 >= albumEntry.photos.size()) {
            return null;
        }
        return this.selectedAlbumEntry.photos.get(i2);
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
        Iterator it = selectedPhotos.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    public final void hideCamera(boolean z) {
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

    public final boolean isNoGalleryPermissions() {
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

    public final void loadGalleryPhotos() {
        if ((shouldLoadAllMedia() ? MediaController.allMediaAlbumEntry : MediaController.allPhotosAlbumEntry) == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    @Override
    public final int needsActionBar() {
        return 1;
    }

    public final void onActivityResultFragment(int i, Intent intent, String str) throws Throwable {
        String path;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i2;
        int i3;
        String str2 = str;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.destroyed) {
            return;
        }
        mediaFromExternalCamera = true;
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        Bitmap bitmapCreateVideoThumbnail = null;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        if (i == 0) {
            PhotoViewer.getInstance().setParentActivity(baseFragment.getParentActivity(), null, this.resourcesProvider);
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            int i4 = chatAttachAlert.maxSelectedPhotos;
            boolean z = chatAttachAlert.allowOrder;
            photoViewer.maxSelectedPhotos = i4;
            photoViewer.allowOrder = z;
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
            int i5 = i2;
            int i6 = lastImageId;
            lastImageId = i6 - 1;
            MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i6, 0L, str2, ((Integer) imageOrientation.first).intValue(), false, i5, i3, 0L).setOrientation(imageOrientation);
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
        Intent intent2 = (intent == null || str2 == null || !ArticleViewer.IBlock.CC.m(str2)) ? intent : null;
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
                if (path == null || !ArticleViewer.IBlock.CC.m(path)) {
                    path = str2;
                }
            }
            if (!(baseFragment instanceof ChatActivity) || !((ChatActivity) baseFragment).isSecretChat()) {
                AndroidUtilities.addMediaToGallery(str2);
            }
            str2 = null;
        } else {
            path = null;
        }
        if (path != null || str2 == null || !ArticleViewer.IBlock.CC.m(str2)) {
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
                            bitmapCreateVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str2, 1);
                            File file = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                            bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file));
                            SharedConfig.saveConfig();
                            int i7 = lastImageId;
                            lastImageId = i7 - 1;
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i7, 0L, str2, 0, true, bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), 0L);
                            photoEntry.duration = (int) jCeil;
                            photoEntry.thumbPath = file.getAbsolutePath();
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
            bitmapCreateVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str2, 1);
            File file2 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
            SharedConfig.saveConfig();
            int i8 = lastImageId;
            lastImageId = i8 - 1;
            MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i8, 0L, str2, 0, true, bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), 0L);
            photoEntry2.duration = (int) jCeil;
            photoEntry2.thumbPath = file2.getAbsolutePath();
            openPhotoViewer(photoEntry2, false, true);
        } catch (Throwable th4) {
            th = th4;
            mediaMetadataRetriever = bitmapCreateVideoThumbnail;
        }
    }

    @Override
    public final void onButtonsTranslationYUpdated() {
        checkCameraViewPosition();
        invalidate();
    }

    @Override
    public final void onContainerTranslationUpdated(float f) {
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
    public final boolean onContainerViewTouchEvent(MotionEvent motionEvent) {
        CameraViewInternal cameraViewInternal;
        if (!this.cameraAnimationInProgress) {
            if (this.cameraOpened && motionEvent != null) {
                boolean z = this.pressed;
                ZoomControlView zoomControlView = this.zoomControlView;
                if ((!z && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.hitRect;
                    zoomControlView.getHitRect(rect);
                    if (zoomControlView.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
                            return true;
                        }
                    }
                } else if (this.pressed) {
                    int actionMasked = motionEvent.getActionMasked();
                    TextView textView = this.counterTextView;
                    AnonymousClass3 anonymousClass3 = this.cameraPhotoRecyclerView;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.flashModeButton;
                    ChatActivity.AnonymousClass60 anonymousClass60 = this.cameraPanel;
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
                                    zoomControlView.setZoom(this.cameraZoom, false);
                                    this.parentAlert.getSheetContainer().invalidate();
                                    this.cameraView.setZoom(this.cameraZoom);
                                    showZoomControls(true);
                                    return true;
                                }
                            } else if (Math.abs(fHypot - this.pinchStartDistance) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                this.pinchStartDistance = fHypot;
                                this.zoomWas = true;
                                return true;
                            }
                        } else {
                            float y = motionEvent.getY();
                            float f2 = y - this.lastY;
                            if (this.maybeStartDraging) {
                                if (Math.abs(f2) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.maybeStartDraging = false;
                                    this.dragging = true;
                                    return true;
                                }
                            } else if (this.dragging && (cameraViewInternal = this.cameraView) != null) {
                                cameraViewInternal.setTranslationY(cameraViewInternal.getTranslationY() + f2);
                                this.lastY = y;
                                zoomControlView.setTag(null);
                                Runnable runnable = this.zoomControlHideRunnable;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.zoomControlHideRunnable = null;
                                }
                                if (anonymousClass60.getTag() == null) {
                                    anonymousClass60.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) property, 0.0f), ObjectAnimator.ofFloat(zoomControlView, (Property<ZoomControlView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(anonymousClass3, (Property<AnonymousClass3, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                    animatorSet.start();
                                    return true;
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
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.cameraView, (Property<CameraViewInternal, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(anonymousClass3, (Property<AnonymousClass3, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.interpolator);
                                animatorSet2.start();
                                anonymousClass60.setTag(null);
                                return true;
                            }
                        } else {
                            CameraViewInternal cameraViewInternal3 = this.cameraView;
                            if (cameraViewInternal3 != null && !this.zoomWas) {
                                int[] iArr = this.viewPosition;
                                cameraViewInternal3.getLocationOnScreen(iArr);
                                this.cameraView.focusToPoint((int) (motionEvent.getRawX() - iArr[0]), (int) (motionEvent.getRawY() - iArr[1]));
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final void onDestroy() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    @Override
    public final boolean onDismiss() {
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
    public final void onDismissWithButtonClick(int i) {
        hideCamera((i == 0 || i == 2) ? false : true);
    }

    @Override
    public final void onHidden() {
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.setVisibility(8);
        }
        for (Map.Entry entry : selectedPhotos.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.adapter.notifyDataSetChanged();
    }

    @Override
    public final void onHide() {
        this.isHidden = true;
        AnonymousClass3 anonymousClass3 = this.gridView;
        int childCount = anonymousClass3.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (anonymousClass3.getChildAt(i) instanceof PhotoAttachCameraCell) {
                saveLastCameraBitmap();
                break;
            }
            this.cameraViewItemDecoration.updateBitmap();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.headerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = this.dropDown.animate().alpha(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.EASE_BOTH).withEndAction(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(this, 3));
        this.headerAnimator = viewPropertyAnimatorWithEndAction;
        viewPropertyAnimatorWithEndAction.start();
        pauseCameraPreview();
    }

    @Override
    public final void onHideShowProgress(float f) {
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public final void onMenuItemClick(int i) {
        TLRPC.Chat chat;
        boolean z;
        boolean z2;
        int i2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i3 = 1;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (i == 8) {
            chatAttachAlert.setCaptionAbove(!chatAttachAlert.captionAbove, true);
            this.captionItem.setState(!chatAttachAlert.captionAbove, true);
            return;
        }
        if ((i == 0 || i == 1) && chatAttachAlert.maxSelectedPhotos > 0 && selectedPhotosOrder.size() > 1 && (chat = chatAttachAlert.getChat()) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
            AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.resourcesProvider).show();
            return;
        }
        HashMap map = selectedPhotos;
        if (i == 0) {
            if (chatAttachAlert.editingMessageObject == null) {
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) baseFragment).getDialogId(), -1L, 0, new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(this, i3), null, this.resourcesProvider);
                    return;
                }
            }
            long dialogId = chatAttachAlert.getDialogId();
            int additionalMessagesCount = chatAttachAlert.getAdditionalMessagesCount() + map.size();
            final Object[] objArr3 = objArr2 == true ? 1 : 0;
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, dialogId, additionalMessagesCount, new Utilities.Callback(this) {
                public final ChatAttachAlertPhotoLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    Long l = (Long) obj;
                    switch (objArr3) {
                        case 0:
                            ChatAttachAlert chatAttachAlert2 = this.f$0.parentAlert;
                            chatAttachAlert2.applyCaption();
                            chatAttachAlert2.delegate.didPressedButton(7, false, true, 0, 0, 0L, chatAttachAlert2.isCaptionAbove(), false, l.longValue());
                            break;
                        default:
                            ChatAttachAlert chatAttachAlert3 = this.f$0.parentAlert;
                            chatAttachAlert3.applyCaption();
                            chatAttachAlert3.delegate.didPressedButton(4, true, true, 0, 0, 0L, chatAttachAlert3.isCaptionAbove(), false, l.longValue());
                            break;
                    }
                }
            }, 0L);
            return;
        }
        if (i == 1) {
            if (chatAttachAlert.editingMessageObject == null) {
                BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
                if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) baseFragment2).getDialogId(), -1L, 0, new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(this, i2), null, this.resourcesProvider);
                    return;
                }
            }
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + map.size(), new Utilities.Callback(this) {
                public final ChatAttachAlertPhotoLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    Long l = (Long) obj;
                    switch (i3) {
                        case 0:
                            ChatAttachAlert chatAttachAlert2 = this.f$0.parentAlert;
                            chatAttachAlert2.applyCaption();
                            chatAttachAlert2.delegate.didPressedButton(7, false, true, 0, 0, 0L, chatAttachAlert2.isCaptionAbove(), false, l.longValue());
                            break;
                        default:
                            ChatAttachAlert chatAttachAlert3 = this.f$0.parentAlert;
                            chatAttachAlert3.applyCaption();
                            chatAttachAlert3.delegate.didPressedButton(4, true, true, 0, 0, 0L, chatAttachAlert3.isCaptionAbove(), false, l.longValue());
                            break;
                    }
                }
            }, 0L);
            return;
        }
        PhotoAttachAdapter photoAttachAdapter = this.adapter;
        AnonymousClass3 anonymousClass3 = this.gridView;
        if (i == 3) {
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = chatAttachAlert.photoPreviewLayout;
            if (chatAttachAlertPhotoLayoutPreview != null) {
                chatAttachAlertPhotoLayoutPreview.startMediaCrossfade();
            }
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).hasSpoiler) {
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
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
                            ActionBarMenuSubItem actionBarMenuSubItem = chatAttachAlertPhotoLayout.spoilerItem;
                            boolean z4 = z3;
                            actionBarMenuSubItem.setText(LocaleController.getString(z4 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z4) {
                                actionBarMenuSubItem.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                actionBarMenuSubItem.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            ChatAttachAlert chatAttachAlert2 = chatAttachAlertPhotoLayout.parentAlert;
                            if (!z4) {
                                chatAttachAlert2.selectedMenuItem.showSubItem$1(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    chatAttachAlert2.selectedMenuItem.showSubItem$1(6);
                                }
                            } else {
                                chatAttachAlert2.selectedMenuItem.hideSubItem(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    chatAttachAlert2.selectedMenuItem.hideSubItem(6);
                                }
                            }
                            break;
                        default:
                            ActionBarMenuSubItem actionBarMenuSubItem2 = this.f$0.qualityItem;
                            boolean z5 = z3;
                            actionBarMenuSubItem2.setText(LocaleController.getString(z5 ? R.string.SendInStandardQuality : R.string.SendInHighQuality));
                            if (!z5) {
                                actionBarMenuSubItem2.setIcon(R.drawable.menu_quality_hd);
                            } else {
                                actionBarMenuSubItem2.setIcon(R.drawable.menu_quality_sd);
                            }
                            break;
                    }
                }
            }, 200L);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    photoEntry.hasSpoiler = z3;
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                    photoEntry.isAttachSpoilerRevealed = false;
                    arrayList.add(Integer.valueOf(photoEntry.imageId));
                }
            }
            anonymousClass3.forAllChild(new Bulletin$2$$ExternalSyntheticLambda2(i3, arrayList, z3));
            if (chatAttachAlert.currentAttachLayout != this) {
                photoAttachAdapter.notifyDataSetChanged();
            }
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview2 = chatAttachAlert.photoPreviewLayout;
            if (chatAttachAlertPhotoLayoutPreview2 != null) {
                chatAttachAlertPhotoLayoutPreview2.groupsView.invalidate();
                return;
            }
            return;
        }
        if (i == 2) {
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview3 = chatAttachAlert.photoPreviewLayout;
            if (chatAttachAlertPhotoLayoutPreview3 != null) {
                chatAttachAlertPhotoLayoutPreview3.startMediaCrossfade();
            }
            Iterator it2 = map.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((MediaController.PhotoEntry) ((Map.Entry) it2.next()).getValue()).isHighQuality()) {
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
                    switch (i3) {
                        case 0:
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
                            ActionBarMenuSubItem actionBarMenuSubItem = chatAttachAlertPhotoLayout.spoilerItem;
                            boolean z5 = z4;
                            actionBarMenuSubItem.setText(LocaleController.getString(z5 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z5) {
                                actionBarMenuSubItem.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                actionBarMenuSubItem.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            ChatAttachAlert chatAttachAlert2 = chatAttachAlertPhotoLayout.parentAlert;
                            if (!z5) {
                                chatAttachAlert2.selectedMenuItem.showSubItem$1(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    chatAttachAlert2.selectedMenuItem.showSubItem$1(6);
                                }
                            } else {
                                chatAttachAlert2.selectedMenuItem.hideSubItem(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    chatAttachAlert2.selectedMenuItem.hideSubItem(6);
                                }
                            }
                            break;
                        default:
                            ActionBarMenuSubItem actionBarMenuSubItem2 = this.f$0.qualityItem;
                            boolean z6 = z4;
                            actionBarMenuSubItem2.setText(LocaleController.getString(z6 ? R.string.SendInStandardQuality : R.string.SendInHighQuality));
                            if (!z6) {
                                actionBarMenuSubItem2.setIcon(R.drawable.menu_quality_hd);
                            } else {
                                actionBarMenuSubItem2.setIcon(R.drawable.menu_quality_sd);
                            }
                            break;
                    }
                }
            }, 200L);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : map.entrySet()) {
                if (entry2.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) entry2.getValue();
                    photoEntry2.highQuality = Boolean.valueOf(z4);
                    photoEntry2.isChatPreviewSpoilerRevealed = false;
                    photoEntry2.isAttachSpoilerRevealed = false;
                    arrayList2.add(Integer.valueOf(photoEntry2.imageId));
                }
            }
            anonymousClass3.forAllChild(new Bulletin$2$$ExternalSyntheticLambda2(i2, arrayList2, z4));
            if (chatAttachAlert.currentAttachLayout != this) {
                photoAttachAdapter.notifyDataSetChanged();
            }
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview4 = chatAttachAlert.photoPreviewLayout;
            if (chatAttachAlertPhotoLayoutPreview4 != null) {
                chatAttachAlertPhotoLayoutPreview4.groupsView.invalidate();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 7) {
                chatAttachAlert.updatePhotoPreview(chatAttachAlert.currentAttachLayout != chatAttachAlert.photoPreviewLayout);
                return;
            }
            if (i == 9) {
                StarsIntroActivity.showMediaPriceSheet(getContext(), getStarsPrice(), true, new CallLogActivity$$ExternalSyntheticLambda3(this, 23), this.resourcesProvider);
                return;
            }
            if (i >= 10) {
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.dropDownAlbums.get(i - 10);
                this.selectedAlbumEntry = albumEntry;
                MediaController.AlbumEntry albumEntry2 = this.galleryAlbumEntry;
                TextView textView = this.dropDown;
                if (albumEntry == albumEntry2) {
                    textView.setText(LocaleController.getString(R.string.ChatGallery));
                } else {
                    textView.setText(albumEntry.bucketName);
                }
                photoAttachAdapter.notifyDataSetChanged();
                this.cameraAttachAdapter.notifyDataSetChanged();
                int i4 = -(anonymousClass3.getPaddingTop() - getTopScrollOffset());
                StickersAlert.AnonymousClass7 anonymousClass7 = this.layoutManager;
                anonymousClass7.scrollToPositionWithOffset(0, i4, anonymousClass7.mShouldReverseLayout);
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
                int i5 = chatAttachAlert.avatarPicker;
                BaseFragment baseFragment3 = chatAttachAlert.baseFragment;
                if (i5 != 0) {
                    baseFragment3.startActivityForResult(intentCreateChooser, 14);
                } else {
                    baseFragment3.startActivityForResult(intentCreateChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i6 = chatAttachAlert.avatarPicker;
                BaseFragment baseFragment4 = chatAttachAlert.baseFragment;
                if (i6 != 0) {
                    baseFragment4.startActivityForResult(intent3, 14);
                } else {
                    baseFragment4.startActivityForResult(intent3, 1);
                }
            }
            chatAttachAlert.dismiss(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        checkCamera(chatAttachAlert != null && (chatAttachAlert.baseFragment instanceof ChatActivity));
    }

    @Override
    public final void onPanTransitionStart(int i, boolean z) {
        checkCameraViewPosition();
        CameraViewInternal cameraViewInternal = this.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.invalidateOutline();
            this.cameraView.invalidate();
        }
    }

    @Override
    public final void onPause() {
        ShutterButton shutterButton = this.shutterButton;
        if (shutterButton == null) {
            return;
        }
        boolean z = this.requestingPermissions;
        ShutterButton.State state = ShutterButton.State.DEFAULT;
        ShutterButton.State state2 = ShutterButton.State.RECORDING;
        if (z) {
            if (this.cameraView != null && shutterButton.getState() == state2) {
                shutterButton.setState(state);
            }
            this.requestingPermissions = false;
            return;
        }
        if (this.cameraView != null && shutterButton.getState() == state2) {
            resetRecordState();
            CameraController.getInstance().stopVideoRecording(this.cameraView.getCameraSession(), false);
            shutterButton.setState(state);
        }
        if (this.cameraOpened) {
            closeCamera(false);
        }
        hideCamera(true);
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
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
        AnonymousClass3 anonymousClass3 = this.gridView;
        ((FrameLayout.LayoutParams) anonymousClass3.getLayoutParams()).topMargin = -this.listAdditionalH;
        int iDp = (i - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f);
        int i5 = this.itemsPerRow;
        int i6 = iDp / i5;
        this.itemSize = i6;
        if (this.lastItemSize != i6 || i4 != i5) {
            this.lastItemSize = i6;
            AndroidUtilities.runOnUIThread(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(this, 4));
        }
        this.layoutManager.setSpanCount(Math.max(1, ((this.itemsPerRow - 1) * AndroidUtilities.dp(2.0f)) + (this.itemSize * this.itemsPerRow)));
        PhotoAttachAdapter photoAttachAdapter = this.adapter;
        int iCeil = (int) Math.ceil((photoAttachAdapter.getItemCount() - 1) / this.itemsPerRow);
        if (this.noGalleryPermissions) {
            iM = AndroidUtilities.dp(400.0f);
        } else {
            iM = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(iCeil - 1, 2.0f, this.itemSize * iCeil);
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        int iM2 = MessageObject$$ExternalSyntheticOutline0.m((((i2 - iM) - currentActionBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(12.0f), 6.0f, 0);
        if (this.gridExtraSpace != iM2) {
            this.gridExtraSpace = iM2;
            photoAttachAdapter.notifyDataSetChanged();
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
        if (anonymousClass3.getPaddingTop() != iDp2 || anonymousClass3.getPaddingBottom() != this.listPaddingBottom) {
            anonymousClass3.setPadding(AndroidUtilities.dp(2.0f), iDp2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(48.0f) + this.listPaddingBottom);
        }
        this.dropDown.setTextSize(17.0f);
        this.ignoreLayout = false;
    }

    @Override
    public final void onResume() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (!chatAttachAlert.isShowing() || chatAttachAlert.isDismissed() || PhotoViewer.getInstance().isVisible()) {
            return;
        }
        checkCamera(false);
    }

    @Override
    public final void onSelectedItemsCountChanged(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        MessagePreviewView.ToggleButton toggleButton;
        ActionBarMenuSubItem actionBarMenuSubItem;
        long starsPrice;
        int selectedPhotosHighQualityCount;
        ActionBarMenuSubItem actionBarMenuSubItem2;
        TLRPC.ChatFull chatFull;
        boolean z6;
        long j2 = 0;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (i <= 1 || chatAttachAlert.editingMessageObject != null) {
            chatAttachAlert.selectedMenuItem.hideSubItem(0);
            if (i == 0) {
                chatAttachAlert.selectedMenuItem.showSubItem$1(4);
                chatAttachAlert.selectedMenuItem.hideSubItem(1);
            } else if (this.documentsEnabled && getStarsPrice() <= 0 && chatAttachAlert.editingMessageObject == null) {
                chatAttachAlert.selectedMenuItem.showSubItem$1(1);
                z = false;
                z2 = true;
            } else {
                chatAttachAlert.selectedMenuItem.hideSubItem(1);
            }
            z = false;
            z2 = false;
        } else {
            if (getStarsPrice() <= 0) {
                chatAttachAlert.selectedMenuItem.showSubItem$1(0);
                z = true;
            } else {
                chatAttachAlert.selectedMenuItem.hideSubItem(0);
                z = false;
            }
            if (!this.documentsEnabled || getStarsPrice() > 0) {
                chatAttachAlert.selectedMenuItem.hideSubItem(1);
                z2 = false;
            } else {
                chatAttachAlert.selectedMenuItem.showSubItem$1(1);
                z2 = true;
            }
        }
        if (i != 0) {
            chatAttachAlert.selectedMenuItem.hideSubItem(4);
        }
        ActionBarMenuSubItem actionBarMenuSubItem3 = this.compressItem;
        if (i > 1) {
            chatAttachAlert.selectedMenuItem.showSubItem$1(5);
            chatAttachAlert.selectedMenuItem.showSubItem$1(7);
            actionBarMenuSubItem3.setText(LocaleController.getString(R.string.SendAsFiles));
        } else {
            chatAttachAlert.selectedMenuItem.hideSubItem(5);
            chatAttachAlert.selectedMenuItem.hideSubItem(7);
            if (i != 0) {
                actionBarMenuSubItem3.setText(LocaleController.getString(R.string.SendAsFile));
            }
        }
        if (i > 0 && getStarsPrice() <= 0) {
            if (chatAttachAlert != null) {
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                z3 = (baseFragment instanceof ChatActivity) && !((ChatActivity) baseFragment).isSecretChat();
            }
        }
        if (i > 0 && chatAttachAlert != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
            if (chatAttachAlertPhotoLayout != null) {
                HashMap<Object, Object> selectedPhotos2 = chatAttachAlertPhotoLayout.getSelectedPhotos();
                ArrayList<Object> selectedPhotosOrder2 = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                if (!selectedPhotos2.isEmpty()) {
                    int i2 = 0;
                    z6 = false;
                    loop0: while (true) {
                        j = j2;
                        if (i2 >= Math.ceil(selectedPhotos2.size() / 10.0f)) {
                            break;
                        }
                        int i3 = i2 * 10;
                        int iMin = Math.min(10, selectedPhotos2.size() - i3);
                        Utilities.random.nextLong();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= iMin) {
                                i2++;
                                j2 = j;
                            } else {
                                int i5 = i3 + i4;
                                if (i5 < selectedPhotosOrder2.size()) {
                                    CharSequence charSequence = ((MediaController.PhotoEntry) selectedPhotos2.get(selectedPhotosOrder2.get(i5))).caption;
                                    String string = charSequence == null ? "" : charSequence.toString();
                                    if (chatAttachAlert.getCommentView() != null && TextUtils.isEmpty(string) && i4 == 0) {
                                        string = chatAttachAlert.getCommentView().getText().toString();
                                    }
                                    if (TextUtils.isEmpty(string)) {
                                        continue;
                                    } else if (!z6) {
                                        z6 = true;
                                    }
                                }
                                i4++;
                            }
                        }
                    }
                } else {
                    j = 0;
                }
                z6 = false;
                break loop0;
            } else {
                j = 0;
                z6 = false;
                break loop0;
            }
            if (z6 && (chatAttachAlert.baseFragment instanceof ChatActivity)) {
                z4 = true;
            }
            if (i > 0 || chatAttachAlert == null) {
                z5 = false;
            } else {
                BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
                if ((baseFragment2 instanceof ChatActivity) && ChatObject.isChannelAndNotMegaGroup(((ChatActivity) baseFragment2).currentChat) && (chatFull = ((ChatActivity) chatAttachAlert.baseFragment).chatInfo) != null && chatFull.paid_media_allowed) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            if (!z3) {
                String string2 = LocaleController.getString(R.string.EnablePhotoSpoiler);
                ActionBarMenuSubItem actionBarMenuSubItem4 = this.spoilerItem;
                actionBarMenuSubItem4.setText(string2);
                actionBarMenuSubItem4.setAnimatedIcon(R.raw.photo_spoiler);
                chatAttachAlert.selectedMenuItem.hideSubItem(3);
            } else if (chatAttachAlert != null) {
                chatAttachAlert.selectedMenuItem.showSubItem$1(3);
            }
            if (chatAttachAlert != null) {
                if (getSelectedPhotosCount() == i) {
                    selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                    actionBarMenuSubItem2 = this.qualityItem;
                    if (selectedPhotosHighQualityCount > 0) {
                        actionBarMenuSubItem2.setText(LocaleController.getString(R.string.SendInStandardQuality));
                        actionBarMenuSubItem2.setIcon(R.drawable.menu_quality_sd);
                    } else {
                        actionBarMenuSubItem2.setText(LocaleController.getString(R.string.SendInHighQuality));
                        actionBarMenuSubItem2.setIcon(R.drawable.menu_quality_hd);
                    }
                    chatAttachAlert.selectedMenuItem.showSubItem$1(2);
                } else {
                    chatAttachAlert.selectedMenuItem.hideSubItem(2);
                }
            }
            toggleButton = this.captionItem;
            if (z4) {
                toggleButton.setVisibility(0);
            } else {
                toggleButton.setVisibility(8);
            }
            if ((!z3 || z4) && (z2 || z)) {
                chatAttachAlert.selectedMenuItem.showSubItem$1(6);
            } else {
                chatAttachAlert.selectedMenuItem.hideSubItem(6);
            }
            if (z5) {
                chatAttachAlert.selectedMenuItem.hideSubItem(9);
                return;
            }
            actionBarMenuSubItem = this.starsItem;
            if (actionBarMenuSubItem != null) {
                starsPrice = getStarsPrice();
                if (starsPrice > j) {
                    actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    actionBarMenuSubItem.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
                } else {
                    actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaButton));
                    actionBarMenuSubItem.setSubtext(null);
                }
            }
            forAllChild(new ChatUsersActivity$8$$ExternalSyntheticLambda1(1));
            chatAttachAlert.selectedMenuItem.showSubItem$1(9);
        }
        j = 0;
        z4 = false;
        if (i > 0) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (!z3) {
            String string3 = LocaleController.getString(R.string.EnablePhotoSpoiler);
            ActionBarMenuSubItem actionBarMenuSubItem5 = this.spoilerItem;
            actionBarMenuSubItem5.setText(string3);
            actionBarMenuSubItem5.setAnimatedIcon(R.raw.photo_spoiler);
            chatAttachAlert.selectedMenuItem.hideSubItem(3);
        } else if (chatAttachAlert != null) {
            chatAttachAlert.selectedMenuItem.showSubItem$1(3);
        }
        if (chatAttachAlert != null) {
            if (getSelectedPhotosCount() == i) {
                selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                actionBarMenuSubItem2 = this.qualityItem;
                if (selectedPhotosHighQualityCount > 0) {
                    actionBarMenuSubItem2.setText(LocaleController.getString(R.string.SendInStandardQuality));
                    actionBarMenuSubItem2.setIcon(R.drawable.menu_quality_sd);
                } else {
                    actionBarMenuSubItem2.setText(LocaleController.getString(R.string.SendInHighQuality));
                    actionBarMenuSubItem2.setIcon(R.drawable.menu_quality_hd);
                }
                chatAttachAlert.selectedMenuItem.showSubItem$1(2);
            } else {
                chatAttachAlert.selectedMenuItem.hideSubItem(2);
            }
        }
        toggleButton = this.captionItem;
        if (z4) {
            toggleButton.setVisibility(0);
        } else {
            toggleButton.setVisibility(8);
        }
        if (z3) {
            chatAttachAlert.selectedMenuItem.showSubItem$1(6);
        } else {
            chatAttachAlert.selectedMenuItem.showSubItem$1(6);
        }
        if (z5) {
            chatAttachAlert.selectedMenuItem.hideSubItem(9);
            return;
        }
        actionBarMenuSubItem = this.starsItem;
        if (actionBarMenuSubItem != null) {
            starsPrice = getStarsPrice();
            if (starsPrice > j) {
                actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                actionBarMenuSubItem.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaButton));
                actionBarMenuSubItem.setSubtext(null);
            }
        }
        forAllChild(new ChatUsersActivity$8$$ExternalSyntheticLambda1(1));
        chatAttachAlert.selectedMenuItem.showSubItem$1(9);
    }

    @Override
    public final boolean onSheetKeyDown(int i) {
        if (!this.cameraOpened) {
            return false;
        }
        if (i != 24 && i != 25 && i != 79 && i != 85) {
            return false;
        }
        ((AnonymousClass10) this.shutterButton.getDelegate()).shutterReleased();
        return true;
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        ViewPropertyAnimator viewPropertyAnimator = this.headerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.dropDownContainer.setVisibility(0);
        boolean z = attachAlertLayout instanceof ChatAttachAlertPhotoLayoutPreview;
        TextView textView = this.dropDown;
        if (z) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            this.headerAnimator = interpolator;
            interpolator.start();
        } else {
            clearSelectedPhotos();
            textView.setAlpha(1.0f);
        }
        this.parentAlert.actionBar.setTitle("");
        StickersAlert.AnonymousClass7 anonymousClass7 = this.layoutManager;
        anonymousClass7.scrollToPositionWithOffset(0, 0, anonymousClass7.mShouldReverseLayout);
        if (z) {
            post(new EmojiView$2$$ExternalSyntheticLambda1(7, this, attachAlertLayout));
        }
        checkCameraViewPosition();
        resumeCameraPreview();
    }

    @Override
    public final void onShown() {
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

    public final void openCamera(boolean z) {
        CameraViewInternal cameraViewInternal;
        int i = 1;
        if (this.cameraView == null || this.cameraInitAnimation != null) {
            return;
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.isDismissed()) {
            return;
        }
        this.cameraView.initTexture();
        boolean zShouldLoadAllMedia = shouldLoadAllMedia();
        TextView textView = this.tooltipTextView;
        if (zShouldLoadAllMedia) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean zIsEmpty = cameraPhotos.isEmpty();
        TextView textView2 = this.counterTextView;
        AnonymousClass3 anonymousClass3 = this.cameraPhotoRecyclerView;
        if (zIsEmpty) {
            textView2.setVisibility(4);
            anonymousClass3.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            anonymousClass3.setVisibility(0);
        }
        if (chatAttachAlert.getCommentView().keyboardVisible && isFocusable()) {
            AndroidUtilities.hideKeyboard(chatAttachAlert.getCommentView().editText);
        }
        ZoomControlView zoomControlView = this.zoomControlView;
        zoomControlView.setVisibility(0);
        zoomControlView.setAlpha(0.0f);
        ChatActivity.AnonymousClass60 anonymousClass60 = this.cameraPanel;
        anonymousClass60.setVisibility(0);
        anonymousClass60.setTag(null);
        int[] iArr = this.animateCameraValues;
        iArr[0] = 0;
        int i2 = this.itemSize;
        iArr[1] = i2;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i2 * 2);
        this.additionCloseCameraY = 0.0f;
        this.cameraExpanded = true;
        CameraViewInternal cameraViewInternal2 = this.cameraView;
        if (cameraViewInternal2 != null) {
            cameraViewInternal2.setFpsLimit(-1);
        }
        AndroidUtilities.hideKeyboard(this);
        AndroidUtilities.setLightNavigationBar((Dialog) chatAttachAlert, false);
        chatAttachAlert.getWindow().addFlags(128);
        AnonymousClass3 anonymousClass4 = this.gridView;
        ImageView[] imageViewArr = this.flashModeButton;
        if (z) {
            setCameraOpenProgress(0.0f);
            this.cameraAnimationInProgress = true;
            if (anonymousClass4 != null) {
                anonymousClass4.invalidate();
            }
            this.notificationsLocker.lock();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass3, (Property<AnonymousClass3, Float>) property, 1.0f));
            for (int i3 = 0; i3 < 2; i3++) {
                if (imageViewArr[i3].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i3], (Property<ImageView, Float>) property, 1.0f));
                    break;
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet.addListener(new AnonymousClass16(this, i));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            anonymousClass60.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            anonymousClass3.setAlpha(1.0f);
            for (int i4 = 0; i4 < 2; i4++) {
                if (imageViewArr[i4].getVisibility() == 0) {
                    imageViewArr[i4].setAlpha(1.0f);
                    break;
                }
            }
            chatAttachAlert.delegate.onCameraOpened();
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
        anonymousClass4.setImportantForAccessibility(4);
        anonymousClass4.invalidate();
        if (LiteMode.isEnabled(360928) || (cameraViewInternal = this.cameraView) == null || !cameraViewInternal.isInited()) {
            return;
        }
        this.cameraView.showTexture(true, z);
    }

    public final void openCameraByClick() {
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

    public final void openPhotoViewer(MediaController.PhotoEntry photoEntry, boolean z, boolean z2) {
        int i;
        ChatActivity chatActivity;
        int i2;
        ChatActivity chatActivity2;
        ArrayList<Object> arrayList;
        int size;
        ArrayList arrayList2 = cameraPhotos;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            selectedPhotos.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            selectedPhotosOrder.add(Integer.valueOf(photoEntry.imageId));
            chatAttachAlert.updateCountButton(0);
            this.adapter.notifyDataSetChanged();
            this.cameraAttachAdapter.notifyDataSetChanged();
        }
        if (photoEntry != null && !z2 && arrayList2.size() > 1) {
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
        if (arrayList2.isEmpty()) {
            return;
        }
        this.cancelTakingPhotos = true;
        BaseFragment lastFragment = chatAttachAlert.baseFragment;
        if (lastFragment == null) {
            lastFragment = LaunchActivity.getLastFragment();
        }
        if (lastFragment == null) {
            return;
        }
        PhotoViewer.getInstance().setParentActivity(lastFragment.getParentActivity(), null, this.resourcesProvider);
        PhotoViewer.getInstance().setParentAlert(chatAttachAlert);
        PhotoViewer photoViewer = PhotoViewer.getInstance();
        int i3 = chatAttachAlert.maxSelectedPhotos;
        boolean z3 = chatAttachAlert.allowOrder;
        photoViewer.maxSelectedPhotos = i3;
        photoViewer.allowOrder = z3;
        boolean z4 = chatAttachAlert.isPhotoPicker;
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        if (z4 && chatAttachAlert.isStickerMode) {
            chatActivity = (ChatActivity) baseFragment;
            i = 11;
        } else if (chatAttachAlert.avatarPicker != 0) {
            chatActivity = null;
            i = 1;
        } else if (baseFragment instanceof ChatActivity) {
            chatActivity = (ChatActivity) baseFragment;
            i = 2;
        } else {
            i = 5;
            chatActivity = null;
        }
        boolean z5 = chatAttachAlert.isPollAttach;
        if (z5) {
            chatActivity2 = null;
            i2 = 13;
        } else {
            i2 = i;
            chatActivity2 = chatActivity;
        }
        if (chatAttachAlert.avatarPicker != 0 || z5) {
            arrayList = new ArrayList<>();
            arrayList.add(photoEntry);
            size = 0;
        } else {
            arrayList = getAllPhotosArray();
            size = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        ImageUpdater.AvatarFor avatarFor = chatAttachAlert.setAvatarFor;
        if (avatarFor != null && photoEntry != null) {
            avatarFor.isVideo = photoEntry.isVideo;
        }
        PhotoViewer.getInstance().openPhotoForSelect(arrayList3, size, i2, false, new AnonymousClass15(z), chatActivity2);
        PhotoViewer.getInstance().setAvatarFor(chatAttachAlert.setAvatarFor);
        if (chatAttachAlert.isStickerMode) {
            PhotoViewer.getInstance().enableStickerMode(null, null, false, chatAttachAlert.customStickerHandler);
            PhotoViewer.getInstance().prepareSegmentImage();
        }
    }

    public final void pauseCameraPreview() {
        try {
            if (this.cameraView != null) {
                CameraController.getInstance().stopPreview(this.cameraView.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void resetRecordState() {
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

    public final void resumeCameraPreview() {
        try {
            checkCamera(false);
            if (this.cameraView != null) {
                CameraController.getInstance().startPreview(this.cameraView.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void saveLastCameraBitmap() {
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

    @Override
    public final void scrollToTop() {
        smoothScrollToPosition(0);
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
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        float width = (chatAttachAlert.getContainer().getWidth() - chatAttachAlert.getLeftInset()) - chatAttachAlert.getRightInset();
        float height = chatAttachAlert.getContainer().getHeight();
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

    public final void setCurrentSpoilerVisible(int i, final boolean z) {
        PhotoViewer photoViewer = PhotoViewer.getInstance();
        if (i == -1) {
            i = photoViewer.currentIndex;
        }
        ArrayList arrayList = photoViewer.imagesArrLocals;
        if (arrayList == null || arrayList.isEmpty() || i >= arrayList.size() || !(arrayList.get(i) instanceof MediaController.PhotoEntry) || !((MediaController.PhotoEntry) arrayList.get(i)).hasSpoiler) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i);
        forAllChild(new Consumer() {
            @Override
            public final void accept(Object obj) {
                View view = (View) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
                chatAttachAlertPhotoLayout.getClass();
                if (view instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
                    if (photoAttachPhotoCell.getPhotoEntry() == photoEntry) {
                        photoAttachPhotoCell.setHasSpoiler(z, Float.valueOf(250.0f));
                        photoAttachPhotoCell.setStarsPrice(chatAttachAlertPhotoLayout.getStarsPrice(), ChatAttachAlertPhotoLayout.selectedPhotos.size() > 1);
                    }
                }
            }
        });
    }

    public void setIncludeVideosInGallery(boolean z) {
        this.includeVideosInGallery = z;
    }

    public void setStarsPrice(long j) {
        HashMap map = selectedPhotos;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue();
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
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.getSheetAnimationType() == 1) {
            float f2 = (f / 40.0f) * (-0.1f);
            AnonymousClass3 anonymousClass3 = this.gridView;
            int childCount = anonymousClass3.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = anonymousClass3.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    float f3 = 1.0f + f2;
                    photoAttachPhotoCell.getCheckBox().setScaleX(f3);
                    photoAttachPhotoCell.getCheckBox().setScaleY(f3);
                }
            }
        }
        super.setTranslationY(f);
        chatAttachAlert.getSheetContainer().invalidate();
        invalidate();
    }

    public final boolean shouldLoadAllMedia() {
        if (this.includeVideosInGallery) {
            return true;
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.isPhotoPicker) {
            return false;
        }
        return (chatAttachAlert.baseFragment instanceof ChatActivity) || chatAttachAlert.storyMediaPicker || chatAttachAlert.avatarPicker == 2;
    }

    public final void showAvatarConstructorFragment(AvatarConstructorPreviewCell avatarConstructorPreviewCell, TLRPC.VideoSize videoSize, long j) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        AvatarConstructorFragment avatarConstructorFragment = new AvatarConstructorFragment(chatAttachAlert.parentImageUpdater, chatAttachAlert.setAvatarFor);
        ImageUpdater.AvatarFor avatarFor = chatAttachAlert.setAvatarFor;
        avatarConstructorFragment.finishOnDone = avatarFor == null || avatarFor.type != 2;
        chatAttachAlert.baseFragment.presentFragment(avatarConstructorFragment);
        if (avatarConstructorPreviewCell != null) {
            avatarConstructorFragment.startFrom(avatarConstructorPreviewCell);
        }
        if (videoSize != null) {
            avatarConstructorFragment.startFrom(videoSize);
        }
        if (j != 0) {
            avatarConstructorFragment.startFrom(j);
        }
        avatarConstructorFragment.delegate = new ChatActivity$$ExternalSyntheticLambda189(27, this, avatarConstructorFragment);
    }

    public final void showCamera() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (!chatAttachAlert.paused && this.mediaEnabled && CameraView.isCameraAllowed()) {
            if (this.cameraView == null) {
                boolean z = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.isCameraFrontfaceBeforeEnteringEditMode;
                CameraViewInternal cameraViewInternal = new CameraViewInternal(context, bool != null ? bool.booleanValue() : chatAttachAlert.openWithFrontFaceCamera, z);
                this.cameraView = cameraViewInternal;
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                cameraViewInternal.setRecordFile(AndroidUtilities.generateVideoPath((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isSecretChat()));
                this.cameraView.setFocusable(true);
                this.cameraView.setFpsLimit(30);
                this.cameraView.setOutlineProvider(new PremiumPreviewFragment.AnonymousClass3(this, 2));
                this.cameraView.setClipToOutline(true);
                this.cameraView.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                BottomSheet.ContainerView container = chatAttachAlert.getContainer();
                CameraViewInternal cameraViewInternal2 = this.cameraView;
                int i = this.itemSize;
                container.addView(cameraViewInternal2, 1, new FrameLayout.LayoutParams(i, i));
                this.cameraView.setDelegate(new AnonymousClass19());
                this.cameraView.setAlpha(this.mediaEnabled ? 1.0f : 0.2f);
                this.cameraView.setEnabled(this.mediaEnabled);
                if (this.isHidden) {
                    this.cameraView.setVisibility(8);
                }
                if (!this.cameraOpened) {
                    checkCameraViewPosition();
                }
                AnonymousClass3 anonymousClass3 = this.gridView;
                if (anonymousClass3 != null) {
                    anonymousClass3.invalidate();
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

    public final void showZoomControls(boolean z) {
        int i = 0;
        int i2 = 1;
        ZoomControlView zoomControlView = this.zoomControlView;
        if ((zoomControlView.getTag() != null && z) || (zoomControlView.getTag() == null && !z)) {
            if (z) {
                Runnable runnable = this.zoomControlHideRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12 chatAttachAlertPhotoLayout$$ExternalSyntheticLambda12 = new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(this, i2);
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
        zoomControlView.setTag(z ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.zoomControlAnimation = animatorSet2;
        animatorSet2.setDuration(180L);
        this.zoomControlAnimation.playTogether(ObjectAnimator.ofFloat(zoomControlView, (Property<ZoomControlView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.zoomControlAnimation.addListener(new AnonymousClass16(this, i));
        this.zoomControlAnimation.start();
        if (z) {
            ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12 chatAttachAlertPhotoLayout$$ExternalSyntheticLambda13 = new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(this, 2);
            this.zoomControlHideRunnable = chatAttachAlertPhotoLayout$$ExternalSyntheticLambda13;
            AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout$$ExternalSyntheticLambda13, 2000L);
        }
    }

    public final void updateAlbumsDropDown() {
        ThemePreviewActivity.AnonymousClass9 anonymousClass9 = this.dropDownContainer;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = anonymousClass9.popupLayout;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.linearLayout.removeAllViews();
        }
        if (this.mediaEnabled) {
            ArrayList<MediaController.AlbumEntry> arrayList = shouldLoadAllMedia() ? MediaController.allMediaAlbums : MediaController.allPhotoAlbums;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.dropDownAlbums = arrayList2;
            Collections.sort(arrayList2, new GalleryListView$$ExternalSyntheticLambda9(arrayList, 1));
        } else {
            this.dropDownAlbums = new ArrayList();
        }
        boolean zIsEmpty = this.dropDownAlbums.isEmpty();
        TextView textView = this.dropDown;
        if (zIsEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.dropDownDrawable, (Drawable) null);
        int size = this.dropDownAlbums.size();
        for (int i = 0; i < size; i++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.dropDownAlbums.get(i);
            AlbumButton albumButton = new AlbumButton(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.resourcesProvider);
            anonymousClass9.getPopupLayout().linearLayout.addView(albumButton);
            albumButton.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i + 10, 3));
        }
    }

    public final void updateCheckedPhotoIndices() {
        ArrayList arrayList;
        if (this.parentAlert.baseFragment instanceof ChatActivity) {
            AnonymousClass3 anonymousClass3 = this.gridView;
            int childCount = anonymousClass3.getChildCount();
            int i = 0;
            while (true) {
                arrayList = selectedPhotosOrder;
                if (i >= childCount) {
                    break;
                }
                View childAt = anonymousClass3.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    MediaController.PhotoEntry photoEntryAtPosition = getPhotoEntryAtPosition(((Integer) photoAttachPhotoCell.getTag()).intValue());
                    if (photoEntryAtPosition != null) {
                        photoAttachPhotoCell.setNum(arrayList.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)));
                    }
                }
                i++;
            }
            AnonymousClass3 anonymousClass4 = this.cameraPhotoRecyclerView;
            int childCount2 = anonymousClass4.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = anonymousClass4.getChildAt(i2);
                if (childAt2 instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell2 = (PhotoAttachPhotoCell) childAt2;
                    MediaController.PhotoEntry photoEntryAtPosition2 = getPhotoEntryAtPosition(((Integer) photoAttachPhotoCell2.getTag()).intValue());
                    if (photoEntryAtPosition2 != null) {
                        photoAttachPhotoCell2.setNum(arrayList.indexOf(Integer.valueOf(photoEntryAtPosition2.imageId)));
                    }
                }
            }
        }
    }

    public final void updateCheckedPhotos() {
        ArrayList arrayList;
        HashMap map;
        BaseFragment baseFragment;
        PhotoAttachAdapter photoAttachAdapter;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.baseFragment instanceof ChatActivity) {
            AnonymousClass3 anonymousClass3 = this.gridView;
            int childCount = anonymousClass3.getChildCount();
            int i = 0;
            while (true) {
                arrayList = selectedPhotosOrder;
                map = selectedPhotos;
                baseFragment = chatAttachAlert.baseFragment;
                photoAttachAdapter = this.adapter;
                if (i >= childCount) {
                    break;
                }
                View childAt = anonymousClass3.getChildAt(i);
                if (childAt instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                    if (photoAttachAdapter.hasCameraSpaceRow && childAdapterPosition > this.itemsPerRow) {
                        childAdapterPosition--;
                    }
                    if (photoAttachAdapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry) {
                        childAdapterPosition--;
                    }
                    MediaController.PhotoEntry photoEntryAtPosition = getPhotoEntryAtPosition(childAdapterPosition);
                    photoAttachPhotoCell.setHasSpoiler(photoEntryAtPosition != null && photoEntryAtPosition.hasSpoiler);
                    photoAttachPhotoCell.setHighQuality(photoEntryAtPosition != null && photoEntryAtPosition.isHighQuality());
                    if ((baseFragment instanceof ChatActivity) && chatAttachAlert.allowOrder) {
                        photoAttachPhotoCell.setChecked(photoEntryAtPosition != null ? arrayList.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)) : -1, photoEntryAtPosition != null && map.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), true);
                    } else {
                        photoAttachPhotoCell.setChecked(-1, photoEntryAtPosition != null && map.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), true);
                    }
                }
                i++;
            }
            AnonymousClass3 anonymousClass4 = this.cameraPhotoRecyclerView;
            int childCount2 = anonymousClass4.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = anonymousClass4.getChildAt(i2);
                if (childAt2 instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell2 = (PhotoAttachPhotoCell) childAt2;
                    int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(childAt2);
                    if (photoAttachAdapter.hasCameraSpaceRow && childAdapterPosition2 > this.itemsPerRow) {
                        childAdapterPosition2--;
                    }
                    if (photoAttachAdapter.needCamera && this.selectedAlbumEntry == this.galleryAlbumEntry) {
                        childAdapterPosition2--;
                    }
                    MediaController.PhotoEntry photoEntryAtPosition2 = getPhotoEntryAtPosition(childAdapterPosition2);
                    photoAttachPhotoCell2.setHasSpoiler(photoEntryAtPosition2 != null && photoEntryAtPosition2.hasSpoiler);
                    photoAttachPhotoCell2.setHighQuality(photoEntryAtPosition2 != null && photoEntryAtPosition2.isHighQuality());
                    if ((baseFragment instanceof ChatActivity) && chatAttachAlert.allowOrder) {
                        photoAttachPhotoCell2.setChecked(photoEntryAtPosition2 != null ? arrayList.indexOf(Integer.valueOf(photoEntryAtPosition2.imageId)) : -1, photoEntryAtPosition2 != null && map.containsKey(Integer.valueOf(photoEntryAtPosition2.imageId)), true);
                    } else {
                        photoAttachPhotoCell2.setChecked(-1, photoEntryAtPosition2 != null && map.containsKey(Integer.valueOf(photoEntryAtPosition2.imageId)), true);
                    }
                }
            }
        }
    }

    public final void updatePhotosCounter(boolean z) {
        TextView textView = this.counterTextView;
        if (textView != null) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (chatAttachAlert.avatarPicker != 0 || chatAttachAlert.storyMediaPicker || chatAttachAlert.isPollAttach) {
                return;
            }
            HashMap map = selectedPhotos;
            Iterator it = map.entrySet().iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).isVideo) {
                    z2 = true;
                } else {
                    z3 = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
            int iMax = Math.max(1, map.size());
            TextView textView2 = chatAttachAlert.selectedTextView;
            if (z2 && z3) {
                textView.setText(LocaleController.formatPluralString("Media", map.size(), new Object[0]).toUpperCase());
                if (iMax != this.currentSelectedCount || z) {
                    textView2.setText(LocaleController.formatPluralString("MediaSelected", iMax, new Object[0]));
                }
            } else if (z2) {
                textView.setText(LocaleController.formatPluralString("Videos", map.size(), new Object[0]).toUpperCase());
                if (iMax != this.currentSelectedCount || z) {
                    textView2.setText(LocaleController.formatPluralString("VideosSelected", iMax, new Object[0]));
                }
            } else {
                textView.setText(LocaleController.formatPluralString("Photos", map.size(), new Object[0]).toUpperCase());
                if (iMax != this.currentSelectedCount || z) {
                    textView2.setText(LocaleController.formatPluralString("PhotosSelected", iMax, new Object[0]));
                }
            }
            boolean z4 = iMax > 1;
            chatAttachAlert.canOpenPreview = z4;
            chatAttachAlert.selectedArrowImageView.setVisibility((!z4 || chatAttachAlert.avatarPicker == 2) ? 8 : 0);
            this.currentSelectedCount = iMax;
        }
    }
}
