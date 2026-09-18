package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class g61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24100a;
    public final View f24101b;

    public g61(int i10, View view) {
        this.f24100a = i10;
        this.f24101b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24100a) {
            case 0:
                h61 h61Var = (h61) this.f24101b;
                h61Var.getClass();
                h61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h61Var.invalidate();
                return;
            case 1:
                n61 n61Var = (n61) this.f24101b;
                n61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n61Var.f26352b = floatValue;
                n61Var.setTranslationY(floatValue);
                return;
            default:
                i81 i81Var = (i81) this.f24101b;
                i81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i81Var.setAnimationIdicatorProgress(floatValue2);
                h81 h81Var = i81Var.f24899y;
                if (h81Var != null) {
                    ((ka.c) h81Var).h(floatValue2);
                    return;
                }
                return;
        }
    }
}
