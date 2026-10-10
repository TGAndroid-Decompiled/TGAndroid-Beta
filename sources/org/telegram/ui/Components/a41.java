package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24470a;
    public final c41 f24471b;

    public a41(c41 c41Var, int i10) {
        this.f24470a = i10;
        this.f24471b = c41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24470a) {
            case 0:
                c41 c41Var = this.f24471b;
                c41Var.getClass();
                c41Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c41Var.h();
                c41Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                c41 c41Var2 = this.f24471b;
                c41Var2.K = max;
                c41Var2.h.invalidate();
                return;
        }
    }
}
