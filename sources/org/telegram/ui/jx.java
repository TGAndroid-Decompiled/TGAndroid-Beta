package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class jx extends ai.b0 {
    public final sy O0;

    public jx(sy syVar, Context context, sy syVar2, int i10, int i11) {
        super(context, syVar2, i10, i11);
        this.O0 = syVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.O0).actionBar;
        if (!kVar.t() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
