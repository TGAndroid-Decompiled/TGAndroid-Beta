package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qx0 extends wk0 {
    public boolean T2;
    public boolean U2;
    public final ux0 V2;

    public qx0(ux0 ux0Var, Context context) {
        super(context, null);
        this.V2 = ux0Var;
    }

    @Override
    public final void k0(int i9, int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.T2 == canScrollHorizontally && this.U2 == canScrollHorizontally2) {
            return;
        }
        fh.d2 d2Var = this.V2.d;
        if (d2Var != null) {
            d2Var.invalidate();
        }
        this.T2 = canScrollHorizontally;
        this.U2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft previewDelegate;
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        ux0 ux0Var = this.V2;
        qx0 qx0Var = ux0Var.f33161e;
        previewDelegate = ux0Var.getPreviewDelegate();
        boolean r10 = q10.r(motionEvent, qx0Var, previewDelegate, this.f34260l2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
