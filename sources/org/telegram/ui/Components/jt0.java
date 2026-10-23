package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27639a;
    public final nu0 f27640b;
    public final uv0 f27641c;

    public jt0(uv0 uv0Var, nu0 nu0Var, int i10) {
        this.f27639a = i10;
        this.f27641c = uv0Var;
        this.f27640b = nu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27639a) {
            case 0:
                this.f27641c.f31057n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27640b.h.invalidate();
                return;
            default:
                this.f27641c.f31057n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27640b.h.invalidate();
                return;
        }
    }
}
