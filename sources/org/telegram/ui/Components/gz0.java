package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class gz0 extends mm0 {
    public boolean V2;
    public boolean W2;
    public final kz0 X2;

    public gz0(kz0 kz0Var, Context context) {
        super(context, null);
        this.X2 = kz0Var;
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
        org.telegram.ui.vt previewDelegate;
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        kz0 kz0Var = this.X2;
        gz0 gz0Var = kz0Var.e;
        previewDelegate = kz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, gz0Var, previewDelegate, this.f27439n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
