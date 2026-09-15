package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ne implements ValueAnimator.AnimatorUpdateListener {
    public final int f35958a;
    public final bo f35959b;

    public ne(bo boVar, int i10) {
        this.f35958a = i10;
        this.f35959b = boVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35958a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bo boVar = this.f35959b;
                boVar.K8 = floatValue;
                tm tmVar = boVar.X0;
                if (tmVar != null) {
                    tmVar.invalidate();
                    boVar.f32524x0.invalidate();
                    return;
                }
                return;
            case 1:
                bo boVar2 = this.f35959b;
                boVar2.getClass();
                boVar2.f32339i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar2.lc();
                return;
            case 2:
                bo boVar3 = this.f35959b;
                boVar3.getClass();
                boVar3.f32339i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar3.lc();
                return;
            case 3:
                bo boVar4 = this.f35959b;
                boVar4.getClass();
                boVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar4.o9();
                return;
            default:
                bo boVar5 = this.f35959b;
                boVar5.getClass();
                boVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar5.o9();
                return;
        }
    }
}
