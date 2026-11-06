package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35885a;
    public final Object f35886b;

    public m61(Object obj, int i7) {
        this.f35885a = i7;
        this.f35886b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35885a) {
            case 0:
                t61 t61Var = (t61) this.f35886b;
                t61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t61Var.setAnimationIdicatorProgress(floatValue);
                s61 s61Var = t61Var.D;
                if (s61Var != null) {
                    ((n) s61Var).y(floatValue);
                    return;
                }
                return;
            default:
                k60 k60Var = (k60) this.f35886b;
                k60Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60 i60Var = k60Var.f35184x;
                if (i60Var != null) {
                    i60Var.setProgress(floatValue2);
                    return;
                }
                return;
        }
    }
}
