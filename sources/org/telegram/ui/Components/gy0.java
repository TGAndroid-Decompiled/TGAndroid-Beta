package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class gy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23453a;
    public final com.google.firebase.messaging.n f23454b;
    public final int f23455c;

    public gy0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f23453a = i11;
        this.f23454b = nVar;
        this.f23455c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23453a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f23454b.d).set(this.f23455c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f23454b.e).set(this.f23455c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f23454b.f6106f).set(this.f23455c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f23454b.d).set(this.f23455c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f23454b.e).set(this.f23455c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f23454b.f6106f).set(this.f23455c, f14);
                return;
        }
    }
}
