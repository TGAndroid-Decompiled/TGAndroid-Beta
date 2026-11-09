package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class mw0 extends qj0 {
    public boolean f36156e3;
    public boolean f36157f3;
    public final pw0 f36158g3;

    public mw0(pw0 pw0Var, Context context) {
        super(context, null);
        this.f36158g3 = pw0Var;
    }

    @Override
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f36156e3 == canScrollHorizontally && this.f36157f3 == canScrollHorizontally2) {
            return;
        }
        bi.e5 e5Var = this.f36158g3.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
        this.f36156e3 = canScrollHorizontally;
        this.f36157f3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ks previewDelegate;
        org.telegram.ui.ms p10 = org.telegram.ui.ms.p();
        pw0 pw0Var = this.f36158g3;
        mw0 mw0Var = pw0Var.f37109e;
        previewDelegate = pw0Var.getPreviewDelegate();
        boolean q10 = p10.q(motionEvent, mw0Var, previewDelegate, this.f37381n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }
}
