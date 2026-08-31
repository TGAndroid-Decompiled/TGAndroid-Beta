package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class u21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31531a;
    public final w21 f31532b;

    public u21(w21 w21Var, int i10) {
        this.f31531a = i10;
        this.f31532b = w21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31531a) {
            case 0:
                w21 w21Var = this.f31532b;
                w21Var.getClass();
                w21Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.h();
                w21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                w21 w21Var2 = this.f31532b;
                w21Var2.H = max;
                w21Var2.h.invalidate();
                return;
        }
    }
}
