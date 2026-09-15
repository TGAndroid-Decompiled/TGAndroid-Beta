package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class f61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23832a;
    public final View f23833b;

    public f61(int i10, View view) {
        this.f23832a = i10;
        this.f23833b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23832a) {
            case 0:
                g61 g61Var = (g61) this.f23833b;
                g61Var.getClass();
                g61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g61Var.invalidate();
                return;
            case 1:
                m61 m61Var = (m61) this.f23833b;
                m61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m61Var.f26109b = floatValue;
                m61Var.setTranslationY(floatValue);
                return;
            default:
                h81 h81Var = (h81) this.f23833b;
                h81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h81Var.setAnimationIdicatorProgress(floatValue2);
                g81 g81Var = h81Var.f24614y;
                if (g81Var != null) {
                    ((ka.c) g81Var).h(floatValue2);
                    return;
                }
                return;
        }
    }
}
