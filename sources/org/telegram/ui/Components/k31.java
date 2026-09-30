package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25643a;
    public final m31 f25644b;

    public k31(m31 m31Var, int i10) {
        this.f25643a = i10;
        this.f25644b = m31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25643a) {
            case 0:
                m31 m31Var = this.f25644b;
                m31Var.getClass();
                m31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m31Var.h();
                m31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m31 m31Var2 = this.f25644b;
                m31Var2.K = max;
                m31Var2.h.invalidate();
                return;
        }
    }
}
