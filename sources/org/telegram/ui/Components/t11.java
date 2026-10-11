package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30955a;
    public final u11 f30956b;

    public t11(u11 u11Var, int i10) {
        this.f30955a = i10;
        this.f30956b = u11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30955a) {
            case 0:
                u11 u11Var = this.f30956b;
                u11Var.getClass();
                u11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u11Var.invalidate();
                return;
            case 1:
                u11 u11Var2 = this.f30956b;
                u11Var2.getClass();
                u11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u11Var2.invalidate();
                return;
            case 2:
                u11 u11Var3 = this.f30956b;
                u11Var3.getClass();
                u11Var3.f31210f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u11Var3.invalidate();
                return;
            case 3:
                u11 u11Var4 = this.f30956b;
                u11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u11Var4.f31213s = floatValue;
                u11Var4.f31214w = (int) ((u11Var4.h * floatValue) + 0);
                u11Var4.invalidate();
                return;
            default:
                u11 u11Var5 = this.f30956b;
                u11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u11Var5.v = floatValue2;
                int i10 = u11Var5.f31212r;
                u11Var5.f31215x = i10 + ((int) Math.ceil((u11Var5.f31211n - i10) * floatValue2));
                u11Var5.invalidate();
                return;
        }
    }
}
