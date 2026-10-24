package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class cw extends org.telegram.ui.Components.q00 {
    public final ey B0;

    public cw(ey eyVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.B0 = eyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f37081n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
