package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33819a;
    public final cz0 f33820b;

    public bz0(cz0 cz0Var, int i7) {
        this.f33819a = i7;
        this.f33820b = cz0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33819a) {
            case 0:
                cz0 cz0Var = this.f33820b;
                cz0Var.getClass();
                cz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var.invalidate();
                return;
            case 1:
                cz0 cz0Var2 = this.f33820b;
                cz0Var2.getClass();
                cz0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var2.invalidate();
                return;
            case 2:
                cz0 cz0Var3 = this.f33820b;
                cz0Var3.getClass();
                cz0Var3.f34223f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var3.invalidate();
                return;
            case 3:
                cz0 cz0Var4 = this.f33820b;
                cz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var4.f34226s = floatValue;
                cz0Var4.f34228x = (int) ((cz0Var4.h * floatValue) + 0);
                cz0Var4.invalidate();
                return;
            default:
                cz0 cz0Var5 = this.f33820b;
                cz0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var5.f34227w = floatValue2;
                int i7 = cz0Var5.f34225r;
                cz0Var5.f34229y = i7 + ((int) Math.ceil((cz0Var5.f34224n - i7) * floatValue2));
                cz0Var5.invalidate();
                return;
        }
    }
}
