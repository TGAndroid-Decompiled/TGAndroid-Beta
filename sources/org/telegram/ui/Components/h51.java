package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class h51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35641a;
    public final View f35642b;

    public h51(int i7, View view) {
        this.f35641a = i7;
        this.f35642b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35641a) {
            case 0:
                i51 i51Var = (i51) this.f35642b;
                i51Var.getClass();
                i51Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51Var.invalidate();
                return;
            case 1:
                o51 o51Var = (o51) this.f35642b;
                o51Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51Var.f38036b = floatValue;
                o51Var.setTranslationY(floatValue);
                return;
            default:
                j71 j71Var = (j71) this.f35642b;
                j71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var.setAnimationIdicatorProgress(floatValue2);
                i71 i71Var = j71Var.E;
                if (i71Var != null) {
                    i71Var.c(floatValue2);
                    return;
                }
                return;
        }
    }
}
