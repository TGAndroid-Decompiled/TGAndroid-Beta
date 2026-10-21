package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class uw extends jm0 {
    public boolean V2;
    public boolean W2;
    public final tz X2;

    public uw(tz tzVar, Context context) {
        super(context, null);
        this.X2 = tzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        tz tzVar = this.X2;
        boolean r10 = q6.r(motionEvent, tzVar.f30738h0, tzVar.f30737g2, this.f27579n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tz tzVar = this.X2;
        if (tzVar.f30764q0 && tzVar.f30755n0.G > 1) {
            this.V2 = true;
            tzVar.f30741i0.h1(0, 0);
            tzVar.f30758o0.setVisibility(0);
            tzVar.f30761p0.k(0, 0);
            tzVar.f30764q0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        tz.f(tzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.W2) {
            this.X2.f30755n0.l();
            this.W2 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
