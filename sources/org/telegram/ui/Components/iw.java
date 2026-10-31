package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class iw extends z4.g {
    public final vy f27108w0;

    public iw(vy vyVar, Context context) {
        super(context);
        this.f27108w0 = vyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27108w0.f31873f) {
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
        vy vyVar = this.f27108w0;
        zw zwVar = vyVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        vy.a(vyVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                vyVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(gr.h);
                ofFloat.start();
                vyVar.H(1, 0);
                if (zwVar != null) {
                    zwVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                vyVar.f31880h0.y0(0);
                return;
            } else {
                vyVar.D0.y0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
