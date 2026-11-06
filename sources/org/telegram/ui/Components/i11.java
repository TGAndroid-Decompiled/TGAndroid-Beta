package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34421a;
    public final k11 f34422b;

    public i11(k11 k11Var, int i7) {
        this.f34421a = i7;
        this.f34422b = k11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34421a) {
            case 0:
                k11 k11Var = this.f34422b;
                k11Var.getClass();
                k11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var.h();
                k11Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k11 k11Var2 = this.f34422b;
                k11Var2.L = max;
                k11Var2.h.invalidate();
                return;
        }
    }
}
