package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class sw extends lm0 {
    public boolean Y2;
    public boolean Z2;
    public final rz f30632a3;

    public sw(rz rzVar, Context context) {
        super(context, null);
        this.f30632a3 = rzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        rz rzVar = this.f30632a3;
        boolean p5 = o10.p(motionEvent, rzVar.f30325h0, rzVar.f30324g2, this.f28396n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !p5) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rz rzVar = this.f30632a3;
        if (rzVar.f30351q0 && rzVar.f30342n0.G > 1) {
            this.Y2 = true;
            rzVar.f30328i0.h1(0, 0);
            rzVar.f30345o0.setVisibility(0);
            rzVar.f30348p0.k(0, 0);
            rzVar.f30351q0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        rz.f(rzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.Z2) {
            this.f30632a3.f30342n0.l();
            this.Z2 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
