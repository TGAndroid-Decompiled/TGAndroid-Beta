package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class av0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33470a;
    public final dv0 f33471b;

    public av0(dv0 dv0Var, int i7) {
        this.f33470a = i7;
        this.f33471b = dv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33470a) {
            case 0:
                dv0 dv0Var = this.f33471b;
                dv0Var.getClass();
                dv0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dv0Var.invalidate();
                return;
            case 1:
                dv0 dv0Var2 = this.f33471b;
                dv0Var2.getClass();
                dv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                dv0 dv0Var3 = this.f33471b;
                dv0Var3.getClass();
                dv0Var3.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dv0Var3.invalidate();
                return;
        }
    }
}
