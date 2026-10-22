package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27638a;
    public final nu0 f27639b;
    public final uv0 f27640c;

    public jt0(uv0 uv0Var, nu0 nu0Var, int i10) {
        this.f27638a = i10;
        this.f27640c = uv0Var;
        this.f27639b = nu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27638a) {
            case 0:
                this.f27640c.f31056n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27639b.h.invalidate();
                return;
            default:
                this.f27640c.f31056n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27639b.h.invalidate();
                return;
        }
    }
}
