package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class kx extends z4.g {
    public final wz f26824w0;

    public kx(wz wzVar, Context context) {
        super(context);
        this.f26824w0 = wzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26824w0.f31022f) {
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
        wz wzVar = this.f26824w0;
        zx zxVar = wzVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        wz.c(wzVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                wzVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zxVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(es.h);
                ofFloat.start();
                wzVar.G(1, 0);
                if (zxVar != null) {
                    zxVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                wzVar.f31029h0.x0(0);
                return;
            } else {
                wzVar.D0.x0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
