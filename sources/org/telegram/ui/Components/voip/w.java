package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.e50;
import org.telegram.ui.i60;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f29687a;
    public final m0 f29688b;

    public w(m0 m0Var, int i10) {
        this.f29687a = i10;
        this.f29688b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29687a) {
            case 0:
                m0 m0Var = this.f29688b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29688b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.f29425c = floatValue;
                i60 i60Var = m0Var2.f29434j0;
                i60Var.f34484z1.setAlpha(1.0f - floatValue);
                e50 e50Var = i60Var.O;
                if (e50Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e50Var.setAlpha((1.0f - i60Var.a2.f29425c) * f7);
                i60Var.E1(i60Var.f34480y0);
                m0Var2.l();
                return;
        }
    }
}
