package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39084a;
    public final xd0 f39085b;

    public vd0(xd0 xd0Var, int i3) {
        this.f39084a = i3;
        this.f39085b = xd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39084a) {
            case 0:
                xd0 xd0Var = this.f39085b;
                xd0Var.getClass();
                xd0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var.invalidate();
                return;
            default:
                xd0 xd0Var2 = this.f39085b;
                xd0Var2.getClass();
                xd0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var2.invalidate();
                return;
        }
    }
}
