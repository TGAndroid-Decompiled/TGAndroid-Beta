package org.telegram.ui;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class LoginActivity$$ExternalSyntheticLambda12 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public LoginActivity$$ExternalSyntheticLambda12(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((LoginActivity) this.f$0).lambda$createView$2(dynamicAnimation, f, f2);
                break;
            case 1:
                ((PaymentFormActivity.BottomFrameLayout) this.f$0).lambda$setChecked$0(dynamicAnimation, f, f2);
                break;
            case 2:
                ((PhotoViewer.VideoPlayerControlFrameLayout) this.f$0).lambda$new$0(dynamicAnimation, f, f2);
                break;
            case 3:
                ((SecretMediaViewer.VideoPlayerControlFrameLayout) this.f$0).lambda$new$0(dynamicAnimation, f, f2);
                break;
            case 4:
                ((PhotoViewer.CaptionScrollView) this.f$0).lambda$new$0(dynamicAnimation, f, f2);
                break;
            default:
                ((RightSlidingDialogContainer) this.f$0).lambda$animateReplace$2(dynamicAnimation, f, f2);
                break;
        }
    }
}
