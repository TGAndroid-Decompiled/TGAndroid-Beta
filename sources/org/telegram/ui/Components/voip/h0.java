package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c30;
import org.telegram.ui.e40;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40911a;
    public final l0 f40912b;

    public h0(l0 l0Var, int i7) {
        this.f40911a = i7;
        this.f40912b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f40911a) {
            case 0:
                l0 l0Var = this.f40912b;
                l0Var.getClass();
                l0Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f40912b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f41005c = floatValue;
                e40 e40Var = l0Var2.f41016k0;
                e40Var.f47426y3.setAlpha(1.0f - floatValue);
                c30 c30Var = e40Var.J1;
                if (c30Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                c30Var.setAlpha((1.0f - e40Var.Z3.f41005c) * f10);
                e40Var.K1(e40Var.f47400t2);
                l0Var2.l();
                return;
        }
    }
}
