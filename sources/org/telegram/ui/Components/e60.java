package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25974a;
    public final k60 f25975b;

    public e60(k60 k60Var, int i10) {
        this.f25974a = i10;
        this.f25975b = k60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25974a) {
            case 0:
                k60 k60Var = this.f25975b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * k60Var.getMeasuredHeight() * 0.5f;
                k60Var.f27901w0 = floatValue;
                k60Var.v.setTranslationY(floatValue + k60Var.f27899v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k60 k60Var2 = this.f25975b;
                k60Var2.f27905y0 = floatValue2;
                si.u0 u0Var = k60Var2.P;
                if (u0Var != null) {
                    u0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
