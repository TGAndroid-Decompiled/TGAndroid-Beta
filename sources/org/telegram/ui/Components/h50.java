package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24555a;
    public final d50 f24556b;
    public final b60 f24557c;

    public h50(b60 b60Var, boolean[] zArr, d50 d50Var) {
        this.f24557c = b60Var;
        this.f24555a = zArr;
        this.f24556b = d50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24555a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24556b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        b60 b60Var = this.f24557c;
        b60Var.e.setRotationY(f7);
        b60Var.f22849p0.setRotationY(f7);
    }
}
