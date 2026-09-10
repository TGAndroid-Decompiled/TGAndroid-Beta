package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21833a;
    public final eh0 f21834b;

    public bh0(eh0 eh0Var, int i10) {
        this.f21833a = i10;
        this.f21834b = eh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21833a) {
            case 0:
                eh0 eh0Var = this.f21834b;
                eh0Var.getClass();
                eh0Var.f22703b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh0Var.c(true);
                return;
            default:
                eh0 eh0Var2 = this.f21834b;
                eh0Var2.getClass();
                eh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh0Var2.c(true);
                return;
        }
    }
}
