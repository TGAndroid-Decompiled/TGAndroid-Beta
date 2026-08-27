package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

public final class sx0 extends zk0 {
    public boolean T2;
    public boolean U2;
    public final wx0 V2;

    public sx0(wx0 wx0Var, Context context) {
        super(context, null);
        this.V2 = wx0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean zCanScrollHorizontally = canScrollHorizontally(-1);
        boolean zCanScrollHorizontally2 = canScrollHorizontally(1);
        if (this.T2 == zCanScrollHorizontally && this.U2 == zCanScrollHorizontally2) {
            return;
        }
        ag.p1 p1Var = this.V2.d;
        if (p1Var != null) {
            p1Var.invalidate();
        }
        this.T2 = zCanScrollHorizontally;
        this.U2 = zCanScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
        wx0 wx0Var = this.V2;
        return super.onInterceptTouchEvent(motionEvent) || ktVarQ.r(motionEvent, wx0Var.f34366e, wx0Var.getPreviewDelegate(), this.f35277l2);
    }
}
