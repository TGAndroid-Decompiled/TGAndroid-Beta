package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n40 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f28664a;
    public final j40 f28665b;
    public final e50 f28666c;

    public n40(e50 e50Var, boolean[] zArr, j40 j40Var) {
        this.f28666c = e50Var;
        this.f28664a = zArr;
        this.f28665b = j40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f28664a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f28665b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f7 = floatValue * 180.0f;
        e50 e50Var = this.f28666c;
        e50Var.f25705f.setRotationY(f7);
        e50Var.f25723q0.setRotationY(f7);
    }
}
