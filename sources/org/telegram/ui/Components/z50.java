package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33387a;
    public final e60 f33388b;

    public z50(e60 e60Var, int i10) {
        this.f33387a = i10;
        this.f33388b = e60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33387a) {
            case 0:
                e60 e60Var = this.f33388b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * e60Var.getMeasuredHeight() * 0.5f;
                e60Var.f25956p0 = floatValue;
                e60Var.v.setTranslationY(floatValue + e60Var.f25955o0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e60 e60Var2 = this.f33388b;
                e60Var2.f25959r0 = floatValue2;
                ki.s0 s0Var = e60Var2.P;
                if (s0Var != null) {
                    s0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
