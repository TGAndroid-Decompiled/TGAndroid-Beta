package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class py0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29414a;
    public final com.google.firebase.messaging.l f29415b;
    public final int f29416c;

    public py0(com.google.firebase.messaging.l lVar, int i10, int i11) {
        this.f29414a = i11;
        this.f29415b = lVar;
        this.f29416c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29414a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f29415b.d).set(this.f29416c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f29415b.e).set(this.f29416c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f29415b.f7648f).set(this.f29416c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f29415b.d).set(this.f29416c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f29415b.e).set(this.f29416c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f29415b.f7648f).set(this.f29416c, f14);
                return;
        }
    }
}
