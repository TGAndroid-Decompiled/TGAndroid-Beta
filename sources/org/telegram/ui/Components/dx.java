package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class dx extends sm0 {
    public boolean V2;
    public boolean W2;
    public final b00 X2;

    public dx(b00 b00Var, Context context) {
        super(context, null);
        this.X2 = b00Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
        b00 b00Var = this.X2;
        boolean r10 = q6.r(motionEvent, b00Var.f24678h0, b00Var.f24677g2, this.f30807n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b00 b00Var = this.X2;
        if (b00Var.f24704q0 && b00Var.f24695n0.G > 1) {
            this.V2 = true;
            b00Var.f24681i0.h1(0, 0);
            b00Var.f24698o0.setVisibility(0);
            b00Var.f24701p0.k(0, 0);
            b00Var.f24704q0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        b00.f(b00Var, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.W2) {
            this.X2.f24695n0.l();
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
