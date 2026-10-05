package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ft0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26584a;
    public final ju0 f26585b;
    public final qv0 f26586c;

    public ft0(qv0 qv0Var, ju0 ju0Var, int i10) {
        this.f26584a = i10;
        this.f26586c = qv0Var;
        this.f26585b = ju0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26584a) {
            case 0:
                this.f26586c.f30245n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26585b.h.invalidate();
                return;
            default:
                this.f26586c.f30245n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26585b.h.invalidate();
                return;
        }
    }
}
