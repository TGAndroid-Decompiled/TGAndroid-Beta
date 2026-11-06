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
                p10Var.f36858s.x = (int) floatValue;
                p10Var.i();
                n10 n10Var = p10Var.f36847a;
                if (n10Var.getParent() != null) {
                    p10Var.f36856n.updateViewLayout(n10Var, p10Var.f36858s);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10 p10Var2 = this.f35143b;
                p10Var2.f36858s.y = (int) floatValue2;
                n10 n10Var2 = p10Var2.f36847a;
                if (n10Var2.getParent() != null) {
                    p10Var2.f36856n.updateViewLayout(n10Var2, p10Var2.f36858s);
                    return;
                }
                return;
        }
    }
}
