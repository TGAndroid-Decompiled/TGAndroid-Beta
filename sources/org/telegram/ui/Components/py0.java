package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class py0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29827a;
    public final com.google.firebase.messaging.n f29828b;
    public final int f29829c;

    public py0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f29827a = i11;
        this.f29828b = nVar;
        this.f29829c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29827a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f29828b.d).set(this.f29829c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f29828b.f7907e).set(this.f29829c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f29828b.f7908f).set(this.f29829c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f29828b.d).set(this.f29829c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f29828b.f7907e).set(this.f29829c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f29828b.f7908f).set(this.f29829c, f14);
                return;
        }
    }
}
