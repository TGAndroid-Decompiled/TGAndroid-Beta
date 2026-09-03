package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class wx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32843a;
    public final a9.a f32844b;
    public final int f32845c;

    public wx0(a9.a aVar, int i10, int i11) {
        this.f32843a = i11;
        this.f32844b = aVar;
        this.f32845c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32843a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f32844b.d).set(this.f32845c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f32844b.f158e).set(this.f32845c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f32844b.f159f).set(this.f32845c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f32844b.d).set(this.f32845c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f32844b.f158e).set(this.f32845c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f32844b.f159f).set(this.f32845c, f15);
                return;
        }
    }
}
