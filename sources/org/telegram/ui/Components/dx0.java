package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class dx0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f27870a;

    public final com.google.firebase.messaging.m f27871b;

    public final int f27872c;

    public dx0(com.google.firebase.messaging.m mVar, int i10, int i11) {
        this.f27870a = i11;
        this.f27871b = mVar;
        this.f27872c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27870a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f27871b.d;
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                arrayList.set(this.f27872c, f10);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.f27871b.f4605e;
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                arrayList2.set(this.f27872c, f11);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) this.f27871b.f4606f;
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                arrayList3.set(this.f27872c, f12);
                break;
            case 3:
                ArrayList arrayList4 = (ArrayList) this.f27871b.d;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                arrayList4.set(this.f27872c, f13);
                break;
            case 4:
                ArrayList arrayList5 = (ArrayList) this.f27871b.f4605e;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                arrayList5.set(this.f27872c, f14);
                break;
            default:
                ArrayList arrayList6 = (ArrayList) this.f27871b.f4606f;
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                arrayList6.set(this.f27872c, f15);
                break;
        }
    }
}
