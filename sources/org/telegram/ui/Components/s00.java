package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class s00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30624a;
    public final z00 f30625b;

    public s00(z00 z00Var, int i10) {
        this.f30624a = i10;
        this.f30625b = z00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30624a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z00 z00Var = this.f30625b;
                z00Var.f33473x = floatValue;
                z00Var.invalidate();
                return;
            default:
                z00 z00Var2 = this.f30625b;
                z00Var2.getClass();
                z00Var2.f33474y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z00Var2.invalidate();
                return;
        }
    }
}
