package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class vx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29427a;
    public final com.google.firebase.messaging.n f29428b;
    public final int f29429c;

    public vx0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f29427a = i11;
        this.f29428b = nVar;
        this.f29429c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29427a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f29428b.d).set(this.f29429c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f29428b.e).set(this.f29429c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f29428b.f7339f).set(this.f29429c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f29428b.d).set(this.f29429c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f29428b.e).set(this.f29429c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f29428b.f7339f).set(this.f29429c, f14);
                return;
        }
    }
}
