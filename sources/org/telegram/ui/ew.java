package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ew extends org.telegram.ui.Components.f00 {
    public final fy f37909x0;

    public ew(fy fyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f37909x0 = fyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f37909x0.f38301i3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
