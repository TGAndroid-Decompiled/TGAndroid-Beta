package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37419a;
    public final tu0 f37420b;

    public qu0(tu0 tu0Var, int i7) {
        this.f37419a = i7;
        this.f37420b = tu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37419a) {
            case 0:
                tu0 tu0Var = this.f37420b;
                tu0Var.getClass();
                tu0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tu0Var.invalidate();
                return;
            case 1:
                tu0 tu0Var2 = this.f37420b;
                tu0Var2.getClass();
                tu0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                tu0 tu0Var3 = this.f37420b;
                tu0Var3.getClass();
                tu0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tu0Var3.invalidate();
                return;
        }
    }
}
