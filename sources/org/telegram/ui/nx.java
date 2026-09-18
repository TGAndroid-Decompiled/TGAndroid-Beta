package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class nx extends ai.b0 {
    public final wy O0;

    public nx(wy wyVar, Context context, wy wyVar2, int i10, int i11) {
        super(context, wyVar2, i10, i11);
        this.O0 = wyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.O0).actionBar;
        if (!kVar.s() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
