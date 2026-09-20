package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23002a;
    public final eh0 f23003b;

    public bh0(eh0 eh0Var, int i10) {
        this.f23002a = i10;
        this.f23003b = eh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23002a) {
            case 0:
                eh0 eh0Var = this.f23003b;
                eh0Var.getClass();
                eh0Var.f23851b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh0Var.c(true);
                return;
            default:
                eh0 eh0Var2 = this.f23003b;
                eh0Var2.getClass();
                eh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh0Var2.c(true);
                return;
        }
    }
}
