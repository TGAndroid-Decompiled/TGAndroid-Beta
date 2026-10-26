package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class b41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26754a;
    public final d41 f26755b;

    public b41(d41 d41Var, int i10) {
        this.f26754a = i10;
        this.f26755b = d41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26754a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41 d41Var = this.f26755b;
                d41Var.U = floatValue;
                d41Var.h();
                d41Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                d41 d41Var2 = this.f26755b;
                d41Var2.L = max;
                d41Var2.h.invalidate();
                return;
        }
    }
}
