package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class nw extends wl0 {
    public boolean X2;
    public boolean Y2;
    public final lz Z2;

    public nw(lz lzVar, Context context) {
        super(context, null);
        this.Z2 = lzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        lz lzVar = this.Z2;
        boolean r10 = q6.r(motionEvent, lzVar.f26252h0, lzVar.f26251g2, this.f30115p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        lz lzVar = this.Z2;
        if (lzVar.f26278q0 && lzVar.f26269n0.G > 1) {
            this.X2 = true;
            lzVar.f26255i0.h1(0, 0);
            lzVar.f26272o0.setVisibility(0);
            lzVar.f26275p0.k(0, 0);
            lzVar.f26278q0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        lz.f(lzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.Y2) {
            this.Z2.f26269n0.l();
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
