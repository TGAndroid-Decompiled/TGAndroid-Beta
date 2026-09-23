package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.b50;
import org.telegram.ui.f60;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f29293a;
    public final m0 f29294b;

    public w(m0 m0Var, int i10) {
        this.f29293a = i10;
        this.f29294b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29293a) {
            case 0:
                m0 m0Var = this.f29294b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29294b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f29031c = floatValue;
                f60 f60Var = m0Var2.f29040j0;
                f60Var.f33203z1.setAlpha(1.0f - floatValue);
                b50 b50Var = f60Var.O;
                if (b50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b50Var.setAlpha((1.0f - f60Var.a2.f29031c) * f7);
                f60Var.E1(f60Var.f33199y0);
                m0Var2.l();
                return;
        }
    }
}
