package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30519a;
    public final v21 f30520b;

    public t21(v21 v21Var, int i10) {
        this.f30519a = i10;
        this.f30520b = v21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30519a) {
            case 0:
                v21 v21Var = this.f30520b;
                v21Var.getClass();
                v21Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v21Var.h();
                v21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                v21 v21Var2 = this.f30520b;
                v21Var2.K = max;
                v21Var2.h.invalidate();
                return;
        }
    }
}
