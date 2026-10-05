package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.e50;
import org.telegram.ui.h60;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f32316a;
    public final m0 f32317b;

    public w(m0 m0Var, int i10) {
        this.f32316a = i10;
        this.f32317b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f32316a) {
            case 0:
                m0 m0Var = this.f32317b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f32317b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f32051c = floatValue;
                h60 h60Var = m0Var2.f32061j0;
                h60Var.f37011z1.setAlpha(1.0f - floatValue);
                e50 e50Var = h60Var.O;
                if (e50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e50Var.setAlpha((1.0f - h60Var.a2.f32051c) * f7);
                h60Var.E1(h60Var.f37007y0);
                m0Var2.l();
                return;
        }
    }
}
