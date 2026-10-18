package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38249a;
    public final kn f38250b;

    public jn(kn knVar, int i10) {
        this.f38249a = i10;
        this.f38250b = knVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38249a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar = this.f38250b;
                knVar.f38589r = floatValue;
                View view = knVar.f38590s.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar2 = this.f38250b;
                knVar2.f38589r = floatValue2;
                View view2 = knVar2.f38590s.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn knVar3 = this.f38250b;
                knVar3.f38589r = floatValue3;
                View view3 = knVar3.f38590s.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
