package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ys0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30671a;
    public final cu0 f30672b;
    public final jv0 f30673c;

    public ys0(jv0 jv0Var, cu0 cu0Var, int i10) {
        this.f30671a = i10;
        this.f30673c = jv0Var;
        this.f30672b = cu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30671a) {
            case 0:
                this.f30673c.f25525n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30672b.h.invalidate();
                return;
            default:
                this.f30673c.f25525n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30672b.h.invalidate();
                return;
        }
    }
}
