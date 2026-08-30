package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sm implements ValueAnimator.AnimatorUpdateListener {
    public final int f28777a;
    public final qn f28778b;

    public sm(qn qnVar, int i10) {
        this.f28777a = i10;
        this.f28778b = qnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28777a) {
            case 0:
                qn qnVar = this.f28778b;
                qnVar.getClass();
                qnVar.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                qn qnVar2 = this.f28778b;
                qnVar2.getClass();
                qnVar2.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
