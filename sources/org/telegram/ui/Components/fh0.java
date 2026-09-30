package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24297a;
    public final ih0 f24298b;

    public fh0(ih0 ih0Var, int i10) {
        this.f24297a = i10;
        this.f24298b = ih0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24297a) {
            case 0:
                ih0 ih0Var = this.f24298b;
                ih0Var.getClass();
                ih0Var.f25125b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ih0Var.c(true);
                return;
            default:
                ih0 ih0Var2 = this.f24298b;
                ih0Var2.getClass();
                ih0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ih0Var2.c(true);
                return;
        }
    }
}
