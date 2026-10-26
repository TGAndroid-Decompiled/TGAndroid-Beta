package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class s71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32449a;
    public final View f32450b;

    public s71(int i10, View view) {
        this.f32449a = i10;
        this.f32450b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32449a) {
            case 0:
                t71 t71Var = (t71) this.f32450b;
                t71Var.getClass();
                t71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t71Var.invalidate();
                return;
            case 1:
                z71 z71Var = (z71) this.f32450b;
                z71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z71Var.f35240b = floatValue;
                z71Var.setTranslationY(floatValue);
                return;
            default:
                t91 t91Var = (t91) this.f32450b;
                t91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t91Var.setAnimationIdicatorProgress(floatValue2);
                s91 s91Var = t91Var.f32948y;
                if (s91Var != null) {
                    ((jg.i) s91Var).e0(floatValue2);
                    return;
                }
                return;
        }
    }
}
