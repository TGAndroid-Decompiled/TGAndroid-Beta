package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class tx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28331a;
    public final com.google.firebase.messaging.n f28332b;
    public final int f28333c;

    public tx0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f28331a = i11;
        this.f28332b = nVar;
        this.f28333c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28331a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f28332b.d).set(this.f28333c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f28332b.e).set(this.f28333c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f28332b.f7322f).set(this.f28333c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f28332b.d).set(this.f28333c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f28332b.e).set(this.f28333c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f28332b.f7322f).set(this.f28333c, f14);
                return;
        }
    }
}
