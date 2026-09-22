package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class hy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24902a;
    public final com.google.firebase.messaging.n f24903b;
    public final int f24904c;

    public hy0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f24902a = i11;
        this.f24903b = nVar;
        this.f24904c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24902a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f24903b.d).set(this.f24904c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f24903b.e).set(this.f24904c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f24903b.f7331f).set(this.f24904c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f24903b.d).set(this.f24904c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f24903b.e).set(this.f24904c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f24903b.f7331f).set(this.f24904c, f14);
                return;
        }
    }
}
