package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41946a;
    public final z11 f41947b;

    public x11(z11 z11Var, int i7) {
        this.f41946a = i7;
        this.f41947b = z11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41946a) {
            case 0:
                z11 z11Var = this.f41947b;
                z11Var.getClass();
                z11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z11Var.h();
                z11Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                z11 z11Var2 = this.f41947b;
                z11Var2.M = max;
                z11Var2.h.invalidate();
                return;
        }
    }
}
