package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c60;
import org.telegram.ui.z40;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f29987a;
    public final k0 f29988b;

    public v(k0 k0Var, int i10) {
        this.f29987a = i10;
        this.f29988b = k0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f29987a) {
            case 0:
                k0 k0Var = this.f29988b;
                k0Var.getClass();
                k0Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f29988b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.f29715c = floatValue;
                c60 c60Var = k0Var2.f29721g0;
                c60Var.f33190w1.setAlpha(1.0f - floatValue);
                z40 z40Var = c60Var.L;
                if (z40Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z40Var.setAlpha((1.0f - c60Var.X1.f29715c) * f10);
                c60Var.E1(c60Var.f33184v0);
                k0Var2.l();
                return;
        }
    }
}
