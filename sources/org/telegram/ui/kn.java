package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class kn implements ValueAnimator.AnimatorUpdateListener {
    public final int f39935a;
    public final ln f39936b;

    public kn(ln lnVar, int i10) {
        this.f39935a = i10;
        this.f39936b = lnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39935a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ln lnVar = this.f39936b;
                lnVar.f40247f = floatValue;
                View view = lnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ln lnVar2 = this.f39936b;
                lnVar2.f40247f = floatValue2;
                View view2 = lnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ln lnVar3 = this.f39936b;
                lnVar3.f40247f = floatValue3;
                View view3 = lnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
