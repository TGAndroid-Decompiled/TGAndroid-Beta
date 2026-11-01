package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28360a;
    public final o21 f28361b;

    public m21(o21 o21Var, int i10) {
        this.f28360a = i10;
        this.f28361b = o21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28360a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o21 o21Var = this.f28361b;
                o21Var.U = floatValue;
                o21Var.h();
                o21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                o21 o21Var2 = this.f28361b;
                o21Var2.L = max;
                o21Var2.h.invalidate();
                return;
        }
    }
}
