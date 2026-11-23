package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40633a;
    public final b50 f40634b;

    public v40(b50 b50Var, int i7) {
        this.f40633a = i7;
        this.f40634b = b50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40633a) {
            case 0:
                b50 b50Var = this.f40634b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * b50Var.getMeasuredHeight() * 0.5f;
                b50Var.f33744y0 = floatValue;
                b50Var.f33734s.setTranslationY(floatValue + b50Var.f33742x0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50 b50Var2 = this.f40634b;
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
