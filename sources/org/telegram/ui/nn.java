package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class nn implements ValueAnimator.AnimatorUpdateListener {
    public final int f35927a;
    public final on f35928b;

    public nn(on onVar, int i10) {
        this.f35927a = i10;
        this.f35928b = onVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35927a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on onVar = this.f35928b;
                onVar.f36270f = floatValue;
                View view = onVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on onVar2 = this.f35928b;
                onVar2.f36270f = floatValue2;
                View view2 = onVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on onVar3 = this.f35928b;
                onVar3.f36270f = floatValue3;
                View view3 = onVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
