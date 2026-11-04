package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class j4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42701a;
    public final w5 f42702b;

    public j4(w5 w5Var, int i3) {
        this.f42701a = i3;
        this.f42702b = w5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42701a) {
            case 0:
                w5 w5Var = this.f42702b;
                w5Var.getClass();
                w5Var.M0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                w5 w5Var2 = this.f42702b;
                w5Var2.getClass();
                w5Var2.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var2.T0();
                return;
        }
    }
}
