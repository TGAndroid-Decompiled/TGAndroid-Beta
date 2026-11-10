package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35142a;
    public final p10 f35143b;

    public k10(p10 p10Var, int i7) {
        this.f35142a = i7;
        this.f35143b = p10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35142a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10 p10Var = this.f35143b;
                p10Var.f36774s.x = (int) floatValue;
                p10Var.i();
                m10 m10Var = p10Var.f36763a;
                if (m10Var.getParent() != null) {
                    p10Var.f36772n.updateViewLayout(m10Var, p10Var.f36774s);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10 p10Var2 = this.f35143b;
                p10Var2.f36774s.y = (int) floatValue2;
                m10 m10Var2 = p10Var2.f36763a;
                if (m10Var2.getParent() != null) {
                    p10Var2.f36772n.updateViewLayout(m10Var2, p10Var2.f36774s);
                    return;
                }
                return;
        }
    }
}
