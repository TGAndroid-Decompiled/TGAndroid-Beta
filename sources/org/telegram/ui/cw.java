package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class cw extends org.telegram.ui.Components.s00 {
    public final ey B0;

    public cw(ey eyVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.B0 = eyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f36677n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
