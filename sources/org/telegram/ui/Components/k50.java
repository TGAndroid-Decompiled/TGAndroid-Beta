package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f25606a;
    public final g50 f25607b;
    public final e60 f25608c;

    public k50(e60 e60Var, boolean[] zArr, g50 g50Var) {
        this.f25608c = e60Var;
        this.f25606a = zArr;
        this.f25607b = g50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f25606a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f25607b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        e60 e60Var = this.f25608c;
        e60Var.h.setRotationY(f7);
        e60Var.f23895r0.setRotationY(f7);
    }
}
