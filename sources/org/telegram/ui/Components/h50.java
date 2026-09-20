package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24546a;
    public final d50 f24547b;
    public final a60 f24548c;

    public h50(a60 a60Var, boolean[] zArr, d50 d50Var) {
        this.f24548c = a60Var;
        this.f24546a = zArr;
        this.f24547b = d50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24546a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24547b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        a60 a60Var = this.f24548c;
        a60Var.e.setRotationY(f7);
        a60Var.f22554p0.setRotationY(f7);
    }
}
