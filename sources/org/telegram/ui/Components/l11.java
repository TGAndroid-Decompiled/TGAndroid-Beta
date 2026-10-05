package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28351a;
    public final m11 f28352b;

    public l11(m11 m11Var, int i10) {
        this.f28351a = i10;
        this.f28352b = m11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28351a) {
            case 0:
                m11 m11Var = this.f28352b;
                m11Var.getClass();
                m11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.invalidate();
                return;
            case 1:
                m11 m11Var2 = this.f28352b;
                m11Var2.getClass();
                m11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var2.invalidate();
                return;
            case 2:
                m11 m11Var3 = this.f28352b;
                m11Var3.getClass();
                m11Var3.f28571f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var3.invalidate();
                return;
            case 3:
                m11 m11Var4 = this.f28352b;
                m11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var4.f28574s = floatValue;
                m11Var4.f28575w = (int) ((m11Var4.h * floatValue) + 0);
                m11Var4.invalidate();
                return;
            default:
                m11 m11Var5 = this.f28352b;
                m11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var5.v = floatValue2;
                int i10 = m11Var5.f28573r;
                m11Var5.f28576x = i10 + ((int) Math.ceil((m11Var5.f28572n - i10) * floatValue2));
                m11Var5.invalidate();
                return;
        }
    }
}
