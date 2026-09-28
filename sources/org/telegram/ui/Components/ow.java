package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ow extends yl0 {
    public boolean X2;
    public boolean Y2;
    public final mz Z2;

    public ow(mz mzVar, Context context) {
        super(context, null);
        this.Z2 = mzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        mz mzVar = this.Z2;
        boolean r10 = q6.r(motionEvent, mzVar.f26548h0, mzVar.f26547g2, this.f30705p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mz mzVar = this.Z2;
        if (mzVar.f26574q0 && mzVar.f26565n0.G > 1) {
            this.X2 = true;
            mzVar.f26551i0.h1(0, 0);
            mzVar.f26568o0.setVisibility(0);
            mzVar.f26571p0.k(0, 0);
            mzVar.f26574q0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        mz.f(mzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.Y2) {
            this.Z2.f26565n0.l();
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
