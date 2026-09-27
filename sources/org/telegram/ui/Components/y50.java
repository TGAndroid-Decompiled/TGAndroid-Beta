package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30587a;
    public final d60 f30588b;

    public y50(d60 d60Var, int i10) {
        this.f30587a = i10;
        this.f30588b = d60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30587a) {
            case 0:
                d60 d60Var = this.f30588b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * d60Var.getMeasuredHeight() * 0.5f;
                d60Var.f23563p0 = floatValue;
                d60Var.v.setTranslationY(floatValue + d60Var.f23562o0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60 d60Var2 = this.f30588b;
                d60Var2.f23566r0 = floatValue2;
                ki.s0 s0Var = d60Var2.P;
                if (s0Var != null) {
                    s0Var.v(floatValue2);
                    return;
                }
                return;
        }
    }
}
