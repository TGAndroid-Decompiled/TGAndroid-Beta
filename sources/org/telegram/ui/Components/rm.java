package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rm implements ValueAnimator.AnimatorUpdateListener {
    public final int f28538a;
    public final pn f28539b;

    public rm(pn pnVar, int i10) {
        this.f28538a = i10;
        this.f28539b = pnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28538a) {
            case 0:
                pn pnVar = this.f28539b;
                pnVar.getClass();
                pnVar.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                pn pnVar2 = this.f28539b;
                pnVar2.getClass();
                pnVar2.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
