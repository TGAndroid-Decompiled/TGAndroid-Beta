package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qz0 extends wm0 {
    public boolean V2;
    public boolean W2;
    public final uz0 X2;

    public qz0(uz0 uz0Var, Context context) {
        super(context, null);
        this.X2 = uz0Var;
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
        org.telegram.ui.st previewDelegate;
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        uz0 uz0Var = this.X2;
        qz0 qz0Var = uz0Var.f31300e;
        previewDelegate = uz0Var.getPreviewDelegate();
        boolean r10 = q6.r(motionEvent, qz0Var, previewDelegate, this.f32467n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }
}
