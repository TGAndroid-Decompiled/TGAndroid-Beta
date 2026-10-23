package org.telegram.ui;

import android.animation.ValueAnimator;
public final class me implements ValueAnimator.AnimatorUpdateListener {
    public final int f39226a;
    public final qn f39227b;

    public me(qn qnVar, int i10) {
        this.f39226a = i10;
        this.f39227b = qnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39226a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar = this.f39227b;
                qnVar.K8 = floatValue;
                jm jmVar = qnVar.X0;
                if (jmVar != null) {
                    jmVar.invalidate();
                    qnVar.f40905x0.invalidate();
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f39227b;
                qnVar2.getClass();
                qnVar2.f40719i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.qc();
                return;
            case 2:
                qn qnVar3 = this.f39227b;
                qnVar3.getClass();
                qnVar3.f40719i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar3.qc();
                return;
            case 3:
                qn qnVar4 = this.f39227b;
                qnVar4.getClass();
                qnVar4.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar4.t9();
                return;
            default:
                qn qnVar5 = this.f39227b;
                qnVar5.getClass();
                qnVar5.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar5.t9();
                return;
        }
    }
}
