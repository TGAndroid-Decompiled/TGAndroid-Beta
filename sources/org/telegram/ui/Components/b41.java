package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class b41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24849a;
    public final d41 f24850b;

    public b41(d41 d41Var, int i10) {
        this.f24849a = i10;
        this.f24850b = d41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24849a) {
            case 0:
                d41 d41Var = this.f24850b;
                d41Var.getClass();
                d41Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var.h();
                d41Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                d41 d41Var2 = this.f24850b;
                d41Var2.K = max;
                d41Var2.h.invalidate();
                return;
        }
    }
}
