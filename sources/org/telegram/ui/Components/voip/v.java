package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.j50;
import org.telegram.ui.n60;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f30211a;
    public final l0 f30212b;

    public v(l0 l0Var, int i10) {
        this.f30211a = i10;
        this.f30212b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f30211a) {
            case 0:
                l0 l0Var = this.f30212b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f30212b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f29952c = floatValue;
                n60 n60Var = l0Var2.f29961j0;
                n60Var.f38262z1.setAlpha(1.0f - floatValue);
                j50 j50Var = n60Var.O;
                if (j50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                j50Var.setAlpha((1.0f - n60Var.a2.f29952c) * f7);
                n60Var.F1(n60Var.f38258y0);
                l0Var2.l();
                return;
        }
    }
}
