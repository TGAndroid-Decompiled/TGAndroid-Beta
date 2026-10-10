package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31843a;
    public final yh0 f31844b;

    public vh0(yh0 yh0Var, int i10) {
        this.f31843a = i10;
        this.f31844b = yh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31843a) {
            case 0:
                yh0 yh0Var = this.f31844b;
                yh0Var.getClass();
                yh0Var.f33207b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yh0Var.c(true);
                return;
            default:
                yh0 yh0Var2 = this.f31844b;
                yh0Var2.getClass();
                yh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yh0Var2.c(true);
                return;
        }
    }
}
