package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c60 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24837a;
    public final y50 f24838b;
    public final w60 f24839c;

    public c60(w60 w60Var, boolean[] zArr, y50 y50Var) {
        this.f24839c = w60Var;
        this.f24837a = zArr;
        this.f24838b = y50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24837a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24838b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        w60 w60Var = this.f24839c;
        w60Var.h.setRotationY(f7);
        w60Var.f32317r0.setRotationY(f7);
    }
}
