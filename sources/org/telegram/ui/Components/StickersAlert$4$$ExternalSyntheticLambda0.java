package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class StickersAlert$4$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;

    public StickersAlert$4$$ExternalSyntheticLambda0(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((StickersAlert.AnonymousClass4) this.f$0).lambda$createAnimator$0(this.f$1, this.f$2, valueAnimator);
                break;
            default:
                ((ScrollSlidingTextTabStrip) this.f$0).lambda$onLayout$2(this.f$1, this.f$2, valueAnimator);
                break;
        }
    }
}
