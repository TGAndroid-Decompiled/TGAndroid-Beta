package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ev implements ValueAnimator.AnimatorUpdateListener {
    public final int f36817a;
    public final cy f36818b;

    public ev(cy cyVar, int i10) {
        this.f36817a = i10;
        this.f36818b = cyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36817a) {
            case 0:
                cy cyVar = this.f36818b;
                cyVar.getClass();
                cyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36818b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                cy cyVar2 = this.f36818b;
                cyVar2.getClass();
                cyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
