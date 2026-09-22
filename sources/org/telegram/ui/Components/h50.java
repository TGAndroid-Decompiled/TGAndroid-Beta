package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24518a;
    public final d50 f24519b;
    public final w50 f24520c;

    public h50(w50 w50Var, boolean[] zArr, d50 d50Var) {
        this.f24520c = w50Var;
        this.f24518a = zArr;
        this.f24519b = d50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24518a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24519b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        w50 w50Var = this.f24520c;
        w50Var.f29574b.setRotationY(f7);
        w50Var.m0.setRotationY(f7);
    }
}
