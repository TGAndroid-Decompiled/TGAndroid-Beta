package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31016a;
    public final bh0 f31017b;

    public yg0(bh0 bh0Var, int i10) {
        this.f31016a = i10;
        this.f31017b = bh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31016a) {
            case 0:
                bh0 bh0Var = this.f31017b;
                bh0Var.getClass();
                bh0Var.f23683b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh0Var.c(true);
                return;
            default:
                bh0 bh0Var2 = this.f31017b;
                bh0Var2.getClass();
                bh0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh0Var2.c(true);
                return;
        }
    }
}
