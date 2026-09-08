package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class tx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30760a;
    public final com.google.firebase.messaging.n f30761b;
    public final int f30762c;

    public tx0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f30760a = i11;
        this.f30761b = nVar;
        this.f30762c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30760a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f30761b.d).set(this.f30762c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f30761b.f6404e).set(this.f30762c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f30761b.f6405f).set(this.f30762c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f30761b.d).set(this.f30762c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f30761b.f6404e).set(this.f30762c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f30761b.f6405f).set(this.f30762c, f14);
                return;
        }
    }
}
