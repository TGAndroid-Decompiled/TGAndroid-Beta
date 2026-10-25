package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.r40;
import org.telegram.ui.v50;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f34135a;
    public final l0 f34136b;

    public v(l0 l0Var, int i10) {
        this.f34135a = i10;
        this.f34136b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f34135a) {
            case 0:
                l0 l0Var = this.f34136b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f34136b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f33902c = floatValue;
                v50 v50Var = l0Var2.f33911j0;
                v50Var.f44712z1.setAlpha(1.0f - floatValue);
                r40 r40Var = v50Var.O;
                if (r40Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                r40Var.setAlpha((1.0f - v50Var.a2.f33902c) * f7);
                v50Var.E1(v50Var.f44708y0);
                l0Var2.l();
                return;
        }
    }
}
