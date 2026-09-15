package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dh implements ValueAnimator.AnimatorUpdateListener {
    public final int f23323a;
    public final vi f23324b;

    public dh(vi viVar, int i10) {
        this.f23323a = i10;
        this.f23324b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23323a) {
            case 0:
                this.f23324b.b2();
                return;
            case 1:
                this.f23324b.D0.invalidate();
                return;
            case 2:
                vi.m(this.f23324b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f23324b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f23324b.b2();
                return;
        }
    }
}
