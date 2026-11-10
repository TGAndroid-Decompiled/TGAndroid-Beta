package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ru0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37739a;
    public final uu0 f37740b;

    public ru0(uu0 uu0Var, int i7) {
        this.f37739a = i7;
        this.f37740b = uu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37739a) {
            case 0:
                uu0 uu0Var = this.f37740b;
                uu0Var.getClass();
                uu0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uu0Var.invalidate();
                return;
            case 1:
                uu0 uu0Var2 = this.f37740b;
                uu0Var2.getClass();
                uu0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uu0 uu0Var3 = this.f37740b;
                uu0Var3.getClass();
                uu0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uu0Var3.invalidate();
                return;
        }
    }
}
