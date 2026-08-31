package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33290a;
    public final c30 f33291b;

    public y20(c30 c30Var, int i10) {
        this.f33290a = i10;
        this.f33291b = c30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33290a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var = this.f33291b;
                c30Var.f25777r.x = (int) floatValue;
                c30Var.h();
                a30 a30Var = c30Var.f25771a;
                if (a30Var.getParent() != null) {
                    c30Var.f25776n.updateViewLayout(a30Var, c30Var.f25777r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var2 = this.f33291b;
                c30Var2.f25777r.y = (int) floatValue2;
                a30 a30Var2 = c30Var2.f25771a;
                if (a30Var2.getParent() != null) {
                    c30Var2.f25776n.updateViewLayout(a30Var2, c30Var2.f25777r);
                    return;
                }
                return;
        }
    }
}
