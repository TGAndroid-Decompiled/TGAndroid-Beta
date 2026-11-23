package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41473a;
    public final y11 f41474b;

    public w11(y11 y11Var, int i7) {
        this.f41473a = i7;
        this.f41474b = y11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41473a) {
            case 0:
                y11 y11Var = this.f41474b;
                y11Var.getClass();
                y11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.h();
                y11Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                y11 y11Var2 = this.f41474b;
                y11Var2.M = max;
                y11Var2.h.invalidate();
                return;
        }
    }
}
