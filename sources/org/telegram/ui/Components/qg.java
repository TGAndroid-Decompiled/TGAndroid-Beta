package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class qg implements ValueAnimator.AnimatorUpdateListener {

    public final int f31904a;

    public final gi f31905b;

    public qg(gi giVar, int i10) {
        this.f31904a = i10;
        this.f31905b = giVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31904a) {
            case 0:
                this.f31905b.b2();
                break;
            case 1:
                this.f31905b.f28714z0.invalidate();
                break;
            case 2:
                gi.m(this.f31905b, valueAnimator);
                break;
            case 3:
                gi giVar = this.f31905b;
                giVar.getClass();
                giVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.f31905b.b2();
                break;
        }
    }
}
