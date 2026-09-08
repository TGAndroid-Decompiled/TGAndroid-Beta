package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class iy0 extends ll0 {
    public boolean X2;
    public boolean Y2;
    public final my0 Z2;

    public iy0(my0 my0Var, Context context) {
        super(context, null);
        this.Z2 = my0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.X2 == canScrollHorizontally && this.Y2 == canScrollHorizontally2) {
            return;
        }
        ah.y yVar = this.Z2.d;
        if (yVar != null) {
            yVar.invalidate();
        }
        this.X2 = canScrollHorizontally;
        this.Y2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.qt previewDelegate;
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        my0 my0Var = this.Z2;
        iy0 iy0Var = my0Var.f28589e;
        previewDelegate = my0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, iy0Var, previewDelegate, this.f28251p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
