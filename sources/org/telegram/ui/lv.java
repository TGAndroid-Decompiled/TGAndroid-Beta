package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38933a;
    public final ey f38934b;
    public final float f38935c;

    public lv(ey eyVar, float f7, int i10) {
        this.f38933a = i10;
        this.f38934b = eyVar;
        this.f38935c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38933a) {
            case 0:
                ey.V(this.f38934b, this.f38935c, valueAnimator);
                return;
            default:
                ey.C0(this.f38934b, this.f38935c, valueAnimator);
                return;
        }
    }
}
