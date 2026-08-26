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
                this.f$0.lambda$finishPreviewInernal$4(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$presentFragment$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$onTouchEvent$5(valueAnimator);
                break;
        }
    }
}
