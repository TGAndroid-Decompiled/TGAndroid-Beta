package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f30105a;
    public final n50 f30106b;
    public final n60 f30107c;

    public r50(n60 n60Var, boolean[] zArr, n50 n50Var) {
        this.f30107c = n60Var;
        this.f30105a = zArr;
        this.f30106b = n50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f30105a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f30106b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        n60 n60Var = this.f30107c;
        n60Var.h.setRotationY(f7);
        n60Var.f28874r0.setRotationY(f7);
    }
}
