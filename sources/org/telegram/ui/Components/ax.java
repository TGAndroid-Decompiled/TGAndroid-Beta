package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class ax extends z4.g {
    public final lz f22807w0;

    public ax(lz lzVar, Context context) {
        super(context);
        this.f22807w0 = lzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22807w0.f26237f) {
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
        lz lzVar = this.f22807w0;
        px pxVar = lzVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        lz.a(lzVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                lzVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pxVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(rr.h);
                ofFloat.start();
                lzVar.G(1, 0);
                if (pxVar != null) {
                    pxVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                lzVar.f26244h0.x0(0);
                return;
            } else {
                lzVar.D0.x0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
