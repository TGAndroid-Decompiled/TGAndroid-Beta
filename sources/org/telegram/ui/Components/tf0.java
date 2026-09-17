package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30624a;
    public final vf0 f30625b;

    public tf0(vf0 vf0Var, int i10) {
        this.f30624a = i10;
        this.f30625b = vf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30624a) {
            case 0:
                vf0 vf0Var = this.f30625b;
                vf0Var.getClass();
                vf0Var.f31249y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var.invalidate();
                return;
            default:
                vf0 vf0Var2 = this.f30625b;
                vf0Var2.getClass();
                vf0Var2.f31249y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var2.invalidate();
                return;
        }
    }
}
