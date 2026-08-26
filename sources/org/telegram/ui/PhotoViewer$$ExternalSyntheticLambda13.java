package org.telegram.ui;

import android.animation.ValueAnimator;

public final class PhotoViewer$$ExternalSyntheticLambda13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda13(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setVideoPlayerControlVisible$104(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$createPaintView$118(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$switchToEditMode$110(valueAnimator);
                break;
            case 3:
                this.f$0.lambda$switchToEditMode$111(valueAnimator);
                break;
            case 4:
                this.f$0.lambda$switchToEditMode$112(valueAnimator);
                break;
            case 5:
                this.f$0.lambda$checkChangedTextureView$3(valueAnimator);
                break;
            case 6:
                this.f$0.lambda$switchToPaintMode$125(valueAnimator);
                break;
            case 7:
                this.f$0.lambda$switchToPaintMode$126(valueAnimator);
                break;
            case 8:
                this.f$0.lambda$translateY$123(valueAnimator);
                break;
            case 9:
                this.f$0.lambda$closePhoto$146(valueAnimator);
                break;
            case 10:
                this.f$0.lambda$closePhoto$147(valueAnimator);
                break;
            case 11:
                this.f$0.lambda$setItemVisible$129(valueAnimator);
                break;
            case 12:
                this.f$0.lambda$closePhoto$150(valueAnimator);
                break;
            case 13:
                this.f$0.lambda$toggleActionBar$128(valueAnimator);
                break;
            default:
                this.f$0.lambda$switchToPip$99(valueAnimator);
                break;
        }
    }
}
