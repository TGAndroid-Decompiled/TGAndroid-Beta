package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f29491a;
    public final l50 f29492b;
    public final l60 f29493c;

    public p50(l60 l60Var, boolean[] zArr, l50 l50Var) {
        this.f29493c = l60Var;
        this.f29491a = zArr;
        this.f29492b = l50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f29491a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f29492b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        l60 l60Var = this.f29493c;
        l60Var.h.setRotationY(f7);
        l60Var.f28208r0.setRotationY(f7);
    }
}
