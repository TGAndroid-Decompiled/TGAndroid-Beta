package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a60 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24450a;
    public final w50 f24451b;
    public final u60 f24452c;

    public a60(u60 u60Var, boolean[] zArr, w50 w50Var) {
        this.f24452c = u60Var;
        this.f24450a = zArr;
        this.f24451b = w50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24450a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24451b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        u60 u60Var = this.f24452c;
        u60Var.h.setRotationY(f7);
        u60Var.f31288r0.setRotationY(f7);
    }
}
