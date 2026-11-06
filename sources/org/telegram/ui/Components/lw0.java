package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class lw0 extends pj0 {
    public boolean f35757e3;
    public boolean f35758f3;
    public final ow0 f35759g3;

    public lw0(ow0 ow0Var, Context context) {
        super(context, null);
        this.f35759g3 = ow0Var;
    }

    @Override
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f35757e3 == canScrollHorizontally && this.f35758f3 == canScrollHorizontally2) {
            return;
        }
        bi.e5 e5Var = this.f35759g3.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
        this.f35757e3 = canScrollHorizontally;
        this.f35758f3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.is previewDelegate;
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        ow0 ow0Var = this.f35759g3;
        lw0 lw0Var = ow0Var.f36674e;
        previewDelegate = ow0Var.getPreviewDelegate();
        boolean q10 = p10.q(motionEvent, lw0Var, previewDelegate, this.f36939n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }
}
