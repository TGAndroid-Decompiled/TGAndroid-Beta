package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class pu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37255a;
    public final su0 f37256b;

    public pu0(su0 su0Var, int i3) {
        this.f37255a = i3;
        this.f37256b = su0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37255a) {
            case 0:
                su0 su0Var = this.f37256b;
                su0Var.getClass();
                su0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                su0Var.invalidate();
                return;
            case 1:
                su0 su0Var2 = this.f37256b;
                su0Var2.getClass();
                su0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                su0 su0Var3 = this.f37256b;
                su0Var3.getClass();
                su0Var3.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                su0Var3.invalidate();
                return;
        }
    }
}
