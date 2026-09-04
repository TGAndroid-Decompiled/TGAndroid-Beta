package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class zw extends z4.g {
    public final kz f33250w0;

    public zw(kz kzVar, Context context) {
        super(context);
        this.f33250w0 = kzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f33250w0.f27941f) {
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
    public final void x(int i10, boolean z10) {
        boolean z11;
        kz kzVar = this.f33250w0;
        jw jwVar = kzVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        kz.c(kzVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                kzVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(pr.h);
                ofFloat.start();
                kzVar.I(1, 0);
                if (jwVar != null) {
                    jwVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                kzVar.f27948h0.x0(0);
                return;
            } else {
                kzVar.D0.x0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
