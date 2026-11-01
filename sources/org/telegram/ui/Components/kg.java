package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class kg implements ValueAnimator.AnimatorUpdateListener {
    public final int f27839a;
    public final bi f27840b;

    public kg(bi biVar, int i10) {
        this.f27839a = i10;
        this.f27840b = biVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27839a) {
            case 0:
                this.f27840b.P1();
                return;
            case 1:
                this.f27840b.f24832x2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi biVar = this.f27840b;
                biVar.C0 = floatValue;
                org.telegram.ui.ActionBar.p2 p2Var = biVar.f21590c;
                if (p2Var != null) {
                    p2Var.invalidate();
                    return;
                }
                return;
            case 3:
                bi biVar2 = this.f27840b;
                biVar2.getClass();
                biVar2.y1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                bi biVar3 = this.f27840b;
                uh uhVar = biVar3.f24812s2;
                kk kkVar = biVar3.f24792n2;
                if (uhVar == kkVar && kkVar != null) {
                    kkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f27840b.P1();
                return;
        }
    }
}
