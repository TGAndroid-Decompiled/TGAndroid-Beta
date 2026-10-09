package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28707a;
    public final s60 f28708b;

    public m60(s60 s60Var, int i10) {
        this.f28707a = i10;
        this.f28708b = s60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28707a) {
            case 0:
                s60 s60Var = this.f28708b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * s60Var.getMeasuredHeight() * 0.5f;
                s60Var.f30697v0 = floatValue;
                s60Var.v.setTranslationY(floatValue + s60Var.f30696u0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s60 s60Var2 = this.f28708b;
                s60Var2.f30701x0 = floatValue2;
                ki.t0 t0Var = s60Var2.P;
                if (t0Var != null) {
                    t0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
