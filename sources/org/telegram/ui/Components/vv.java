package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class vv extends c5.k {
    public final gy f39693w0;

    public vv(gy gyVar, Context context) {
        super(context);
        this.f39693w0 = gyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f39693w0.f34032f) {
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
        gy gyVar = this.f39693w0;
        kw kwVar = gyVar.I;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        gy.a(gyVar, z10);
        if (i7 == getCurrentItem()) {
            if (i7 == 0) {
                gyVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
                gyVar.G(1, 0);
                if (kwVar != null) {
                    kwVar.j(0, true);
                    return;
                }
                return;
            } else if (i7 == 1) {
                gyVar.f34039h0.y0(0);
                return;
            } else {
                gyVar.D0.y0(1);
                return;
            }
        }
        super.x(i7, z9);
    }
}
