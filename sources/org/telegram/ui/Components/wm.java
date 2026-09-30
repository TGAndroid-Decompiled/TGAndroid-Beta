package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f30016a;
    public final wn f30017b;

    public wm(wn wnVar, int i10) {
        this.f30016a = i10;
        this.f30017b = wnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30016a) {
            case 0:
                wn wnVar = this.f30017b;
                wnVar.getClass();
                wnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wn wnVar2 = this.f30017b;
                wnVar2.getClass();
                wnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
