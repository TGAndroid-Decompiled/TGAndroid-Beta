package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class y3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35123a;
    public final m5 f35124b;

    public y3(m5 m5Var, int i10) {
        this.f35123a = i10;
        this.f35124b = m5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35123a) {
            case 0:
                m5 m5Var = this.f35124b;
                m5Var.getClass();
                m5Var.F0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m5 m5Var2 = this.f35124b;
                m5Var2.getClass();
                m5Var2.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var2.M0();
                return;
        }
    }
}
