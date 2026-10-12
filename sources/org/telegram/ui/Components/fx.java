package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class fx extends wm0 {
    public boolean V2;
    public boolean W2;
    public final d00 X2;

    public fx(d00 d00Var, Context context) {
        super(context, null);
        this.X2 = d00Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        d00 d00Var = this.X2;
        boolean r10 = q6.r(motionEvent, d00Var.f25096h0, d00Var.f25095g2, this.f32467n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        d00 d00Var = this.X2;
        if (d00Var.f25122q0 && d00Var.f25113n0.G > 1) {
            this.V2 = true;
            d00Var.f25099i0.h1(0, 0);
            d00Var.f25116o0.setVisibility(0);
            d00Var.f25119p0.k(0, 0);
            d00Var.f25122q0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        d00.f(d00Var, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.W2) {
            this.X2.f25113n0.l();
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
