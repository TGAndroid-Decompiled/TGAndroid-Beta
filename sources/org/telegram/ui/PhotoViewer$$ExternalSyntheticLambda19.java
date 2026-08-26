package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LivePhotoButton;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.HintView2;

public final class PhotoViewer$$ExternalSyntheticLambda19 implements View.OnClickListener {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda19(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        int i;
        VideoPlayer videoPlayer;
        int i2;
        Bitmap bitmap;
        Bitmap bitmap2;
        ChatActivity.AnonymousClass78 anonymousClass78;
        MessageObject messageObject;
        MessageSuggestionParams messageSuggestionParamsOf;
        PhotoViewer.PhotoViewerProvider photoViewerProvider;
        boolean z = false;
        z = false;
        z = false;
        final int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = this.f$0;
                photoViewer.selectedCompression = photoViewer.previousCompression;
                photoViewer.didChangedCompressionLevel();
                photoViewer.showQualityView(false);
                photoViewer.requestVideoPreview(2);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.f$0;
                photoViewer2.applyCurrentEditMode();
                photoViewer2.switchToEditMode(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.f$0;
                if (!photoViewer3.photoFilterView.hasChanges()) {
                    photoViewer3.switchToEditMode(0);
                    break;
                } else {
                    Activity activity = photoViewer3.parentActivity;
                    if (activity != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, photoViewer3.resourcesProvider);
                        String string = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.message = string;
                        alertDialog.title = LocaleController.getString("AppName", R.string.AppName);
                        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new PhotoViewer$$ExternalSyntheticLambda49(photoViewer3));
                        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer3.showAlertDialog(builder);
                        break;
                    }
                }
                break;
            case 3:
                PhotoViewer photoViewer4 = this.f$0;
                MessageObject messageObject2 = photoViewer4.currentMessageObject;
                if (messageObject2 != null && messageObject2.isSponsored()) {
                    BaseFragment baseFragment = photoViewer4.parentFragment;
                    if (baseFragment instanceof ChatActivity) {
                        ((ChatActivity) baseFragment).logSponsoredClicked(photoViewer4.currentMessageObject, false, true);
                    }
                    photoViewer4.closePhoto(true, false);
                    String str = photoViewer4.currentMessageObject.sponsoredUrl;
                    if (str != null) {
                        Context context = LaunchActivity.instance;
                        if (context == null) {
                            context = photoViewer4.activityContext;
                        }
                        Browser.openUrl(context, Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(photoViewer4.currentAccount).sponsoredLinksInappAllow, false);
                    }
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer5 = this.f$0;
                photoViewer5.eraseBtn.setActive(false, true);
                photoViewer5.restoreBtn.setActive(false, true);
                photoViewer5.switchToEditMode(0);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.f$0;
                photoViewer6.eraseBtn.setActive(false, true);
                photoViewer6.restoreBtn.setActive(false, true);
                photoViewer6.applyCurrentEditMode();
                photoViewer6.switchToEditMode(0);
                break;
            case 6:
                this.f$0.closePaintMode();
                break;
            case 7:
                PhotoViewer photoViewer7 = this.f$0;
                Object obj = photoViewer7.imagesArrLocals.get(photoViewer7.currentIndex);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer7.getCurrentVideoEditedInfo();
                }
                photoViewer7.showQualityView(false);
                photoViewer7.requestVideoPreview(2);
                break;
            case 8:
                this.f$0.sendPressed(false, 0, 0, false, false, false);
                break;
            case 9:
                this.f$0.switchToEditMode(5);
                break;
            case 10:
                PhotoViewer photoViewer8 = this.f$0;
                if (!photoViewer8.coverEditor.button.loading && (i = photoViewer8.currentIndex) >= 0 && i < photoViewer8.imagesArrLocals.size() && (photoViewer8.imagesArrLocals.get(photoViewer8.currentIndex) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer8.imagesArrLocals.get(photoViewer8.currentIndex);
                    long time = photoViewer8.coverEditor.getTime();
                    String tempFileAbsolutePath = PhotoViewer.getTempFileAbsolutePath();
                    photoViewer8.coverEditor.button.setLoading(true);
                    Utilities.globalQueue.postRunnable(new PhotoViewer$$ExternalSyntheticLambda126(photoViewer8, tempFileAbsolutePath, photoEntry, time, 0));
                    break;
                }
                break;
            case 11:
                final PhotoViewer photoViewer9 = this.f$0;
                if (!photoViewer9.isCaptionOpen()) {
                    photoViewer9.muteVideo = !photoViewer9.muteVideo;
                    ArrayList arrayList = photoViewer9.muteHints;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            ((HintView2) obj2).hide(true);
                        }
                    }
                    if (photoViewer9.muteVideo) {
                        final HintView2 hintView2 = new HintView2(photoViewer9.parentActivity, 3);
                        hintView2.setMultilineText(true);
                        hintView2.setText(LocaleController.getString(R.string.EditorMuteHint));
                        hintView2.textMaxWidth = HintView2.cutInFancyHalf(hintView2.getText(), hintView2.getTextPaint());
                        hintView2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        hintView2.setJoint(0.0f, 22.0f);
                        hintView2.onHidden = new Runnable() {
                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        PhotoViewer photoViewer10 = photoViewer9;
                                        ArrayList arrayList2 = photoViewer10.muteHints;
                                        HintView2 hintView3 = hintView2;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(hintView3);
                                        }
                                        ArrayList arrayList3 = photoViewer10.livePhotoHints;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(hintView3);
                                        }
                                        break;
                                    default:
                                        ArrayList arrayList4 = photoViewer9.muteHints;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(hintView2);
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer9.muteHints == null) {
                            photoViewer9.muteHints = new ArrayList();
                        }
                        photoViewer9.containerView.addView(hintView2, LayoutHelper.createFrame(-1, 200, 83));
                        photoViewer9.muteHints.add(hintView2);
                        hintView2.show();
                    }
                    photoViewer9.updateMuteButton();
                    photoViewer9.updateVideoInfo();
                    if (photoViewer9.muteVideo) {
                        CheckBox checkBox = photoViewer9.checkImageView;
                        if (!checkBox.isChecked) {
                            checkBox.callOnClick();
                        }
                    }
                    Object obj3 = photoViewer9.imagesArrLocals.get(photoViewer9.currentIndex);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer9.getCurrentVideoEditedInfo();
                    }
                    break;
                }
                break;
            case 12:
                final PhotoViewer photoViewer10 = this.f$0;
                boolean zIsUnalivePhoto = photoViewer10.isUnalivePhoto();
                boolean z2 = !zIsUnalivePhoto;
                int i5 = photoViewer10.currentIndex;
                if (i5 >= 0 && i5 < photoViewer10.imagesArrLocals.size()) {
                    Object obj4 = photoViewer10.imagesArrLocals.get(photoViewer10.currentIndex);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z2);
                        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = zIsUnalivePhoto;
                        editorEdit.putBoolean("photoLiveDefault", zIsUnalivePhoto).apply();
                        PhotoViewer.PhotoViewerProvider photoViewerProvider2 = photoViewer10.placeProvider;
                        if (photoViewerProvider2 != null) {
                            photoViewerProvider2.updatedLivePhotos();
                        }
                    }
                }
                LivePhotoButton livePhotoButton = photoViewer10.livePhotoButton;
                boolean z3 = !photoViewer10.isUnalivePhoto();
                if (livePhotoButton.value != z3) {
                    livePhotoButton.value = z3;
                    livePhotoButton.invalidate();
                }
                photoViewer10.videoTimelineView.animate().alpha(photoViewer10.isUnalivePhoto() ? 0.45f : 1.0f).start();
                if (photoViewer10.isUnalivePhoto() && (videoPlayer = photoViewer10.videoPlayer) != null) {
                    videoPlayer.pause();
                }
                photoViewer10.containerView.invalidate();
                if (photoViewer10.muteHints == null) {
                    photoViewer10.muteHints = new ArrayList();
                }
                if (photoViewer10.livePhotoHints == null) {
                    photoViewer10.livePhotoHints = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer10.muteHints;
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj5 = arrayList2.get(i6);
                    i6++;
                    ((HintView2) obj5).hide(true);
                }
                final HintView2 hintView3 = new HintView2(photoViewer10.parentActivity, 3);
                hintView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(photoViewer10.isUnalivePhoto() ? R.string.LivePhotoOff : R.string.LivePhotoOn)));
                hintView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                hintView3.setJoint(0.0f, 28.0f);
                final int i7 = z ? 1 : 0;
                hintView3.onHidden = new Runnable() {
                    @Override
                    public final void run() {
                        switch (i7) {
                            case 0:
                                PhotoViewer photoViewer11 = photoViewer10;
                                ArrayList arrayList3 = photoViewer11.muteHints;
                                HintView2 hintView4 = hintView3;
                                if (arrayList3 != null) {
                                    arrayList3.remove(hintView4);
                                }
                                ArrayList arrayList4 = photoViewer11.livePhotoHints;
                                if (arrayList4 != null) {
                                    arrayList4.remove(hintView4);
                                }
                                break;
                            default:
                                ArrayList arrayList5 = photoViewer10.muteHints;
                                if (arrayList5 != null) {
                                    arrayList5.remove(hintView3);
                                }
                                break;
                        }
                    }
                };
                photoViewer10.containerView.addView(hintView3, LayoutHelper.createFrame(-1, 200, 83));
                photoViewer10.muteHints.add(hintView3);
                photoViewer10.livePhotoHints.add(hintView3);
                hintView3.show();
                break;
            case 13:
                PhotoViewer photoViewer11 = this.f$0;
                if (photoViewer11.placeProvider != null && !photoViewer11.isCaptionOpen()) {
                    photoViewer11.placeProvider.needAddMorePhotos();
                    photoViewer11.closePhoto(true, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer12 = this.f$0;
                if (photoViewer12.placeProvider != null && !photoViewer12.isCaptionOpen()) {
                    photoViewer12.placeProvider.needAddMorePhotos();
                    photoViewer12.closePhoto(true, false);
                    break;
                }
                break;
            case 15:
                PhotoViewer photoViewer13 = this.f$0;
                if (!photoViewer13.stickerEmpty) {
                    PhotoViewer.BlurButton blurButton = photoViewer13.cutOutBtn;
                    if (!blurButton.loading && blurButton.state != 1 && (i2 = photoViewer13.currentIndex) >= 0 && i2 < photoViewer13.imagesArrLocals.size() && !photoViewer13.stickerMakerView.isThanosInProgress) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) photoViewer13.imagesArrLocals.get(photoViewer13.currentIndex);
                        boolean zIsEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z4 = !zIsEmpty;
                        PhotoViewer.BlurButton blurButton2 = photoViewer13.cutOutBtn;
                        int i8 = blurButton2.state;
                        if (i8 == 0) {
                            blurButton2.setCancelState(true);
                            StickerMakerView stickerMakerView = photoViewer13.stickerMakerView;
                            PhotoViewer$$ExternalSyntheticLambda91 photoViewer$$ExternalSyntheticLambda91 = new PhotoViewer$$ExternalSyntheticLambda91(photoViewer13, z4, mediaEditState, 0);
                            stickerMakerView.getClass();
                            stickerMakerView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(3, stickerMakerView, photoViewer$$ExternalSyntheticLambda91));
                            TextView textView = stickerMakerView.actionTextView;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            ValueAnimator valueAnimator = stickerMakerView.bordersAnimator;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            stickerMakerView.bordersAnimatorValueStart = stickerMakerView.bordersAnimatorValue;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            stickerMakerView.bordersAnimator = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(stickerMakerView, 23));
                            stickerMakerView.bordersAnimator.setRepeatCount(-1);
                            stickerMakerView.bordersAnimator.setRepeatMode(1);
                            stickerMakerView.bordersAnimator.setDuration(2400L);
                            stickerMakerView.bordersAnimator.setInterpolator(new LinearInterpolator());
                            stickerMakerView.bordersAnimator.start();
                            photoViewer13.containerView.invalidate();
                        } else if (i8 != 2) {
                            photoViewer13.stickerMakerView.resetPaths();
                            photoViewer13.stickerMakerView.getThanosEffect();
                            StickerMakerView stickerMakerView2 = photoViewer13.stickerMakerView;
                            stickerMakerView2.isSegmentedState = false;
                            stickerMakerView2.selectedObject = null;
                            ImageReceiver imageReceiver = photoViewer13.centerImage;
                            if (zIsEmpty || (bitmap = stickerMakerView2.filteredBitmap) == null) {
                                bitmap = stickerMakerView2.sourceBitmap;
                            }
                            imageReceiver.setImageBitmap(bitmap);
                            photoViewer13.cutOutBtn.setCutOutState(true);
                            photoViewer13.showEditStickerMode(false, true);
                            photoViewer13.applyCurrentEditMode();
                        } else {
                            blurButton2.setCutOutState(true);
                            photoViewer13.showEditStickerMode(false, true);
                            photoViewer13.stickerMakerView.disableClippingMode();
                            photoViewer13.containerView.invalidate();
                        }
                        break;
                    }
                }
                break;
            case 16:
                PhotoViewer photoViewer14 = this.f$0;
                photoViewer14.eraseBtn.setActive(true, true);
                photoViewer14.restoreBtn.setActive(false, true);
                StickerMakerView stickerMakerView3 = photoViewer14.stickerMakerView;
                if (stickerMakerView3 != null) {
                    stickerMakerView3.setOutlineVisible(false);
                }
                photoViewer14.maskPaintViewEraser = true;
                PhotoViewer.AnonymousClass66 anonymousClass66 = photoViewer14.maskPaintView;
                if (anonymousClass66 != null) {
                    anonymousClass66.setEraser(true);
                }
                photoViewer14.switchToEditMode(4);
                break;
            case 17:
                PhotoViewer photoViewer15 = this.f$0;
                photoViewer15.eraseBtn.setActive(false, true);
                photoViewer15.restoreBtn.setActive(true, true);
                StickerMakerView stickerMakerView4 = photoViewer15.stickerMakerView;
                if (stickerMakerView4 != null) {
                    stickerMakerView4.setOutlineVisible(false);
                }
                photoViewer15.maskPaintViewEraser = false;
                PhotoViewer.AnonymousClass66 anonymousClass67 = photoViewer15.maskPaintView;
                if (anonymousClass67 != null) {
                    anonymousClass67.setEraser(false);
                }
                photoViewer15.switchToEditMode(4);
                break;
            case 18:
                PhotoViewer photoViewer16 = this.f$0;
                PhotoViewer.AnonymousClass66 anonymousClass68 = photoViewer16.maskPaintView;
                if (anonymousClass68 != null && anonymousClass68.undoStore.canUndo()) {
                    anonymousClass68.undoStore.undo();
                } else {
                    photoViewer16.switchToEditMode(0);
                    photoViewer16.stickerMakerView.resetPaths();
                    boolean zIsEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer16.imagesArrLocals.get(photoViewer16.currentIndex)).filterPath);
                    StickerMakerView stickerMakerView5 = photoViewer16.stickerMakerView;
                    if (stickerMakerView5 != null && !stickerMakerView5.empty) {
                        stickerMakerView5.isSegmentedState = false;
                        stickerMakerView5.selectedObject = null;
                    }
                    ImageReceiver imageReceiver2 = photoViewer16.centerImage;
                    if (zIsEmpty2 || (bitmap2 = stickerMakerView5.filteredBitmap) == null) {
                        bitmap2 = stickerMakerView5.sourceBitmap;
                    }
                    imageReceiver2.setImageBitmap(bitmap2);
                    StickerMakerView stickerMakerView6 = photoViewer16.stickerMakerView;
                    if (stickerMakerView6 == null || !stickerMakerView6.empty) {
                        photoViewer16.cutOutBtn.setCutOutState(true);
                    }
                    photoViewer16.showStickerMode$1(true, true);
                }
                break;
            case 19:
                PhotoViewer photoViewer17 = this.f$0;
                if (photoViewer17.stickerMakerView != null) {
                    PhotoViewer.BlurButton blurButton3 = photoViewer17.outlineBtn;
                    blurButton3.setActive(!blurButton3.active, true);
                    StickerMakerView stickerMakerView7 = photoViewer17.stickerMakerView;
                    if (photoViewer17.outlineBtn.active && !photoViewer17.eraseBtn.active && !photoViewer17.restoreBtn.active) {
                        z = true;
                    }
                    stickerMakerView7.setOutlineVisible(z);
                }
                break;
            case 20:
                PhotoViewer photoViewer18 = this.f$0;
                ChatActivity chatActivity = photoViewer18.parentChatActivity;
                if (chatActivity != null && (messageObject = chatActivity.editingMessageObject) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer18.currentAccount, photoViewer18.parentChatActivity.editingMessageObject.getDialogId())) {
                    if (photoViewer18.parentFragment == null || (messageSuggestionParamsOf = photoViewer18.parentChatActivity.messageSuggestionParams) == null) {
                        messageSuggestionParamsOf = MessageSuggestionParams.of(photoViewer18.parentChatActivity.editingMessageObject.messageOwner.suggested_post);
                    }
                    if (!StarsController.isEnoughAmount(photoViewer18.currentAccount, messageSuggestionParamsOf.amount)) {
                        ChatActivity chatActivity2 = photoViewer18.parentChatActivity;
                        if (chatActivity2 != null) {
                            chatActivity2.showSuggestionOfferForEditMessage(messageSuggestionParamsOf);
                        }
                    }
                }
                PhotoViewer.AnonymousClass30 anonymousClass30 = photoViewer18.captionEdit;
                if (anonymousClass30.getCodePointCount() <= anonymousClass30.getCaptionLimit()) {
                    ChatActivity chatActivity3 = photoViewer18.parentChatActivity;
                    if (chatActivity3 != null && chatActivity3.isInScheduleMode() && ((anonymousClass78 = photoViewer18.parentChatActivity.chatAttachAlert) == null || anonymousClass78.editingMessageObject == null)) {
                        photoViewer18.showScheduleDatePickerDialog();
                    } else {
                        photoViewer18.sendPressed(true, 0, 0, false, false, false);
                    }
                    break;
                } else {
                    AnimatedTextView animatedTextView = photoViewer18.captionEdit.limitTextView;
                    float f = -photoViewer18.shiftDp;
                    photoViewer18.shiftDp = f;
                    AndroidUtilities.shakeViewSpring(animatedTextView, f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer18.currentAccount).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer18.currentAccount).captionLengthLimitPremium > photoViewer18.captionEdit.getCodePointCount()) {
                        photoViewer18.showCaptionLimitBulletin(photoViewer18.containerView);
                        break;
                    }
                }
                break;
            case 21:
                this.f$0.animatorPollAttachButtonsVisibility.setValue(false, true);
                break;
            case 22:
                PhotoViewer photoViewer19 = this.f$0;
                if (photoViewer19.parentActivity != null && (photoViewerProvider = photoViewer19.placeProvider) != null) {
                    photoViewerProvider.onPollAttachReplace();
                    photoViewer19.closePhoto(true, false);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer20 = this.f$0;
                photoViewer20.cancelStickerClippingMode();
                if (!photoViewer20.isCaptionOpen()) {
                    if (photoViewer20.isCurrentVideo) {
                        if (photoViewer20.videoConvertSupported) {
                            TextureView textureView = photoViewer20.videoTextureView;
                            if (textureView instanceof VideoEditTextureView) {
                                VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
                                if (videoEditTextureView.getVideoWidth() <= 0 || videoEditTextureView.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer20.switchToEditMode(1);
                    break;
                }
                break;
            case 24:
                this.f$0.cropRotate(-90.0f, false, null);
                break;
            case 25:
                this.f$0.cropMirror();
                break;
            case 26:
                PhotoViewer photoViewer21 = this.f$0;
                photoViewer21.cancelStickerClippingMode();
                if (!photoViewer21.isCaptionOpen()) {
                    if (photoViewer21.isCurrentVideo) {
                        if (photoViewer21.videoConvertSupported) {
                            TextureView textureView2 = photoViewer21.videoTextureView;
                            if (textureView2 instanceof VideoEditTextureView) {
                                VideoEditTextureView videoEditTextureView2 = (VideoEditTextureView) textureView2;
                                if (videoEditTextureView2.getVideoWidth() <= 0 || videoEditTextureView2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer21.switchToEditMode(3);
                    break;
                }
                break;
            case 27:
                PhotoViewer photoViewer22 = this.f$0;
                photoViewer22.getClass();
                if (view.getAlpha() >= 0.9f) {
                    photoViewer22.cancelStickerClippingMode();
                    if (!photoViewer22.isCaptionOpen()) {
                        if (photoViewer22.isCurrentVideo) {
                            if (photoViewer22.videoConvertSupported) {
                                TextureView textureView3 = photoViewer22.videoTextureView;
                                if (textureView3 instanceof VideoEditTextureView) {
                                    VideoEditTextureView videoEditTextureView3 = (VideoEditTextureView) textureView3;
                                    if (videoEditTextureView3.getVideoWidth() <= 0 || videoEditTextureView3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer22.switchToEditMode(2);
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer23 = this.f$0;
                if (photoViewer23.imageMoveAnimation == null) {
                    PhotoViewer$$ExternalSyntheticLambda93 photoViewer$$ExternalSyntheticLambda93 = new PhotoViewer$$ExternalSyntheticLambda93(photoViewer23, 1);
                    if (!photoViewer23.previousHasTransform) {
                        float stateOrientation = photoViewer23.previousCropOrientation - photoViewer23.photoCropView.cropView.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer23.cropRotate(stateOrientation, photoViewer23.photoCropView.cropView.getStateMirror(), photoViewer$$ExternalSyntheticLambda93);
                    } else {
                        photoViewer$$ExternalSyntheticLambda93.run();
                    }
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer24 = this.f$0;
                if (photoViewer24.currentEditMode == 1) {
                    CropView cropView = photoViewer24.photoCropView.cropView;
                    if (cropView.detector.mDetector.isInProgress() || cropView.detector.mIsDragging || cropView.areaView.isDragging) {
                    }
                }
                photoViewer24.applyCurrentEditMode();
                photoViewer24.switchToEditMode(0);
                break;
        }
    }
}
