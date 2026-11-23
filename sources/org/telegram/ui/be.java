package org.telegram.ui;

import android.animation.ValueAnimator;
public final class be implements ValueAnimator.AnimatorUpdateListener {
    public final int f46022a;
    public final bn f46023b;

    public be(bn bnVar, int i7) {
        this.f46022a = i7;
        this.f46023b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46022a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bn bnVar = this.f46023b;
                bnVar.f46127a9 = floatValue;
                pl plVar = bnVar.f46279m1;
                if (plVar != null) {
                    plVar.invalidate();
                    bnVar.A0.invalidate();
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f46023b;
                bnVar2.getClass();
                bnVar2.f46421x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.Tc();
                return;
            case 2:
                bn bnVar3 = this.f46023b;
                bnVar3.getClass();
                bnVar3.f46421x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar3.Tc();
                return;
            case 3:
                bn bnVar4 = this.f46023b;
                bnVar4.getClass();
                bnVar4.f46144bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar4.M9();
                return;
            default:
                bn bnVar5 = this.f46023b;
                bnVar5.getClass();
                bnVar5.f46144bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar5.M9();
                return;
        }
    }
}
