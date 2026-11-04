package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mz implements ValueAnimator.AnimatorUpdateListener {
    public final int f36275a;
    public final nz f36276b;

    public mz(nz nzVar, int i3) {
        this.f36275a = i3;
        this.f36276b = nzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36275a) {
            case 0:
                nz nzVar = this.f36276b;
                nzVar.getClass();
                nzVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nzVar.invalidate();
                return;
            case 1:
                nz nzVar2 = this.f36276b;
                nzVar2.getClass();
                nzVar2.f36660w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                nzVar2.invalidate();
                return;
            default:
                nz nzVar3 = this.f36276b;
                nzVar3.getClass();
                nzVar3.f36657n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nzVar3.invalidate();
                return;
        }
    }
}
