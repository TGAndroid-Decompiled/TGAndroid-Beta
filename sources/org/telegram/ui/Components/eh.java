package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f23950a;
    public final vi f23951b;

    public eh(vi viVar, int i10) {
        this.f23950a = i10;
        this.f23951b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23950a) {
            case 0:
                this.f23951b.b2();
                return;
            case 1:
                this.f23951b.D0.invalidate();
                return;
            case 2:
                vi.m(this.f23951b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f23951b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f23951b.b2();
                return;
        }
    }
}
