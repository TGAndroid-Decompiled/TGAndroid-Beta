package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class u21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28275a;
    public final w21 f28276b;

    public u21(w21 w21Var, int i10) {
        this.f28275a = i10;
        this.f28276b = w21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28275a) {
            case 0:
                w21 w21Var = this.f28276b;
                w21Var.getClass();
                w21Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.h();
                w21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                w21 w21Var2 = this.f28276b;
                w21Var2.K = max;
                w21Var2.h.invalidate();
                return;
        }
    }
}
