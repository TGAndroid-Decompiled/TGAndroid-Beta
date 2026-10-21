package org.telegram.ui;

import android.animation.ValueAnimator;
public final class d51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36273a;
    public final g51 f36274b;

    public d51(g51 g51Var, int i10) {
        this.f36273a = i10;
        this.f36274b = g51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36273a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g51 g51Var = this.f36274b;
                g51Var.N = floatValue;
                g51Var.V.f43061h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g51 g51Var2 = this.f36274b;
                g51Var2.N = floatValue2;
                g51Var2.V.f43061h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g51 g51Var3 = this.f36274b;
                g51Var3.N = floatValue3;
                g51Var3.V.f43061h0.invalidate();
                return;
        }
    }
}
