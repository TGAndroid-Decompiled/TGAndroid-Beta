package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34817a;
    public final l11 f34818b;

    public j11(l11 l11Var, int i7) {
        this.f34817a = i7;
        this.f34818b = l11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34817a) {
            case 0:
                l11 l11Var = this.f34818b;
                l11Var.getClass();
                l11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var.h();
                l11Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l11 l11Var2 = this.f34818b;
                l11Var2.L = max;
                l11Var2.h.invalidate();
                return;
        }
    }
}
