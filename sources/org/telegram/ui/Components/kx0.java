package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class kx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28302a;
    public final nx0 f28303b;

    public kx0(nx0 nx0Var, int i10) {
        this.f28302a = i10;
        this.f28303b = nx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28302a) {
            case 0:
                nx0 nx0Var = this.f28303b;
                nx0Var.getClass();
                nx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.invalidate();
                return;
            case 1:
                nx0 nx0Var2 = this.f28303b;
                nx0Var2.getClass();
                nx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                nx0 nx0Var3 = this.f28303b;
                nx0Var3.getClass();
                nx0Var3.f29170y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var3.invalidate();
                return;
        }
    }
}
