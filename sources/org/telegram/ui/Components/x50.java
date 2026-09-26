package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class x50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30275a;
    public final c60 f30276b;

    public x50(c60 c60Var, int i10) {
        this.f30275a = i10;
        this.f30276b = c60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30275a) {
            case 0:
                c60 c60Var = this.f30276b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * c60Var.getMeasuredHeight() * 0.5f;
                c60Var.f23234p0 = floatValue;
                c60Var.v.setTranslationY(floatValue + c60Var.f23233o0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c60 c60Var2 = this.f30276b;
                c60Var2.f23237r0 = floatValue2;
                ki.s0 s0Var = c60Var2.P;
                if (s0Var != null) {
                    s0Var.v(floatValue2);
                    return;
                }
                return;
        }
    }
}
