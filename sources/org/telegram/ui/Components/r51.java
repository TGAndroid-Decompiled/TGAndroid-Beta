package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class r51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28430a;
    public final View f28431b;

    public r51(int i10, View view) {
        this.f28430a = i10;
        this.f28431b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28430a) {
            case 0:
                t51 t51Var = (t51) this.f28431b;
                t51Var.getClass();
                t51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t51Var.invalidate();
                return;
            case 1:
                j71 j71Var = (j71) this.f28431b;
                j71Var.getClass();
                j71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var.invalidate();
                return;
            case 2:
                p71 p71Var = (p71) this.f28431b;
                p71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p71Var.f27920b = floatValue;
                p71Var.setTranslationY(floatValue);
                return;
            default:
                k91 k91Var = (k91) this.f28431b;
                k91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var.setAnimationIdicatorProgress(floatValue2);
                j91 j91Var = k91Var.f26331y;
                if (j91Var != null) {
                    ((m.h) j91Var).e(floatValue2);
                    return;
                }
                return;
        }
    }
}
