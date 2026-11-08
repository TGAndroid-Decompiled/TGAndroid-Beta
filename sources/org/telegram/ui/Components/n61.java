package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36256a;
    public final Object f36257b;

    public n61(Object obj, int i7) {
        this.f36256a = i7;
        this.f36257b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36256a) {
            case 0:
                u61 u61Var = (u61) this.f36257b;
                u61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61Var.setAnimationIdicatorProgress(floatValue);
                t61 t61Var = u61Var.D;
                if (t61Var != null) {
                    ((n) t61Var).y(floatValue);
                    return;
                }
                return;
            default:
                k60 k60Var = (k60) this.f36257b;
                k60Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60 i60Var = k60Var.f35235x;
                if (i60Var != null) {
                    i60Var.setProgress(floatValue2);
                    return;
                }
                return;
        }
    }
}
