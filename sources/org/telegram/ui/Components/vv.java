package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class vv extends ek0 {
    public boolean f41437f3;
    public boolean f41438g3;
    public final qy f41439h3;

    public vv(qy qyVar, Context context) {
        super(context, null);
        this.f41439h3 = qyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        qy qyVar = this.f41439h3;
        boolean q10 = p10.q(motionEvent, qyVar.f39062i0, qyVar.f39061h2, this.f34767o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        qy qyVar = this.f41439h3;
        if (qyVar.f39088r0 && qyVar.f39078o0.H > 1) {
            this.f41437f3 = true;
            qyVar.f39065j0.h1(0, 0);
            qyVar.f39081p0.setVisibility(0);
            qyVar.f39084q0.k(0, 0);
            qyVar.f39088r0 = false;
            this.f41437f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        qy.f(qyVar, true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f41438g3) {
            this.f41439h3.f39078o0.f();
            this.f41438g3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f41437f3) {
            return;
        }
        super.requestLayout();
    }
}
