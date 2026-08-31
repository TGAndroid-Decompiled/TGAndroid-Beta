package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30558a;
    public final s01 f30559b;

    public r01(s01 s01Var, int i10) {
        this.f30558a = i10;
        this.f30559b = s01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30558a) {
            case 0:
                s01 s01Var = this.f30559b;
                s01Var.getClass();
                s01Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var.invalidate();
                return;
            case 1:
                s01 s01Var2 = this.f30559b;
                s01Var2.getClass();
                s01Var2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var2.invalidate();
                return;
            case 2:
                s01 s01Var3 = this.f30559b;
                s01Var3.getClass();
                s01Var3.f30931f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var3.invalidate();
                return;
            case 3:
                s01 s01Var4 = this.f30559b;
                s01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var4.f30934s = floatValue;
                s01Var4.f30935w = (int) ((s01Var4.h * floatValue) + 0);
                s01Var4.invalidate();
                return;
            default:
                s01 s01Var5 = this.f30559b;
                s01Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var5.v = floatValue2;
                int i10 = s01Var5.f30933r;
                s01Var5.f30936x = i10 + ((int) Math.ceil((s01Var5.f30932n - i10) * floatValue2));
                s01Var5.invalidate();
                return;
        }
    }
}
