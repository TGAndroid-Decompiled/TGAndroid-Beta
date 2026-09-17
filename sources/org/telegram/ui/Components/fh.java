package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f26071a;
    public final vi f26072b;

    public fh(vi viVar, int i10) {
        this.f26071a = i10;
        this.f26072b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26071a) {
            case 0:
                this.f26072b.b2();
                return;
            case 1:
                this.f26072b.D0.invalidate();
                return;
            case 2:
                vi.m(this.f26072b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f26072b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f26072b.b2();
                return;
        }
    }
}
