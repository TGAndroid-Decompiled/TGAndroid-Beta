package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yy implements ValueAnimator.AnimatorUpdateListener {
    public final int f40823a;
    public final dz f40824b;

    public yy(dz dzVar, int i7) {
        this.f40823a = i7;
        this.f40824b = dzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40823a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz dzVar = this.f40824b;
                dzVar.f33137y = floatValue;
                dzVar.invalidate();
                return;
            default:
                dz dzVar2 = this.f40824b;
                dzVar2.getClass();
                dzVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dzVar2.invalidate();
                return;
        }
    }
}
