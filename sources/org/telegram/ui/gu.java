package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gu implements ValueAnimator.AnimatorUpdateListener {
    public final int f46113a;
    public final ww f46114b;
    public final float f46115c;

    public gu(ww wwVar, float f10, int i7) {
        this.f46113a = i7;
        this.f46114b = wwVar;
        this.f46115c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46113a) {
            case 0:
                ww.a0(this.f46114b, this.f46115c, valueAnimator);
                return;
            default:
                ww.G0(this.f46114b, this.f46115c, valueAnimator);
                return;
        }
    }
}
