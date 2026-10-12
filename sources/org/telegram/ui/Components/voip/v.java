package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.j50;
import org.telegram.ui.n60;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f30542a;
    public final l0 f30543b;

    public v(l0 l0Var, int i10) {
        this.f30542a = i10;
        this.f30543b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f30542a) {
            case 0:
                l0 l0Var = this.f30543b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f30543b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f30283c = floatValue;
                n60 n60Var = l0Var2.f30292j0;
                n60Var.f38547z1.setAlpha(1.0f - floatValue);
                j50 j50Var = n60Var.O;
                if (j50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                j50Var.setAlpha((1.0f - n60Var.a2.f30283c) * f7);
                n60Var.F1(n60Var.f38543y0);
                l0Var2.l();
                return;
        }
    }
}
