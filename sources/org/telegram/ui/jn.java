package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38233a;
    public final kn f38234b;

    public jn(kn knVar, int i10) {
        this.f38233a = i10;
        this.f38234b = knVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38233a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar = this.f38234b;
                knVar.f38580r = floatValue;
                View view = knVar.f38581s.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar2 = this.f38234b;
                knVar2.f38580r = floatValue2;
                View view2 = knVar2.f38581s.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar3 = this.f38234b;
                knVar3.f38580r = floatValue3;
                View view3 = knVar3.f38581s.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
