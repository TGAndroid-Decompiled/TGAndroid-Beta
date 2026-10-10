package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class lz0 extends rm0 {
    public boolean V2;
    public boolean W2;
    public final pz0 X2;

    public lz0(pz0 pz0Var, Context context) {
        super(context, null);
        this.X2 = pz0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.V2 == canScrollHorizontally && this.W2 == canScrollHorizontally2) {
            return;
        }
        ai.f0 f0Var = this.X2.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        this.V2 = canScrollHorizontally;
        this.W2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.pt previewDelegate;
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        pz0 pz0Var = this.X2;
        lz0 lz0Var = pz0Var.f29895e;
        previewDelegate = pz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, lz0Var, previewDelegate, this.f30511n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
