package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ju implements ValueAnimator.AnimatorUpdateListener {
    public final int f47037a;
    public final ww f47038b;

    public ju(ww wwVar, int i7) {
        this.f47037a = i7;
        this.f47038b = wwVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47037a) {
            case 0:
                this.f47038b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ww wwVar = this.f47038b;
                wwVar.getClass();
                wwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ww wwVar2 = this.f47038b;
                wwVar2.getClass();
                wwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
