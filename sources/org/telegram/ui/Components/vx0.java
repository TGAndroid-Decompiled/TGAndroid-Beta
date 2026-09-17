package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class vx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29424a;
    public final com.google.firebase.messaging.n f29425b;
    public final int f29426c;

    public vx0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f29424a = i11;
        this.f29425b = nVar;
        this.f29426c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29424a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f29425b.d).set(this.f29426c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f29425b.e).set(this.f29426c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f29425b.f7339f).set(this.f29426c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f29425b.d).set(this.f29426c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f29425b.e).set(this.f29426c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f29425b.f7339f).set(this.f29426c, f14);
                return;
        }
    }
}
