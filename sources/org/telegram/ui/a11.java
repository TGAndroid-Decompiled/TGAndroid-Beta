package org.telegram.ui;

import android.animation.ValueAnimator;
public final class a11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43529a;
    public final d11 f43530b;

    public a11(d11 d11Var, int i7) {
        this.f43529a = i7;
        this.f43530b = d11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43529a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11 d11Var = this.f43530b;
                d11Var.N = floatValue;
                d11Var.V.f50036h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11 d11Var2 = this.f43530b;
                d11Var2.N = floatValue2;
                d11Var2.V.f50036h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11 d11Var3 = this.f43530b;
                d11Var3.N = floatValue3;
                d11Var3.V.f50036h0.invalidate();
                return;
        }
    }
}
