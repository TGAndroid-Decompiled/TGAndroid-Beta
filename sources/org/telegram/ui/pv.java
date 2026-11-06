package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class pv extends di.q {
    public final ww O0;

    public pv(ww wwVar, Context context, ww wwVar2, int i7, int i10) {
        super(context, wwVar2, i7, i10);
        this.O0 = wwVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.O0).actionBar;
        if (!kVar.v() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
