package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class gz0 extends lm0 {
    public boolean Y2;
    public boolean Z2;
    public final kz0 f26818a3;

    public gz0(kz0 kz0Var, Context context) {
        super(context, null);
        this.f26818a3 = kz0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.Y2 == canScrollHorizontally && this.Z2 == canScrollHorizontally2) {
            return;
        }
        ah.x xVar = this.f26818a3.d;
        if (xVar != null) {
            xVar.invalidate();
        }
        this.Y2 = canScrollHorizontally;
        this.Z2 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft previewDelegate;
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        kz0 kz0Var = this.f26818a3;
        gz0 gz0Var = kz0Var.e;
        previewDelegate = kz0Var.getPreviewDelegate();
        boolean p5 = o10.p(motionEvent, gz0Var, previewDelegate, this.f28396n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !p5) {
            return false;
        }
        return true;
    }
}
