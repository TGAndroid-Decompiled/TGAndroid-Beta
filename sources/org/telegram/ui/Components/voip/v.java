package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.k40;
import org.telegram.ui.o50;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f33896a;
    public final k0 f33897b;

    public v(k0 k0Var, int i9) {
        this.f33896a = i9;
        this.f33897b = k0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f33896a) {
            case 0:
                k0 k0Var = this.f33897b;
                k0Var.getClass();
                k0Var.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f33897b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.f33600c = floatValue;
                o50 o50Var = k0Var2.f33606f0;
                o50Var.f40969v1.setAlpha(1.0f - floatValue);
                k40 k40Var = o50Var.K;
                if (k40Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k40Var.setAlpha((1.0f - o50Var.W1.f33600c) * f10);
                o50Var.E1(o50Var.f40964u0);
                k0Var2.l();
                return;
        }
    }
}
