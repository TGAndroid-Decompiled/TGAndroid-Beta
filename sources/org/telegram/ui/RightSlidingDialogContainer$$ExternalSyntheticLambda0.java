package org.telegram.ui;

import android.animation.ValueAnimator;

public final class RightSlidingDialogContainer$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final RightSlidingDialogContainer f$0;

    public RightSlidingDialogContainer$$ExternalSyntheticLambda0(RightSlidingDialogContainer rightSlidingDialogContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = rightSlidingDialogContainer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                RightSlidingDialogContainer rightSlidingDialogContainer = this.f$0;
                rightSlidingDialogContainer.getClass();
                rightSlidingDialogContainer.openedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rightSlidingDialogContainer.updateOpenAnimationProgress();
                break;
            case 1:
                RightSlidingDialogContainer rightSlidingDialogContainer2 = this.f$0;
                rightSlidingDialogContainer2.getClass();
                rightSlidingDialogContainer2.openedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rightSlidingDialogContainer2.updateOpenAnimationProgress();
                break;
            default:
                RightSlidingDialogContainer rightSlidingDialogContainer3 = this.f$0;
                rightSlidingDialogContainer3.getClass();
                rightSlidingDialogContainer3.openedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rightSlidingDialogContainer3.updateOpenAnimationProgress();
                break;
        }
    }
}
