package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26298a;
    public final o01 f26299b;

    public n01(o01 o01Var, int i10) {
        this.f26298a = i10;
        this.f26299b = o01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26298a) {
            case 0:
                o01 o01Var = this.f26299b;
                o01Var.getClass();
                o01Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var.invalidate();
                return;
            case 1:
                o01 o01Var2 = this.f26299b;
                o01Var2.getClass();
                o01Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var2.invalidate();
                return;
            case 2:
                o01 o01Var3 = this.f26299b;
                o01Var3.getClass();
                o01Var3.f26581f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var3.invalidate();
                return;
            case 3:
                o01 o01Var4 = this.f26299b;
                o01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var4.f26584s = floatValue;
                o01Var4.f26585w = (int) ((o01Var4.h * floatValue) + 0);
                o01Var4.invalidate();
                return;
            default:
                o01 o01Var5 = this.f26299b;
                o01Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var5.v = floatValue2;
                int i10 = o01Var5.f26583r;
                o01Var5.f26586x = i10 + ((int) Math.ceil((o01Var5.f26582n - i10) * floatValue2));
                o01Var5.invalidate();
                return;
        }
    }
}
