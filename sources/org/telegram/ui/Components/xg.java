package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xg implements ValueAnimator.AnimatorUpdateListener {
    public final int f34709a;
    public final ni f34710b;

    public xg(ni niVar, int i10) {
        this.f34709a = i10;
        this.f34710b = niVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34709a) {
            case 0:
                this.f34710b.b2();
                return;
            case 1:
                this.f34710b.f31069z0.invalidate();
                return;
            case 2:
                ni.m(this.f34710b, valueAnimator);
                return;
            case 3:
                ni niVar = this.f34710b;
                niVar.getClass();
                niVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f34710b.b2();
                return;
        }
    }
}
