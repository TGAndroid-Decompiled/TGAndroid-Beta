package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class nm implements ValueAnimator.AnimatorUpdateListener {
    public final int f48021a;
    public final om f48022b;

    public nm(om omVar, int i3) {
        this.f48021a = i3;
        this.f48022b = omVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48021a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                om omVar = this.f48022b;
                omVar.f48310a = floatValue;
                View view = omVar.f48311b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                om omVar2 = this.f48022b;
                omVar2.f48310a = floatValue2;
                View view2 = omVar2.f48311b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                om omVar3 = this.f48022b;
                omVar3.f48310a = floatValue3;
                View view3 = omVar3.f48311b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
