package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class e61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23584a;
    public final View f23585b;

    public e61(int i10, View view) {
        this.f23584a = i10;
        this.f23585b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23584a) {
            case 0:
                f61 f61Var = (f61) this.f23585b;
                f61Var.getClass();
                f61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61Var.invalidate();
                return;
            case 1:
                l61 l61Var = (l61) this.f23585b;
                l61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61Var.f25829b = floatValue;
                l61Var.setTranslationY(floatValue);
                return;
            default:
                g81 g81Var = (g81) this.f23585b;
                g81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g81Var.setAnimationIdicatorProgress(floatValue2);
                f81 f81Var = g81Var.f24234y;
                if (f81Var != null) {
                    ((ka.c) f81Var).h(floatValue2);
                    return;
                }
                return;
        }
    }
}
