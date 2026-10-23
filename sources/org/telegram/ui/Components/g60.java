package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26550a;
    public final m60 f26551b;

    public g60(m60 m60Var, int i10) {
        this.f26550a = i10;
        this.f26551b = m60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26550a) {
            case 0:
                m60 m60Var = this.f26551b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * m60Var.getMeasuredHeight() * 0.5f;
                m60Var.f28547w0 = floatValue;
                m60Var.v.setTranslationY(floatValue + m60Var.f28545v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m60 m60Var2 = this.f26551b;
                m60Var2.f28551y0 = floatValue2;
                si.u0 u0Var = m60Var2.P;
                if (u0Var != null) {
                    u0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
