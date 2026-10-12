package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class cz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25052a;
    public final com.google.firebase.messaging.n f25053b;
    public final int f25054c;

    public cz0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f25052a = i11;
        this.f25053b = nVar;
        this.f25054c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25052a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f25053b.d).set(this.f25054c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f25053b.f7953e).set(this.f25054c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f25053b.f7954f).set(this.f25054c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f25053b.d).set(this.f25054c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f25053b.f7953e).set(this.f25054c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f25053b.f7954f).set(this.f25054c, f14);
                return;
        }
    }
}
