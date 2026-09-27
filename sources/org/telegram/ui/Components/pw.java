package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pw extends yl0 {
    public boolean X2;
    public boolean Y2;
    public final mz Z2;

    public pw(mz mzVar, Context context) {
        super(context, null);
        this.Z2 = mzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
        mz mzVar = this.Z2;
        boolean r10 = q6.r(motionEvent, mzVar.f26589h0, mzVar.f26588g2, this.f30709p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mz mzVar = this.Z2;
        if (mzVar.f26615q0 && mzVar.f26606n0.G > 1) {
            this.X2 = true;
            mzVar.f26592i0.h1(0, 0);
            mzVar.f26609o0.setVisibility(0);
            mzVar.f26612p0.k(0, 0);
            mzVar.f26615q0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        mz.f(mzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.Y2) {
            this.Z2.f26606n0.l();
            this.Y2 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }
}
