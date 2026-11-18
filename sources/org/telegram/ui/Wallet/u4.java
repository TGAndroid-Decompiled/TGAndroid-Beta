package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class u4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45122a;
    public final n6 f45123b;

    public u4(n6 n6Var, int i7) {
        this.f45122a = i7;
        this.f45123b = n6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45122a) {
            case 0:
                n6 n6Var = this.f45123b;
                n6Var.getClass();
                n6Var.R0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n6 n6Var2 = this.f45123b;
                n6Var2.getClass();
                n6Var2.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var2.Y0();
                return;
        }
    }
}
