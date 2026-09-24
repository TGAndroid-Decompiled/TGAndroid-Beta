package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24923a;
    public final e50 f24924b;
    public final c60 f24925c;

    public i50(c60 c60Var, boolean[] zArr, e50 e50Var) {
        this.f24925c = c60Var;
        this.f24923a = zArr;
        this.f24924b = e50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24923a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24924b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        c60 c60Var = this.f24925c;
        c60Var.h.setRotationY(f7);
        c60Var.f23208r0.setRotationY(f7);
    }
}
