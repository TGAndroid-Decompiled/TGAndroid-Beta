package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class u3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37348a;
    public final m5 f37349b;

    public u3(m5 m5Var, int i10) {
        this.f37348a = i10;
        this.f37349b = m5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37348a) {
            case 0:
                m5 m5Var = this.f37349b;
                m5Var.getClass();
                m5Var.I0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m5 m5Var2 = this.f37349b;
                m5Var2.getClass();
                m5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var2.P0();
                return;
        }
    }
}
