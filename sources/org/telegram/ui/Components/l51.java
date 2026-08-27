package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

public final class l51 implements ValueAnimator.AnimatorUpdateListener {

    public final int f30299a;

    public final View f30300b;

    public l51(int i10, View view) {
        this.f30299a = i10;
        this.f30300b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30299a) {
            case 0:
                m51 m51Var = (m51) this.f30300b;
                m51Var.getClass();
                m51Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51Var.invalidate();
                break;
            case 1:
                s51 s51Var = (s51) this.f30300b;
                s51Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s51Var.f32339b = fFloatValue;
                s51Var.setTranslationY(fFloatValue);
                break;
            default:
                o71 o71Var = (o71) this.f30300b;
                o71Var.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o71Var.setAnimationIdicatorProgress(fFloatValue2);
                n71 n71Var = o71Var.f31227y;
                if (n71Var != null) {
                    ((m5.o) n71Var).x(fFloatValue2);
                }
                break;
        }
    }
}
