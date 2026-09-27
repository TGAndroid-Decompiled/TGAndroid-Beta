package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class gy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24674a;
    public final com.google.firebase.messaging.n f24675b;
    public final int f24676c;

    public gy0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f24674a = i11;
        this.f24675b = nVar;
        this.f24676c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24674a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f24675b.d).set(this.f24676c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f24675b.e).set(this.f24676c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f24675b.f7323f).set(this.f24676c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f24675b.d).set(this.f24676c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f24675b.e).set(this.f24676c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f24675b.f7323f).set(this.f24676c, f14);
                return;
        }
    }
}
