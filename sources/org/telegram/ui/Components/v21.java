package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28577a;
    public final x21 f28578b;

    public v21(x21 x21Var, int i10) {
        this.f28577a = i10;
        this.f28578b = x21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28577a) {
            case 0:
                x21 x21Var = this.f28578b;
                x21Var.getClass();
                x21Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.h();
                x21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x21 x21Var2 = this.f28578b;
                x21Var2.K = max;
                x21Var2.h.invalidate();
                return;
        }
    }
}
