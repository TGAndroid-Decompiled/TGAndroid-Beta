package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class og0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29046a;
    public final qg0 f29047b;

    public og0(qg0 qg0Var, int i10) {
        this.f29046a = i10;
        this.f29047b = qg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29046a) {
            case 0:
                qg0 qg0Var = this.f29047b;
                qg0Var.getClass();
                qg0Var.f29586y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var.invalidate();
                return;
            default:
                qg0 qg0Var2 = this.f29047b;
                qg0Var2.getClass();
                qg0Var2.f29586y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var2.invalidate();
                return;
        }
    }
}
