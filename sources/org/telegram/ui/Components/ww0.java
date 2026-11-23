package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ww0 extends ek0 {
    public boolean f41746f3;
    public boolean f41747g3;
    public final zw0 f41748h3;

    public ww0(zw0 zw0Var, Context context) {
        super(context, null);
        this.f41748h3 = zw0Var;
    }

    @Override
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f41746f3 == canScrollHorizontally && this.f41747g3 == canScrollHorizontally2) {
            return;
        }
        bi.g3 g3Var = this.f41748h3.d;
        if (g3Var != null) {
            g3Var.invalidate();
        }
        this.f41746f3 = canScrollHorizontally;
        this.f41747g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ls previewDelegate;
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        zw0 zw0Var = this.f41748h3;
        ww0 ww0Var = zw0Var.f43061e;
        previewDelegate = zw0Var.getPreviewDelegate();
        boolean q10 = p10.q(motionEvent, ww0Var, previewDelegate, this.f34767o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }
}
