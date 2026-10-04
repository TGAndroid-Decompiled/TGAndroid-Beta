package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class pn implements ValueAnimator.AnimatorUpdateListener {
    public final int f39522a;
    public final qn f39523b;

    public pn(qn qnVar, int i10) {
        this.f39522a = i10;
        this.f39523b = qnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39522a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar = this.f39523b;
                qnVar.f39761f = floatValue;
                View view = qnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar2 = this.f39523b;
                qnVar2.f39761f = floatValue2;
                View view2 = qnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar3 = this.f39523b;
                qnVar3.f39761f = floatValue3;
                View view3 = qnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
