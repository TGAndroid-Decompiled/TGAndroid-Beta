package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28985a;
    public final b60 f28986b;

    public v50(b60 b60Var, int i10) {
        this.f28985a = i10;
        this.f28986b = b60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28985a) {
            case 0:
                b60 b60Var = this.f28986b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * b60Var.getMeasuredHeight() * 0.5f;
                b60Var.m0 = floatValue;
                b60Var.v.setTranslationY(floatValue + b60Var.f22882l0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b60 b60Var2 = this.f28986b;
                b60Var2.f22885o0 = floatValue2;
                ki.q0 q0Var = b60Var2.M;
                if (q0Var != null) {
                    q0Var.v(floatValue2);
                    return;
                }
                return;
        }
    }
}
