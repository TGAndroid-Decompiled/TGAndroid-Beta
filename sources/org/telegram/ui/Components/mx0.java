package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27531a;
    public final px0 f27532b;

    public mx0(px0 px0Var, int i10) {
        this.f27531a = i10;
        this.f27532b = px0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27531a) {
            case 0:
                px0 px0Var = this.f27532b;
                px0Var.getClass();
                px0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.invalidate();
                return;
            case 1:
                px0 px0Var2 = this.f27532b;
                px0Var2.getClass();
                px0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                px0 px0Var3 = this.f27532b;
                px0Var3.getClass();
                px0Var3.f28445y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var3.invalidate();
                return;
        }
    }
}
