package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class gy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24506a;
    public final com.google.firebase.messaging.n f24507b;
    public final int f24508c;

    public gy0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f24506a = i11;
        this.f24507b = nVar;
        this.f24508c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24506a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f24507b.d).set(this.f24508c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f24507b.e).set(this.f24508c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f24507b.f7332f).set(this.f24508c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f24507b.d).set(this.f24508c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f24507b.e).set(this.f24508c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f24507b.f7332f).set(this.f24508c, f14);
                return;
        }
    }
}
