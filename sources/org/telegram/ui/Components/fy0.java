package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class fy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24197a;
    public final com.google.firebase.messaging.n f24198b;
    public final int f24199c;

    public fy0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f24197a = i11;
        this.f24198b = nVar;
        this.f24199c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24197a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f24198b.d).set(this.f24199c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f24198b.e).set(this.f24199c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f24198b.f7333f).set(this.f24199c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f24198b.d).set(this.f24199c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f24198b.e).set(this.f24199c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f24198b.f7333f).set(this.f24199c, f14);
                return;
        }
    }
}
