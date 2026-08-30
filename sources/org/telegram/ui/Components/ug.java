package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ug implements ValueAnimator.AnimatorUpdateListener {
    public final int f29213a;
    public final li f29214b;

    public ug(li liVar, int i10) {
        this.f29213a = i10;
        this.f29214b = liVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29213a) {
            case 0:
                this.f29214b.b2();
                return;
            case 1:
                this.f29214b.A0.invalidate();
                return;
            case 2:
                li.m(this.f29214b, valueAnimator);
                return;
            case 3:
                li liVar = this.f29214b;
                liVar.getClass();
                liVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f29214b.b2();
                return;
        }
    }
}
