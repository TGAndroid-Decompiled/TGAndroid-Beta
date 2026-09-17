package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class os0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26842a;
    public final st0 f26843b;
    public final zu0 f26844c;

    public os0(zu0 zu0Var, st0 st0Var, int i10) {
        this.f26842a = i10;
        this.f26844c = zu0Var;
        this.f26843b = st0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26842a) {
            case 0:
                this.f26844c.f30638n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26843b.h.invalidate();
                return;
            default:
                this.f26844c.f30638n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26843b.h.invalidate();
                return;
        }
    }
}
