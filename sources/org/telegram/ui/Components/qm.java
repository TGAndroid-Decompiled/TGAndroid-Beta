package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qm implements ValueAnimator.AnimatorUpdateListener {
    public final int f26447a;
    public final wm f26448b;

    public qm(wm wmVar, int i10) {
        this.f26447a = i10;
        this.f26448b = wmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26447a) {
            case 0:
                wm wmVar = this.f26448b;
                wmVar.getClass();
                wmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar.invalidate();
                return;
            default:
                wm wmVar2 = this.f26448b;
                wmVar2.getClass();
                wmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar2.invalidate();
                return;
        }
    }
}
