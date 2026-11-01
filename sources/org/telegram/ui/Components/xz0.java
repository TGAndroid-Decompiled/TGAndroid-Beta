package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32675a;
    public final yz0 f32676b;

    public xz0(yz0 yz0Var, int i10) {
        this.f32675a = i10;
        this.f32676b = yz0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32675a) {
            case 0:
                yz0 yz0Var = this.f32676b;
                yz0Var.getClass();
                yz0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var.invalidate();
                return;
            case 1:
                yz0 yz0Var2 = this.f32676b;
                yz0Var2.getClass();
                yz0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var2.invalidate();
                return;
            case 2:
                yz0 yz0Var3 = this.f32676b;
                yz0Var3.getClass();
                yz0Var3.f32941f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var3.invalidate();
                return;
            case 3:
                yz0 yz0Var4 = this.f32676b;
                yz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var4.f32944s = floatValue;
                yz0Var4.f32946x = (int) ((yz0Var4.h * floatValue) + 0);
                yz0Var4.invalidate();
                return;
            default:
                yz0 yz0Var5 = this.f32676b;
                yz0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var5.f32945w = floatValue2;
                int i10 = yz0Var5.f32943r;
                yz0Var5.f32947y = i10 + ((int) Math.ceil((yz0Var5.f32942n - i10) * floatValue2));
                yz0Var5.invalidate();
                return;
        }
    }
}
