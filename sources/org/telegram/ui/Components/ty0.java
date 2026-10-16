package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class ty0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29203a;
    public final com.google.firebase.messaging.m f29204b;
    public final int f29205c;

    public ty0(com.google.firebase.messaging.m mVar, int i10, int i11) {
        this.f29203a = i11;
        this.f29204b = mVar;
        this.f29205c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29203a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f29204b.d).set(this.f29205c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f29204b.e).set(this.f29205c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f29204b.f6197f).set(this.f29205c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f29204b.d).set(this.f29205c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f29204b.e).set(this.f29205c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f29204b.f6197f).set(this.f29205c, f14);
                return;
        }
    }
}
