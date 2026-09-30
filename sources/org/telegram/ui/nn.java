package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class nn implements ValueAnimator.AnimatorUpdateListener {
    public final int f36042a;
    public final on f36043b;

    public nn(on onVar, int i10) {
        this.f36042a = i10;
        this.f36043b = onVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36042a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on onVar = this.f36043b;
                onVar.f36408f = floatValue;
                View view = onVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on onVar2 = this.f36043b;
                onVar2.f36408f = floatValue2;
                View view2 = onVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on onVar3 = this.f36043b;
                onVar3.f36408f = floatValue3;
                View view3 = onVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
