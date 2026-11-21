package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40680a;
    public final b50 f40681b;

    public v40(b50 b50Var, int i7) {
        this.f40680a = i7;
        this.f40681b = b50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40680a) {
            case 0:
                b50 b50Var = this.f40681b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * b50Var.getMeasuredHeight() * 0.5f;
                b50Var.f33774y0 = floatValue;
                b50Var.f33764s.setTranslationY(floatValue + b50Var.f33772x0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50 b50Var2 = this.f40681b;
                b50Var2.A0 = floatValue2;
                zi.u0 u0Var = b50Var2.P;
                if (u0Var != null) {
                    u0Var.y(floatValue2);
                    return;
                }
                return;
        }
    }
}
