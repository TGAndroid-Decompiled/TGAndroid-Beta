package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f25916a;
    public final h50 f25917b;
    public final f60 f25918c;

    public l50(f60 f60Var, boolean[] zArr, h50 h50Var) {
        this.f25918c = f60Var;
        this.f25916a = zArr;
        this.f25917b = h50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f25916a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f25917b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        f60 f60Var = this.f25918c;
        f60Var.h.setRotationY(f7);
        f60Var.f24207r0.setRotationY(f7);
    }
}
