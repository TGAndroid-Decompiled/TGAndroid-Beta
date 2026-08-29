package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28258a;
    public final g01 f28259b;

    public f01(g01 g01Var, int i10) {
        this.f28258a = i10;
        this.f28259b = g01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28258a) {
            case 0:
                g01 g01Var = this.f28259b;
                g01Var.getClass();
                g01Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var.invalidate();
                return;
            case 1:
                g01 g01Var2 = this.f28259b;
                g01Var2.getClass();
                g01Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var2.invalidate();
                return;
            case 2:
                g01 g01Var3 = this.f28259b;
                g01Var3.getClass();
                g01Var3.f28699f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var3.invalidate();
                return;
            case 3:
                g01 g01Var4 = this.f28259b;
                g01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var4.f28702s = floatValue;
                g01Var4.f28703w = (int) ((g01Var4.h * floatValue) + 0);
                g01Var4.invalidate();
                return;
            default:
                g01 g01Var5 = this.f28259b;
                g01Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var5.v = floatValue2;
                int i10 = g01Var5.f28701r;
                g01Var5.f28704x = i10 + ((int) Math.ceil((g01Var5.f28700n - i10) * floatValue2));
                g01Var5.invalidate();
                return;
        }
    }
}
