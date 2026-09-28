package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30551a;
    public final c30 f30552b;

    public y20(c30 c30Var, int i10) {
        this.f30551a = i10;
        this.f30552b = c30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30551a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var = this.f30552b;
                c30Var.f23190r.x = (int) floatValue;
                c30Var.h();
                a30 a30Var = c30Var.f23182a;
                if (a30Var.getParent() != null) {
                    c30Var.f23189n.updateViewLayout(a30Var, c30Var.f23190r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var2 = this.f30552b;
                c30Var2.f23190r.y = (int) floatValue2;
                a30 a30Var2 = c30Var2.f23182a;
                if (a30Var2.getParent() != null) {
                    c30Var2.f23189n.updateViewLayout(a30Var2, c30Var2.f23190r);
                    return;
                }
                return;
        }
    }
}
