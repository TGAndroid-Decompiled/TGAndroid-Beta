package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mm implements ValueAnimator.AnimatorUpdateListener {
    public final int f26451a;
    public final rm f26452b;

    public mm(rm rmVar, int i10) {
        this.f26451a = i10;
        this.f26452b = rmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26451a) {
            case 0:
                rm rmVar = this.f26452b;
                rmVar.getClass();
                rmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rmVar.invalidate();
                return;
            default:
                rm rmVar2 = this.f26452b;
                rmVar2.getClass();
                rmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rmVar2.invalidate();
                return;
        }
    }
}
