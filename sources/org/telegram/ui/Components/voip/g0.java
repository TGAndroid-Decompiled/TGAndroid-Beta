package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c40;
import org.telegram.ui.z20;
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39162a;
    public final k0 f39163b;

    public g0(k0 k0Var, int i7) {
        this.f39162a = i7;
        this.f39163b = k0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f39162a) {
            case 0:
                k0 k0Var = this.f39163b;
                k0Var.getClass();
                k0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f39163b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.f39242c = floatValue;
                c40 c40Var = k0Var2.f39252j0;
                c40Var.f44594q3.setAlpha(1.0f - floatValue);
                z20 z20Var = c40Var.F1;
                if (z20Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z20Var.setAlpha((1.0f - c40Var.R3.f39242c) * f10);
                c40Var.J1(c40Var.f44588p2);
                k0Var2.l();
                return;
        }
    }
}
