package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mm implements ValueAnimator.AnimatorUpdateListener {
    public final int f26450a;
    public final rm f26451b;

    public mm(rm rmVar, int i10) {
        this.f26450a = i10;
        this.f26451b = rmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26450a) {
            case 0:
                rm rmVar = this.f26451b;
                rmVar.getClass();
                rmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rmVar.invalidate();
                return;
            default:
                rm rmVar2 = this.f26451b;
                rmVar2.getClass();
                rmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rmVar2.invalidate();
                return;
        }
    }
}
