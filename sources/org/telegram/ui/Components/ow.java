package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ow extends wl0 {
    public boolean X2;
    public boolean Y2;
    public final lz Z2;

    public ow(lz lzVar, Context context) {
        super(context, null);
        this.Z2 = lzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        lz lzVar = this.Z2;
        boolean r10 = q6.r(motionEvent, lzVar.f26244h0, lzVar.f26243g2, this.f30094p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        lz lzVar = this.Z2;
        if (lzVar.f26270q0 && lzVar.f26261n0.G > 1) {
            this.X2 = true;
            lzVar.f26247i0.h1(0, 0);
            lzVar.f26264o0.setVisibility(0);
            lzVar.f26267p0.k(0, 0);
            lzVar.f26270q0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        lz.f(lzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.Y2) {
            this.Z2.f26261n0.l();
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
