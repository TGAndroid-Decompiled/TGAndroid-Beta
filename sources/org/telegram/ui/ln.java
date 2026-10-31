package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ln implements ValueAnimator.AnimatorUpdateListener {
    public final int f39321a;
    public final mn f39322b;

    public ln(mn mnVar, int i10) {
        this.f39321a = i10;
        this.f39322b = mnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39321a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar = this.f39322b;
                mnVar.f39736a = floatValue;
                View view = mnVar.f39737b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar2 = this.f39322b;
                mnVar2.f39736a = floatValue2;
                View view2 = mnVar2.f39737b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar3 = this.f39322b;
                mnVar3.f39736a = floatValue3;
                View view3 = mnVar3.f39737b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
