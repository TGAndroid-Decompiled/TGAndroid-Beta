package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class zw extends z4.g {
    public final kz f30971w0;

    public zw(kz kzVar, Context context) {
        super(context);
        this.f30971w0 = kzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30971w0.f25866f) {
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
        kz kzVar = this.f30971w0;
        ox oxVar = kzVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        kz.a(kzVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                kzVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oxVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(qr.h);
                ofFloat.start();
                kzVar.F(1, 0);
                if (oxVar != null) {
                    oxVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                kzVar.f25873h0.y0(0);
                return;
            } else {
                kzVar.D0.y0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
