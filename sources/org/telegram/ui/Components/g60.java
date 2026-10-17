package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26486a;
    public final l60 f26487b;

    public g60(l60 l60Var, int i10) {
        this.f26486a = i10;
        this.f26487b = l60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26486a) {
            case 0:
                l60 l60Var = this.f26487b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * l60Var.getMeasuredHeight() * 0.5f;
                l60Var.f28106w0 = floatValue;
                l60Var.v.setTranslationY(floatValue + l60Var.f28104v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l60 l60Var2 = this.f26487b;
                l60Var2.f28110y0 = floatValue2;
                si.t0 t0Var = l60Var2.P;
                if (t0Var != null) {
                    t0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
