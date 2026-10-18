package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class cz0 extends im0 {
    public boolean V2;
    public boolean W2;
    public final gz0 X2;

    public cz0(gz0 gz0Var, Context context) {
        super(context, null);
        this.X2 = gz0Var;
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
        org.telegram.ui.et previewDelegate;
        org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
        gz0 gz0Var = this.X2;
        cz0 cz0Var = gz0Var.e;
        previewDelegate = gz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, cz0Var, previewDelegate, this.f27291n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
