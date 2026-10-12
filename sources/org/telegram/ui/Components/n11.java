package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27562a;
    public final o11 f27563b;

    public n11(o11 o11Var, int i10) {
        this.f27562a = i10;
        this.f27563b = o11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27562a) {
            case 0:
                o11 o11Var = this.f27563b;
                o11Var.getClass();
                o11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var.invalidate();
                return;
            case 1:
                o11 o11Var2 = this.f27563b;
                o11Var2.getClass();
                o11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var2.invalidate();
                return;
            case 2:
                o11 o11Var3 = this.f27563b;
                o11Var3.getClass();
                o11Var3.f27796f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var3.invalidate();
                return;
            case 3:
                o11 o11Var4 = this.f27563b;
                o11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var4.f27799s = floatValue;
                o11Var4.f27800w = (int) ((o11Var4.h * floatValue) + 0);
                o11Var4.invalidate();
                return;
            default:
                o11 o11Var5 = this.f27563b;
                o11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var5.v = floatValue2;
                int i10 = o11Var5.f27798r;
                o11Var5.f27801x = i10 + ((int) Math.ceil((o11Var5.f27797n - i10) * floatValue2));
                o11Var5.invalidate();
                return;
        }
    }
}
