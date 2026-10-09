package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class ox extends z4.g {
    public final a00 f29598w0;

    public ox(a00 a00Var, Context context) {
        super(context);
        this.f29598w0 = a00Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f29598w0.f24410f) {
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
        a00 a00Var = this.f29598w0;
        ey eyVar = a00Var.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        a00.a(a00Var, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                a00Var.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eyVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(hs.h);
                ofFloat.start();
                a00Var.G(1, 0);
                if (eyVar != null) {
                    eyVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                a00Var.f24417h0.x0(0);
                return;
            } else {
                a00Var.D0.x0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
