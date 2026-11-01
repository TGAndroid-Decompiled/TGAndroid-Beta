package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class w51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32086a;
    public final View f32087b;

    public w51(int i10, View view) {
        this.f32086a = i10;
        this.f32087b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32086a) {
            case 0:
                x51 x51Var = (x51) this.f32087b;
                x51Var.getClass();
                x51Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x51Var.invalidate();
                return;
            case 1:
                d61 d61Var = (d61) this.f32087b;
                d61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d61Var.f25420b = floatValue;
                d61Var.setTranslationY(floatValue);
                return;
            default:
                w71 w71Var = (w71) this.f32087b;
                w71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var.setAnimationIdicatorProgress(floatValue2);
                v71 v71Var = w71Var.D;
                if (v71Var != null) {
                    ((n2.u) v71Var).J(floatValue2);
                    return;
                }
                return;
        }
    }
}
