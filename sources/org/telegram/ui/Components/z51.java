package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class z51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33285a;
    public final View f33286b;

    public z51(int i10, View view) {
        this.f33285a = i10;
        this.f33286b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33285a) {
            case 0:
                b61 b61Var = (b61) this.f33286b;
                b61Var.getClass();
                b61Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                return;
            case 1:
                q71 q71Var = (q71) this.f33286b;
                q71Var.getClass();
                q71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q71Var.invalidate();
                return;
            case 2:
                w71 w71Var = (w71) this.f33286b;
                w71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var.f32354b = floatValue;
                w71Var.setTranslationY(floatValue);
                return;
            default:
                t91 t91Var = (t91) this.f33286b;
                t91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t91Var.setAnimationIdicatorProgress(floatValue2);
                s91 s91Var = t91Var.f30827y;
                if (s91Var != null) {
                    ((n4.l) s91Var).k(floatValue2);
                    return;
                }
                return;
        }
    }
}
