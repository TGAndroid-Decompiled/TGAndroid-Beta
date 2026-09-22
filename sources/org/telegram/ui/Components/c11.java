package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23163a;
    public final d11 f23164b;

    public c11(d11 d11Var, int i10) {
        this.f23163a = i10;
        this.f23164b = d11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23163a) {
            case 0:
                d11 d11Var = this.f23164b;
                d11Var.getClass();
                d11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var.invalidate();
                return;
            case 1:
                d11 d11Var2 = this.f23164b;
                d11Var2.getClass();
                d11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var2.invalidate();
                return;
            case 2:
                d11 d11Var3 = this.f23164b;
                d11Var3.getClass();
                d11Var3.f23528f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var3.invalidate();
                return;
            case 3:
                d11 d11Var4 = this.f23164b;
                d11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var4.f23531s = floatValue;
                d11Var4.f23532w = (int) ((d11Var4.h * floatValue) + 0);
                d11Var4.invalidate();
                return;
            default:
                d11 d11Var5 = this.f23164b;
                d11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var5.v = floatValue2;
                int i10 = d11Var5.f23530r;
                d11Var5.f23533x = i10 + ((int) Math.ceil((d11Var5.f23529n - i10) * floatValue2));
                d11Var5.invalidate();
                return;
        }
    }
}
