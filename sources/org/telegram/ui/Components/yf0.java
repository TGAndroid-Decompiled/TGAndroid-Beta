package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31016a;
    public final ag0 f31017b;

    public yf0(ag0 ag0Var, int i10) {
        this.f31016a = i10;
        this.f31017b = ag0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31016a) {
            case 0:
                ag0 ag0Var = this.f31017b;
                ag0Var.getClass();
                ag0Var.f23390y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ag0Var.invalidate();
                return;
            default:
                ag0 ag0Var2 = this.f31017b;
                ag0Var2.getClass();
                ag0Var2.f23390y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ag0Var2.invalidate();
                return;
        }
    }
}
