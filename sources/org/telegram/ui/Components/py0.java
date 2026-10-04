package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class py0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29832a;
    public final com.google.firebase.messaging.n f29833b;
    public final int f29834c;

    public py0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f29832a = i11;
        this.f29833b = nVar;
        this.f29834c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29832a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f29833b.d).set(this.f29834c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f29833b.f7908e).set(this.f29834c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f29833b.f7909f).set(this.f29834c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f29833b.d).set(this.f29834c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f29833b.f7908e).set(this.f29834c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f29833b.f7909f).set(this.f29834c, f14);
                return;
        }
    }
}
