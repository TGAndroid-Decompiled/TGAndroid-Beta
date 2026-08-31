package org.telegram.ui;

import android.animation.ValueAnimator;
public final class pv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40163a;
    public final py f40164b;

    public pv(py pyVar, int i10) {
        this.f40163a = i10;
        this.f40164b = pyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40163a) {
            case 0:
                py pyVar = this.f40164b;
                pyVar.getClass();
                pyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40164b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                py pyVar2 = this.f40164b;
                pyVar2.getClass();
                pyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
