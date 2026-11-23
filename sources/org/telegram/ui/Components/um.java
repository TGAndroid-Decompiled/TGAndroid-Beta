package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f40419a;
    public final qn f40420b;

    public um(qn qnVar, int i7) {
        this.f40419a = i7;
        this.f40420b = qnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40419a) {
            case 0:
                qn qnVar = this.f40420b;
                qnVar.getClass();
                qnVar.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                qn qnVar2 = this.f40420b;
                qnVar2.getClass();
                qnVar2.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
