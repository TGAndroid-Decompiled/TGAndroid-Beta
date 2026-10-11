package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31877a;
    public final yh0 f31878b;

    public vh0(yh0 yh0Var, int i10) {
        this.f31877a = i10;
        this.f31878b = yh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31877a) {
            case 0:
                yh0 yh0Var = this.f31878b;
                yh0Var.getClass();
                yh0Var.f33261b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yh0Var.c(true);
                return;
            default:
                yh0 yh0Var2 = this.f31878b;
                yh0Var2.getClass();
                yh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yh0Var2.c(true);
                return;
        }
    }
}
