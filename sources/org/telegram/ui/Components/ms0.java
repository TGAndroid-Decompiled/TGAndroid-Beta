package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ms0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28537a;
    public final qt0 f28538b;
    public final xu0 f28539c;

    public ms0(xu0 xu0Var, qt0 qt0Var, int i10) {
        this.f28537a = i10;
        this.f28539c = xu0Var;
        this.f28538b = qt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28537a) {
            case 0:
                this.f28539c.f32736n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28538b.h.invalidate();
                return;
            default:
                this.f28539c.f32736n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28538b.h.invalidate();
                return;
        }
    }
}
