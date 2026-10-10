package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41074a;
    public final t61 f41075b;

    public q61(t61 t61Var, int i10) {
        this.f41074a = i10;
        this.f41075b = t61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41074a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t61 t61Var = this.f41075b;
                t61Var.N = floatValue;
                t61Var.V.f39176h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t61 t61Var2 = this.f41075b;
                t61Var2.N = floatValue2;
                t61Var2.V.f39176h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t61 t61Var3 = this.f41075b;
                t61Var3.N = floatValue3;
                t61Var3.V.f39176h0.invalidate();
                return;
        }
    }
}
