package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ms0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28536a;
    public final qt0 f28537b;
    public final xu0 f28538c;

    public ms0(xu0 xu0Var, qt0 qt0Var, int i10) {
        this.f28536a = i10;
        this.f28538c = xu0Var;
        this.f28537b = qt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28536a) {
            case 0:
                this.f28538c.f32735n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28537b.h.invalidate();
                return;
            default:
                this.f28538c.f32735n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28537b.h.invalidate();
                return;
        }
    }
}
