package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ms0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28510a;
    public final qt0 f28511b;
    public final xu0 f28512c;

    public ms0(xu0 xu0Var, qt0 qt0Var, int i10) {
        this.f28510a = i10;
        this.f28512c = xu0Var;
        this.f28511b = qt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28510a) {
            case 0:
                this.f28512c.f32709n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28511b.h.invalidate();
                return;
            default:
                this.f28512c.f32709n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28511b.h.invalidate();
                return;
        }
    }
}
