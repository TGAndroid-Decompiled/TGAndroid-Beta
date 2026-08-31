package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class j61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28053a;
    public final View f28054b;

    public j61(int i10, View view) {
        this.f28053a = i10;
        this.f28054b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28053a) {
            case 0:
                k61 k61Var = (k61) this.f28054b;
                k61Var.getClass();
                k61Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k61Var.invalidate();
                return;
            case 1:
                q61 q61Var = (q61) this.f28054b;
                q61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q61Var.f30292b = floatValue;
                q61Var.setTranslationY(floatValue);
                return;
            default:
                l81 l81Var = (l81) this.f28054b;
                l81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l81Var.setAnimationIdicatorProgress(floatValue2);
                k81 k81Var = l81Var.f28671y;
                if (k81Var != null) {
                    ((oh.h4) k81Var).f0(floatValue2);
                    return;
                }
                return;
        }
    }
}
