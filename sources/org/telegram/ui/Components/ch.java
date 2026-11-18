package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ch implements ValueAnimator.AnimatorUpdateListener {
    public final int f33994a;
    public final si f33995b;

    public ch(si siVar, int i7) {
        this.f33994a = i7;
        this.f33995b = siVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33994a) {
            case 0:
                this.f33995b.R1();
                return;
            case 1:
                this.f33995b.B2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si siVar = this.f33995b;
                siVar.D0 = floatValue;
                org.telegram.ui.ActionBar.n2 n2Var = siVar.f30195c;
                if (n2Var != null) {
                    n2Var.invalidate();
                    return;
                }
                return;
            case 3:
                si siVar2 = this.f33995b;
                siVar2.getClass();
                siVar2.A1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                si siVar3 = this.f33995b;
                ki kiVar = siVar3.f39732w2;
                xk xkVar = siVar3.f39712r2;
                if (kiVar == xkVar && xkVar != null) {
                    xkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f33995b.R1();
                return;
        }
    }
}
