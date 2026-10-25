package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class uw extends mm0 {
    public boolean f33499f3;
    public boolean f33500g3;
    public final sz f33501h3;

    public uw(sz szVar, Context context) {
        super(context, null);
        this.f33501h3 = szVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        sz szVar = this.f33501h3;
        boolean p10 = o10.p(motionEvent, szVar.f32731h0, szVar.f32730g2, this.f30644n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !p10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        sz szVar = this.f33501h3;
        if (szVar.f32757q0 && szVar.f32748n0.G > 1) {
            this.f33499f3 = true;
            szVar.f32734i0.h1(0, 0);
            szVar.f32751o0.setVisibility(0);
            szVar.f32754p0.k(0, 0);
            szVar.f32757q0 = false;
            this.f33499f3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        sz.f(szVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f33500g3) {
            this.f33501h3.f32748n0.l();
            this.f33500g3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f33499f3) {
            return;
        }
        super.requestLayout();
    }
}
