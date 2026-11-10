package org.telegram.ui;

import android.animation.ValueAnimator;
public final class mu implements ValueAnimator.AnimatorUpdateListener {
    public final int f48053a;
    public final zw f48054b;

    public mu(zw zwVar, int i7) {
        this.f48053a = i7;
        this.f48054b = zwVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48053a) {
            case 0:
                this.f48054b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                zw zwVar = this.f48054b;
                zwVar.getClass();
                zwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zw zwVar2 = this.f48054b;
                zwVar2.getClass();
                zwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
