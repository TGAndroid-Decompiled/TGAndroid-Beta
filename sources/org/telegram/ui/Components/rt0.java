package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30627a;
    public final vu0 f30628b;
    public final cw0 f30629c;

    public rt0(cw0 cw0Var, vu0 vu0Var, int i10) {
        this.f30627a = i10;
        this.f30629c = cw0Var;
        this.f30628b = vu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30627a) {
            case 0:
                this.f30629c.f25518n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30628b.h.invalidate();
                return;
            default:
                this.f30629c.f25518n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30628b.h.invalidate();
                return;
        }
    }
}
