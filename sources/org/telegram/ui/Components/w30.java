package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w30 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f39888a;
    public final s30 f39889b;
    public final p40 f39890c;

    public w30(p40 p40Var, boolean[] zArr, s30 s30Var) {
        this.f39890c = p40Var;
        this.f39888a = zArr;
        this.f39889b = s30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f39888a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f39889b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        p40 p40Var = this.f39890c;
        p40Var.f36894f.setRotationY(f10);
        p40Var.f36912q0.setRotationY(f10);
    }
}
