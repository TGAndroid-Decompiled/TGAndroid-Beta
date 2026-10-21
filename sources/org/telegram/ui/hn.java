package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class hn implements ValueAnimator.AnimatorUpdateListener {
    public final int f37692a;
    public final in f37693b;

    public hn(in inVar, int i10) {
        this.f37692a = i10;
        this.f37693b = inVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37692a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in inVar = this.f37693b;
                inVar.f38031r = floatValue;
                View view = inVar.f38032s.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in inVar2 = this.f37693b;
                inVar2.f38031r = floatValue2;
                View view2 = inVar2.f38032s.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in inVar3 = this.f37693b;
                inVar3.f38031r = floatValue3;
                View view3 = inVar3.f38032s.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
