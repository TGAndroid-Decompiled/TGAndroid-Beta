package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29527a;
    public final l21 f29528b;

    public j21(l21 l21Var, int i10) {
        this.f29527a = i10;
        this.f29528b = l21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29527a) {
            case 0:
                l21 l21Var = this.f29528b;
                l21Var.getClass();
                l21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l21Var.h();
                l21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l21 l21Var2 = this.f29528b;
                l21Var2.G = max;
                l21Var2.h.invalidate();
                return;
        }
    }
}
