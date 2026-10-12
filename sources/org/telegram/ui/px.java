package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class px extends bi.v {
    public final yy O0;

    public px(yy yyVar, Context context, yy yyVar2, int i10, int i11) {
        super(context, yyVar2, i10, i11);
        this.O0 = yyVar;
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
