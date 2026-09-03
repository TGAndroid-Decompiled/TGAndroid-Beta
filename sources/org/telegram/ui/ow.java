package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ow extends org.telegram.ui.Components.l00 {
    public final py f39815y0;

    public ow(py pyVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f39815y0 = pyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f39815y0.f40200j3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
