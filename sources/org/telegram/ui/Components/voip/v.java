package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.o40;
import org.telegram.ui.s50;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f31824a;
    public final l0 f31825b;

    public v(l0 l0Var, int i10) {
        this.f31824a = i10;
        this.f31825b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f31824a) {
            case 0:
                l0 l0Var = this.f31825b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31825b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f31563c = floatValue;
                s50 s50Var = l0Var2.f31572j0;
                s50Var.f41039z1.setAlpha(1.0f - floatValue);
                o40 o40Var = s50Var.O;
                if (o40Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                o40Var.setAlpha((1.0f - s50Var.a2.f31563c) * f7);
                s50Var.F1(s50Var.f41035y0);
                l0Var2.l();
                return;
        }
    }
}
