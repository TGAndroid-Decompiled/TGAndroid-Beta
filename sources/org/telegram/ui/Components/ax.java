package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class ax extends z4.g {
    public final mz f22797w0;

    public ax(mz mzVar, Context context) {
        super(context);
        this.f22797w0 = mzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22797w0.f26582f) {
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
        mz mzVar = this.f22797w0;
        px pxVar = mzVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        mz.a(mzVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                mzVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pxVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(sr.h);
                ofFloat.start();
                mzVar.G(1, 0);
                if (pxVar != null) {
                    pxVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                mzVar.f26589h0.y0(0);
                return;
            } else {
                mzVar.D0.y0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
