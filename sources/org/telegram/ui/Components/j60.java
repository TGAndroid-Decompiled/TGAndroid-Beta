package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25897a;
    public final o60 f25898b;

    public j60(o60 o60Var, int i10) {
        this.f25897a = i10;
        this.f25898b = o60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25897a) {
            case 0:
                o60 o60Var = this.f25898b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * o60Var.getMeasuredHeight() * 0.5f;
                o60Var.f27582w0 = floatValue;
                o60Var.v.setTranslationY(floatValue + o60Var.f27580v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o60 o60Var2 = this.f25898b;
                o60Var2.f27586y0 = floatValue2;
                ri.r0 r0Var = o60Var2.P;
                if (r0Var != null) {
                    r0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
