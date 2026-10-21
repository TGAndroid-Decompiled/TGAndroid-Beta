package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class aw extends org.telegram.ui.Components.s00 {
    public final cy B0;

    public aw(cy cyVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.B0 = cyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f36139n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
