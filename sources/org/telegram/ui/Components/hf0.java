package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35828a;
    public final kf0 f35829b;

    public hf0(kf0 kf0Var, int i7) {
        this.f35828a = i7;
        this.f35829b = kf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35828a) {
            case 0:
                kf0 kf0Var = this.f35829b;
                kf0Var.getClass();
                kf0Var.f36864b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kf0Var.c(true);
                return;
            default:
                kf0 kf0Var2 = this.f35829b;
                kf0Var2.getClass();
                kf0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kf0Var2.c(true);
                return;
        }
    }
}
