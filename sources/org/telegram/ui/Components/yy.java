package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yy implements ValueAnimator.AnimatorUpdateListener {
    public final int f40837a;
    public final dz f40838b;

    public yy(dz dzVar, int i7) {
        this.f40837a = i7;
        this.f40838b = dzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40837a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz dzVar = this.f40838b;
                dzVar.f33229y = floatValue;
                dzVar.invalidate();
                return;
            default:
                dz dzVar2 = this.f40838b;
                dzVar2.getClass();
                dzVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dzVar2.invalidate();
                return;
        }
    }
}
