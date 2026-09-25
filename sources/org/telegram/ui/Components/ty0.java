package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ty0 extends wl0 {
    public boolean X2;
    public boolean Y2;
    public final xy0 Z2;

    public ty0(xy0 xy0Var, Context context) {
        super(context, null);
        this.Z2 = xy0Var;
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
        org.telegram.ui.lt previewDelegate;
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        xy0 xy0Var = this.Z2;
        ty0 ty0Var = xy0Var.e;
        previewDelegate = xy0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, ty0Var, previewDelegate, this.f30115p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
