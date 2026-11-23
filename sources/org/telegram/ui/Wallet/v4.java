package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45294a;
    public final o6 f45295b;

    public v4(o6 o6Var, int i7) {
        this.f45294a = i7;
        this.f45295b = o6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45294a) {
            case 0:
                o6 o6Var = this.f45295b;
                o6Var.getClass();
                o6Var.R0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o6 o6Var2 = this.f45295b;
                o6Var2.getClass();
                o6Var2.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var2.Y0();
                return;
        }
    }
}
