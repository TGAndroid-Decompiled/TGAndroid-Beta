package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28049a;
    public final k30 f28050b;

    public f30(k30 k30Var, int i10) {
        this.f28049a = i10;
        this.f28050b = k30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28049a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k30 k30Var = this.f28050b;
                k30Var.f29794r.x = (int) floatValue;
                k30Var.h();
                h30 h30Var = k30Var.f29786a;
                if (h30Var.getParent() != null) {
                    k30Var.f29793n.updateViewLayout(h30Var, k30Var.f29794r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k30 k30Var2 = this.f28050b;
                k30Var2.f29794r.y = (int) floatValue2;
                h30 h30Var2 = k30Var2.f29786a;
                if (h30Var2.getParent() != null) {
                    k30Var2.f29793n.updateViewLayout(h30Var2, k30Var2.f29794r);
                    return;
                }
                return;
        }
    }
}
