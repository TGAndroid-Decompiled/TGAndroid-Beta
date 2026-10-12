package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class u00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31013a;
    public final b10 f31014b;

    public u00(b10 b10Var, int i10) {
        this.f31013a = i10;
        this.f31014b = b10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31013a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b10 b10Var = this.f31014b;
                b10Var.f24546x = floatValue;
                b10Var.invalidate();
                return;
            default:
                b10 b10Var2 = this.f31014b;
                b10Var2.getClass();
                b10Var2.f24547y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b10Var2.invalidate();
                return;
        }
    }
}
