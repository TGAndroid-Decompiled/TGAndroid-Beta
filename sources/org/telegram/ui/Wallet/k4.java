package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class k4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44066a;
    public final y5 f44067b;

    public k4(y5 y5Var, int i7) {
        this.f44066a = i7;
        this.f44067b = y5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44066a) {
            case 0:
                y5 y5Var = this.f44067b;
                y5Var.getClass();
                y5Var.N0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                y5 y5Var2 = this.f44067b;
                y5Var2.getClass();
                y5Var2.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var2.U0();
                return;
        }
    }
}
