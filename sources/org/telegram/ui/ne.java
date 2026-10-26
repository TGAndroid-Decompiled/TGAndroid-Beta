package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ne implements ValueAnimator.AnimatorUpdateListener {
    public final int f41880a;
    public final un f41881b;

    public ne(un unVar, int i10) {
        this.f41880a = i10;
        this.f41881b = unVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41880a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un unVar = this.f41881b;
                unVar.W8 = floatValue;
                mm mmVar = unVar.f44295j1;
                if (mmVar != null) {
                    mmVar.invalidate();
                    unVar.f44471x0.invalidate();
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f41881b;
                unVar2.getClass();
                unVar2.f44434u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.yc();
                return;
            case 2:
                un unVar3 = this.f41881b;
                unVar3.getClass();
                unVar3.f44434u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar3.yc();
                return;
            case 3:
                un unVar4 = this.f41881b;
                unVar4.getClass();
                unVar4.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar4.x9();
                return;
            default:
                un unVar5 = this.f41881b;
                unVar5.getClass();
                unVar5.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar5.x9();
                return;
        }
    }
}
