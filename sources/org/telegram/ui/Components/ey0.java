package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class ey0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24011a;
    public final com.google.firebase.messaging.n f24012b;
    public final int f24013c;

    public ey0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f24011a = i11;
        this.f24012b = nVar;
        this.f24013c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24011a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f24012b.d).set(this.f24013c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f24012b.e).set(this.f24013c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f24012b.f7315f).set(this.f24013c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f24012b.d).set(this.f24013c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f24012b.e).set(this.f24013c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f24012b.f7315f).set(this.f24013c, f14);
                return;
        }
    }
}
