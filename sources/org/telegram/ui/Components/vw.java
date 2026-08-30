package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class vw extends m2.h {
    public final kz f30098t0;

    public vw(kz kzVar, Context context) {
        super(context);
        this.f30098t0 = kzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30098t0.f26426f) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override
    public final void x(int i10, boolean z4) {
        boolean z10;
        kz kzVar = this.f30098t0;
        fw fwVar = kzVar.F;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        kz.a(kzVar, z10);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                kzVar.N0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(nr.h);
                ofFloat.start();
                kzVar.H(1, 0);
                if (fwVar != null) {
                    fwVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                kzVar.f26423e0.x0(0);
                return;
            } else {
                kzVar.A0.x0(1);
                return;
            }
        }
        super.x(i10, z4);
    }
}
