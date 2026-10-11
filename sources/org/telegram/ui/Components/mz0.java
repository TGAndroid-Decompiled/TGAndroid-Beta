package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class mz0 extends sm0 {
    public boolean V2;
    public boolean W2;
    public final qz0 X2;

    public mz0(qz0 qz0Var, Context context) {
        super(context, null);
        this.X2 = qz0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.V2 == canScrollHorizontally && this.W2 == canScrollHorizontally2) {
            return;
        }
        ai.f0 f0Var = this.X2.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        this.V2 = canScrollHorizontally;
        this.W2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ot previewDelegate;
        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
        qz0 qz0Var = this.X2;
        mz0 mz0Var = qz0Var.f30275e;
        previewDelegate = qz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, mz0Var, previewDelegate, this.f30807n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
