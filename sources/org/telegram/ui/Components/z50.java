package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33388a;
    public final e60 f33389b;

    public z50(e60 e60Var, int i10) {
        this.f33388a = i10;
        this.f33389b = e60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33388a) {
            case 0:
                e60 e60Var = this.f33389b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * e60Var.getMeasuredHeight() * 0.5f;
                e60Var.f25957p0 = floatValue;
                e60Var.v.setTranslationY(floatValue + e60Var.f25956o0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e60 e60Var2 = this.f33389b;
                e60Var2.f25960r0 = floatValue2;
                ki.s0 s0Var = e60Var2.P;
                if (s0Var != null) {
                    s0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
