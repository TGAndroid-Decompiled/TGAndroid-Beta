package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class s40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39489a;
    public final y40 f39490b;

    public s40(y40 y40Var, int i7) {
        this.f39489a = i7;
        this.f39490b = y40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39489a) {
            case 0:
                y40 y40Var = this.f39490b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * y40Var.getMeasuredHeight() * 0.5f;
                y40Var.f42353y0 = floatValue;
                y40Var.f42343s.setTranslationY(floatValue + y40Var.f42351x0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y40 y40Var2 = this.f39490b;
                y40Var2.A0 = floatValue2;
                zi.u0 u0Var = y40Var2.P;
                if (u0Var != null) {
                    u0Var.y(floatValue2);
                    return;
                }
                return;
        }
    }
}
