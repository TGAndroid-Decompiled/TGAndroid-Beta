package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class v61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29053a;
    public final View f29054b;

    public v61(int i10, View view) {
        this.f29053a = i10;
        this.f29054b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29053a) {
            case 0:
                w61 w61Var = (w61) this.f29054b;
                w61Var.getClass();
                w61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var.invalidate();
                return;
            case 1:
                c71 c71Var = (c71) this.f29054b;
                c71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.f23181b = floatValue;
                c71Var.setTranslationY(floatValue);
                return;
            default:
                x81 x81Var = (x81) this.f29054b;
                x81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x81Var.setAnimationIdicatorProgress(floatValue2);
                w81 w81Var = x81Var.f30205y;
                if (w81Var != null) {
                    ((l.d) w81Var).L(floatValue2);
                    return;
                }
                return;
        }
    }
}
