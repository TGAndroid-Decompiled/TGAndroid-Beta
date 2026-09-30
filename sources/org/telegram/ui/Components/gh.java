package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gh implements ValueAnimator.AnimatorUpdateListener {
    public final int f24566a;
    public final xi f24567b;

    public gh(xi xiVar, int i10) {
        this.f24566a = i10;
        this.f24567b = xiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24566a) {
            case 0:
                this.f24567b.b2();
                return;
            case 1:
                this.f24567b.D0.invalidate();
                return;
            case 2:
                xi.m(this.f24567b, valueAnimator);
                return;
            case 3:
                xi xiVar = this.f24567b;
                xiVar.getClass();
                xiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f24567b.b2();
                return;
        }
    }
}
