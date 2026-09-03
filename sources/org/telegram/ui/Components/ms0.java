package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ms0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29253a;
    public final qt0 f29254b;
    public final yu0 f29255c;

    public ms0(yu0 yu0Var, qt0 qt0Var, int i10) {
        this.f29253a = i10;
        this.f29255c = yu0Var;
        this.f29254b = qt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29253a) {
            case 0:
                this.f29255c.f33632k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f29254b.h.invalidate();
                return;
            default:
                this.f29255c.f33632k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f29254b.h.invalidate();
                return;
        }
    }
}
