package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nm implements ValueAnimator.AnimatorUpdateListener {
    public final int f29016a;
    public final sm f29017b;

    public nm(sm smVar, int i10) {
        this.f29016a = i10;
        this.f29017b = smVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29016a) {
            case 0:
                sm smVar = this.f29017b;
                smVar.getClass();
                smVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                smVar.invalidate();
                return;
            default:
                sm smVar2 = this.f29017b;
                smVar2.getClass();
                smVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                smVar2.invalidate();
                return;
        }
    }
}
