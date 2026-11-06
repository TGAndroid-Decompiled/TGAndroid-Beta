package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gu implements ValueAnimator.AnimatorUpdateListener {
    public final int f46112a;
    public final ww f46113b;
    public final float f46114c;

    public gu(ww wwVar, float f10, int i7) {
        this.f46112a = i7;
        this.f46113b = wwVar;
        this.f46114c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46112a) {
            case 0:
                ww.a0(this.f46113b, this.f46114c, valueAnimator);
                return;
            default:
                ww.G0(this.f46113b, this.f46114c, valueAnimator);
                return;
        }
    }
}
