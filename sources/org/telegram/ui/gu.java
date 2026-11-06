package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gu implements ValueAnimator.AnimatorUpdateListener {
    public final int f46111a;
    public final ww f46112b;
    public final float f46113c;

    public gu(ww wwVar, float f10, int i7) {
        this.f46111a = i7;
        this.f46112b = wwVar;
        this.f46113c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46111a) {
            case 0:
                ww.a0(this.f46112b, this.f46113c, valueAnimator);
                return;
            default:
                ww.G0(this.f46112b, this.f46113c, valueAnimator);
                return;
        }
    }
}
