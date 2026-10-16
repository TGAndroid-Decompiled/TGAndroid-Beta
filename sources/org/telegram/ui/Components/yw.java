package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class yw extends mm0 {
    public boolean V2;
    public boolean W2;
    public final wz X2;

    public yw(wz wzVar, Context context) {
        super(context, null);
        this.X2 = wzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.X2;
        boolean r10 = q6.r(motionEvent, wzVar.f30722h0, wzVar.f30721g2, this.f27148n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        wz wzVar = this.X2;
        if (wzVar.f30748q0 && wzVar.f30739n0.G > 1) {
            this.V2 = true;
            wzVar.f30725i0.h1(0, 0);
            wzVar.f30742o0.setVisibility(0);
            wzVar.f30745p0.k(0, 0);
            wzVar.f30748q0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        wz.f(wzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.W2) {
            this.X2.f30739n0.l();
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
