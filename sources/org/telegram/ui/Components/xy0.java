package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class xy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33050a;
    public final com.google.firebase.messaging.n f33051b;
    public final int f33052c;

    public xy0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f33050a = i11;
        this.f33051b = nVar;
        this.f33052c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33050a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f33051b.d).set(this.f33052c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f33051b.f7957e).set(this.f33052c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f33051b.f7958f).set(this.f33052c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f33051b.d).set(this.f33052c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f33051b.f7957e).set(this.f33052c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f33051b.f7958f).set(this.f33052c, f14);
                return;
        }
    }
}
