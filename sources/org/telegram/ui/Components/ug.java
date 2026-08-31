package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ug implements ValueAnimator.AnimatorUpdateListener {
    public final int f31674a;
    public final mi f31675b;

    public ug(mi miVar, int i10) {
        this.f31674a = i10;
        this.f31675b = miVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31674a) {
            case 0:
                this.f31675b.b2();
                return;
            case 1:
                this.f31675b.A0.invalidate();
                return;
            case 2:
                mi.m(this.f31675b, valueAnimator);
                return;
            case 3:
                mi miVar = this.f31675b;
                miVar.getClass();
                miVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f31675b.b2();
                return;
        }
    }
}
