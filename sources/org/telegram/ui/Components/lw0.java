package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class lw0 extends tj0 {
    public boolean f35895f3;
    public boolean f35896g3;
    public final ow0 f35897h3;

    public lw0(ow0 ow0Var, Context context) {
        super(context, null);
        this.f35897h3 = ow0Var;
    }

    @Override
    public final void l0(int i3) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f35895f3 == canScrollHorizontally && this.f35896g3 == canScrollHorizontally2) {
            return;
        }
        kw0 kw0Var = this.f35897h3.d;
        if (kw0Var != null) {
            kw0Var.invalidate();
        }
        this.f35895f3 = canScrollHorizontally;
        this.f35896g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.gs previewDelegate;
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        ow0 ow0Var = this.f35897h3;
        lw0 lw0Var = ow0Var.f36965e;
        previewDelegate = ow0Var.getPreviewDelegate();
        boolean q10 = p10.q(motionEvent, lw0Var, previewDelegate, this.f38460o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }
}
