package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ln implements ValueAnimator.AnimatorUpdateListener {
    public final int f39312a;
    public final mn f39313b;

    public ln(mn mnVar, int i10) {
        this.f39312a = i10;
        this.f39313b = mnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39312a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar = this.f39313b;
                mnVar.f39576a = floatValue;
                View view = mnVar.f39577b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar2 = this.f39313b;
                mnVar2.f39576a = floatValue2;
                View view2 = mnVar2.f39577b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar3 = this.f39313b;
                mnVar3.f39576a = floatValue3;
                View view3 = mnVar3.f39577b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
