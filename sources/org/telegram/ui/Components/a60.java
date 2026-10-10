package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a60 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24493a;
    public final w50 f24494b;
    public final u60 f24495c;

    public a60(u60 u60Var, boolean[] zArr, w50 w50Var) {
        this.f24495c = u60Var;
        this.f24493a = zArr;
        this.f24494b = w50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24493a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24494b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        u60 u60Var = this.f24495c;
        u60Var.h.setRotationY(f7);
        u60Var.f31366r0.setRotationY(f7);
    }
}
