package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34209a;
    public final n40 f34210b;

    public h40(n40 n40Var, int i7) {
        this.f34209a = i7;
        this.f34210b = n40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34209a) {
            case 0:
                n40 n40Var = this.f34210b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * n40Var.getMeasuredHeight() * 0.5f;
                n40Var.f36269w0 = floatValue;
                n40Var.f36263s.setTranslationY(floatValue + n40Var.f36267v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n40 n40Var2 = this.f34210b;
                n40Var2.f36273y0 = floatValue2;
                wi.t0 t0Var = n40Var2.O;
                if (t0Var != null) {
                    t0Var.x(floatValue2);
                    return;
                }
                return;
        }
    }
}
