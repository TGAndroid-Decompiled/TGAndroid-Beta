package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class in implements ValueAnimator.AnimatorUpdateListener {
    public final int f25998a;
    public final io f25999b;

    public in(io ioVar, int i10) {
        this.f25998a = i10;
        this.f25999b = ioVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25998a) {
            case 0:
                io ioVar = this.f25999b;
                ioVar.getClass();
                ioVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                io ioVar2 = this.f25999b;
                ioVar2.getClass();
                ioVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
