package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27997a;
    public final k30 f27998b;

    public f30(k30 k30Var, int i10) {
        this.f27997a = i10;
        this.f27998b = k30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27997a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k30 k30Var = this.f27998b;
                k30Var.f29845r.x = (int) floatValue;
                k30Var.h();
                h30 h30Var = k30Var.f29837a;
                if (h30Var.getParent() != null) {
                    k30Var.f29844n.updateViewLayout(h30Var, k30Var.f29845r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k30 k30Var2 = this.f27998b;
                k30Var2.f29845r.y = (int) floatValue2;
                h30 h30Var2 = k30Var2.f29837a;
                if (h30Var2.getParent() != null) {
                    k30Var2.f29844n.updateViewLayout(h30Var2, k30Var2.f29845r);
                    return;
                }
                return;
        }
    }
}
