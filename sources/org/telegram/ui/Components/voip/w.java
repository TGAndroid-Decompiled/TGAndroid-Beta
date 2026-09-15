package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.e50;
import org.telegram.ui.i60;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f29322a;
    public final m0 f29323b;

    public w(m0 m0Var, int i10) {
        this.f29322a = i10;
        this.f29323b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29322a) {
            case 0:
                m0 m0Var = this.f29323b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29323b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f29060c = floatValue;
                i60 i60Var = m0Var2.f29069j0;
                i60Var.f34514z1.setAlpha(1.0f - floatValue);
                e50 e50Var = i60Var.O;
                if (e50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e50Var.setAlpha((1.0f - i60Var.a2.f29060c) * f7);
                i60Var.E1(i60Var.f34510y0);
                m0Var2.l();
                return;
        }
    }
}
