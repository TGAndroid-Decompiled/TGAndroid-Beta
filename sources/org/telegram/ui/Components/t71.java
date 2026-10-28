package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class t71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32876a;
    public final View f32877b;

    public t71(int i10, View view) {
        this.f32876a = i10;
        this.f32877b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32876a) {
            case 0:
                u71 u71Var = (u71) this.f32877b;
                u71Var.getClass();
                u71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u71Var.invalidate();
                return;
            case 1:
                a81 a81Var = (a81) this.f32877b;
                a81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a81Var.f26458b = floatValue;
                a81Var.setTranslationY(floatValue);
                return;
            default:
                u91 u91Var = (u91) this.f32877b;
                u91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u91Var.setAnimationIdicatorProgress(floatValue2);
                t91 t91Var = u91Var.f33322y;
                if (t91Var != null) {
                    ((jg.i) t91Var).e0(floatValue2);
                    return;
                }
                return;
        }
    }
}
