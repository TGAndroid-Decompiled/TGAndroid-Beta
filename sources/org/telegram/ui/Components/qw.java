package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends zl0 {
    public boolean f30182e3;
    public boolean f30183f3;
    public final nz f30184g3;

    public qw(nz nzVar, Context context) {
        super(context, null);
        this.f30184g3 = nzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        nz nzVar = this.f30184g3;
        boolean r10 = q6.r(motionEvent, nzVar.f29113h0, nzVar.f29112g2, this.f33552p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.f30184g3;
        if (nzVar.f29139q0 && nzVar.f29130n0.G > 1) {
            this.f30182e3 = true;
            nzVar.f29116i0.h1(0, 0);
            nzVar.f29133o0.setVisibility(0);
            nzVar.f29136p0.k(0, 0);
            nzVar.f29139q0 = false;
            this.f30182e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nz.f(nzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f30183f3) {
            this.f30184g3.f29130n0.l();
            this.f30183f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f30182e3) {
            return;
        }
        super.requestLayout();
    }
}
