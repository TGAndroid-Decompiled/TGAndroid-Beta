package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30631a;
    public final v31 f30632b;

    public t31(v31 v31Var, int i10) {
        this.f30631a = i10;
        this.f30632b = v31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30631a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31 v31Var = this.f30632b;
                v31Var.U = floatValue;
                v31Var.h();
                v31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                v31 v31Var2 = this.f30632b;
                v31Var2.L = max;
                v31Var2.h.invalidate();
                return;
        }
    }
}
