package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class rx extends z4.g {
    public final d00 f30273w0;

    public rx(d00 d00Var, Context context) {
        super(context);
        this.f30273w0 = d00Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30273w0.f25089f) {
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
        d00 d00Var = this.f30273w0;
        hy hyVar = d00Var.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        d00.a(d00Var, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                d00Var.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hyVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(js.h);
                ofFloat.start();
                d00Var.G(1, 0);
                if (hyVar != null) {
                    hyVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                d00Var.f25096h0.x0(0);
                return;
            } else {
                d00Var.D0.x0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
