package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24949a;
    public final e50 f24950b;
    public final c60 f24951c;

    public i50(c60 c60Var, boolean[] zArr, e50 e50Var) {
        this.f24951c = c60Var;
        this.f24949a = zArr;
        this.f24950b = e50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24949a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24950b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        c60 c60Var = this.f24951c;
        c60Var.h.setRotationY(f7);
        c60Var.f23238r0.setRotationY(f7);
    }
}
