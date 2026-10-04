package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends zl0 {
    public boolean f30175e3;
    public boolean f30176f3;
    public final nz f30177g3;

    public qw(nz nzVar, Context context) {
        super(context, null);
        this.f30177g3 = nzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        nz nzVar = this.f30177g3;
        boolean r10 = q6.r(motionEvent, nzVar.f29107h0, nzVar.f29106g2, this.f33545p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.f30177g3;
        if (nzVar.f29133q0 && nzVar.f29124n0.G > 1) {
            this.f30175e3 = true;
            nzVar.f29110i0.h1(0, 0);
            nzVar.f29127o0.setVisibility(0);
            nzVar.f29130p0.k(0, 0);
            nzVar.f29133q0 = false;
            this.f30175e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nz.f(nzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f30176f3) {
            this.f30177g3.f29124n0.l();
            this.f30176f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f30175e3) {
            return;
        }
        super.requestLayout();
    }
}
