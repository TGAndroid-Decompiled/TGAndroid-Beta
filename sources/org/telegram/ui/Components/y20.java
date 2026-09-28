package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30550a;
    public final c30 f30551b;

    public y20(c30 c30Var, int i10) {
        this.f30550a = i10;
        this.f30551b = c30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30550a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var = this.f30551b;
                c30Var.f23189r.x = (int) floatValue;
                c30Var.h();
                a30 a30Var = c30Var.f23181a;
                if (a30Var.getParent() != null) {
                    c30Var.f23188n.updateViewLayout(a30Var, c30Var.f23189r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var2 = this.f30551b;
                c30Var2.f23189r.y = (int) floatValue2;
                a30 a30Var2 = c30Var2.f23181a;
                if (a30Var2.getParent() != null) {
                    c30Var2.f23188n.updateViewLayout(a30Var2, c30Var2.f23189r);
                    return;
                }
                return;
        }
    }
}
