package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class uy0 extends vl0 {
    public boolean X2;
    public boolean Y2;
    public final yy0 Z2;

    public uy0(yy0 yy0Var, Context context) {
        super(context, null);
        this.Z2 = yy0Var;
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
        org.telegram.ui.qt previewDelegate;
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        yy0 yy0Var = this.Z2;
        uy0 uy0Var = yy0Var.e;
        previewDelegate = yy0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, uy0Var, previewDelegate, this.f29207p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
