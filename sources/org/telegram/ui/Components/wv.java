package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class wv extends c5.k {
    public final hy f40057w0;

    public wv(hy hyVar, Context context) {
        super(context);
        this.f40057w0 = hyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f40057w0.f34408f) {
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
    public final void x(int i7, boolean z9) {
        boolean z10;
        hy hyVar = this.f40057w0;
        lw lwVar = hyVar.I;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        hy.a(hyVar, z10);
        if (i7 == getCurrentItem()) {
            if (i7 == 0) {
                hyVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
                hyVar.G(1, 0);
                if (lwVar != null) {
                    lwVar.j(0, true);
                    return;
                }
                return;
            } else if (i7 == 1) {
                hyVar.f34415h0.y0(0);
                return;
            } else {
                hyVar.D0.y0(1);
                return;
            }
        }
        super.x(i7, z9);
    }
}
