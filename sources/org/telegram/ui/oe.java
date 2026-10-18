package org.telegram.ui;

import android.animation.ValueAnimator;
public final class oe implements ValueAnimator.AnimatorUpdateListener {
    public final int f39767a;
    public final sn f39768b;

    public oe(sn snVar, int i10) {
        this.f39767a = i10;
        this.f39768b = snVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39767a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sn snVar = this.f39768b;
                snVar.K8 = floatValue;
                lm lmVar = snVar.X0;
                if (lmVar != null) {
                    lmVar.invalidate();
                    snVar.f41419x0.invalidate();
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f39768b;
                snVar2.getClass();
                snVar2.f41233i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.pc();
                return;
            case 2:
                sn snVar3 = this.f39768b;
                snVar3.getClass();
                snVar3.f41233i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar3.pc();
                return;
            case 3:
                sn snVar4 = this.f39768b;
                snVar4.getClass();
                snVar4.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar4.t9();
                return;
            default:
                sn snVar5 = this.f39768b;
                snVar5.getClass();
                snVar5.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar5.t9();
                return;
        }
    }
}
