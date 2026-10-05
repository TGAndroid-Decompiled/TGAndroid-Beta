package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31053a;
    public final v31 f31054b;

    public t31(v31 v31Var, int i10) {
        this.f31053a = i10;
        this.f31054b = v31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31053a) {
            case 0:
                v31 v31Var = this.f31054b;
                v31Var.getClass();
                v31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.h();
                v31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                v31 v31Var2 = this.f31054b;
                v31Var2.K = max;
                v31Var2.h.invalidate();
                return;
        }
    }
}
