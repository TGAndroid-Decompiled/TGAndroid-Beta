package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class f61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23831a;
    public final View f23832b;

    public f61(int i10, View view) {
        this.f23831a = i10;
        this.f23832b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23831a) {
            case 0:
                g61 g61Var = (g61) this.f23832b;
                g61Var.getClass();
                g61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g61Var.invalidate();
                return;
            case 1:
                m61 m61Var = (m61) this.f23832b;
                m61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m61Var.f26108b = floatValue;
                m61Var.setTranslationY(floatValue);
                return;
            default:
                h81 h81Var = (h81) this.f23832b;
                h81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h81Var.setAnimationIdicatorProgress(floatValue2);
                g81 g81Var = h81Var.f24617y;
                if (g81Var != null) {
                    ((ka.c) g81Var).h(floatValue2);
                    return;
                }
                return;
        }
    }
}
