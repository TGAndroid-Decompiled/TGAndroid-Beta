package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class cx extends qm0 {
    public boolean V2;
    public boolean W2;
    public final a00 X2;

    public cx(a00 a00Var, Context context) {
        super(context, null);
        this.X2 = a00Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        a00 a00Var = this.X2;
        boolean r10 = q6.r(motionEvent, a00Var.f24417h0, a00Var.f24416g2, this.f30216n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a00 a00Var = this.X2;
        if (a00Var.f24443q0 && a00Var.f24434n0.G > 1) {
            this.V2 = true;
            a00Var.f24420i0.h1(0, 0);
            a00Var.f24437o0.setVisibility(0);
            a00Var.f24440p0.k(0, 0);
            a00Var.f24443q0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        a00.f(a00Var, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.W2) {
            this.X2.f24434n0.l();
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
