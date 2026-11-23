package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mm implements ValueAnimator.AnimatorUpdateListener {
    public final int f37539a;
    public final qm f37540b;

    public mm(qm qmVar, int i7) {
        this.f37539a = i7;
        this.f37540b = qmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37539a) {
            case 0:
                qm qmVar = this.f37540b;
                qmVar.getClass();
                qmVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar.invalidate();
                return;
            default:
                qm qmVar2 = this.f37540b;
                qmVar2.getClass();
                qmVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar2.invalidate();
                return;
        }
    }
}
