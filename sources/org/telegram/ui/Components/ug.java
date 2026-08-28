package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ug implements ValueAnimator.AnimatorUpdateListener {
    public final int f32996a;
    public final ki f32997b;

    public ug(ki kiVar, int i9) {
        this.f32996a = i9;
        this.f32997b = kiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32996a) {
            case 0:
                this.f32997b.b2();
                return;
            case 1:
                this.f32997b.f30178z0.invalidate();
                return;
            case 2:
                ki.m(this.f32997b, valueAnimator);
                return;
            case 3:
                ki kiVar = this.f32997b;
                kiVar.getClass();
                kiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f32997b.b2();
                return;
        }
    }
}
