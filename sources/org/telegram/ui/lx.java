package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class lx extends bi.v {
    public final uy O0;

    public lx(uy uyVar, Context context, uy uyVar2, int i10, int i11) {
        super(context, uyVar2, i10, i11);
        this.O0 = uyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.O0).actionBar;
        if (!kVar.s() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
