package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24008a;
    public final hh0 f24009b;

    public eh0(hh0 hh0Var, int i10) {
        this.f24008a = i10;
        this.f24009b = hh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24008a) {
            case 0:
                hh0 hh0Var = this.f24009b;
                hh0Var.getClass();
                hh0Var.f24809b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh0Var.c(true);
                return;
            default:
                hh0 hh0Var2 = this.f24009b;
                hh0Var2.getClass();
                hh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh0Var2.c(true);
                return;
        }
    }
}
