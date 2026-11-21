package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42311a;
    public final a21 f42312b;

    public y11(a21 a21Var, int i7) {
        this.f42311a = i7;
        this.f42312b = a21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42311a) {
            case 0:
                a21 a21Var = this.f42312b;
                a21Var.getClass();
                a21Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.h();
                a21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a21 a21Var2 = this.f42312b;
                a21Var2.M = max;
                a21Var2.h.invalidate();
                return;
        }
    }
}
