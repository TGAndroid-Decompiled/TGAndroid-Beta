package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28669a;
    public final q31 f28670b;

    public n31(q31 q31Var, int i10) {
        this.f28669a = i10;
        this.f28670b = q31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28669a) {
            case 0:
                q31 q31Var = this.f28670b;
                q31Var.getClass();
                q31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q31Var.h();
                q31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                q31 q31Var2 = this.f28670b;
                q31Var2.K = max;
                q31Var2.h.invalidate();
                return;
        }
    }
}
