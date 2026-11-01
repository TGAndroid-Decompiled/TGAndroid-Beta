package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qx0 extends uk0 {
    public boolean f29820e3;
    public boolean f29821f3;
    public final tx0 f29822g3;

    public qx0(tx0 tx0Var, Context context) {
        super(context, null);
        this.f29822g3 = tx0Var;
    }

    @Override
    public final void l0(int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f29820e3 == canScrollHorizontally && this.f29821f3 == canScrollHorizontally2) {
            return;
        }
        jg.l0 l0Var = this.f29822g3.d;
        if (l0Var != null) {
            l0Var.invalidate();
        }
        this.f29820e3 = canScrollHorizontally;
        this.f29821f3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht previewDelegate;
        org.telegram.ui.kt p5 = org.telegram.ui.kt.p();
        tx0 tx0Var = this.f29822g3;
        qx0 qx0Var = tx0Var.e;
        previewDelegate = tx0Var.getPreviewDelegate();
        boolean q6 = p5.q(motionEvent, qx0Var, previewDelegate, this.f31008n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
            return false;
        }
        return true;
    }
}
