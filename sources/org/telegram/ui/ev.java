package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ev implements ValueAnimator.AnimatorUpdateListener {
    public final int f36806a;
    public final cy f36807b;

    public ev(cy cyVar, int i10) {
        this.f36806a = i10;
        this.f36807b = cyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36806a) {
            case 0:
                cy cyVar = this.f36807b;
                cyVar.getClass();
                cyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36807b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                cy cyVar2 = this.f36807b;
                cyVar2.getClass();
                cyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
