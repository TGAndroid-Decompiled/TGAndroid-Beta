package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ry0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37843a;
    public final sy0 f37844b;

    public ry0(sy0 sy0Var, int i3) {
        this.f37843a = i3;
        this.f37844b = sy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37843a) {
            case 0:
                sy0 sy0Var = this.f37844b;
                sy0Var.getClass();
                sy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var.invalidate();
                return;
            case 1:
                sy0 sy0Var2 = this.f37844b;
                sy0Var2.getClass();
                sy0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var2.invalidate();
                return;
            case 2:
                sy0 sy0Var3 = this.f37844b;
                sy0Var3.getClass();
                sy0Var3.f38197f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var3.invalidate();
                return;
            case 3:
                sy0 sy0Var4 = this.f37844b;
                sy0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var4.f38200s = floatValue;
                sy0Var4.f38202x = (int) ((sy0Var4.h * floatValue) + 0);
                sy0Var4.invalidate();
                return;
            default:
                sy0 sy0Var5 = this.f37844b;
                sy0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var5.f38201w = floatValue2;
                int i3 = sy0Var5.f38199r;
                sy0Var5.f38203y = i3 + ((int) Math.ceil((sy0Var5.f38198n - i3) * floatValue2));
                sy0Var5.invalidate();
                return;
        }
    }
}
