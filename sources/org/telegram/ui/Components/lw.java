package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class lw extends tl0 {
    public boolean U2;
    public boolean V2;
    public final mz W2;

    public lw(mz mzVar, Context context) {
        super(context, null);
        this.W2 = mzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        mz mzVar = this.W2;
        boolean r10 = q10.r(motionEvent, mzVar.f29278e0, mzVar.f29276d2, this.f31383m2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        mz mzVar = this.W2;
        if (mzVar.f29305n0 && mzVar.f29297k0.D > 1) {
            this.U2 = true;
            mzVar.f29282f0.h1(0, 0);
            mzVar.f29300l0.setVisibility(0);
            mzVar.m0.k(0, 0);
            mzVar.f29305n0 = false;
            this.U2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        mz.f(mzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.V2) {
            this.W2.f29297k0.l();
            this.V2 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
