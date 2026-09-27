package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class iy extends org.telegram.ui.Components.m00 {
    public final ty B0;

    public iy(ty tyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.B0 = tyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f38016m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
