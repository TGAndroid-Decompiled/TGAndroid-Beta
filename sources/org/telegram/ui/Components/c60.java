package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c60 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24832a;
    public final y50 f24833b;
    public final w60 f24834c;

    public c60(w60 w60Var, boolean[] zArr, y50 y50Var) {
        this.f24834c = w60Var;
        this.f24832a = zArr;
        this.f24833b = y50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24832a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24833b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        w60 w60Var = this.f24834c;
        w60Var.h.setRotationY(f7);
        w60Var.f32303r0.setRotationY(f7);
    }
}
