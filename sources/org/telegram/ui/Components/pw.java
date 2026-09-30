package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pw extends zl0 {
    public boolean f27476e3;
    public boolean f27477f3;
    public final nz f27478g3;

    public pw(nz nzVar, Context context) {
        super(context, null);
        this.f27478g3 = nzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        nz nzVar = this.f27478g3;
        boolean r10 = q6.r(motionEvent, nzVar.f26833h0, nzVar.f26832g2, this.f31015p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.f27478g3;
        if (nzVar.f26859q0 && nzVar.f26850n0.G > 1) {
            this.f27476e3 = true;
            nzVar.f26836i0.h1(0, 0);
            nzVar.f26853o0.setVisibility(0);
            nzVar.f26856p0.k(0, 0);
            nzVar.f26859q0 = false;
            this.f27476e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nz.f(nzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f27477f3) {
            this.f27478g3.f26850n0.l();
            this.f27477f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f27476e3) {
            return;
        }
        super.requestLayout();
    }
}
