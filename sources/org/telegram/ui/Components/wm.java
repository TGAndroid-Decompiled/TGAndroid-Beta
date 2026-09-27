package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f30044a;
    public final wn f30045b;

    public wm(wn wnVar, int i10) {
        this.f30044a = i10;
        this.f30045b = wnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30044a) {
            case 0:
                wn wnVar = this.f30045b;
                wnVar.getClass();
                wnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wn wnVar2 = this.f30045b;
                wnVar2.getClass();
                wnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
