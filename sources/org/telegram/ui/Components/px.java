package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class px extends z4.g {
    public final b00 f29988w0;

    public px(b00 b00Var, Context context) {
        super(context);
        this.f29988w0 = b00Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f29988w0.f24740f) {
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
        b00 b00Var = this.f29988w0;
        fy fyVar = b00Var.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        b00.a(b00Var, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                b00Var.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fyVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(is.h);
                ofFloat.start();
                b00Var.G(1, 0);
                if (fyVar != null) {
                    fyVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                b00Var.f24747h0.x0(0);
                return;
            } else {
                b00Var.D0.x0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
