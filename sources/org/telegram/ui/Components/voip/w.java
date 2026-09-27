package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c50;
import org.telegram.ui.g60;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f29654a;
    public final m0 f29655b;

    public w(m0 m0Var, int i10) {
        this.f29654a = i10;
        this.f29655b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29654a) {
            case 0:
                m0 m0Var = this.f29655b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29655b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f29406c = floatValue;
                g60 g60Var = m0Var2.f29415j0;
                g60Var.f33830z1.setAlpha(1.0f - floatValue);
                c50 c50Var = g60Var.O;
                if (c50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c50Var.setAlpha((1.0f - g60Var.a2.f29406c) * f7);
                g60Var.E1(g60Var.f33826y0);
                m0Var2.l();
                return;
        }
    }
}
