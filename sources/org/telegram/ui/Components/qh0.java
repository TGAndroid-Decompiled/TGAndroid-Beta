package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29900a;
    public final th0 f29901b;

    public qh0(th0 th0Var, int i10) {
        this.f29900a = i10;
        this.f29901b = th0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29900a) {
            case 0:
                th0 th0Var = this.f29901b;
                th0Var.getClass();
                th0Var.f30704b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th0Var.c(true);
                return;
            default:
                th0 th0Var2 = this.f29901b;
                th0Var2.getClass();
                th0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th0Var2.c(true);
                return;
        }
    }
}
