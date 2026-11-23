package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41471a;
    public final a20 f41472b;

    public w10(a20 a20Var, int i7) {
        this.f41471a = i7;
        this.f41472b = a20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41471a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a20 a20Var = this.f41472b;
                a20Var.f33337s.x = (int) floatValue;
                a20Var.i();
                y10 y10Var = a20Var.f33325a;
                if (y10Var.getParent() != null) {
                    a20Var.f33335n.updateViewLayout(y10Var, a20Var.f33337s);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a20 a20Var2 = this.f41472b;
                a20Var2.f33337s.y = (int) floatValue2;
                y10 y10Var2 = a20Var2.f33325a;
                if (y10Var2.getParent() != null) {
                    a20Var2.f33335n.updateViewLayout(y10Var2, a20Var2.f33337s);
                    return;
                }
                return;
        }
    }
}
