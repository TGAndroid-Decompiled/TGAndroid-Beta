package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36661a;
    public final Object f36662b;

    public o61(Object obj, int i7) {
        this.f36661a = i7;
        this.f36662b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36661a) {
            case 0:
                v61 v61Var = (v61) this.f36662b;
                v61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.setAnimationIdicatorProgress(floatValue);
                u61 u61Var = v61Var.D;
                if (u61Var != null) {
                    ((n) u61Var).y(floatValue);
                    return;
                }
                return;
            default:
                l60 l60Var = (l60) this.f36662b;
                l60Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j60 j60Var = l60Var.f35621x;
                if (j60Var != null) {
                    j60Var.setProgress(floatValue2);
                    return;
                }
                return;
        }
    }
}
