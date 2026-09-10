package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class vy0 extends vl0 {
    public boolean X2;
    public boolean Y2;
    public final zy0 Z2;

    public vy0(zy0 zy0Var, Context context) {
        super(context, null);
        this.Z2 = zy0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.X2 == canScrollHorizontally && this.Y2 == canScrollHorizontally2) {
            return;
        }
        bi.ld ldVar = this.Z2.d;
        if (ldVar != null) {
            ldVar.invalidate();
        }
        this.X2 = canScrollHorizontally;
        this.Y2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.rt previewDelegate;
        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
        zy0 zy0Var = this.Z2;
        vy0 vy0Var = zy0Var.e;
        previewDelegate = zy0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, vy0Var, previewDelegate, this.f27987p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
