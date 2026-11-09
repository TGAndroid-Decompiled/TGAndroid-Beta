package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34550a;
    public final o40 f34551b;

    public i40(o40 o40Var, int i7) {
        this.f34550a = i7;
        this.f34551b = o40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34550a) {
            case 0:
                o40 o40Var = this.f34551b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * o40Var.getMeasuredHeight() * 0.5f;
                o40Var.f36645x0 = floatValue;
                o40Var.f36637s.setTranslationY(floatValue + o40Var.f36643w0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o40 o40Var2 = this.f34551b;
                o40Var2.f36648z0 = floatValue2;
                wi.t0 t0Var = o40Var2.O;
                if (t0Var != null) {
                    t0Var.y(floatValue2);
                    return;
                }
                return;
        }
    }
}
