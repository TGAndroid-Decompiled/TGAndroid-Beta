package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class hx extends oh.p {
    public final py L0;

    public hx(py pyVar, Context context, py pyVar2, int i10, int i11) {
        super(context, pyVar2, i10, i11);
        this.L0 = pyVar;
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
