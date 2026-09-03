package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ug implements ValueAnimator.AnimatorUpdateListener {
    public final int f31628a;
    public final mi f31629b;

    public ug(mi miVar, int i10) {
        this.f31628a = i10;
        this.f31629b = miVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31628a) {
            case 0:
                this.f31629b.b2();
                return;
            case 1:
                this.f31629b.A0.invalidate();
                return;
            case 2:
                mi.m(this.f31629b, valueAnimator);
                return;
            case 3:
                mi miVar = this.f31629b;
                miVar.getClass();
                miVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f31629b.b2();
                return;
        }
    }
}
