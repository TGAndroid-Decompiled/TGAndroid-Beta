package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32932a;
    public final j40 f32933b;

    public d40(j40 j40Var, int i3) {
        this.f32932a = i3;
        this.f32933b = j40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32932a) {
            case 0:
                j40 j40Var = this.f32933b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * j40Var.getMeasuredHeight() * 0.5f;
                j40Var.f34957x0 = floatValue;
                j40Var.f34949s.setTranslationY(floatValue + j40Var.f34955w0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j40 j40Var2 = this.f32933b;
                j40Var2.f34960z0 = floatValue2;
                wi.t0 t0Var = j40Var2.P;
                if (t0Var != null) {
                    t0Var.x(floatValue2);
                    return;
                }
                return;
        }
    }
}
