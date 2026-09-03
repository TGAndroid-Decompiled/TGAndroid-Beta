package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class i61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27725a;
    public final View f27726b;

    public i61(int i10, View view) {
        this.f27725a = i10;
        this.f27726b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27725a) {
            case 0:
                j61 j61Var = (j61) this.f27726b;
                j61Var.getClass();
                j61Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61Var.invalidate();
                return;
            case 1:
                p61 p61Var = (p61) this.f27726b;
                p61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61Var.f29995b = floatValue;
                p61Var.setTranslationY(floatValue);
                return;
            default:
                k81 k81Var = (k81) this.f27726b;
                k81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k81Var.setAnimationIdicatorProgress(floatValue2);
                j81 j81Var = k81Var.f28346y;
                if (j81Var != null) {
                    ((oh.h4) j81Var).f0(floatValue2);
                    return;
                }
                return;
        }
    }
}
