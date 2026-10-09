package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33454a;
    public final b41 f33455b;

    public z31(b41 b41Var, int i10) {
        this.f33454a = i10;
        this.f33455b = b41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33454a) {
            case 0:
                b41 b41Var = this.f33455b;
                b41Var.getClass();
                b41Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b41Var.h();
                b41Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                b41 b41Var2 = this.f33455b;
                b41Var2.K = max;
                b41Var2.h.invalidate();
                return;
        }
    }
}
