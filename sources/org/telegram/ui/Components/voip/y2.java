package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class y2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31947a;
    public final a3 f31948b;

    public y2(a3 a3Var, int i10) {
        this.f31947a = i10;
        this.f31948b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31947a) {
            case 0:
                a3 a3Var = this.f31948b;
                a3Var.getClass();
                a3Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var.invalidate();
                a3Var.T.c();
                return;
            case 1:
                a3 a3Var2 = this.f31948b;
                a3Var2.getClass();
                a3Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.invalidate();
                a3Var2.T.c();
                return;
            case 2:
                a3 a3Var3 = this.f31948b;
                a3Var3.getClass();
                a3Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var3.invalidate();
                a3Var3.T.c();
                return;
            case 3:
                a3 a3Var4 = this.f31948b;
                a3Var4.getClass();
                a3Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var4.invalidate();
                return;
            case 4:
                a3 a3Var5 = this.f31948b;
                a3Var5.getClass();
                a3Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var5.invalidate();
                return;
            default:
                a3 a3Var6 = this.f31948b;
                a3Var6.getClass();
                a3Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var6.invalidate();
                return;
        }
    }
}
