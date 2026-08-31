package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f31691a;
    public final sn f31692b;

    public um(sn snVar, int i10) {
        this.f31691a = i10;
        this.f31692b = snVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31691a) {
            case 0:
                sn snVar = this.f31692b;
                snVar.getClass();
                snVar.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sn snVar2 = this.f31692b;
                snVar2.getClass();
                snVar2.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
