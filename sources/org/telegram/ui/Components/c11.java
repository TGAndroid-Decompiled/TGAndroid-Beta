package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23124a;
    public final d11 f23125b;

    public c11(d11 d11Var, int i10) {
        this.f23124a = i10;
        this.f23125b = d11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23124a) {
            case 0:
                d11 d11Var = this.f23125b;
                d11Var.getClass();
                d11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var.invalidate();
                return;
            case 1:
                d11 d11Var2 = this.f23125b;
                d11Var2.getClass();
                d11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var2.invalidate();
                return;
            case 2:
                d11 d11Var3 = this.f23125b;
                d11Var3.getClass();
                d11Var3.f23480f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var3.invalidate();
                return;
            case 3:
                d11 d11Var4 = this.f23125b;
                d11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var4.f23483s = floatValue;
                d11Var4.f23484w = (int) ((d11Var4.h * floatValue) + 0);
                d11Var4.invalidate();
                return;
            default:
                d11 d11Var5 = this.f23125b;
                d11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var5.v = floatValue2;
                int i10 = d11Var5.f23482r;
                d11Var5.f23485x = i10 + ((int) Math.ceil((d11Var5.f23481n - i10) * floatValue2));
                d11Var5.invalidate();
                return;
        }
    }
}
