package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class gx extends z4.h {
    public final tz f26735w0;

    public gx(tz tzVar, Context context) {
        super(context);
        this.f26735w0 = tzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26735w0.f30974f) {
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
        tz tzVar = this.f26735w0;
        vx vxVar = tzVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        tz.a(tzVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                tzVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vxVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(bs.h);
                ofFloat.start();
                tzVar.F(1, 0);
                if (vxVar != null) {
                    vxVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                tzVar.f30981h0.x0(0);
                return;
            } else {
                tzVar.D0.x0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
