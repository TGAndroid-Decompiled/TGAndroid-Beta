package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ys0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30681a;
    public final cu0 f30682b;
    public final jv0 f30683c;

    public ys0(jv0 jv0Var, cu0 cu0Var, int i10) {
        this.f30681a = i10;
        this.f30683c = jv0Var;
        this.f30682b = cu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30681a) {
            case 0:
                this.f30683c.f25541n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30682b.h.invalidate();
                return;
            default:
                this.f30683c.f25541n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30682b.h.invalidate();
                return;
        }
    }
}
