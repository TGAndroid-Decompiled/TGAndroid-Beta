package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class nw extends org.telegram.ui.Components.m00 {
    public final qy B0;

    public nw(qy qyVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.B0 = qyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f37072m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
