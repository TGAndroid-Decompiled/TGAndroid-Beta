package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class xw extends m2.h {
    public final mz f33187t0;

    public xw(mz mzVar, Context context) {
        super(context);
        this.f33187t0 = mzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f33187t0.f29281f) {
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
    public final void x(int i10, boolean z4) {
        boolean z10;
        mz mzVar = this.f33187t0;
        hw hwVar = mzVar.F;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        mz.a(mzVar, z10);
        if (i10 == getCurrentItem()) {
            if (i10 == 0) {
                mzVar.N0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hwVar, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(pr.h);
                ofFloat.start();
                mzVar.H(1, 0);
                if (hwVar != null) {
                    hwVar.j(0, true);
                    return;
                }
                return;
            } else if (i10 == 1) {
                mzVar.f29278e0.x0(0);
                return;
            } else {
                mzVar.A0.x0(1);
                return;
            }
        }
        super.x(i10, z4);
    }
}
