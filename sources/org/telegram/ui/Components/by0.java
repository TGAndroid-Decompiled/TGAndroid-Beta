package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class by0 extends jl0 {
    public boolean T2;
    public boolean U2;
    public final fy0 V2;

    public by0(fy0 fy0Var, Context context) {
        super(context, null);
        this.V2 = fy0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.T2 == canScrollHorizontally && this.U2 == canScrollHorizontally2) {
            return;
        }
        bg.x2 x2Var = this.V2.d;
        if (x2Var != null) {
            x2Var.invalidate();
        }
        this.T2 = canScrollHorizontally;
        this.U2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft previewDelegate;
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
        fy0 fy0Var = this.V2;
        by0 by0Var = fy0Var.f28566e;
        previewDelegate = fy0Var.getPreviewDelegate();
        boolean r6 = q6.r(motionEvent, by0Var, previewDelegate, this.f29709l2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r6) {
            return false;
        }
        return true;
    }
}
