package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class pw extends org.telegram.ui.Components.k00 {
    public final qy f37238y0;

    public pw(qy qyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f37238y0 = qyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f37238y0.f37571j3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
