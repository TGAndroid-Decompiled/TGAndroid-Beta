package org.telegram.ui;

import android.animation.ValueAnimator;
public final class l51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40979a;
    public final o51 f40980b;

    public l51(o51 o51Var, int i10) {
        this.f40979a = i10;
        this.f40980b = o51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40979a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51 o51Var = this.f40980b;
                o51Var.N = floatValue;
                o51Var.V.f39202h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51 o51Var2 = this.f40980b;
                o51Var2.N = floatValue2;
                o51Var2.V.f39202h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51 o51Var3 = this.f40980b;
                o51Var3.N = floatValue3;
                o51Var3.V.f39202h0.invalidate();
                return;
        }
    }
}
