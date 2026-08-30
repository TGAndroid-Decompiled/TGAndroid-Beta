package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class gx extends nh.q {
    public final oy L0;

    public gx(oy oyVar, Context context, oy oyVar2, int i10, int i11) {
        super(context, oyVar2, i10, i11);
        this.L0 = oyVar;
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
