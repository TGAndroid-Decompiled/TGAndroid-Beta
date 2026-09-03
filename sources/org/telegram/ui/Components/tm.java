package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tm implements ValueAnimator.AnimatorUpdateListener {
    public final int f31373a;
    public final rn f31374b;

    public tm(rn rnVar, int i10) {
        this.f31373a = i10;
        this.f31374b = rnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31373a) {
            case 0:
                rn rnVar = this.f31374b;
                rnVar.getClass();
                rnVar.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                rn rnVar2 = this.f31374b;
                rnVar2.getClass();
                rnVar2.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
