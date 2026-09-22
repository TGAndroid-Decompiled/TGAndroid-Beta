package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class jy0 extends ll0 {
    public boolean X2;
    public boolean Y2;
    public final ny0 Z2;

    public jy0(ny0 ny0Var, Context context) {
        super(context, null);
        this.Z2 = ny0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
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
        ny0 ny0Var = this.Z2;
        jy0 jy0Var = ny0Var.e;
        previewDelegate = ny0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, jy0Var, previewDelegate, this.f25969p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
