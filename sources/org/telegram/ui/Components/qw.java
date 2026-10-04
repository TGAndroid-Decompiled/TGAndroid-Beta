package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends zl0 {
    public boolean f30176e3;
    public boolean f30177f3;
    public final nz f30178g3;

    public qw(nz nzVar, Context context) {
        super(context, null);
        this.f30178g3 = nzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        nz nzVar = this.f30178g3;
        boolean r10 = q6.r(motionEvent, nzVar.f29108h0, nzVar.f29107g2, this.f33546p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.f30178g3;
        if (nzVar.f29134q0 && nzVar.f29125n0.G > 1) {
            this.f30176e3 = true;
            nzVar.f29111i0.h1(0, 0);
            nzVar.f29128o0.setVisibility(0);
            nzVar.f29131p0.k(0, 0);
            nzVar.f29134q0 = false;
            this.f30176e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nz.f(nzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f30177f3) {
            this.f30178g3.f29125n0.l();
            this.f30177f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f30176e3) {
            return;
        }
        super.requestLayout();
    }
}
