package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class hz0 extends mm0 {
    public boolean V2;
    public boolean W2;
    public final lz0 X2;

    public hz0(lz0 lz0Var, Context context) {
        super(context, null);
        this.X2 = lz0Var;
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
        lz0 lz0Var = this.X2;
        hz0 hz0Var = lz0Var.e;
        previewDelegate = lz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, hz0Var, previewDelegate, this.f27148n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
