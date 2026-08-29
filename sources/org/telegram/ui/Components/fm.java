package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fm implements ValueAnimator.AnimatorUpdateListener {
    public final int f28480a;
    public final km f28481b;

    public fm(km kmVar, int i10) {
        this.f28480a = i10;
        this.f28481b = kmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28480a) {
            case 0:
                km kmVar = this.f28481b;
                kmVar.getClass();
                kmVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmVar.invalidate();
                return;
            default:
                km kmVar2 = this.f28481b;
                kmVar2.getClass();
                kmVar2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmVar2.invalidate();
                return;
        }
    }
}
