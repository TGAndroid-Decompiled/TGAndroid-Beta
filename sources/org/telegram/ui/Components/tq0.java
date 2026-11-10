package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38371a;
    public final tr0 f38372b;
    public final ys0 f38373c;

    public tq0(ys0 ys0Var, tr0 tr0Var, int i7) {
        this.f38371a = i7;
        this.f38373c = ys0Var;
        this.f38372b = tr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38371a) {
            case 0:
                this.f38373c.f40696p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38372b.h.invalidate();
                return;
            default:
                this.f38373c.f40696p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38372b.h.invalidate();
                return;
        }
    }
}
