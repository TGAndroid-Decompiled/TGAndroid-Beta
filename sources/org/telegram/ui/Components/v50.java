package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28930a;
    public final a60 f28931b;

    public v50(a60 a60Var, int i10) {
        this.f28930a = i10;
        this.f28931b = a60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28930a) {
            case 0:
                a60 a60Var = this.f28931b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * a60Var.getMeasuredHeight() * 0.5f;
                a60Var.f22517h0 = floatValue;
                a60Var.f22525r.setTranslationY(floatValue + a60Var.f22516g0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a60 a60Var2 = this.f28931b;
                a60Var2.f22519j0 = floatValue2;
                ki.h0 h0Var = a60Var2.J;
                if (h0Var != null) {
                    h0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
