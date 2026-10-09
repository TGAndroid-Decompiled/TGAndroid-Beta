package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f33475a;
    public final v50 f33476b;
    public final t60 f33477c;

    public z50(t60 t60Var, boolean[] zArr, v50 v50Var) {
        this.f33477c = t60Var;
        this.f33475a = zArr;
        this.f33476b = v50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f33475a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f33476b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        t60 t60Var = this.f33477c;
        t60Var.h.setRotationY(f7);
        t60Var.f31032r0.setRotationY(f7);
    }
}
