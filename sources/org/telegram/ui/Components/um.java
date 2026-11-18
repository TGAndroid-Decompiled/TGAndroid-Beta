package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f40377a;
    public final rn f40378b;

    public um(rn rnVar, int i7) {
        this.f40377a = i7;
        this.f40378b = rnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40377a) {
            case 0:
                rn rnVar = this.f40378b;
                rnVar.getClass();
                rnVar.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                rn rnVar2 = this.f40378b;
                rnVar2.getClass();
                rnVar2.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
