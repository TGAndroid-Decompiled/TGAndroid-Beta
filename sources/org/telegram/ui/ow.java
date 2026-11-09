package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ow extends org.telegram.ui.Components.fz {
    public final yw B0;

    public ow(yw ywVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.B0 = ywVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f52282o3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
