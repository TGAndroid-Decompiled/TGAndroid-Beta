package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class e61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25600a;
    public final View f25601b;

    public e61(int i10, View view) {
        this.f25600a = i10;
        this.f25601b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25600a) {
            case 0:
                f61 f61Var = (f61) this.f25601b;
                f61Var.getClass();
                f61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61Var.invalidate();
                return;
            case 1:
                m61 m61Var = (m61) this.f25601b;
                m61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m61Var.f28423b = floatValue;
                m61Var.setTranslationY(floatValue);
                return;
            default:
                h81 h81Var = (h81) this.f25601b;
                h81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h81Var.setAnimationIdicatorProgress(floatValue2);
                g81 g81Var = h81Var.f26687y;
                if (g81Var != null) {
                    ((k2.g0) g81Var).A(floatValue2);
                    return;
                }
                return;
        }
    }
}
