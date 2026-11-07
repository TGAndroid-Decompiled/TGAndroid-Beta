package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34170a;
    public final n40 f34171b;

    public h40(n40 n40Var, int i7) {
        this.f34170a = i7;
        this.f34171b = n40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34170a) {
            case 0:
                n40 n40Var = this.f34171b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * n40Var.getMeasuredHeight() * 0.5f;
                n40Var.f36223x0 = floatValue;
                n40Var.f36215s.setTranslationY(floatValue + n40Var.f36221w0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n40 n40Var2 = this.f34171b;
                n40Var2.f36226z0 = floatValue2;
                wi.u0 u0Var = n40Var2.O;
                if (u0Var != null) {
                    u0Var.y(floatValue2);
                    return;
                }
                return;
        }
    }
}
