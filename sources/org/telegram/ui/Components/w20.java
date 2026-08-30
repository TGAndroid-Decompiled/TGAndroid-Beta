package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30169a;
    public final a30 f30170b;

    public w20(a30 a30Var, int i10) {
        this.f30169a = i10;
        this.f30170b = a30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30169a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a30 a30Var = this.f30170b;
                a30Var.f23284r.x = (int) floatValue;
                a30Var.h();
                y20 y20Var = a30Var.f23279a;
                if (y20Var.getParent() != null) {
                    a30Var.f23283n.updateViewLayout(y20Var, a30Var.f23284r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a30 a30Var2 = this.f30170b;
                a30Var2.f23284r.y = (int) floatValue2;
                y20 y20Var2 = a30Var2.f23279a;
                if (y20Var2.getParent() != null) {
                    a30Var2.f23283n.updateViewLayout(y20Var2, a30Var2.f23284r);
                    return;
                }
                return;
        }
    }
}
