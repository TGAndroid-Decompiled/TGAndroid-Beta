package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ev implements ValueAnimator.AnimatorUpdateListener {
    public final int f39182a;
    public final cy f39183b;

    public ev(cy cyVar, int i10) {
        this.f39182a = i10;
        this.f39183b = cyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39182a) {
            case 0:
                cy cyVar = this.f39183b;
                cyVar.getClass();
                cyVar.H4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39183b.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                cy cyVar2 = this.f39183b;
                cyVar2.getClass();
                cyVar2.N4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
