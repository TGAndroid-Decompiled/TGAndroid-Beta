package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f30024a;
    public final wn f30025b;

    public wm(wn wnVar, int i10) {
        this.f30024a = i10;
        this.f30025b = wnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30024a) {
            case 0:
                wn wnVar = this.f30025b;
                wnVar.getClass();
                wnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wn wnVar2 = this.f30025b;
                wnVar2.getClass();
                wnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
