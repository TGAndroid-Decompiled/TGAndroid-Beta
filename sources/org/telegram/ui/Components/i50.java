package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24948a;
    public final e50 f24949b;
    public final c60 f24950c;

    public i50(c60 c60Var, boolean[] zArr, e50 e50Var) {
        this.f24950c = c60Var;
        this.f24948a = zArr;
        this.f24949b = e50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24948a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24949b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        c60 c60Var = this.f24950c;
        c60Var.h.setRotationY(f7);
        c60Var.f23237r0.setRotationY(f7);
    }
}
