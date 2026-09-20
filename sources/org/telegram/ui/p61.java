package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36479a;
    public final s61 f36480b;

    public p61(s61 s61Var, int i10) {
        this.f36479a = i10;
        this.f36480b = s61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36479a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61 s61Var = this.f36480b;
                s61Var.N = floatValue;
                s61Var.V.f34792h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61 s61Var2 = this.f36480b;
                s61Var2.N = floatValue2;
                s61Var2.V.f34792h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61 s61Var3 = this.f36480b;
                s61Var3.N = floatValue3;
                s61Var3.V.f34792h0.invalidate();
                return;
        }
    }
}
