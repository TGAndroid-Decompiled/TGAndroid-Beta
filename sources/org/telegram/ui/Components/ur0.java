package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ur0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f33194a;

    public final zs0 f33195b;

    public final hu0 f33196c;

    public ur0(hu0 hu0Var, zs0 zs0Var, int i10) {
        this.f33194a = i10;
        this.f33196c = hu0Var;
        this.f33195b = zs0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33194a) {
            case 0:
                this.f33196c.f29129j1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f33195b.h.invalidate();
                break;
            default:
                this.f33196c.f29129j1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f33195b.h.invalidate();
                break;
        }
    }
}
