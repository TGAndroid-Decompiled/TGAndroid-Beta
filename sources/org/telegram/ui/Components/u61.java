package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class u61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28619a;
    public final View f28620b;

    public u61(int i10, View view) {
        this.f28619a = i10;
        this.f28620b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28619a) {
            case 0:
                v61 v61Var = (v61) this.f28620b;
                v61Var.getClass();
                v61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.invalidate();
                return;
            case 1:
                b71 b71Var = (b71) this.f28620b;
                b71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b71Var.f22875b = floatValue;
                b71Var.setTranslationY(floatValue);
                return;
            default:
                w81 w81Var = (w81) this.f28620b;
                w81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w81Var.setAnimationIdicatorProgress(floatValue2);
                v81 v81Var = w81Var.f29986y;
                if (v81Var != null) {
                    ((l.d) v81Var).L(floatValue2);
                    return;
                }
                return;
        }
    }
}
