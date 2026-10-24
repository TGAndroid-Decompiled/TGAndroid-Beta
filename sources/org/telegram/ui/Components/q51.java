package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class q51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29807a;
    public final View f29808b;

    public q51(int i10, View view) {
        this.f29807a = i10;
        this.f29808b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29807a) {
            case 0:
                s51 s51Var = (s51) this.f29808b;
                s51Var.getClass();
                s51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s51Var.invalidate();
                return;
            case 1:
                j71 j71Var = (j71) this.f29808b;
                j71Var.getClass();
                j71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var.invalidate();
                return;
            case 2:
                p71 p71Var = (p71) this.f29808b;
                p71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p71Var.f29505b = floatValue;
                p71Var.setTranslationY(floatValue);
                return;
            default:
                k91 k91Var = (k91) this.f29808b;
                k91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var.setAnimationIdicatorProgress(floatValue2);
                j91 j91Var = k91Var.f27989y;
                if (j91Var != null) {
                    ((l2.f) j91Var).I(floatValue2);
                    return;
                }
                return;
        }
    }
}
