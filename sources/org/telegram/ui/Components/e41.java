package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25589a;
    public final g41 f25590b;

    public e41(g41 g41Var, int i10) {
        this.f25589a = i10;
        this.f25590b = g41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25589a) {
            case 0:
                g41 g41Var = this.f25590b;
                g41Var.getClass();
                g41Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g41Var.h();
                g41Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                g41 g41Var2 = this.f25590b;
                g41Var2.K = max;
                g41Var2.h.invalidate();
                return;
        }
    }
}
