package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32859a;
    public final uz0 f32860b;

    public tz0(uz0 uz0Var, int i9) {
        this.f32859a = i9;
        this.f32860b = uz0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32859a) {
            case 0:
                uz0 uz0Var = this.f32860b;
                uz0Var.getClass();
                uz0Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var.invalidate();
                return;
            case 1:
                uz0 uz0Var2 = this.f32860b;
                uz0Var2.getClass();
                uz0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var2.invalidate();
                return;
            case 2:
                uz0 uz0Var3 = this.f32860b;
                uz0Var3.getClass();
                uz0Var3.f33178f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var3.invalidate();
                return;
            case 3:
                uz0 uz0Var4 = this.f32860b;
                uz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var4.f33181s = floatValue;
                uz0Var4.f33182w = (int) ((uz0Var4.h * floatValue) + 0);
                uz0Var4.invalidate();
                return;
            default:
                uz0 uz0Var5 = this.f32860b;
                uz0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var5.v = floatValue2;
                int i9 = uz0Var5.f33180r;
                uz0Var5.f33183x = i9 + ((int) Math.ceil((uz0Var5.f33179n - i9) * floatValue2));
                uz0Var5.invalidate();
                return;
        }
    }
}
