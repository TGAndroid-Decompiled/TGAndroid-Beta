package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34160a;
    public final n40 f34161b;

    public h40(n40 n40Var, int i7) {
        this.f34160a = i7;
        this.f34161b = n40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34160a) {
            case 0:
                n40 n40Var = this.f34161b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * n40Var.getMeasuredHeight() * 0.5f;
                n40Var.f36186w0 = floatValue;
                n40Var.f36180s.setTranslationY(floatValue + n40Var.f36184v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n40 n40Var2 = this.f34161b;
                n40Var2.f36190y0 = floatValue2;
                wi.t0 t0Var = n40Var2.O;
                if (t0Var != null) {
                    t0Var.x(floatValue2);
                    return;
                }
                return;
        }
    }
}
