package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class pw extends org.telegram.ui.Components.ez {
    public final zw B0;

    public pw(zw zwVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.B0 = zwVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f52628o3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
