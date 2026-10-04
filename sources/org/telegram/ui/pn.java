package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class pn implements ValueAnimator.AnimatorUpdateListener {
    public final int f39517a;
    public final qn f39518b;

    public pn(qn qnVar, int i10) {
        this.f39517a = i10;
        this.f39518b = qnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39517a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar = this.f39518b;
                qnVar.f39756f = floatValue;
                View view = qnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar2 = this.f39518b;
                qnVar2.f39756f = floatValue2;
                View view2 = qnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar3 = this.f39518b;
                qnVar3.f39756f = floatValue3;
                View view3 = qnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
