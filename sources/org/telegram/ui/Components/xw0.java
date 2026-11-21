package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class xw0 extends ek0 {
    public boolean f42240f3;
    public boolean f42241g3;
    public final ax0 f42242h3;

    public xw0(ax0 ax0Var, Context context) {
        super(context, null);
        this.f42242h3 = ax0Var;
    }

    @Override
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f42240f3 == canScrollHorizontally && this.f42241g3 == canScrollHorizontally2) {
            return;
        }
        bi.e3 e3Var = this.f42242h3.d;
        if (e3Var != null) {
            e3Var.invalidate();
        }
        this.f42240f3 = canScrollHorizontally;
        this.f42241g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ls previewDelegate;
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ax0 ax0Var = this.f42242h3;
        xw0 xw0Var = ax0Var.f33646e;
        previewDelegate = ax0Var.getPreviewDelegate();
        boolean q10 = p10.q(motionEvent, xw0Var, previewDelegate, this.f34875o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }
}
