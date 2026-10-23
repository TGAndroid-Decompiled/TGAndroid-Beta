package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class uw extends mm0 {
    public boolean Y2;
    public boolean Z2;
    public final tz f31227a3;

    public uw(tz tzVar, Context context) {
        super(context, null);
        this.f31227a3 = tzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        tz tzVar = this.f31227a3;
        boolean p5 = o10.p(motionEvent, tzVar.f30981h0, tzVar.f30980g2, this.f28705n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !p5) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tz tzVar = this.f31227a3;
        if (tzVar.f31007q0 && tzVar.f30998n0.G > 1) {
            this.Y2 = true;
            tzVar.f30984i0.h1(0, 0);
            tzVar.f31001o0.setVisibility(0);
            tzVar.f31004p0.k(0, 0);
            tzVar.f31007q0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        tz.f(tzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.Z2) {
            this.f31227a3.f30998n0.l();
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
