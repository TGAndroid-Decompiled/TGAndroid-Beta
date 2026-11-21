package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j40 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f36396a;
    public final f40 f36397b;
    public final c50 f36398c;

    public j40(c50 c50Var, boolean[] zArr, f40 f40Var) {
        this.f36398c = c50Var;
        this.f36396a = zArr;
        this.f36397b = f40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f36396a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f36397b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        c50 c50Var = this.f36398c;
        c50Var.f34032f.setRotationY(f10);
        c50Var.f34052r0.setRotationY(f10);
    }
}
