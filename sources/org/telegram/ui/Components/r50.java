package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f29847a;
    public final n50 f29848b;
    public final m60 f29849c;

    public r50(m60 m60Var, boolean[] zArr, n50 n50Var) {
        this.f29849c = m60Var;
        this.f29847a = zArr;
        this.f29848b = n50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f29847a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f29848b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        m60 m60Var = this.f29849c;
        m60Var.h.setRotationY(f7);
        m60Var.f28430r0.setRotationY(f7);
    }
}
