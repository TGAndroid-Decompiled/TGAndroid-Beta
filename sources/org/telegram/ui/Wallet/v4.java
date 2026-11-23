package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45206a;
    public final n6 f45207b;

    public v4(n6 n6Var, int i7) {
        this.f45206a = i7;
        this.f45207b = n6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45206a) {
            case 0:
                n6 n6Var = this.f45207b;
                n6Var.getClass();
                n6Var.R0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n6 n6Var2 = this.f45207b;
                n6Var2.getClass();
                n6Var2.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var2.Y0();
                return;
        }
    }
}
