package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

public final class PhotoViewer$$ExternalSyntheticLambda6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda6(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = this.f$0;
                photoViewer.getClass();
                photoViewer.videoPlayerControlFrameLayout.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.f$0.photoProgressViews[0].setIndexedAlpha(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
            case 2:
                PhotoViewer photoViewer2 = this.f$0;
                photoViewer2.getClass();
                photoViewer2.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 3:
                PhotoViewer photoViewer3 = this.f$0;
                CropAreaView cropAreaView = photoViewer3.photoCropView.cropView.areaView;
                float fLerp = AndroidUtilities.lerp(photoViewer3.scale, photoViewer3.animateToScale, photoViewer3.animationValue);
                float fLerp2 = AndroidUtilities.lerp(photoViewer3.translationX, photoViewer3.animateToX, photoViewer3.animationValue);
                float fLerp3 = AndroidUtilities.lerp(photoViewer3.translationY, photoViewer3.animateToY, photoViewer3.animationValue);
                cropAreaView.rotate = 0.0f;
                cropAreaView.scale = fLerp;
                cropAreaView.tx = fLerp2;
                cropAreaView.ty = fLerp3;
                cropAreaView.invalidate();
                break;
            case 4:
                this.f$0.photoPaintView.setOffsetTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                this.f$0.photoPaintView.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                PhotoViewer photoViewer4 = this.f$0;
                photoViewer4.getClass();
                photoViewer4.clippingImageProgress = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 7:
                PhotoViewer photoViewer5 = this.f$0;
                photoViewer5.getClass();
                photoViewer5.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 8:
                this.f$0.photoPaintView.setOffsetTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                this.f$0.photoPaintView.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                PhotoViewer.AnonymousClass67 anonymousClass67 = this.f$0.photoPaintView;
                if (anonymousClass67 != null) {
                    anonymousClass67.overlayLayout.invalidate();
                }
                break;
            case 11:
                PhotoViewer photoViewer6 = this.f$0;
                photoViewer6.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer6.translateY = fFloatValue;
                PhotoViewer.AnonymousClass67 anonymousClass68 = photoViewer6.photoPaintView;
                if (anonymousClass68 != null && Math.abs(fFloatValue - anonymousClass68.pany) > 0.1f) {
                    anonymousClass68.pany = fFloatValue;
                    anonymousClass68.setTransform(anonymousClass68.scale, anonymousClass68.inputTransformX, anonymousClass68.inputTransformY, anonymousClass68.imageWidth, anonymousClass68.imageHeight);
                }
                photoViewer6.containerView.invalidate();
                break;
            case 12:
                this.f$0.updateActionBarTitlePadding();
                break;
            case 13:
                PhotoViewer photoViewer7 = this.f$0;
                photoViewer7.getClass();
                photoViewer7.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer7.invalidateBlur$1();
                break;
            default:
                PhotoViewer photoViewer8 = this.f$0;
                photoViewer8.getClass();
                photoViewer8.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
