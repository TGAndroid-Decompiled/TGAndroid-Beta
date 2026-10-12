package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class sy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29230a;
    public final com.google.firebase.messaging.m f29231b;
    public final int f29232c;

    public sy0(com.google.firebase.messaging.m mVar, int i10, int i11) {
        this.f29230a = i11;
        this.f29231b = mVar;
        this.f29232c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29230a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f29231b.d).set(this.f29232c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f29231b.e).set(this.f29232c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f29231b.f6194f).set(this.f29232c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f29231b.d).set(this.f29232c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f29231b.e).set(this.f29232c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f29231b.f6194f).set(this.f29232c, f14);
                return;
        }
    }
}
