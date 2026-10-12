package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.e50;
import org.telegram.ui.i60;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f32082a;
    public final n0 f32083b;

    public x(n0 n0Var, int i10) {
        this.f32082a = i10;
        this.f32083b = n0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f32082a) {
            case 0:
                n0 n0Var = this.f32083b;
                n0Var.getClass();
                n0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.invalidate();
                return;
            default:
                n0 n0Var2 = this.f32083b;
                n0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var2.f31801c = floatValue;
                i60 i60Var = n0Var2.f31811j0;
                i60Var.f38786z1.setAlpha(1.0f - floatValue);
                e50 e50Var = i60Var.O;
                if (e50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e50Var.setAlpha((1.0f - i60Var.a2.f31801c) * f7);
                i60Var.F1(i60Var.f38782y0);
                n0Var2.l();
                return;
        }
    }
}
