package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j40 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f36349a;
    public final f40 f36350b;
    public final c50 f36351c;

    public j40(c50 c50Var, boolean[] zArr, f40 f40Var) {
        this.f36351c = c50Var;
        this.f36349a = zArr;
        this.f36350b = f40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f36349a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f36350b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        c50 c50Var = this.f36351c;
        c50Var.f33990f.setRotationY(f10);
        c50Var.f34010r0.setRotationY(f10);
    }
}
