package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ky extends org.telegram.ui.Components.n00 {
    public final uy B0;

    public ky(uy uyVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.B0 = uyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f41433m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
