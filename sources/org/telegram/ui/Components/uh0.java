package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31503a;
    public final xh0 f31504b;

    public uh0(xh0 xh0Var, int i10) {
        this.f31503a = i10;
        this.f31504b = xh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31503a) {
            case 0:
                xh0 xh0Var = this.f31504b;
                xh0Var.getClass();
                xh0Var.f32865b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh0Var.c(true);
                return;
            default:
                xh0 xh0Var2 = this.f31504b;
                xh0Var2.getClass();
                xh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh0Var2.c(true);
                return;
        }
    }
}
