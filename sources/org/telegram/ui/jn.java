package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38604a;
    public final kn f38605b;

    public jn(kn knVar, int i10) {
        this.f38604a = i10;
        this.f38605b = knVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38604a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar = this.f38605b;
                knVar.f38976r = floatValue;
                View view = knVar.f38977s.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar2 = this.f38605b;
                knVar2.f38976r = floatValue2;
                View view2 = knVar2.f38977s.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar3 = this.f38605b;
                knVar3.f38976r = floatValue3;
                View view3 = knVar3.f38977s.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
