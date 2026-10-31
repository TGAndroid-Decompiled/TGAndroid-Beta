package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32628a;
    public final d50 f32629b;

    public y40(d50 d50Var, int i10) {
        this.f32628a = i10;
        this.f32629b = d50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32628a) {
            case 0:
                d50 d50Var = this.f32629b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * d50Var.getMeasuredHeight() * 0.5f;
                d50Var.f25334w0 = floatValue;
                d50Var.f25328s.setTranslationY(floatValue + d50Var.f25332v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d50 d50Var2 = this.f32629b;
                d50Var2.f25338y0 = floatValue2;
                li.x0 x0Var = d50Var2.O;
                if (x0Var != null) {
                    x0Var.x(floatValue2);
                    return;
                }
                return;
        }
    }
}
