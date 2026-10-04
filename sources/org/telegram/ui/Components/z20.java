package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33339a;
    public final d30 f33340b;

    public z20(d30 d30Var, int i10) {
        this.f33339a = i10;
        this.f33340b = d30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33339a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d30 d30Var = this.f33340b;
                d30Var.f25543r.x = (int) floatValue;
                d30Var.h();
                b30 b30Var = d30Var.f25534a;
                if (b30Var.getParent() != null) {
                    d30Var.f25542n.updateViewLayout(b30Var, d30Var.f25543r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d30 d30Var2 = this.f33340b;
                d30Var2.f25543r.y = (int) floatValue2;
                b30 b30Var2 = d30Var2.f25534a;
                if (b30Var2.getParent() != null) {
                    d30Var2.f25542n.updateViewLayout(b30Var2, d30Var2.f25543r);
                    return;
                }
                return;
        }
    }
}
