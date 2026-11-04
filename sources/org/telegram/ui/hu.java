package org.telegram.ui;

import android.animation.ValueAnimator;
public final class hu implements ValueAnimator.AnimatorUpdateListener {
    public final int f45987a;
    public final uw f45988b;

    public hu(uw uwVar, int i3) {
        this.f45987a = i3;
        this.f45988b = uwVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45987a) {
            case 0:
                this.f45988b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                uw uwVar = this.f45988b;
                uwVar.getClass();
                uwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uw uwVar2 = this.f45988b;
                uwVar2.getClass();
                uwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
