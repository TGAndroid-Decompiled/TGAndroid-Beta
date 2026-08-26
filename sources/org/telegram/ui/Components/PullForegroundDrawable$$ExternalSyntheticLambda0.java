package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class PullForegroundDrawable$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PullForegroundDrawable f$0;

    public PullForegroundDrawable$$ExternalSyntheticLambda0(PullForegroundDrawable pullForegroundDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = pullForegroundDrawable;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startOutAnimation$5(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$startOutAnimation$6(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$startOutAnimation$7(valueAnimator);
                break;
            case 3:
                this.f$0.lambda$colorize$3(valueAnimator);
                break;
            case 4:
                this.f$0.lambda$colorize$4(valueAnimator);
                break;
            case 5:
                this.f$0.lambda$updateTextProgress$2(valueAnimator);
                break;
            case 6:
                this.f$0.lambda$new$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$new$1(valueAnimator);
                break;
        }
    }
}
