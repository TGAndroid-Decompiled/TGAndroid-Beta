package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33345a;
    public final d30 f33346b;

    public z20(d30 d30Var, int i10) {
        this.f33345a = i10;
        this.f33346b = d30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33345a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d30 d30Var = this.f33346b;
                d30Var.f25548r.x = (int) floatValue;
                d30Var.h();
                b30 b30Var = d30Var.f25539a;
                if (b30Var.getParent() != null) {
                    d30Var.f25547n.updateViewLayout(b30Var, d30Var.f25548r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d30 d30Var2 = this.f33346b;
                d30Var2.f25548r.y = (int) floatValue2;
                b30 b30Var2 = d30Var2.f25539a;
                if (b30Var2.getParent() != null) {
                    d30Var2.f25547n.updateViewLayout(b30Var2, d30Var2.f25548r);
                    return;
                }
                return;
        }
    }
}
