package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class ny0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28841a;
    public final com.google.firebase.messaging.l f28842b;
    public final int f28843c;

    public ny0(com.google.firebase.messaging.l lVar, int i10, int i11) {
        this.f28841a = i11;
        this.f28842b = lVar;
        this.f28843c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28841a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f28842b.d).set(this.f28843c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f28842b.e).set(this.f28843c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f28842b.f7650f).set(this.f28843c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f28842b.d).set(this.f28843c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f28842b.e).set(this.f28843c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f28842b.f7650f).set(this.f28843c, f14);
                return;
        }
    }
}
