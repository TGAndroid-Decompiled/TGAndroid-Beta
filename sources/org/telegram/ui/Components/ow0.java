package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ow0 extends uj0 {
    public boolean f38094f3;
    public boolean f38095g3;
    public final rw0 f38096h3;

    public ow0(rw0 rw0Var, Context context) {
        super(context, null);
        this.f38096h3 = rw0Var;
    }

    @Override
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f38094f3 == canScrollHorizontally && this.f38095g3 == canScrollHorizontally2) {
            return;
        }
        bi.g2 g2Var = this.f38096h3.d;
        if (g2Var != null) {
            g2Var.invalidate();
        }
        this.f38094f3 = canScrollHorizontally;
        this.f38095g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ls previewDelegate;
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        rw0 rw0Var = this.f38096h3;
        ow0 ow0Var = rw0Var.f39079e;
        previewDelegate = rw0Var.getPreviewDelegate();
        boolean q10 = p10.q(motionEvent, ow0Var, previewDelegate, this.f40069o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }
}
