package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class w51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32586a;
    public final View f32587b;

    public w51(int i10, View view) {
        this.f32586a = i10;
        this.f32587b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32586a) {
            case 0:
                y51 y51Var = (y51) this.f32587b;
                y51Var.getClass();
                y51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y51Var.invalidate();
                return;
            case 1:
                n71 n71Var = (n71) this.f32587b;
                n71Var.getClass();
                n71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n71Var.invalidate();
                return;
            case 2:
                t71 t71Var = (t71) this.f32587b;
                t71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t71Var.f31047b = floatValue;
                t71Var.setTranslationY(floatValue);
                return;
            default:
                p91 p91Var = (p91) this.f32587b;
                p91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p91Var.setAnimationIdicatorProgress(floatValue2);
                o91 o91Var = p91Var.f29685y;
                if (o91Var != null) {
                    ((m2.t) o91Var).D(floatValue2);
                    return;
                }
                return;
        }
    }
}
