package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class nx extends zh.l {
    public final wy O0;

    public nx(wy wyVar, Context context, wy wyVar2, int i10, int i11) {
        super(context, wyVar2, i10, i11);
        this.O0 = wyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.p2) this.O0).actionBar;
        if (!lVar.s() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
