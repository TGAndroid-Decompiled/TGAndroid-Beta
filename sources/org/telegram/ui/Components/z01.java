package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29561a;
    public final a11 f29562b;

    public z01(a11 a11Var, int i10) {
        this.f29561a = i10;
        this.f29562b = a11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29561a) {
            case 0:
                a11 a11Var = this.f29562b;
                a11Var.getClass();
                a11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var.invalidate();
                return;
            case 1:
                a11 a11Var2 = this.f29562b;
                a11Var2.getClass();
                a11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var2.invalidate();
                return;
            case 2:
                a11 a11Var3 = this.f29562b;
                a11Var3.getClass();
                a11Var3.f21351f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var3.invalidate();
                return;
            case 3:
                a11 a11Var4 = this.f29562b;
                a11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var4.f21354s = floatValue;
                a11Var4.f21355w = (int) ((a11Var4.h * floatValue) + 0);
                a11Var4.invalidate();
                return;
            default:
                a11 a11Var5 = this.f29562b;
                a11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var5.v = floatValue2;
                int i10 = a11Var5.f21353r;
                a11Var5.f21356x = i10 + ((int) Math.ceil((a11Var5.f21352n - i10) * floatValue2));
                a11Var5.invalidate();
                return;
        }
    }
}
