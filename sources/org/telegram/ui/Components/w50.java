package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29899a;
    public final b60 f29900b;

    public w50(b60 b60Var, int i10) {
        this.f29899a = i10;
        this.f29900b = b60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29899a) {
            case 0:
                b60 b60Var = this.f29900b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * b60Var.getMeasuredHeight() * 0.5f;
                b60Var.f22892p0 = floatValue;
                b60Var.v.setTranslationY(floatValue + b60Var.f22891o0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b60 b60Var2 = this.f29900b;
                b60Var2.f22895r0 = floatValue2;
                ki.s0 s0Var = b60Var2.P;
                if (s0Var != null) {
                    s0Var.v(floatValue2);
                    return;
                }
                return;
        }
    }
}
