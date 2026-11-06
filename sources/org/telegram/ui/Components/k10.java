package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35134a;
    public final p10 f35135b;

    public k10(p10 p10Var, int i7) {
        this.f35134a = i7;
        this.f35135b = p10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35134a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10 p10Var = this.f35135b;
                p10Var.f36749s.x = (int) floatValue;
                p10Var.i();
                n10 n10Var = p10Var.f36738a;
                if (n10Var.getParent() != null) {
                    p10Var.f36747n.updateViewLayout(n10Var, p10Var.f36749s);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10 p10Var2 = this.f35135b;
                p10Var2.f36749s.y = (int) floatValue2;
                n10 n10Var2 = p10Var2.f36738a;
                if (n10Var2.getParent() != null) {
                    p10Var2.f36747n.updateViewLayout(n10Var2, p10Var2.f36749s);
                    return;
                }
                return;
        }
    }
}
