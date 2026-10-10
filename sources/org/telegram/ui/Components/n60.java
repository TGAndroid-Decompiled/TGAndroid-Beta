package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29014a;
    public final t60 f29015b;

    public n60(t60 t60Var, int i10) {
        this.f29014a = i10;
        this.f29015b = t60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29014a) {
            case 0:
                t60 t60Var = this.f29015b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * t60Var.getMeasuredHeight() * 0.5f;
                t60Var.f31025v0 = floatValue;
                t60Var.v.setTranslationY(floatValue + t60Var.f31024u0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t60 t60Var2 = this.f29015b;
                t60Var2.f31029x0 = floatValue2;
                ki.t0 t0Var = t60Var2.P;
                if (t0Var != null) {
                    t0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
