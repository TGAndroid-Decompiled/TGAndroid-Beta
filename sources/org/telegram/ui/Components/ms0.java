package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ms0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27114a;
    public final qt0 f27115b;
    public final yu0 f27116c;

    public ms0(yu0 yu0Var, qt0 qt0Var, int i10) {
        this.f27114a = i10;
        this.f27116c = yu0Var;
        this.f27115b = qt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27114a) {
            case 0:
                this.f27116c.f31127k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27115b.h.invalidate();
                return;
            default:
                this.f27116c.f31127k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27115b.h.invalidate();
                return;
        }
    }
}
