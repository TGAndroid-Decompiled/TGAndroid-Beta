package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m50 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean[] f28938a;
    public final h50 f28939b;
    public final z50 f28940c;

    public m50(z50 z50Var, boolean[] zArr, h50 h50Var) {
        this.f28940c = z50Var;
        this.f28938a = zArr;
        this.f28939b = h50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue > 0.5f) {
            boolean[] zArr = this.f28938a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f28939b.run();
            }
        }
        if (floatValue >= 0.5f) {
            floatValue -= 1.0f;
        }
        float f10 = floatValue * 180.0f;
        z50 z50Var = this.f28940c;
        z50Var.f33734b.setRotationY(f10);
        z50Var.f33746j0.setRotationY(f10);
    }
}
