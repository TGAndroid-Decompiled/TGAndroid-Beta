package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f24687a;
    public final d50 f24688b;
    public final c60 f24689c;

    public h50(c60 c60Var, boolean[] zArr, d50 d50Var) {
        this.f24689c = c60Var;
        this.f24687a = zArr;
        this.f24688b = d50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f24687a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f24688b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        c60 c60Var = this.f24689c;
        c60Var.h.setRotationY(f7);
        c60Var.f23248r0.setRotationY(f7);
    }
}
