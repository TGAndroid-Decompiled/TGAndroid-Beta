package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26031a;
    public final n01 f26032b;

    public m01(n01 n01Var, int i10) {
        this.f26031a = i10;
        this.f26032b = n01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26031a) {
            case 0:
                n01 n01Var = this.f26032b;
                n01Var.getClass();
                n01Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var.invalidate();
                return;
            case 1:
                n01 n01Var2 = this.f26032b;
                n01Var2.getClass();
                n01Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var2.invalidate();
                return;
            case 2:
                n01 n01Var3 = this.f26032b;
                n01Var3.getClass();
                n01Var3.f26284f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var3.invalidate();
                return;
            case 3:
                n01 n01Var4 = this.f26032b;
                n01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var4.f26287s = floatValue;
                n01Var4.f26288w = (int) ((n01Var4.h * floatValue) + 0);
                n01Var4.invalidate();
                return;
            default:
                n01 n01Var5 = this.f26032b;
                n01Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var5.v = floatValue2;
                int i10 = n01Var5.f26286r;
                n01Var5.f26289x = i10 + ((int) Math.ceil((n01Var5.f26285n - i10) * floatValue2));
                n01Var5.invalidate();
                return;
        }
    }
}
