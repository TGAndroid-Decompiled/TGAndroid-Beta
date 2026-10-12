package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29357a;
    public final t30 f29358b;

    public p30(t30 t30Var, int i10) {
        this.f29357a = i10;
        this.f29358b = t30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29357a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t30 t30Var = this.f29358b;
                t30Var.f30753r.x = (int) floatValue;
                t30Var.h();
                r30 r30Var = t30Var.f30744a;
                if (r30Var.getParent() != null) {
                    t30Var.f30752n.updateViewLayout(r30Var, t30Var.f30753r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t30 t30Var2 = this.f29358b;
                t30Var2.f30753r.y = (int) floatValue2;
                r30 r30Var2 = t30Var2.f30744a;
                if (r30Var2.getParent() != null) {
                    t30Var2.f30752n.updateViewLayout(r30Var2, t30Var2.f30753r);
                    return;
                }
                return;
        }
    }
}
