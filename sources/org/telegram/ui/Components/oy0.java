package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class oy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29110a;
    public final com.google.firebase.messaging.l f29111b;
    public final int f29112c;

    public oy0(com.google.firebase.messaging.l lVar, int i10, int i11) {
        this.f29110a = i11;
        this.f29111b = lVar;
        this.f29112c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29110a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f29111b.d).set(this.f29112c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f29111b.e).set(this.f29112c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f29111b.f7648f).set(this.f29112c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f29111b.d).set(this.f29112c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f29111b.e).set(this.f29112c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f29111b.f7648f).set(this.f29112c, f14);
                return;
        }
    }
}
