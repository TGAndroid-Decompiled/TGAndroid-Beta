package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends zl0 {
    public boolean f30275e3;
    public boolean f30276f3;
    public final nz f30277g3;

    public qw(nz nzVar, Context context) {
        super(context, null);
        this.f30277g3 = nzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        nz nzVar = this.f30277g3;
        boolean r10 = q6.r(motionEvent, nzVar.f29210h0, nzVar.f29209g2, this.f33560p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.f30277g3;
        if (nzVar.f29236q0 && nzVar.f29227n0.G > 1) {
            this.f30275e3 = true;
            nzVar.f29213i0.h1(0, 0);
            nzVar.f29230o0.setVisibility(0);
            nzVar.f29233p0.k(0, 0);
            nzVar.f29236q0 = false;
            this.f30275e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nz.f(nzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f30276f3) {
            this.f30277g3.f29227n0.l();
            this.f30276f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f30275e3) {
            return;
        }
        super.requestLayout();
    }
}
