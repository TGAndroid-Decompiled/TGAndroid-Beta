package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34107a;
    public final n40 f34108b;

    public h40(n40 n40Var, int i7) {
        this.f34107a = i7;
        this.f34108b = n40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34107a) {
            case 0:
                n40 n40Var = this.f34108b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * n40Var.getMeasuredHeight() * 0.5f;
                n40Var.f36239x0 = floatValue;
                n40Var.f36231s.setTranslationY(floatValue + n40Var.f36237w0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n40 n40Var2 = this.f34108b;
                n40Var2.f36242z0 = floatValue2;
                wi.t0 t0Var = n40Var2.O;
                if (t0Var != null) {
                    t0Var.y(floatValue2);
                    return;
                }
                return;
        }
    }
}
