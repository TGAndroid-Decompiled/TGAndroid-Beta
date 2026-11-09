package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35210a;
    public final m11 f35211b;

    public k11(m11 m11Var, int i7) {
        this.f35210a = i7;
        this.f35211b = m11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35210a) {
            case 0:
                m11 m11Var = this.f35211b;
                m11Var.getClass();
                m11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.h();
                m11Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m11 m11Var2 = this.f35211b;
                m11Var2.L = max;
                m11Var2.h.invalidate();
                return;
        }
    }
}
