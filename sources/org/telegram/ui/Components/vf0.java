package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31245a;
    public final yf0 f31246b;

    public vf0(yf0 yf0Var, int i10) {
        this.f31245a = i10;
        this.f31246b = yf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31245a) {
            case 0:
                yf0 yf0Var = this.f31246b;
                yf0Var.getClass();
                yf0Var.f32719b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yf0Var.c(true);
                return;
            default:
                yf0 yf0Var2 = this.f31246b;
                yf0Var2.getClass();
                yf0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yf0Var2.c(true);
                return;
        }
    }
}
