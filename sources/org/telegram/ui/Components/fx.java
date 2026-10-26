package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class fx extends a5.m {
    public final sz f28324w0;

    public fx(sz szVar, Context context) {
        super(context);
        this.f28324w0 = szVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28324w0.f32727f) {
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
        sz szVar = this.f28324w0;
        ux uxVar = szVar.I;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        sz.a(szVar, z11);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                szVar.Q0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uxVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(ds.h);
                ofFloat.start();
                szVar.G(1, 0);
                if (uxVar != null) {
                    uxVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                szVar.f32734h0.y0(0);
                return;
            } else {
                szVar.D0.y0(1);
                return;
            }
        }
        super.x(i10, z10);
    }
}
