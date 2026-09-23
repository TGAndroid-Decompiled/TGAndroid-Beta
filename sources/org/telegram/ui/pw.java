package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class pw extends org.telegram.ui.Components.l00 {
    public final ry B0;

    public pw(ry ryVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.B0 = ryVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f37018m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
