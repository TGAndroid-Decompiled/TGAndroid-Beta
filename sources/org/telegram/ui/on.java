package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class on implements ValueAnimator.AnimatorUpdateListener {
    public final int f36940a;
    public final pn f36941b;

    public on(pn pnVar, int i10) {
        this.f36940a = i10;
        this.f36941b = pnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36940a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn pnVar = this.f36941b;
                pnVar.f37378f = floatValue;
                View view = pnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn pnVar2 = this.f36941b;
                pnVar2.f37378f = floatValue2;
                View view2 = pnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn pnVar3 = this.f36941b;
                pnVar3.f37378f = floatValue3;
                View view3 = pnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
