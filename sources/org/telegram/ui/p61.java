package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39416a;
    public final s61 f39417b;

    public p61(s61 s61Var, int i10) {
        this.f39416a = i10;
        this.f39417b = s61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39416a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61 s61Var = this.f39417b;
                s61Var.N = floatValue;
                s61Var.V.f37647h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61 s61Var2 = this.f39417b;
                s61Var2.N = floatValue2;
                s61Var2.V.f37647h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61 s61Var3 = this.f39417b;
                s61Var3.N = floatValue3;
                s61Var3.V.f37647h0.invalidate();
                return;
        }
    }
}
