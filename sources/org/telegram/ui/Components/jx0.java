package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27666a;
    public final mx0 f27667b;

    public jx0(mx0 mx0Var, int i10) {
        this.f27666a = i10;
        this.f27667b = mx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27666a) {
            case 0:
                mx0 mx0Var = this.f27667b;
                mx0Var.getClass();
                mx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx0Var.invalidate();
                return;
            case 1:
                mx0 mx0Var2 = this.f27667b;
                mx0Var2.getClass();
                mx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                mx0 mx0Var3 = this.f27667b;
                mx0Var3.getClass();
                mx0Var3.f28624y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx0Var3.invalidate();
                return;
        }
    }
}
