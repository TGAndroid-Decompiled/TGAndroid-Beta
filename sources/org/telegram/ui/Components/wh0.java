package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32645a;
    public final zh0 f32646b;

    public wh0(zh0 zh0Var, int i10) {
        this.f32645a = i10;
        this.f32646b = zh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32645a) {
            case 0:
                zh0 zh0Var = this.f32646b;
                zh0Var.getClass();
                zh0Var.f33529b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zh0Var.c(true);
                return;
            default:
                zh0 zh0Var2 = this.f32646b;
                zh0Var2.getClass();
                zh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zh0Var2.c(true);
                return;
        }
    }
}
