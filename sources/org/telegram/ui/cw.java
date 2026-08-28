package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class cw extends org.telegram.ui.Components.vz {
    public final dy f37335x0;

    public cw(dy dyVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.f37335x0 = dyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f37335x0.f37674i3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
