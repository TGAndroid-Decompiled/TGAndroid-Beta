package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mm implements ValueAnimator.AnimatorUpdateListener {
    public final int f26446a;
    public final rm f26447b;

    public mm(rm rmVar, int i10) {
        this.f26446a = i10;
        this.f26447b = rmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26446a) {
            case 0:
                rm rmVar = this.f26447b;
                rmVar.getClass();
                rmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rmVar.invalidate();
                return;
            default:
                rm rmVar2 = this.f26447b;
                rmVar2.getClass();
                rmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rmVar2.invalidate();
                return;
        }
    }
}
