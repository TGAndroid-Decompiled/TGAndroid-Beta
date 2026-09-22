package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class ux0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28520a;
    public final com.google.firebase.messaging.n f28521b;
    public final int f28522c;

    public ux0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f28520a = i11;
        this.f28521b = nVar;
        this.f28522c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28520a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f28521b.d).set(this.f28522c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f28521b.e).set(this.f28522c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f28521b.f7336f).set(this.f28522c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f28521b.d).set(this.f28522c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f28521b.e).set(this.f28522c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f28521b.f7336f).set(this.f28522c, f14);
                return;
        }
    }
}
