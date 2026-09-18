package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class os0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26845a;
    public final st0 f26846b;
    public final zu0 f26847c;

    public os0(zu0 zu0Var, st0 st0Var, int i10) {
        this.f26845a = i10;
        this.f26847c = zu0Var;
        this.f26846b = st0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26845a) {
            case 0:
                this.f26847c.f30641n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26846b.h.invalidate();
                return;
            default:
                this.f26847c.f30641n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26846b.h.invalidate();
                return;
        }
    }
}
