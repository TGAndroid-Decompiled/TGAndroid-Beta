package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f25607a;
    public final g50 f25608b;
    public final e60 f25609c;

    public k50(e60 e60Var, boolean[] zArr, g50 g50Var) {
        this.f25609c = e60Var;
        this.f25607a = zArr;
        this.f25608b = g50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f25607a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f25608b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        e60 e60Var = this.f25609c;
        e60Var.h.setRotationY(f7);
        e60Var.f23909r0.setRotationY(f7);
    }
}
