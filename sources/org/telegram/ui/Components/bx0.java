package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27301a;
    public final com.google.firebase.messaging.m f27302b;
    public final int f27303c;

    public bx0(com.google.firebase.messaging.m mVar, int i9, int i10) {
        this.f27301a = i10;
        this.f27302b = mVar;
        this.f27303c = i9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27301a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f27302b.d).set(this.f27303c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f27302b.f4163e).set(this.f27303c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f27302b.f4164f).set(this.f27303c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f27302b.d).set(this.f27303c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f27302b.f4163e).set(this.f27303c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f27302b.f4164f).set(this.f27303c, f15);
                return;
        }
    }
}
