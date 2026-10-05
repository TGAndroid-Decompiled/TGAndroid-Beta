package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class cx extends z4.g {
    public final nz f25544w0;

    public cx(nz nzVar, Context context) {
        super(context);
        this.f25544w0 = nzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f25544w0.f29203f) {
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
        nz nzVar = this.f25544w0;
        rx rxVar = nzVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        nz.a(nzVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                nzVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rxVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(tr.h);
                ofFloat.start();
                nzVar.E(1, 0);
                if (rxVar != null) {
                    rxVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                nzVar.f29210h0.y0(0);
                return;
            } else {
                nzVar.D0.y0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
