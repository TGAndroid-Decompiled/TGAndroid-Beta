package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33151a;
    public final tu0 f33152b;
    public final aw0 f33153c;

    public tt0(aw0 aw0Var, tu0 tu0Var, int i10) {
        this.f33151a = i10;
        this.f33153c = aw0Var;
        this.f33152b = tu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33151a) {
            case 0:
                this.f33153c.f26684p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f33152b.h.invalidate();
                return;
            default:
                this.f33153c.f26684p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f33152b.h.invalidate();
                return;
        }
    }
}
