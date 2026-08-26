package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.Crop.CropRotationWheel;
import org.telegram.ui.Components.PhotoCropView;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.VideoPlayer;

public final class PhotoViewer$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda16(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updateQualityItems();
                break;
            case 1:
                this.f$0.pipInvalidateAvailability();
                break;
            case 2:
                this.f$0.switchToEditMode(0);
                break;
            case 3:
                this.f$0.sendPressed(true, 0, 0, false, true, false);
                break;
            case 4:
                this.f$0.sendPressed(true, 0, 0, false, false, false);
                break;
            case 5:
                this.f$0.sendPressed(false, 0, 0, true, false, false);
                break;
            case 6:
                this.f$0.showScheduleDatePickerDialog();
                break;
            case 7:
                this.f$0.sendPressed(false, 0, 0, false, false, false);
                break;
            case 8:
                PhotoCropView photoCropView = this.f$0.photoCropView;
                CropRotationWheel cropRotationWheel = photoCropView.wheelView;
                cropRotationWheel.setRotation$1(0.0f);
                cropRotationWheel.setMirrored(false);
                cropRotationWheel.setRotated(false);
                photoCropView.cropView.reset(true);
                break;
            case 9:
                this.f$0.applyCurrentEditMode();
                break;
            case 10:
                PhotoViewer photoViewer = this.f$0;
                photoViewer.coverEditor.button.setLoading(false);
                photoViewer.switchToEditMode(0);
                break;
            case 11:
                PhotoViewer photoViewer2 = this.f$0;
                photoViewer2.coverEditor.button.setLoading(false);
                photoViewer2.switchToEditMode(0);
                break;
            case 12:
                this.f$0.stickerMakerView.isThanosInProgress = false;
                break;
            case 13:
                this.f$0.paintingOverlay.setBackground(null);
                break;
            case 14:
                PhotoViewer photoViewer3 = this.f$0;
                photoViewer3.savedState = null;
                photoViewer3.applyCurrentEditMode();
                photoViewer3.switchToEditMode(0);
                break;
            case 15:
                PhotoViewer photoViewer4 = this.f$0;
                photoViewer4.coverEditor.button.setLoading(false);
                photoViewer4.switchToEditMode(0);
                break;
            case 16:
                PhotoViewer photoViewer5 = this.f$0;
                photoViewer5.coverEditor.button.setLoading(false);
                photoViewer5.switchToEditMode(0);
                break;
            case 17:
                this.f$0.switchToEditMode(0);
                break;
            case 18:
                this.f$0.updateActionBarTitlePadding();
                break;
            case 19:
                this.f$0.applyCaption$1();
                break;
            case 20:
                this.f$0.toggleMiniProgressInternal(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = this.f$0;
                if (photoViewer6.pipItem.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer6.parentActivity) && !PipVideoOverlay.instance.isVisible && photoViewer6.isPlaying) {
                    if (!photoViewer6.isEmbedVideo) {
                        photoViewer6.pipVideoOverlayAnimateFlag = false;
                        photoViewer6.switchToPip();
                    } else {
                        PhotoViewer.AnonymousClass79 anonymousClass79 = photoViewer6.photoViewerWebView;
                        if (anonymousClass79 != null) {
                            if ((!anonymousClass79.isYouTube || !"inapp".equals(MessagesController.getInstance(anonymousClass79.currentAccount).youtubePipType)) && photoViewer6.photoViewerWebView.openInPip()) {
                                photoViewer6.pipVideoOverlayAnimateFlag = false;
                                if (PhotoViewer.PipInstance != null) {
                                    PhotoViewer.PipInstance.destroyPhotoViewer();
                                }
                                photoViewer6.isInline = true;
                                PhotoViewer.PipInstance = PhotoViewer.Instance;
                                PhotoViewer.Instance = null;
                                photoViewer6.isVisible = false;
                                PhotoViewer.PlaceProviderObject placeProviderObject = photoViewer6.currentPlaceObject;
                                if (placeProviderObject != null && !placeProviderObject.imageReceiver.getVisible()) {
                                    photoViewer6.currentPlaceObject.imageReceiver.setVisible(true, true);
                                }
                                photoViewer6.clippingImageProgress = 1.0f;
                                photoViewer6.containerView.invalidate();
                                photoViewer6.dismissInternal$2();
                            }
                        }
                    }
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer7 = this.f$0;
                if (photoViewer7.isVisible && photoViewer7.animationInProgress == 0) {
                    photoViewer7.updateContainerFlags(photoViewer7.isActionBarVisible);
                    break;
                }
                break;
            case 23:
                this.f$0.invalidateBlur$1();
                break;
            case 24:
                PhotoViewer photoViewer8 = this.f$0;
                VideoPlayer videoPlayer = photoViewer8.videoPlayer;
                if (videoPlayer != null && photoViewer8.scale <= 1.35f) {
                    long currentPosition = videoPlayer.getCurrentPosition();
                    long duration = photoViewer8.videoPlayer.getDuration();
                    if (currentPosition != -9223372036854775807L && duration >= 8000) {
                        float f = photoViewer8.longPressX;
                        int containerViewWidth = photoViewer8.getContainerViewWidth(photoViewer8.currentEditMode);
                        boolean z = false;
                        if (duration <= 180000) {
                            photoViewer8.videoPlayerRewinder.startRewind(photoViewer8.videoPlayer, f > ((float) (containerViewWidth / 3)), photoViewer8.longPressX, photoViewer8.currentVideoSpeed, photoViewer8.seekSpeedDrawable);
                        } else {
                            int i = containerViewWidth / 3;
                            if (f >= i * 2) {
                                z = true;
                            } else if (f >= i) {
                            }
                            photoViewer8.longVideoPlayerRewinder.startRewind(photoViewer8.videoPlayer, z, photoViewer8.currentVideoSpeed);
                        }
                        break;
                    }
                }
                break;
            case 25:
                PhotoViewer photoViewer9 = this.f$0;
                if (photoViewer9.ads.isPopupShown()) {
                    VideoAds videoAds = photoViewer9.ads;
                    VideoPlayer videoPlayer2 = photoViewer9.videoPlayer;
                    videoAds.videoWasPlaying = videoPlayer2 == null ? true : videoPlayer2.isPlaying();
                    VideoPlayer videoPlayer3 = photoViewer9.videoPlayer;
                    if (videoPlayer3 != null) {
                        videoPlayer3.pause();
                    }
                    break;
                } else {
                    VideoPlayer videoPlayer4 = photoViewer9.videoPlayer;
                    if (videoPlayer4 != null && photoViewer9.ads.videoWasPlaying) {
                        videoPlayer4.play();
                        break;
                    }
                }
                break;
            case 26:
                this.f$0.switchToNextIndex(1, false);
                break;
            case 27:
                this.f$0.switchToNextIndex(-1, false);
                break;
            case 28:
                this.f$0.checkChangedTextureView(false);
                PipVideoOverlay.instance.dismissInternal(true, true);
                break;
            default:
                PhotoViewer photoViewer10 = this.f$0;
                photoViewer10.closePhoto(false, false);
                ChatAttachAlert chatAttachAlert = photoViewer10.parentAlert;
                if (chatAttachAlert != null) {
                    chatAttachAlert.dismiss(true);
                }
                BaseFragment baseFragment = photoViewer10.parentFragment;
                if (baseFragment != null) {
                    baseFragment.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                }
                break;
        }
    }
}
