package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29853a;
    public final a30 f29854b;

    public w20(a30 a30Var, int i10) {
        this.f29853a = i10;
        this.f29854b = a30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29853a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a30 a30Var = this.f29854b;
                a30Var.f22566r.x = (int) floatValue;
                a30Var.h();
                y20 y20Var = a30Var.f22558a;
                if (y20Var.getParent() != null) {
                    a30Var.f22565n.updateViewLayout(y20Var, a30Var.f22566r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a30 a30Var2 = this.f29854b;
                a30Var2.f22566r.y = (int) floatValue2;
                y20 y20Var2 = a30Var2.f22558a;
                if (y20Var2.getParent() != null) {
                    a30Var2.f22565n.updateViewLayout(y20Var2, a30Var2.f22566r);
                    return;
                }
                return;
        }
    }
}
