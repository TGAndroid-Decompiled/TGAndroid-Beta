package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class mv extends ei.r {
    public final uw P0;

    public mv(uw uwVar, Context context, uw uwVar2, int i3, int i10) {
        super(context, uwVar2, i3, i10);
        this.P0 = uwVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.d2) this.P0).actionBar;
        if (!kVar.v() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
