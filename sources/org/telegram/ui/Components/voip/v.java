package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.f50;
import org.telegram.ui.j60;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f31879a;
    public final l0 f31880b;

    public v(l0 l0Var, int i10) {
        this.f31879a = i10;
        this.f31880b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f31879a) {
            case 0:
                l0 l0Var = this.f31880b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31880b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f31599c = floatValue;
                j60 j60Var = l0Var2.f31609j0;
                j60Var.f37618z1.setAlpha(1.0f - floatValue);
                f50 f50Var = j60Var.O;
                if (f50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f50Var.setAlpha((1.0f - j60Var.a2.f31599c) * f7);
                j60Var.E1(j60Var.f37614y0);
                l0Var2.l();
                return;
        }
    }
}
