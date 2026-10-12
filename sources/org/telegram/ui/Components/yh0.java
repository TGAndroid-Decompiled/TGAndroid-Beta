package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33107a;
    public final bi0 f33108b;

    public yh0(bi0 bi0Var, int i10) {
        this.f33107a = i10;
        this.f33108b = bi0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33107a) {
            case 0:
                bi0 bi0Var = this.f33108b;
                bi0Var.getClass();
                bi0Var.f24659b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi0Var.c(true);
                return;
            default:
                bi0 bi0Var2 = this.f33108b;
                bi0Var2.getClass();
                bi0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi0Var2.c(true);
                return;
        }
    }
}
