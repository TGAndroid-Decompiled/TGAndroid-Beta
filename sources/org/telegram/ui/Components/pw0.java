package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class pw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28013a;
    public final sw0 f28014b;

    public pw0(sw0 sw0Var, int i10) {
        this.f28013a = i10;
        this.f28014b = sw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28013a) {
            case 0:
                sw0 sw0Var = this.f28014b;
                sw0Var.getClass();
                sw0Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sw0Var.invalidate();
                return;
            case 1:
                sw0 sw0Var2 = this.f28014b;
                sw0Var2.getClass();
                sw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sw0 sw0Var3 = this.f28014b;
                sw0Var3.getClass();
                sw0Var3.f28830y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sw0Var3.invalidate();
                return;
        }
    }
}
