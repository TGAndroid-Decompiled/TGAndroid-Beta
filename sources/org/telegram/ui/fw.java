package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

public final class fw extends org.telegram.ui.Components.yz {

    public final gy f38213x0;

    public fw(gy gyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f38213x0 = gyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f38213x0.f38543i3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
