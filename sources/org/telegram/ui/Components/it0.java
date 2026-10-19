package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class it0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27355a;
    public final mu0 f27356b;
    public final tv0 f27357c;

    public it0(tv0 tv0Var, mu0 mu0Var, int i10) {
        this.f27355a = i10;
        this.f27357c = tv0Var;
        this.f27356b = mu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27355a) {
            case 0:
                this.f27357c.f30714n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27356b.h.invalidate();
                return;
            default:
                this.f27357c.f30714n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27356b.h.invalidate();
                return;
        }
    }
}
