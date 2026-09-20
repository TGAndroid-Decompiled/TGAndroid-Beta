package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f23848a;
    public final vi f23849b;

    public eh(vi viVar, int i10) {
        this.f23848a = i10;
        this.f23849b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23848a) {
            case 0:
                this.f23849b.b2();
                return;
            case 1:
                this.f23849b.D0.invalidate();
                return;
            case 2:
                vi.m(this.f23849b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f23849b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f23849b.b2();
                return;
        }
    }
}
