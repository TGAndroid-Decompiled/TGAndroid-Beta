package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class s31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30432a;
    public final u31 f30433b;

    public s31(u31 u31Var, int i10) {
        this.f30432a = i10;
        this.f30433b = u31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30432a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u31 u31Var = this.f30433b;
                u31Var.U = floatValue;
                u31Var.h();
                u31Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                u31 u31Var2 = this.f30433b;
                u31Var2.L = max;
                u31Var2.h.invalidate();
                return;
        }
    }
}
