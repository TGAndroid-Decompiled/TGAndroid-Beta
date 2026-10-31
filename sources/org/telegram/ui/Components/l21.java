package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27999a;
    public final n21 f28000b;

    public l21(n21 n21Var, int i10) {
        this.f27999a = i10;
        this.f28000b = n21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27999a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n21 n21Var = this.f28000b;
                n21Var.U = floatValue;
                n21Var.h();
                n21Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                n21 n21Var2 = this.f28000b;
                n21Var2.L = max;
                n21Var2.h.invalidate();
                return;
        }
    }
}
