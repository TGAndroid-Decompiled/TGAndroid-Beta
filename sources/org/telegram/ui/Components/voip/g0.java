package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.d30;
import org.telegram.ui.f40;
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41009a;
    public final k0 f41010b;

    public g0(k0 k0Var, int i7) {
        this.f41009a = i7;
        this.f41010b = k0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f41009a) {
            case 0:
                k0 k0Var = this.f41010b;
                k0Var.getClass();
                k0Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f41010b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.f41112c = floatValue;
                f40 f40Var = k0Var2.f41123k0;
                f40Var.f47576y3.setAlpha(1.0f - floatValue);
                d30 d30Var = f40Var.J1;
                if (d30Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                d30Var.setAlpha((1.0f - f40Var.Z3.f41112c) * f10);
                f40Var.K1(f40Var.f47550t2);
                k0Var2.l();
                return;
        }
    }
}
