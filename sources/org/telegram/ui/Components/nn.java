package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nn implements ValueAnimator.AnimatorUpdateListener {
    public final int f28868a;
    public final no f28869b;

    public nn(no noVar, int i10) {
        this.f28868a = i10;
        this.f28869b = noVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28868a) {
            case 0:
                no noVar = this.f28869b;
                noVar.getClass();
                noVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                no noVar2 = this.f28869b;
                noVar2.getClass();
                noVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
