package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30336a;
    public final s11 f30337b;

    public r11(s11 s11Var, int i10) {
        this.f30336a = i10;
        this.f30337b = s11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30336a) {
            case 0:
                s11 s11Var = this.f30337b;
                s11Var.getClass();
                s11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var.invalidate();
                return;
            case 1:
                s11 s11Var2 = this.f30337b;
                s11Var2.getClass();
                s11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var2.invalidate();
                return;
            case 2:
                s11 s11Var3 = this.f30337b;
                s11Var3.getClass();
                s11Var3.f30599f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var3.invalidate();
                return;
            case 3:
                s11 s11Var4 = this.f30337b;
                s11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var4.f30602s = floatValue;
                s11Var4.f30603w = (int) ((s11Var4.h * floatValue) + 0);
                s11Var4.invalidate();
                return;
            default:
                s11 s11Var5 = this.f30337b;
                s11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var5.v = floatValue2;
                int i10 = s11Var5.f30601r;
                s11Var5.f30604x = i10 + ((int) Math.ceil((s11Var5.f30600n - i10) * floatValue2));
                s11Var5.invalidate();
                return;
        }
    }
}
