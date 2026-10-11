package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28924a;
    public final r30 f28925b;

    public n30(r30 r30Var, int i10) {
        this.f28924a = i10;
        this.f28925b = r30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28924a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r30 r30Var = this.f28925b;
                r30Var.f30328r.x = (int) floatValue;
                r30Var.h();
                p30 p30Var = r30Var.f30319a;
                if (p30Var.getParent() != null) {
                    r30Var.f30327n.updateViewLayout(p30Var, r30Var.f30328r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r30 r30Var2 = this.f28925b;
                r30Var2.f30328r.y = (int) floatValue2;
                p30 p30Var2 = r30Var2.f30319a;
                if (p30Var2.getParent() != null) {
                    r30Var2.f30327n.updateViewLayout(p30Var2, r30Var2.f30328r);
                    return;
                }
                return;
        }
    }
}
