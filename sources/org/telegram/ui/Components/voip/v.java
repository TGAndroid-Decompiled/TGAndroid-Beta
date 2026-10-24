package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.p40;
import org.telegram.ui.u50;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f31933a;
    public final l0 f31934b;

    public v(l0 l0Var, int i10) {
        this.f31933a = i10;
        this.f31934b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f31933a) {
            case 0:
                l0 l0Var = this.f31934b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31934b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f31672c = floatValue;
                u50 u50Var = l0Var2.f31681j0;
                u50Var.f42322z1.setAlpha(1.0f - floatValue);
                p40 p40Var = u50Var.O;
                if (p40Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p40Var.setAlpha((1.0f - u50Var.a2.f31672c) * f7);
                u50Var.E1(u50Var.f42318y0);
                l0Var2.l();
                return;
        }
    }
}
