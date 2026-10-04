package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ez0 extends zl0 {
    public boolean f26182e3;
    public boolean f26183f3;
    public final iz0 f26184g3;

    public ez0(iz0 iz0Var, Context context) {
        super(context, null);
        this.f26184g3 = iz0Var;
    }

    @Override
    public final void l0(int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f26182e3 == canScrollHorizontally && this.f26183f3 == canScrollHorizontally2) {
            return;
        }
        ai.f0 f0Var = this.f26184g3.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        this.f26182e3 = canScrollHorizontally;
        this.f26183f3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.pt previewDelegate;
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        iz0 iz0Var = this.f26184g3;
        ez0 ez0Var = iz0Var.f27531e;
        previewDelegate = iz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, ez0Var, previewDelegate, this.f33545p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
