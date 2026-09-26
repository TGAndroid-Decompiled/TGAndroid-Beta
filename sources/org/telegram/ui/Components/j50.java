package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f25265a;
    public final f50 f25266b;
    public final d60 f25267c;

    public j50(d60 d60Var, boolean[] zArr, f50 f50Var) {
        this.f25267c = d60Var;
        this.f25265a = zArr;
        this.f25266b = f50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f25265a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f25266b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        d60 d60Var = this.f25267c;
        d60Var.h.setRotationY(f7);
        d60Var.f23575r0.setRotationY(f7);
    }
}
