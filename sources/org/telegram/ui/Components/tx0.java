package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class tx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30733a;
    public final com.google.firebase.messaging.n f30734b;
    public final int f30735c;

    public tx0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f30733a = i11;
        this.f30734b = nVar;
        this.f30735c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30733a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f30734b.d).set(this.f30735c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f30734b.f6377e).set(this.f30735c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f30734b.f6378f).set(this.f30735c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f30734b.d).set(this.f30735c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f30734b.f6377e).set(this.f30735c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f30734b.f6378f).set(this.f30735c, f14);
                return;
        }
    }
}
