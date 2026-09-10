package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class ex extends z4.g {
    public final rz f22776w0;

    public ex(rz rzVar, Context context) {
        super(context);
        this.f22776w0 = rzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22776w0.f26813f) {
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
        rz rzVar = this.f22776w0;
        ow owVar = rzVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        rz.a(rzVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                rzVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(owVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(wr.h);
                ofFloat.start();
                rzVar.I(1, 0);
                if (owVar != null) {
                    owVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                rzVar.f26820h0.x0(0);
                return;
            } else {
                rzVar.D0.x0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
