package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ns0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26567a;
    public final rt0 f26568b;
    public final yu0 f26569c;

    public ns0(yu0 yu0Var, rt0 rt0Var, int i10) {
        this.f26567a = i10;
        this.f26569c = yu0Var;
        this.f26568b = rt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26567a) {
            case 0:
                this.f26569c.f30374n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26568b.h.invalidate();
                return;
            default:
                this.f26569c.f30374n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26568b.h.invalidate();
                return;
        }
    }
}
