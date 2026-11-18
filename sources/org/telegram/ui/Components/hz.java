package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hz implements ValueAnimator.AnimatorUpdateListener {
    public final int f36010a;
    public final nz f36011b;

    public hz(nz nzVar, int i7) {
        this.f36010a = i7;
        this.f36011b = nzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36010a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nz nzVar = this.f36011b;
                nzVar.f37909y = floatValue;
                nzVar.invalidate();
                return;
            default:
                nz nzVar2 = this.f36011b;
                nzVar2.getClass();
                nzVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nzVar2.invalidate();
                return;
        }
    }
}
