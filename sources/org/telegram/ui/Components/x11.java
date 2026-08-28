package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34488a;
    public final a21 f34489b;

    public x11(a21 a21Var, int i9) {
        this.f34488a = i9;
        this.f34489b = a21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34488a) {
            case 0:
                a21 a21Var = this.f34489b;
                a21Var.getClass();
                a21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.h();
                a21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a21 a21Var2 = this.f34489b;
                a21Var2.G = max;
                a21Var2.h.invalidate();
                return;
        }
    }
}
