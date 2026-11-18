package org.telegram.ui;

import android.animation.ValueAnimator;
public final class be implements ValueAnimator.AnimatorUpdateListener {
    public final int f45838a;
    public final bn f45839b;

    public be(bn bnVar, int i7) {
        this.f45838a = i7;
        this.f45839b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45838a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bn bnVar = this.f45839b;
                bnVar.f45932a9 = floatValue;
                pl plVar = bnVar.f46084m1;
                if (plVar != null) {
                    plVar.invalidate();
                    bnVar.A0.invalidate();
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f45839b;
                bnVar2.getClass();
                bnVar2.f46226x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.Tc();
                return;
            case 2:
                bn bnVar3 = this.f45839b;
                bnVar3.getClass();
                bnVar3.f46226x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar3.Tc();
                return;
            case 3:
                bn bnVar4 = this.f45839b;
                bnVar4.getClass();
                bnVar4.f45949bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar4.M9();
                return;
            default:
                bn bnVar5 = this.f45839b;
                bnVar5.getClass();
                bnVar5.f45949bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar5.M9();
                return;
        }
    }
}
