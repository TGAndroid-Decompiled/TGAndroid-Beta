package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class dz0 extends im0 {
    public boolean V2;
    public boolean W2;
    public final hz0 X2;

    public dz0(hz0 hz0Var, Context context) {
        super(context, null);
        this.X2 = hz0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.V2 == canScrollHorizontally && this.W2 == canScrollHorizontally2) {
            return;
        }
        ah.x xVar = this.X2.d;
        if (xVar != null) {
            xVar.invalidate();
        }
        this.V2 = canScrollHorizontally;
        this.W2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ct previewDelegate;
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        hz0 hz0Var = this.X2;
        dz0 dz0Var = hz0Var.e;
        previewDelegate = hz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, dz0Var, previewDelegate, this.f27301n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
