package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23000a;
    public final dg0 f23001b;

    public bg0(dg0 dg0Var, int i10) {
        this.f23000a = i10;
        this.f23001b = dg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23000a) {
            case 0:
                dg0 dg0Var = this.f23001b;
                dg0Var.getClass();
                dg0Var.f23593y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var.invalidate();
                return;
            default:
                dg0 dg0Var2 = this.f23001b;
                dg0Var2.getClass();
                dg0Var2.f23593y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var2.invalidate();
                return;
        }
    }
}
