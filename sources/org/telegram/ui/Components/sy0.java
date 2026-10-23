package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class sy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30572a;
    public final com.google.firebase.messaging.l f30573b;
    public final int f30574c;

    public sy0(com.google.firebase.messaging.l lVar, int i10, int i11) {
        this.f30572a = i11;
        this.f30573b = lVar;
        this.f30574c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30572a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f30573b.d).set(this.f30574c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f30573b.e).set(this.f30574c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f30573b.f7660f).set(this.f30574c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f30573b.d).set(this.f30574c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f30573b.e).set(this.f30574c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f30573b.f7660f).set(this.f30574c, f14);
                return;
        }
    }
}
