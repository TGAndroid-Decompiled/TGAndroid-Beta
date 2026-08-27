package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class w40 implements ValueAnimator.AnimatorUpdateListener {

    public final boolean[] f34109a;

    public final s40 f34110b;

    public final k50 f34111c;

    public w40(k50 k50Var, boolean[] zArr, s40 s40Var) {
        this.f34111c = k50Var;
        this.f34109a = zArr;
        this.f34110b = s40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 0.5f) {
            boolean[] zArr = this.f34109a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f34110b.run();
            }
        }
        if (fFloatValue >= 0.5f) {
            fFloatValue -= 1.0f;
        }
        float f10 = fFloatValue * 180.0f;
        k50 k50Var = this.f34111c;
        k50Var.f29969b.setRotationY(f10);
        k50Var.f29980i0.setRotationY(f10);
    }
}
