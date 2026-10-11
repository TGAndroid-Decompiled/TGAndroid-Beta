package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class yy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33354a;
    public final com.google.firebase.messaging.n f33355b;
    public final int f33356c;

    public yy0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f33354a = i11;
        this.f33355b = nVar;
        this.f33356c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33354a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f33355b.d).set(this.f33356c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f33355b.f7956e).set(this.f33356c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f33355b.f7957f).set(this.f33356c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f33355b.d).set(this.f33356c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f33355b.f7956e).set(this.f33356c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f33355b.f7957f).set(this.f33356c, f14);
                return;
        }
    }
}
