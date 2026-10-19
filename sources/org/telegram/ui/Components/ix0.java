package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ix0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27384a;
    public final lx0 f27385b;

    public ix0(lx0 lx0Var, int i10) {
        this.f27384a = i10;
        this.f27385b = lx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27384a) {
            case 0:
                lx0 lx0Var = this.f27385b;
                lx0Var.getClass();
                lx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.invalidate();
                return;
            case 1:
                lx0 lx0Var2 = this.f27385b;
                lx0Var2.getClass();
                lx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                lx0 lx0Var3 = this.f27385b;
                lx0Var3.getClass();
                lx0Var3.f28330y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var3.invalidate();
                return;
        }
    }
}
