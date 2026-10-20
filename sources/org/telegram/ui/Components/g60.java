package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26515a;
    public final l60 f26516b;

    public g60(l60 l60Var, int i10) {
        this.f26515a = i10;
        this.f26516b = l60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26515a) {
            case 0:
                l60 l60Var = this.f26516b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * l60Var.getMeasuredHeight() * 0.5f;
                l60Var.f28056w0 = floatValue;
                l60Var.v.setTranslationY(floatValue + l60Var.f28054v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l60 l60Var2 = this.f26516b;
                l60Var2.f28060y0 = floatValue2;
                si.s0 s0Var = l60Var2.P;
                if (s0Var != null) {
                    s0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
