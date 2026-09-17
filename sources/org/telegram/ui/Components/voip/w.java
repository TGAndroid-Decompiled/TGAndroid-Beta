package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.g50;
import org.telegram.ui.k60;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f29299a;
    public final m0 f29300b;

    public w(m0 m0Var, int i10) {
        this.f29299a = i10;
        this.f29300b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29299a) {
            case 0:
                m0 m0Var = this.f29300b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29300b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f29037c = floatValue;
                k60 k60Var = m0Var2.f29046j0;
                k60Var.f35116z1.setAlpha(1.0f - floatValue);
                g50 g50Var = k60Var.O;
                if (g50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g50Var.setAlpha((1.0f - k60Var.a2.f29037c) * f7);
                k60Var.E1(k60Var.f35112y0);
                m0Var2.l();
                return;
        }
    }
}
