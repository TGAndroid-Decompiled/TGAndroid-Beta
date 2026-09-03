package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class h61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25321a;
    public final View f25322b;

    public h61(int i10, View view) {
        this.f25321a = i10;
        this.f25322b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25321a) {
            case 0:
                i61 i61Var = (i61) this.f25322b;
                i61Var.getClass();
                i61Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i61Var.invalidate();
                return;
            case 1:
                o61 o61Var = (o61) this.f25322b;
                o61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o61Var.f27471b = floatValue;
                o61Var.setTranslationY(floatValue);
                return;
            default:
                k81 k81Var = (k81) this.f25322b;
                k81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k81Var.setAnimationIdicatorProgress(floatValue2);
                j81 j81Var = k81Var.f26231y;
                if (j81Var != null) {
                    ((tp0) j81Var).n(floatValue2);
                    return;
                }
                return;
        }
    }
}
