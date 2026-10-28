package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qz0 extends nm0 {
    public boolean f32068f3;
    public boolean f32069g3;
    public final uz0 f32070h3;

    public qz0(uz0 uz0Var, Context context) {
        super(context, null);
        this.f32070h3 = uz0Var;
    }

    @Override
    public final void l0(int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f32068f3 == canScrollHorizontally && this.f32069g3 == canScrollHorizontally2) {
            return;
        }
        bh.r rVar = this.f32070h3.d;
        if (rVar != null) {
            rVar.invalidate();
        }
        this.f32068f3 = canScrollHorizontally;
        this.f32069g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft previewDelegate;
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        uz0 uz0Var = this.f32070h3;
        qz0 qz0Var = uz0Var.e;
        previewDelegate = uz0Var.getPreviewDelegate();
        boolean p10 = o10.p(motionEvent, qz0Var, previewDelegate, this.f30988n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !p10) {
            return false;
        }
        return true;
    }
}
