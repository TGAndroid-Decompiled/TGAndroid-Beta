package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PaintCancelView;
import org.telegram.ui.Components.Paint.Views.PaintDoneView;
import org.telegram.ui.Components.Paint.Views.PaintTextOptionsView;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.PhotoViewerCoverEditor;
import org.telegram.ui.Stories.recorder.GallerySheet;

public final class PhotoViewer$$ExternalSyntheticLambda26 implements Utilities.Callback {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda26(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void run(Object obj) throws Throwable {
        int i;
        Bitmap bitmapCutSegmentInFilteredBitmap;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = this.f$0;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer.coverEditor.button.loading && (i = photoViewer.currentIndex) >= 0 && i < photoViewer.imagesArrLocals.size() && (photoViewer.imagesArrLocals.get(photoViewer.currentIndex) instanceof MediaController.PhotoEntry)) {
                    PhotoViewerCoverEditor photoViewerCoverEditor = photoViewer.coverEditor;
                    GallerySheet gallerySheet = photoViewerCoverEditor.gallerySheet;
                    if (gallerySheet != null) {
                        gallerySheet.lambda$showGiftOfferSheet$15();
                        photoViewerCoverEditor.gallerySheet = null;
                    }
                    photoViewer.coverEditor.button.setLoading(true);
                    Utilities.globalQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda12(photoViewer, photoEntry, (MediaController.PhotoEntry) photoViewer.imagesArrLocals.get(photoViewer.currentIndex), PhotoViewer.getTempFileAbsolutePath(), 21));
                    break;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.f$0;
                StickerMakerView.SegmentedObject segmentedObject = (StickerMakerView.SegmentedObject) obj;
                photoViewer2.getClass();
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer2.imagesArrLocals.get(photoViewer2.currentIndex)).filterPath);
                    StickerMakerView stickerMakerView = photoViewer2.stickerMakerView;
                    stickerMakerView.isSegmentedState = true;
                    stickerMakerView.selectedObject = segmentedObject;
                    Bitmap bitmap = photoViewer2.centerImage.getBitmap();
                    photoViewer2.centerImage.getOrientation();
                    StickerMakerView.SegmentedObject segmentedObject2 = stickerMakerView.selectedObject;
                    if (segmentedObject2 == null) {
                        bitmapCutSegmentInFilteredBitmap = stickerMakerView.sourceBitmap;
                    } else if (zIsEmpty || bitmap == null) {
                        bitmapCutSegmentInFilteredBitmap = segmentedObject2.overrideImage;
                        if (bitmapCutSegmentInFilteredBitmap == null) {
                            bitmapCutSegmentInFilteredBitmap = segmentedObject2.image;
                        }
                    } else {
                        bitmapCutSegmentInFilteredBitmap = stickerMakerView.cutSegmentInFilteredBitmap(bitmap);
                    }
                    photoViewer2.centerImage.setImageBitmap(bitmapCutSegmentInFilteredBitmap);
                    photoViewer2.cutOutBtn.setUndoCutState(true);
                    photoViewer2.showStickerMode$1(true, true);
                    photoViewer2.cutOutBtn.post(new PhotoViewer$$ExternalSyntheticLambda16(photoViewer2, 9));
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 2:
                BulletinFactory.createSaveToGalleryBulletin(this.f$0.containerView, true).show();
                break;
            case 3:
                PhotoViewer photoViewer3 = this.f$0;
                photoViewer3.photoPaintView.keyboardVisible = photoViewer3.paintKeyboardNotifier.keyboardVisible();
                photoViewer3.containerView.invalidate();
                int iMax = Math.max(((Integer) obj).intValue(), photoViewer3.photoPaintView.emojiPadding);
                float fDp = (!(photoViewer3.photoPaintView.currentEntityView instanceof TextPaintView) || iMax <= 0) ? 0.0f : ((AndroidUtilities.displaySize.y - iMax) - AndroidUtilities.dp(80.0f)) - photoViewer3.photoPaintView.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer3.translateYAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer3.translateYAnimator = null;
                }
                if (photoViewer3.currentEditMode != 3) {
                    fDp = 0.0f;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(photoViewer3.translateY, fDp);
                photoViewer3.translateYAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$$ExternalSyntheticLambda6(photoViewer3, 11));
                photoViewer3.translateYAnimator.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer3.translateYAnimator;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                valueAnimator2.setInterpolator(cubicBezierInterpolator);
                photoViewer3.translateYAnimator.start();
                AnimatorSet animatorSet = photoViewer3.paintKeyboardAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.addUpdateListener(new PhotoViewer$$ExternalSyntheticLambda6(photoViewer3, 10));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer3.paintKeyboardAnimator = animatorSet2;
                PaintWeightChooserView paintWeightChooserView = photoViewer3.photoPaintView.weightChooserView;
                Property property = View.TRANSLATION_Y;
                int i2 = -iMax;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(paintWeightChooserView, (Property<PaintWeightChooserView, Float>) property, i2 / 2.5f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(photoViewer3.photoPaintView.bottomLayout, (Property<LPhotoPaintView.BottomLayout, Float>) property, Math.min(0, AndroidUtilities.dp(40.0f) + i2));
                GroupCallActivity.AnonymousClass61 anonymousClass61 = photoViewer3.photoPaintView.tabsLayout;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(anonymousClass61, (Property<GroupCallActivity.AnonymousClass61, Float>) property2, iMax > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer3.photoPaintView.cancelButton, (Property<PaintCancelView, Float>) property2, iMax > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer3.photoPaintView.doneButton, (Property<PaintDoneView, Float>) property2, iMax > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), valueAnimatorOfFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(cubicBezierInterpolator);
                animatorSet2.start();
                PhotoViewer.AnonymousClass67 anonymousClass67 = photoViewer3.photoPaintView;
                PaintTextOptionsView paintTextOptionsView = anonymousClass67.textOptionsView;
                if (paintTextOptionsView != null) {
                    if (anonymousClass67.keyboardVisible) {
                        paintTextOptionsView.animatePlusToIcon(R.drawable.input_smile);
                    } else if (anonymousClass67.emojiViewVisible) {
                        paintTextOptionsView.animatePlusToIcon(R.drawable.input_keyboard);
                    } else {
                        paintTextOptionsView.animatePlusToIcon(R.drawable.msg_add);
                    }
                }
                AndroidUtilities.updateViewShow(anonymousClass67.undoAllButton, (anonymousClass67.keyboardVisible || anonymousClass67.emojiViewVisible) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(anonymousClass67.undoButton, (anonymousClass67.keyboardVisible || anonymousClass67.emojiViewVisible) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(anonymousClass67.doneTextButton, anonymousClass67.keyboardVisible || anonymousClass67.emojiViewVisible, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(anonymousClass67.cancelTextButton, anonymousClass67.keyboardVisible || anonymousClass67.emojiViewVisible, false, 1.0f, true, null);
                break;
            case 4:
                Integer num = (Integer) obj;
                PhotoViewer photoViewer4 = this.f$0;
                Object obj2 = photoViewer4.imagesArrLocals.get(photoViewer4.currentIndex);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.placeProvider.isPhotoChecked(photoViewer4.currentIndex)) {
                    photoViewer4.setPhotoChecked();
                }
                photoViewer4.topCaptionEdit.setTimer(num.intValue());
                break;
            case 5:
                Integer num2 = (Integer) obj;
                PhotoViewer photoViewer5 = this.f$0;
                FrameLayout frameLayout = photoViewer5.videoTimelineViewContainer;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.videoTimelineViewContainer.setTranslationY(photoViewer5.pickerView.getTranslationY() - (photoViewer5.captionEdit.getAlpha() * BotFullscreenButtons$$ExternalSyntheticOutline1.m(photoViewer5.captionEdit.getEditTextHeight(), 46.0f, 0)));
                }
                photoViewer5.muteButton.setTranslationY(photoViewer5.captionEdit.getAlpha() * (-BotFullscreenButtons$$ExternalSyntheticOutline1.m(num2.intValue(), 46.0f, 0)));
                photoViewer5.livePhotoButton.setTranslationY(photoViewer5.captionEdit.getAlpha() * (-BotFullscreenButtons$$ExternalSyntheticOutline1.m(num2.intValue(), 46.0f, 0)));
                photoViewer5.editCoverButton.setTranslationY(photoViewer5.captionEdit.getAlpha() * (-BotFullscreenButtons$$ExternalSyntheticOutline1.m(num2.intValue(), 46.0f, 0)));
                ChatAttachAlert.AnonymousClass36 anonymousClass36 = photoViewer5.captionEdit.mentionContainer;
                if (anonymousClass36 != null) {
                    anonymousClass36.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                }
                break;
            case 6:
                Integer num3 = (Integer) obj;
                PhotoViewer photoViewer6 = this.f$0;
                Object obj3 = photoViewer6.imagesArrLocals.get(photoViewer6.currentIndex);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.placeProvider.isPhotoChecked(photoViewer6.currentIndex)) {
                    photoViewer6.setPhotoChecked();
                }
                photoViewer6.captionEdit.setTimer(num3.intValue());
                break;
            case 7:
                Integer num4 = (Integer) obj;
                ChatAttachAlert.AnonymousClass36 anonymousClass37 = this.f$0.topCaptionEdit.mentionContainer;
                if (anonymousClass37 != null) {
                    anonymousClass37.setTranslationY(num4.intValue());
                }
                break;
            case 8:
                this.f$0.checkProgress(0, false);
                break;
            default:
                this.f$0.checkProgress(0, false);
                break;
        }
    }
}
