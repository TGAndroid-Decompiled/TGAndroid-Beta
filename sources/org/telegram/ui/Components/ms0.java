package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ms0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27133a;
    public final qt0 f27134b;
    public final yu0 f27135c;

    public ms0(yu0 yu0Var, qt0 qt0Var, int i10) {
        this.f27133a = i10;
        this.f27135c = yu0Var;
        this.f27134b = qt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27133a) {
            case 0:
                this.f27135c.f31138k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27134b.h.invalidate();
                return;
            default:
                this.f27135c.f31138k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27134b.h.invalidate();
                return;
        }
    }
}
