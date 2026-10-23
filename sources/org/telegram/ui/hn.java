package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class hn implements ValueAnimator.AnimatorUpdateListener {
    public final int f37696a;
    public final in f37697b;

    public hn(in inVar, int i10) {
        this.f37696a = i10;
        this.f37697b = inVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37696a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in inVar = this.f37697b;
                inVar.f38035r = floatValue;
                View view = inVar.f38036s.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in inVar2 = this.f37697b;
                inVar2.f38035r = floatValue2;
                View view2 = inVar2.f38036s.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in inVar3 = this.f37697b;
                inVar3.f38035r = floatValue3;
                View view3 = inVar3.f38036s.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
