package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ky0 extends ml0 {
    public boolean X2;
    public boolean Y2;
    public final oy0 Z2;

    public ky0(oy0 oy0Var, Context context) {
        super(context, null);
        this.Z2 = oy0Var;
    }

    @Override
    public final void l0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.X2 == canScrollHorizontally && this.Y2 == canScrollHorizontally2) {
            return;
        }
        ai.f0 f0Var = this.Z2.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        this.X2 = canScrollHorizontally;
        this.Y2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.st previewDelegate;
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        oy0 oy0Var = this.Z2;
        ky0 ky0Var = oy0Var.e;
        previewDelegate = oy0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, ky0Var, previewDelegate, this.f26194p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
