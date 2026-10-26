package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28051a;
    public final k30 f28052b;

    public f30(k30 k30Var, int i10) {
        this.f28051a = i10;
        this.f28052b = k30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28051a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k30 k30Var = this.f28052b;
                k30Var.f29796r.x = (int) floatValue;
                k30Var.h();
                h30 h30Var = k30Var.f29788a;
                if (h30Var.getParent() != null) {
                    k30Var.f29795n.updateViewLayout(h30Var, k30Var.f29796r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k30 k30Var2 = this.f28052b;
                k30Var2.f29796r.y = (int) floatValue2;
                h30 h30Var2 = k30Var2.f29788a;
                if (h30Var2.getParent() != null) {
                    k30Var2.f29795n.updateViewLayout(h30Var2, k30Var2.f29796r);
                    return;
                }
                return;
        }
    }
}
