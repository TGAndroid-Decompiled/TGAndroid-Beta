package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.d60;
import org.telegram.ui.z40;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f29702a;
    public final m0 f29703b;

    public w(m0 m0Var, int i10) {
        this.f29702a = i10;
        this.f29703b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29702a) {
            case 0:
                m0 m0Var = this.f29703b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29703b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f29454c = floatValue;
                d60 d60Var = m0Var2.f29463j0;
                d60Var.f33023z1.setAlpha(1.0f - floatValue);
                z40 z40Var = d60Var.O;
                if (z40Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                z40Var.setAlpha((1.0f - d60Var.a2.f29454c) * f7);
                d60Var.E1(d60Var.f33019y0);
                m0Var2.l();
                return;
        }
    }
}
