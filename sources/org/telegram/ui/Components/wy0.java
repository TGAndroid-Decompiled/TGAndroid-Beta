package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class wy0 extends zl0 {
    public boolean f30091e3;
    public boolean f30092f3;
    public final az0 f30093g3;

    public wy0(az0 az0Var, Context context) {
        super(context, null);
        this.f30093g3 = az0Var;
    }

    @Override
    public final void l0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f30091e3 == canScrollHorizontally && this.f30092f3 == canScrollHorizontally2) {
            return;
        }
        ai.f0 f0Var = this.f30093g3.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        this.f30091e3 = canScrollHorizontally;
        this.f30092f3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.lt previewDelegate;
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        az0 az0Var = this.f30093g3;
        wy0 wy0Var = az0Var.e;
        previewDelegate = az0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, wy0Var, previewDelegate, this.f31015p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
