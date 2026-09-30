package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nm implements ValueAnimator.AnimatorUpdateListener {
    public final int f26736a;
    public final sm f26737b;

    public nm(sm smVar, int i10) {
        this.f26736a = i10;
        this.f26737b = smVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26736a) {
            case 0:
                sm smVar = this.f26737b;
                smVar.getClass();
                smVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                smVar.invalidate();
                return;
            default:
                sm smVar2 = this.f26737b;
                smVar2.getClass();
                smVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                smVar2.invalidate();
                return;
        }
    }
}
