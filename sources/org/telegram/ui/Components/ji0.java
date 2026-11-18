package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ji0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f36444a;
    public final vi0 f36445b;

    public ji0(vi0 vi0Var, float f10) {
        this.f36445b = vi0Var;
        this.f36444a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vi0 vi0Var = this.f36445b;
        vi0Var.f40669p0 = floatValue;
        vi0Var.f40668o0 = (1.0f - vi0Var.f40669p0) * this.f36444a;
        vi0Var.invalidate();
    }
}
