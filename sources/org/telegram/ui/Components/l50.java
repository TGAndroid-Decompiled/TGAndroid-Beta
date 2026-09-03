package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f26593a;
    public final g50 f26594b;
    public final y50 f26595c;

    public l50(y50 y50Var, boolean[] zArr, g50 g50Var) {
        this.f26595c = y50Var;
        this.f26593a = zArr;
        this.f26594b = g50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f26593a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f26594b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        y50 y50Var = this.f26595c;
        y50Var.f30873b.setRotationY(f10);
        y50Var.f30884j0.setRotationY(f10);
    }
}
