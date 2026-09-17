package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dh implements ValueAnimator.AnimatorUpdateListener {
    public final int f23351a;
    public final vi f23352b;

    public dh(vi viVar, int i10) {
        this.f23351a = i10;
        this.f23352b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23351a) {
            case 0:
                this.f23352b.b2();
                return;
            case 1:
                this.f23352b.D0.invalidate();
                return;
            case 2:
                vi.m(this.f23352b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f23352b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f23352b.b2();
                return;
        }
    }
}
