package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ix extends nh.q {
    public final qy L0;

    public ix(qy qyVar, Context context, qy qyVar2, int i10, int i11) {
        super(context, qyVar2, i10, i11);
        this.L0 = qyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.L0).actionBar;
        if (!kVar.s() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
