package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class px0 extends tk0 {
    public boolean f29449e3;
    public boolean f29450f3;
    public final sx0 f29451g3;

    public px0(sx0 sx0Var, Context context) {
        super(context, null);
        this.f29451g3 = sx0Var;
    }

    @Override
    public final void l0(int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f29449e3 == canScrollHorizontally && this.f29450f3 == canScrollHorizontally2) {
            return;
        }
        jg.l0 l0Var = this.f29451g3.d;
        if (l0Var != null) {
            l0Var.invalidate();
        }
        this.f29449e3 = canScrollHorizontally;
        this.f29450f3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.jt previewDelegate;
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        sx0 sx0Var = this.f29451g3;
        px0 px0Var = sx0Var.e;
        previewDelegate = sx0Var.getPreviewDelegate();
        boolean q6 = p5.q(motionEvent, px0Var, previewDelegate, this.f30625n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
            return false;
        }
        return true;
    }
}
