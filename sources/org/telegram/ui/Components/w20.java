package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29869a;
    public final a30 f29870b;

    public w20(a30 a30Var, int i10) {
        this.f29869a = i10;
        this.f29870b = a30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29869a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a30 a30Var = this.f29870b;
                a30Var.f22581r.x = (int) floatValue;
                a30Var.h();
                y20 y20Var = a30Var.f22573a;
                if (y20Var.getParent() != null) {
                    a30Var.f22580n.updateViewLayout(y20Var, a30Var.f22581r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a30 a30Var2 = this.f29870b;
                a30Var2.f22581r.y = (int) floatValue2;
                y20 y20Var2 = a30Var2.f22573a;
                if (y20Var2.getParent() != null) {
                    a30Var2.f22580n.updateViewLayout(y20Var2, a30Var2.f22581r);
                    return;
                }
                return;
        }
    }
}
