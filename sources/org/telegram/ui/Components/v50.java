package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f29569a;
    public final r50 f29570b;
    public final p60 f29571c;

    public v50(p60 p60Var, boolean[] zArr, r50 r50Var) {
        this.f29571c = p60Var;
        this.f29569a = zArr;
        this.f29570b = r50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f29569a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f29570b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        p60 p60Var = this.f29571c;
        p60Var.h.setRotationY(f7);
        p60Var.f27881r0.setRotationY(f7);
    }
}
