package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25464a;
    public final i30 f25465b;

    public d30(i30 i30Var, int i10) {
        this.f25464a = i10;
        this.f25465b = i30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25464a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i30 i30Var = this.f25465b;
                i30Var.f27059r.x = (int) floatValue;
                i30Var.h();
                f30 f30Var = i30Var.f27051a;
                if (f30Var.getParent() != null) {
                    i30Var.f27058n.updateViewLayout(f30Var, i30Var.f27059r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i30 i30Var2 = this.f25465b;
                i30Var2.f27059r.y = (int) floatValue2;
                f30 f30Var2 = i30Var2.f27051a;
                if (f30Var2.getParent() != null) {
                    i30Var2.f27058n.updateViewLayout(f30Var2, i30Var2.f27059r);
                    return;
                }
                return;
        }
    }
}
