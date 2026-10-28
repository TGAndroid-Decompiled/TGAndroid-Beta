package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class nn implements ValueAnimator.AnimatorUpdateListener {
    public final int f41826a;
    public final on f41827b;

    public nn(on onVar, int i10) {
        this.f41826a = i10;
        this.f41827b = onVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41826a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on onVar = this.f41827b;
                onVar.f42125a = floatValue;
                View view = onVar.f42126b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on onVar2 = this.f41827b;
                onVar2.f42125a = floatValue2;
                View view2 = onVar2.f42126b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on onVar3 = this.f41827b;
                onVar3.f42125a = floatValue3;
                View view3 = onVar3.f42126b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
