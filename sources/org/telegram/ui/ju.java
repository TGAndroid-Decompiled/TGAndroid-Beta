package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ju implements ValueAnimator.AnimatorUpdateListener {
    public final int f47038a;
    public final ww f47039b;

    public ju(ww wwVar, int i7) {
        this.f47038a = i7;
        this.f47039b = wwVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47038a) {
            case 0:
                this.f47039b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ww wwVar = this.f47039b;
                wwVar.getClass();
                wwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ww wwVar2 = this.f47039b;
                wwVar2.getClass();
                wwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
