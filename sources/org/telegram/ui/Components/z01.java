package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30744a;
    public final a11 f30745b;

    public z01(a11 a11Var, int i10) {
        this.f30744a = i10;
        this.f30745b = a11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30744a) {
            case 0:
                a11 a11Var = this.f30745b;
                a11Var.getClass();
                a11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var.invalidate();
                return;
            case 1:
                a11 a11Var2 = this.f30745b;
                a11Var2.getClass();
                a11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var2.invalidate();
                return;
            case 2:
                a11 a11Var3 = this.f30745b;
                a11Var3.getClass();
                a11Var3.f22538f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var3.invalidate();
                return;
            case 3:
                a11 a11Var4 = this.f30745b;
                a11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var4.f22541s = floatValue;
                a11Var4.f22542w = (int) ((a11Var4.h * floatValue) + 0);
                a11Var4.invalidate();
                return;
            default:
                a11 a11Var5 = this.f30745b;
                a11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var5.v = floatValue2;
                int i10 = a11Var5.f22540r;
                a11Var5.f22543x = i10 + ((int) Math.ceil((a11Var5.f22539n - i10) * floatValue2));
                a11Var5.invalidate();
                return;
        }
    }
}
