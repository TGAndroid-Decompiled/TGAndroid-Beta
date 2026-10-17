package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.o40;
import org.telegram.ui.s50;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f31817a;
    public final l0 f31818b;

    public v(l0 l0Var, int i10) {
        this.f31817a = i10;
        this.f31818b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f31817a) {
            case 0:
                l0 l0Var = this.f31818b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31818b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f31556c = floatValue;
                s50 s50Var = l0Var2.f31565j0;
                s50Var.f41018z1.setAlpha(1.0f - floatValue);
                o40 o40Var = s50Var.O;
                if (o40Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                o40Var.setAlpha((1.0f - s50Var.a2.f31556c) * f7);
                s50Var.F1(s50Var.f41014y0);
                l0Var2.l();
                return;
        }
    }
}
