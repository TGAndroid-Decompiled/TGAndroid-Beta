package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24868a;
    public final k31 f24869b;

    public i31(k31 k31Var, int i10) {
        this.f24868a = i10;
        this.f24869b = k31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24868a) {
            case 0:
                k31 k31Var = this.f24869b;
                k31Var.getClass();
                k31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k31Var.h();
                k31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k31 k31Var2 = this.f24869b;
                k31Var2.K = max;
                k31Var2.h.invalidate();
                return;
        }
    }
}
