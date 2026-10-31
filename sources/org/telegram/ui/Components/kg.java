package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class kg implements ValueAnimator.AnimatorUpdateListener {
    public final int f27746a;
    public final bi f27747b;

    public kg(bi biVar, int i10) {
        this.f27746a = i10;
        this.f27747b = biVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27746a) {
            case 0:
                this.f27747b.P1();
                return;
            case 1:
                this.f27747b.f24741x2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi biVar = this.f27747b;
                biVar.C0 = floatValue;
                org.telegram.ui.ActionBar.p2 p2Var = biVar.f21589c;
                if (p2Var != null) {
                    p2Var.invalidate();
                    return;
                }
                return;
            case 3:
                bi biVar2 = this.f27747b;
                biVar2.getClass();
                biVar2.y1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                bi biVar3 = this.f27747b;
                uh uhVar = biVar3.f24721s2;
                kk kkVar = biVar3.f24701n2;
                if (uhVar == kkVar && kkVar != null) {
                    kkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f27747b.P1();
                return;
        }
    }
}
