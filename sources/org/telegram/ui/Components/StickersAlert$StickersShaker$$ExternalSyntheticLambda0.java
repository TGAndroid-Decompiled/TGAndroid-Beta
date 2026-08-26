package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class StickersAlert$StickersShaker$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final StickersAlert.StickersShaker f$0;
    public final int f$1;

    public StickersAlert$StickersShaker$$ExternalSyntheticLambda0(StickersAlert.StickersShaker stickersShaker, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = stickersShaker;
        this.f$1 = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$stopShake$3(this.f$1, valueAnimator);
                break;
            case 1:
                this.f$0.lambda$stopShake$4(this.f$1, valueAnimator);
                break;
            case 2:
                this.f$0.lambda$stopShake$5(this.f$1, valueAnimator);
                break;
            case 3:
                this.f$0.lambda$startShake$0(this.f$1, valueAnimator);
                break;
            case 4:
                this.f$0.lambda$startShake$1(this.f$1, valueAnimator);
                break;
            default:
                this.f$0.lambda$startShake$2(this.f$1, valueAnimator);
                break;
        }
    }
}
