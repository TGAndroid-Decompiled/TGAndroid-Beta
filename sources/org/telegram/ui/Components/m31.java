package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28392a;
    public final p31 f28393b;

    public m31(p31 p31Var, int i10) {
        this.f28392a = i10;
        this.f28393b = p31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28392a) {
            case 0:
                p31 p31Var = this.f28393b;
                p31Var.getClass();
                p31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p31Var.h();
                p31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                p31 p31Var2 = this.f28393b;
                p31Var2.K = max;
                p31Var2.h.invalidate();
                return;
        }
    }
}
