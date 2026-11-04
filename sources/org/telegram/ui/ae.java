package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ae implements ValueAnimator.AnimatorUpdateListener {
    public final int f43762a;
    public final wm f43763b;

    public ae(wm wmVar, int i3) {
        this.f43762a = i3;
        this.f43763b = wmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43762a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wm wmVar = this.f43763b;
                wmVar.Z8 = floatValue;
                kl klVar = wmVar.m1;
                if (klVar != null) {
                    klVar.invalidate();
                    wmVar.A0.invalidate();
                    return;
                }
                return;
            case 1:
                wm wmVar2 = this.f43763b;
                wmVar2.getClass();
                wmVar2.f51538x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar2.Pc();
                return;
            case 2:
                wm wmVar3 = this.f43763b;
                wmVar3.getClass();
                wmVar3.f51538x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar3.Pc();
                return;
            case 3:
                wm wmVar4 = this.f43763b;
                wmVar4.getClass();
                wmVar4.Ya = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar4.K9();
                return;
            default:
                wm wmVar5 = this.f43763b;
                wmVar5.getClass();
                wmVar5.Ya = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar5.K9();
                return;
        }
    }
}
