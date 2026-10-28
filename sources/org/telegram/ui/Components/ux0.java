package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ux0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33478a;
    public final xx0 f33479b;

    public ux0(xx0 xx0Var, int i10) {
        this.f33478a = i10;
        this.f33479b = xx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33478a) {
            case 0:
                xx0 xx0Var = this.f33479b;
                xx0Var.getClass();
                xx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xx0Var.invalidate();
                return;
            case 1:
                xx0 xx0Var2 = this.f33479b;
                xx0Var2.getClass();
                xx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                xx0 xx0Var3 = this.f33479b;
                xx0Var3.getClass();
                xx0Var3.f34874y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xx0Var3.invalidate();
                return;
        }
    }
}
