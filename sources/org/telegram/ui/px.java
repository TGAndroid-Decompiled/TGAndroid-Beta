package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class px extends org.telegram.ui.Components.tz {
    public final zx B0;

    public px(zx zxVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.B0 = zxVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f44184n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
