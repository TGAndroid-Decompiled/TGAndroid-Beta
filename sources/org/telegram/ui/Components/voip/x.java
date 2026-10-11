package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c50;
import org.telegram.ui.g60;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f32396a;
    public final n0 f32397b;

    public x(n0 n0Var, int i10) {
        this.f32396a = i10;
        this.f32397b = n0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f32396a) {
            case 0:
                n0 n0Var = this.f32397b;
                n0Var.getClass();
                n0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.invalidate();
                return;
            default:
                n0 n0Var2 = this.f32397b;
                n0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var2.f32116c = floatValue;
                g60 g60Var = n0Var2.f32126j0;
                g60Var.f37974z1.setAlpha(1.0f - floatValue);
                c50 c50Var = g60Var.O;
                if (c50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c50Var.setAlpha((1.0f - g60Var.a2.f32116c) * f7);
                g60Var.F1(g60Var.f37970y0);
                n0Var2.l();
                return;
        }
    }
}
