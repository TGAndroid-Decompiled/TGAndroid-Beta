package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24492a;
    public final d50 f24493b;
    public final w50 f24494c;

    public h50(w50 w50Var, boolean[] zArr, d50 d50Var) {
        this.f24494c = w50Var;
        this.f24492a = zArr;
        this.f24493b = d50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24492a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24493b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        w50 w50Var = this.f24494c;
        w50Var.f29535b.setRotationY(f7);
        w50Var.m0.setRotationY(f7);
    }
}
