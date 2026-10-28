package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31894a;
    public final th0 f31895b;

    public qh0(th0 th0Var, int i10) {
        this.f31894a = i10;
        this.f31895b = th0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31894a) {
            case 0:
                th0 th0Var = this.f31895b;
                th0Var.getClass();
                th0Var.f32964b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th0Var.c(true);
                return;
            default:
                th0 th0Var2 = this.f31895b;
                th0Var2.getClass();
                th0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th0Var2.c(true);
                return;
        }
    }
}
