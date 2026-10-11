package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a60 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24517a;
    public final w50 f24518b;
    public final t60 f24519c;

    public a60(t60 t60Var, boolean[] zArr, w50 w50Var) {
        this.f24519c = t60Var;
        this.f24517a = zArr;
        this.f24518b = w50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24517a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24518b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        t60 t60Var = this.f24519c;
        t60Var.h.setRotationY(f7);
        t60Var.f31112r0.setRotationY(f7);
    }
}
