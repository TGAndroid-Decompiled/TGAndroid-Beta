package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class hw extends c5.l {
    public final ry f35996x0;

    public hw(ry ryVar, Context context) {
        super(context);
        this.f35996x0 = ryVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f35996x0.f39350f) {
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
    public final void x(int i7, boolean z10) {
        boolean z11;
        ry ryVar = this.f35996x0;
        ww wwVar = ryVar.J;
        if (i7 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        ry.a(ryVar, z11);
        if (i7 == getCurrentItem()) {
            if (i7 == 0) {
                ryVar.R0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(lr.h);
                ofFloat.start();
                ryVar.G(1, 0);
                if (wwVar != null) {
                    wwVar.j(0, true);
                    return;
                }
                return;
            } else if (i7 == 1) {
                ryVar.f39360i0.y0(0);
                return;
            } else {
                ryVar.E0.y0(1);
                return;
            }
        }
        super.x(i7, z10);
    }
}
