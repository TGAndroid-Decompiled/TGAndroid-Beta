package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qz implements ValueAnimator.AnimatorUpdateListener {
    public final int f37458a;
    public final sz f37459b;

    public qz(sz szVar, int i7) {
        this.f37458a = i7;
        this.f37459b = szVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37458a) {
            case 0:
                sz szVar = this.f37459b;
                szVar.getClass();
                szVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                szVar.invalidate();
                return;
            case 1:
                sz szVar2 = this.f37459b;
                szVar2.getClass();
                szVar2.f38184w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                szVar2.invalidate();
                return;
            default:
                sz szVar3 = this.f37459b;
                szVar3.getClass();
                szVar3.f38181n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                szVar3.invalidate();
                return;
        }
    }
}
