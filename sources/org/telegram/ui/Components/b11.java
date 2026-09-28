package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class b11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22837a;
    public final c11 f22838b;

    public b11(c11 c11Var, int i10) {
        this.f22837a = i10;
        this.f22838b = c11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22837a) {
            case 0:
                c11 c11Var = this.f22838b;
                c11Var.getClass();
                c11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var.invalidate();
                return;
            case 1:
                c11 c11Var2 = this.f22838b;
                c11Var2.getClass();
                c11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var2.invalidate();
                return;
            case 2:
                c11 c11Var3 = this.f22838b;
                c11Var3.getClass();
                c11Var3.f23164f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var3.invalidate();
                return;
            case 3:
                c11 c11Var4 = this.f22838b;
                c11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var4.f23167s = floatValue;
                c11Var4.f23168w = (int) ((c11Var4.h * floatValue) + 0);
                c11Var4.invalidate();
                return;
            default:
                c11 c11Var5 = this.f22838b;
                c11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var5.v = floatValue2;
                int i10 = c11Var5.f23166r;
                c11Var5.f23169x = i10 + ((int) Math.ceil((c11Var5.f23165n - i10) * floatValue2));
                c11Var5.invalidate();
                return;
        }
    }
}
