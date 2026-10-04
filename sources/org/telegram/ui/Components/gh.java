package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gh implements ValueAnimator.AnimatorUpdateListener {
    public final int f26872a;
    public final xi f26873b;

    public gh(xi xiVar, int i10) {
        this.f26872a = i10;
        this.f26873b = xiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26872a) {
            case 0:
                this.f26873b.a2();
                return;
            case 1:
                this.f26873b.D0.invalidate();
                return;
            case 2:
                xi.q(this.f26873b, valueAnimator);
                return;
            case 3:
                xi xiVar = this.f26873b;
                xiVar.getClass();
                xiVar.J1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f26873b.a2();
                return;
        }
    }
}
