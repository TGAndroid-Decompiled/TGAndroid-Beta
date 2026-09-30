package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class hy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24960a;
    public final com.google.firebase.messaging.n f24961b;
    public final int f24962c;

    public hy0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f24960a = i11;
        this.f24961b = nVar;
        this.f24962c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24960a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f24961b.d).set(this.f24962c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f24961b.e).set(this.f24962c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f24961b.f7327f).set(this.f24962c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f24961b.d).set(this.f24962c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f24961b.e).set(this.f24962c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f24961b.f7327f).set(this.f24962c, f14);
                return;
        }
    }
}
