package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30264a;
    public final uu0 f30265b;
    public final bw0 f30266c;

    public qt0(bw0 bw0Var, uu0 uu0Var, int i10) {
        this.f30264a = i10;
        this.f30266c = bw0Var;
        this.f30265b = uu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30264a) {
            case 0:
                this.f30266c.f25148n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30265b.h.invalidate();
                return;
            default:
                this.f30266c.f25148n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30265b.h.invalidate();
                return;
        }
    }
}
