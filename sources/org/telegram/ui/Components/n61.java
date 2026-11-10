package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36251a;
    public final Object f36252b;

    public n61(Object obj, int i7) {
        this.f36251a = i7;
        this.f36252b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36251a) {
            case 0:
                u61 u61Var = (u61) this.f36252b;
                u61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61Var.setAnimationIdicatorProgress(floatValue);
                t61 t61Var = u61Var.D;
                if (t61Var != null) {
                    ((m) t61Var).y(floatValue);
                    return;
                }
                return;
            default:
                k60 k60Var = (k60) this.f36252b;
                k60Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60 i60Var = k60Var.f35223x;
                if (i60Var != null) {
                    i60Var.setProgress(floatValue2);
                    return;
                }
                return;
        }
    }
}
