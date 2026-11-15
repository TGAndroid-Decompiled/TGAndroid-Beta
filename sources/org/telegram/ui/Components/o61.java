package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37860a;
    public final Object f37861b;

    public o61(Object obj, int i7) {
        this.f37860a = i7;
        this.f37861b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37860a) {
            case 0:
                v61 v61Var = (v61) this.f37861b;
                v61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.setAnimationIdicatorProgress(floatValue);
                u61 u61Var = v61Var.E;
                if (u61Var != null) {
                    ((cf) u61Var).q(floatValue);
                    return;
                }
                return;
            default:
                m60 m60Var = (m60) this.f37861b;
                m60Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k60 k60Var = m60Var.f37115x;
                if (k60Var != null) {
                    k60Var.setProgress(floatValue2);
                    return;
                }
                return;
        }
    }
}
