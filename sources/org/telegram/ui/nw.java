package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class nw extends org.telegram.ui.Components.j00 {
    public final oy f36733y0;

    public nw(oy oyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f36733y0 = oyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f36733y0.f37053j3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
