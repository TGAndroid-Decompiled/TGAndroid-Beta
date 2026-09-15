package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24515a;
    public final d50 f24516b;
    public final w50 f24517c;

    public h50(w50 w50Var, boolean[] zArr, d50 d50Var) {
        this.f24517c = w50Var;
        this.f24515a = zArr;
        this.f24516b = d50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24515a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24516b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        w50 w50Var = this.f24517c;
        w50Var.f29577b.setRotationY(f7);
        w50Var.m0.setRotationY(f7);
    }
}
