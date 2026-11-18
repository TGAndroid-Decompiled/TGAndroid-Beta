package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class vw0 extends ck0 {
    public boolean f41468f3;
    public boolean f41469g3;
    public final yw0 f41470h3;

    public vw0(yw0 yw0Var, Context context) {
        super(context, null);
        this.f41470h3 = yw0Var;
    }

    @Override
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f41468f3 == canScrollHorizontally && this.f41469g3 == canScrollHorizontally2) {
            return;
        }
        bi.a3 a3Var = this.f41470h3.d;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        this.f41468f3 = canScrollHorizontally;
        this.f41469g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ls previewDelegate;
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        yw0 yw0Var = this.f41470h3;
        vw0 vw0Var = yw0Var.f42650e;
        previewDelegate = yw0Var.getPreviewDelegate();
        boolean q10 = p10.q(motionEvent, vw0Var, previewDelegate, this.f34074o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }
}
