package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class kz0 extends qm0 {
    public boolean V2;
    public boolean W2;
    public final oz0 X2;

    public kz0(oz0 oz0Var, Context context) {
        super(context, null);
        this.X2 = oz0Var;
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
        oz0 oz0Var = this.X2;
        kz0 kz0Var = oz0Var.f29608e;
        previewDelegate = oz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, kz0Var, previewDelegate, this.f30216n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
