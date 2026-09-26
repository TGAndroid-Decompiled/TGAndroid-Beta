package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.d60;
import org.telegram.ui.z40;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f29711a;
    public final m0 f29712b;

    public w(m0 m0Var, int i10) {
        this.f29711a = i10;
        this.f29712b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29711a) {
            case 0:
                m0 m0Var = this.f29712b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29712b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f29463c = floatValue;
                d60 d60Var = m0Var2.f29472j0;
                d60Var.f33039z1.setAlpha(1.0f - floatValue);
                z40 z40Var = d60Var.O;
                if (z40Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                z40Var.setAlpha((1.0f - d60Var.a2.f29463c) * f7);
                d60Var.E1(d60Var.f33035y0);
                m0Var2.l();
                return;
        }
    }
}
