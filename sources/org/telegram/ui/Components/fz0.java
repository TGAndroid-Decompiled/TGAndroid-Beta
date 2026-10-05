package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class fz0 extends zl0 {
    public boolean f26642e3;
    public boolean f26643f3;
    public final jz0 f26644g3;

    public fz0(jz0 jz0Var, Context context) {
        super(context, null);
        this.f26644g3 = jz0Var;
    }

    @Override
    public final void l0(int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f26642e3 == canScrollHorizontally && this.f26643f3 == canScrollHorizontally2) {
            return;
        }
        ai.f0 f0Var = this.f26644g3.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        this.f26642e3 = canScrollHorizontally;
        this.f26643f3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.pt previewDelegate;
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        jz0 jz0Var = this.f26644g3;
        fz0 fz0Var = jz0Var.f28005e;
        previewDelegate = jz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, fz0Var, previewDelegate, this.f33560p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
