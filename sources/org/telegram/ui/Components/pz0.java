package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pz0 extends mm0 {
    public boolean f31739f3;
    public boolean f31740g3;
    public final tz0 f31741h3;

    public pz0(tz0 tz0Var, Context context) {
        super(context, null);
        this.f31741h3 = tz0Var;
    }

    @Override
    public final void l0(int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f31739f3 == canScrollHorizontally && this.f31740g3 == canScrollHorizontally2) {
            return;
        }
        bh.r rVar = this.f31741h3.d;
        if (rVar != null) {
            rVar.invalidate();
        }
        this.f31739f3 = canScrollHorizontally;
        this.f31740g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.dt previewDelegate;
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        tz0 tz0Var = this.f31741h3;
        pz0 pz0Var = tz0Var.e;
        previewDelegate = tz0Var.getPreviewDelegate();
        boolean p10 = o10.p(motionEvent, pz0Var, previewDelegate, this.f30646n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !p10) {
            return false;
        }
        return true;
    }
}
