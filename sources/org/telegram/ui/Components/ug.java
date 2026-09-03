package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ug implements ValueAnimator.AnimatorUpdateListener {
    public final int f29206a;
    public final li f29207b;

    public ug(li liVar, int i10) {
        this.f29206a = i10;
        this.f29207b = liVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29206a) {
            case 0:
                this.f29207b.b2();
                return;
            case 1:
                this.f29207b.A0.invalidate();
                return;
            case 2:
                li.m(this.f29207b, valueAnimator);
                return;
            case 3:
                li liVar = this.f29207b;
                liVar.getClass();
                liVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f29207b.b2();
                return;
        }
    }
}
