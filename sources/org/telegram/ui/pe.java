package org.telegram.ui;

import android.animation.ValueAnimator;
public final class pe implements ValueAnimator.AnimatorUpdateListener {
    public final int f36607a;
    public final bo f36608b;

    public pe(bo boVar, int i10) {
        this.f36607a = i10;
        this.f36608b = boVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36607a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bo boVar = this.f36608b;
                boVar.K8 = floatValue;
                tm tmVar = boVar.X0;
                if (tmVar != null) {
                    tmVar.invalidate();
                    boVar.f32502x0.invalidate();
                    return;
                }
                return;
            case 1:
                bo boVar2 = this.f36608b;
                boVar2.getClass();
                boVar2.f32317i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar2.lc();
                return;
            case 2:
                bo boVar3 = this.f36608b;
                boVar3.getClass();
                boVar3.f32317i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar3.lc();
                return;
            case 3:
                bo boVar4 = this.f36608b;
                boVar4.getClass();
                boVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar4.o9();
                return;
            default:
                bo boVar5 = this.f36608b;
                boVar5.getClass();
                boVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar5.o9();
                return;
        }
    }
}
