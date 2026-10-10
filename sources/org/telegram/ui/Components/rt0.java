package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30568a;
    public final vu0 f30569b;
    public final cw0 f30570c;

    public rt0(cw0 cw0Var, vu0 vu0Var, int i10) {
        this.f30568a = i10;
        this.f30570c = cw0Var;
        this.f30569b = vu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30568a) {
            case 0:
                this.f30570c.f25456n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30569b.h.invalidate();
                return;
            default:
                this.f30570c.f25456n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30569b.h.invalidate();
                return;
        }
    }
}
