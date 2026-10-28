package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.t40;
import org.telegram.ui.x50;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f34243a;
    public final l0 f34244b;

    public v(l0 l0Var, int i10) {
        this.f34243a = i10;
        this.f34244b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f34243a) {
            case 0:
                l0 l0Var = this.f34244b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f34244b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f34010c = floatValue;
                x50 x50Var = l0Var2.f34019j0;
                x50Var.f45596z1.setAlpha(1.0f - floatValue);
                t40 t40Var = x50Var.O;
                if (t40Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                t40Var.setAlpha((1.0f - x50Var.a2.f34010c) * f7);
                x50Var.E1(x50Var.f45592y0);
                l0Var2.l();
                return;
        }
    }
}
