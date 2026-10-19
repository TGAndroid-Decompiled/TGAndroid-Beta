package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class hn implements ValueAnimator.AnimatorUpdateListener {
    public final int f37685a;
    public final in f37686b;

    public hn(in inVar, int i10) {
        this.f37685a = i10;
        this.f37686b = inVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37685a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in inVar = this.f37686b;
                inVar.f38024r = floatValue;
                View view = inVar.f38025s.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in inVar2 = this.f37686b;
                inVar2.f38024r = floatValue2;
                View view2 = inVar2.f38025s.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in inVar3 = this.f37686b;
                inVar3.f38024r = floatValue3;
                View view3 = inVar3.f38025s.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
