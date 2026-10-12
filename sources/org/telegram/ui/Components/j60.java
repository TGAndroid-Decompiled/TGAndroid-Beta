package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26200a;
    public final o60 f26201b;

    public j60(o60 o60Var, int i10) {
        this.f26200a = i10;
        this.f26201b = o60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26200a) {
            case 0:
                o60 o60Var = this.f26201b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * o60Var.getMeasuredHeight() * 0.5f;
                o60Var.f27886w0 = floatValue;
                o60Var.v.setTranslationY(floatValue + o60Var.f27884v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o60 o60Var2 = this.f26201b;
                o60Var2.f27890y0 = floatValue2;
                li.u0 u0Var = o60Var2.P;
                if (u0Var != null) {
                    u0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
