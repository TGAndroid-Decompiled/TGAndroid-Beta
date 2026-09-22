package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23114a;
    public final ex0 f23115b;

    public bx0(ex0 ex0Var, int i10) {
        this.f23114a = i10;
        this.f23115b = ex0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23114a) {
            case 0:
                ex0 ex0Var = this.f23115b;
                ex0Var.getClass();
                ex0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0Var.invalidate();
                return;
            case 1:
                ex0 ex0Var2 = this.f23115b;
                ex0Var2.getClass();
                ex0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ex0 ex0Var3 = this.f23115b;
                ex0Var3.getClass();
                ex0Var3.f24055y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0Var3.invalidate();
                return;
        }
    }
}
