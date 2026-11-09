package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.b30;
import org.telegram.ui.e40;
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39304a;
    public final k0 f39305b;

    public g0(k0 k0Var, int i7) {
        this.f39304a = i7;
        this.f39305b = k0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f39304a) {
            case 0:
                k0 k0Var = this.f39305b;
                k0Var.getClass();
                k0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f39305b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.f39384c = floatValue;
                e40 e40Var = k0Var2.f39394j0;
                e40Var.f45257q3.setAlpha(1.0f - floatValue);
                b30 b30Var = e40Var.F1;
                if (b30Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b30Var.setAlpha((1.0f - e40Var.R3.f39384c) * f10);
                e40Var.J1(e40Var.f45251p2);
                k0Var2.l();
                return;
        }
    }
}
