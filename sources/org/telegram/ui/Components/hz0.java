package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class hz0 extends mm0 {
    public boolean Y2;
    public boolean Z2;
    public final lz0 f27076a3;

    public hz0(lz0 lz0Var, Context context) {
        super(context, null);
        this.f27076a3 = lz0Var;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.Y2 == canScrollHorizontally && this.Z2 == canScrollHorizontally2) {
            return;
        }
        ah.x xVar = this.f27076a3.d;
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
        lz0 lz0Var = this.f27076a3;
        hz0 hz0Var = lz0Var.e;
        previewDelegate = lz0Var.getPreviewDelegate();
        boolean p5 = o10.p(motionEvent, hz0Var, previewDelegate, this.f28705n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !p5) {
            return false;
        }
        return true;
    }
}
