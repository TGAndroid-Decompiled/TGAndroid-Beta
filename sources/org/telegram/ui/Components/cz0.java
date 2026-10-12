package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class cz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25060a;
    public final com.google.firebase.messaging.n f25061b;
    public final int f25062c;

    public cz0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.f25060a = i11;
        this.f25061b = nVar;
        this.f25062c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25060a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f25061b.d).set(this.f25062c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f25061b.f7953e).set(this.f25062c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f25061b.f7954f).set(this.f25062c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f25061b.d).set(this.f25062c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f25061b.f7953e).set(this.f25062c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f25061b.f7954f).set(this.f25062c, f14);
                return;
        }
    }
}
