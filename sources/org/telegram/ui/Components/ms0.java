package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ms0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28509a;
    public final qt0 f28510b;
    public final xu0 f28511c;

    public ms0(xu0 xu0Var, qt0 qt0Var, int i10) {
        this.f28509a = i10;
        this.f28511c = xu0Var;
        this.f28510b = qt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28509a) {
            case 0:
                this.f28511c.f32708n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28510b.h.invalidate();
                return;
            default:
                this.f28511c.f32708n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28510b.h.invalidate();
                return;
        }
    }
}
