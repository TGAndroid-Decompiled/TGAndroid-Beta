package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class g61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24097a;
    public final View f24098b;

    public g61(int i10, View view) {
        this.f24097a = i10;
        this.f24098b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24097a) {
            case 0:
                h61 h61Var = (h61) this.f24098b;
                h61Var.getClass();
                h61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h61Var.invalidate();
                return;
            case 1:
                n61 n61Var = (n61) this.f24098b;
                n61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n61Var.f26349b = floatValue;
                n61Var.setTranslationY(floatValue);
                return;
            default:
                i81 i81Var = (i81) this.f24098b;
                i81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i81Var.setAnimationIdicatorProgress(floatValue2);
                h81 h81Var = i81Var.f24896y;
                if (h81Var != null) {
                    ((ka.c) h81Var).h(floatValue2);
                    return;
                }
                return;
        }
    }
}
