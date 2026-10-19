package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class it0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27357a;
    public final mu0 f27358b;
    public final tv0 f27359c;

    public it0(tv0 tv0Var, mu0 mu0Var, int i10) {
        this.f27357a = i10;
        this.f27359c = tv0Var;
        this.f27358b = mu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27357a) {
            case 0:
                this.f27359c.f30716n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27358b.h.invalidate();
                return;
            default:
                this.f27359c.f30716n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27358b.h.invalidate();
                return;
        }
    }
}
