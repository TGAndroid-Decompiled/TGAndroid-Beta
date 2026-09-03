package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class my0 extends sl0 {
    public boolean U2;
    public boolean V2;
    public final qy0 W2;

    public my0(qy0 qy0Var, Context context) {
        super(context, null);
        this.W2 = qy0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.U2 == canScrollHorizontally && this.V2 == canScrollHorizontally2) {
            return;
        }
        eg.s2 s2Var = this.W2.d;
        if (s2Var != null) {
            s2Var.invalidate();
        }
        this.U2 = canScrollHorizontally;
        this.V2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ot previewDelegate;
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        qy0 qy0Var = this.W2;
        my0 my0Var = qy0Var.f30562e;
        previewDelegate = qy0Var.getPreviewDelegate();
        boolean r10 = q10.r(motionEvent, my0Var, previewDelegate, this.f31106m2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
