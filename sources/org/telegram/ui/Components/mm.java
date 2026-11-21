package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mm implements ValueAnimator.AnimatorUpdateListener {
    public final int f37583a;
    public final qm f37584b;

    public mm(qm qmVar, int i7) {
        this.f37583a = i7;
        this.f37584b = qmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37583a) {
            case 0:
                qm qmVar = this.f37584b;
                qmVar.getClass();
                qmVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar.invalidate();
                return;
            default:
                qm qmVar2 = this.f37584b;
                qmVar2.getClass();
                qmVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar2.invalidate();
                return;
        }
    }
}
