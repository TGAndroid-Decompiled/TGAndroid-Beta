package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30755a;
    public final a11 f30756b;

    public z01(a11 a11Var, int i10) {
        this.f30755a = i10;
        this.f30756b = a11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30755a) {
            case 0:
                a11 a11Var = this.f30756b;
                a11Var.getClass();
                a11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var.invalidate();
                return;
            case 1:
                a11 a11Var2 = this.f30756b;
                a11Var2.getClass();
                a11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var2.invalidate();
                return;
            case 2:
                a11 a11Var3 = this.f30756b;
                a11Var3.getClass();
                a11Var3.f22553f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var3.invalidate();
                return;
            case 3:
                a11 a11Var4 = this.f30756b;
                a11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var4.f22556s = floatValue;
                a11Var4.f22557w = (int) ((a11Var4.h * floatValue) + 0);
                a11Var4.invalidate();
                return;
            default:
                a11 a11Var5 = this.f30756b;
                a11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var5.v = floatValue2;
                int i10 = a11Var5.f22555r;
                a11Var5.f22558x = i10 + ((int) Math.ceil((a11Var5.f22554n - i10) * floatValue2));
                a11Var5.invalidate();
                return;
        }
    }
}
