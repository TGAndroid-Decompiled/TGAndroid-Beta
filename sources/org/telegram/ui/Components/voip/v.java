package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.f50;
import org.telegram.ui.j60;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f28491a;
    public final m0 f28492b;

    public v(m0 m0Var, int i10) {
        this.f28491a = i10;
        this.f28492b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f28491a) {
            case 0:
                m0 m0Var = this.f28492b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f28492b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f28243c = floatValue;
                j60 j60Var = m0Var2.f28252j0;
                j60Var.f34040z1.setAlpha(1.0f - floatValue);
                f50 f50Var = j60Var.O;
                if (f50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f50Var.setAlpha((1.0f - j60Var.a2.f28243c) * f7);
                j60Var.E1(j60Var.f34036y0);
                m0Var2.l();
                return;
        }
    }
}
