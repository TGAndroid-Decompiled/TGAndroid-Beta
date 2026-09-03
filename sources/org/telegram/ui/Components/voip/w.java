package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.a50;
import org.telegram.ui.d60;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f32437a;
    public final l0 f32438b;

    public w(l0 l0Var, int i10) {
        this.f32437a = i10;
        this.f32438b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f32437a) {
            case 0:
                l0 l0Var = this.f32438b;
                l0Var.getClass();
                l0Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f32438b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f32147c = floatValue;
                d60 d60Var = l0Var2.f32154g0;
                d60Var.f36083w1.setAlpha(1.0f - floatValue);
                a50 a50Var = d60Var.L;
                if (a50Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a50Var.setAlpha((1.0f - d60Var.X1.f32147c) * f10);
                d60Var.E1(d60Var.f36077v0);
                l0Var2.l();
                return;
        }
    }
}
