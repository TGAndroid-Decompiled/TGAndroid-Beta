package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class k4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42706a;
    public final x5 f42707b;

    public k4(x5 x5Var, int i7) {
        this.f42706a = i7;
        this.f42707b = x5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42706a) {
            case 0:
                x5 x5Var = this.f42707b;
                x5Var.getClass();
                x5Var.M0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                x5 x5Var2 = this.f42707b;
                x5Var2.getClass();
                x5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var2.T0();
                return;
        }
    }
}
