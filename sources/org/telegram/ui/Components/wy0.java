package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class wy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32695a;
    public final com.google.firebase.messaging.n f32696b;
    public final int f32697c;

    public wy0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f32695a = i11;
        this.f32696b = nVar;
        this.f32697c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32695a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f32696b.d).set(this.f32697c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f32696b.f7957e).set(this.f32697c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f32696b.f7958f).set(this.f32697c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f32696b.d).set(this.f32697c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f32696b.f7957e).set(this.f32697c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f32696b.f7958f).set(this.f32697c, f14);
                return;
        }
    }
}
