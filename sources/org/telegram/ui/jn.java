package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38590a;
    public final kn f38591b;

    public jn(kn knVar, int i10) {
        this.f38590a = i10;
        this.f38591b = knVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38590a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar = this.f38591b;
                knVar.f38946r = floatValue;
                View view = knVar.f38947s.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar2 = this.f38591b;
                knVar2.f38946r = floatValue2;
                View view2 = knVar2.f38947s.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar3 = this.f38591b;
                knVar3.f38946r = floatValue3;
                View view3 = knVar3.f38947s.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
