package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32718a;
    public final d50 f32719b;

    public y40(d50 d50Var, int i10) {
        this.f32718a = i10;
        this.f32719b = d50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32718a) {
            case 0:
                d50 d50Var = this.f32719b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * d50Var.getMeasuredHeight() * 0.5f;
                d50Var.f25405w0 = floatValue;
                d50Var.f25399s.setTranslationY(floatValue + d50Var.f25403v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d50 d50Var2 = this.f32719b;
                d50Var2.f25409y0 = floatValue2;
                li.x0 x0Var = d50Var2.O;
                if (x0Var != null) {
                    x0Var.x(floatValue2);
                    return;
                }
                return;
        }
    }
}
