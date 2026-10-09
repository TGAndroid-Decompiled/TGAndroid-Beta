package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c50;
import org.telegram.ui.g60;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f32337a;
    public final m0 f32338b;

    public w(m0 m0Var, int i10) {
        this.f32337a = i10;
        this.f32338b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f32337a) {
            case 0:
                m0 m0Var = this.f32338b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f32338b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f32057c = floatValue;
                g60 g60Var = m0Var2.f32067j0;
                g60Var.f37894z1.setAlpha(1.0f - floatValue);
                c50 c50Var = g60Var.O;
                if (c50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c50Var.setAlpha((1.0f - g60Var.a2.f32057c) * f7);
                g60Var.F1(g60Var.f37890y0);
                m0Var2.l();
                return;
        }
    }
}
