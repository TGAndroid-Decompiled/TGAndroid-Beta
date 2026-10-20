package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28938a;
    public final r31 f28939b;

    public o31(r31 r31Var, int i10) {
        this.f28938a = i10;
        this.f28939b = r31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28938a) {
            case 0:
                r31 r31Var = this.f28939b;
                r31Var.getClass();
                r31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r31Var.h();
                r31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                r31 r31Var2 = this.f28939b;
                r31Var2.K = max;
                r31Var2.h.invalidate();
                return;
        }
    }
}
