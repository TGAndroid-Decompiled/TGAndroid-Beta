package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ln implements ValueAnimator.AnimatorUpdateListener {
    public final int f41300a;
    public final mn f41301b;

    public ln(mn mnVar, int i10) {
        this.f41300a = i10;
        this.f41301b = mnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41300a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar = this.f41301b;
                mnVar.f41590a = floatValue;
                View view = mnVar.f41591b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar2 = this.f41301b;
                mnVar2.f41590a = floatValue2;
                View view2 = mnVar2.f41591b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar3 = this.f41301b;
                mnVar3.f41590a = floatValue3;
                View view3 = mnVar3.f41591b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
