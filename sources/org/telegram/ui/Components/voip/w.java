package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.e50;
import org.telegram.ui.h60;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f32243a;
    public final m0 f32244b;

    public w(m0 m0Var, int i10) {
        this.f32243a = i10;
        this.f32244b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f32243a) {
            case 0:
                m0 m0Var = this.f32244b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f32244b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f31978c = floatValue;
                h60 h60Var = m0Var2.f31988j0;
                h60Var.f36979z1.setAlpha(1.0f - floatValue);
                e50 e50Var = h60Var.O;
                if (e50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e50Var.setAlpha((1.0f - h60Var.a2.f31978c) * f7);
                h60Var.E1(h60Var.f36975y0);
                m0Var2.l();
                return;
        }
    }
}
