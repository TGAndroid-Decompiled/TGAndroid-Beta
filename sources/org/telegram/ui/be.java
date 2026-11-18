package org.telegram.ui;

import android.animation.ValueAnimator;
public final class be implements ValueAnimator.AnimatorUpdateListener {
    public final int f45850a;
    public final bn f45851b;

    public be(bn bnVar, int i7) {
        this.f45850a = i7;
        this.f45851b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45850a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bn bnVar = this.f45851b;
                bnVar.f45941a9 = floatValue;
                pl plVar = bnVar.f46093m1;
                if (plVar != null) {
                    plVar.invalidate();
                    bnVar.A0.invalidate();
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f45851b;
                bnVar2.getClass();
                bnVar2.f46235x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.Tc();
                return;
            case 2:
                bn bnVar3 = this.f45851b;
                bnVar3.getClass();
                bnVar3.f46235x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar3.Tc();
                return;
            case 3:
                bn bnVar4 = this.f45851b;
                bnVar4.getClass();
                bnVar4.f45958bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar4.M9();
                return;
            default:
                bn bnVar5 = this.f45851b;
                bnVar5.getClass();
                bnVar5.f45958bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar5.M9();
                return;
        }
    }
}
