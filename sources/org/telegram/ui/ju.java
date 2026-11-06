package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ju implements ValueAnimator.AnimatorUpdateListener {
    public final int f47019a;
    public final ww f47020b;

    public ju(ww wwVar, int i7) {
        this.f47019a = i7;
        this.f47020b = wwVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47019a) {
            case 0:
                this.f47020b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ww wwVar = this.f47020b;
                wwVar.getClass();
                wwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ww wwVar2 = this.f47020b;
                wwVar2.getClass();
                wwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
