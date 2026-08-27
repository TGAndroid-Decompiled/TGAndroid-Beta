package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class po extends org.telegram.ui.Components.kn0 {

    public final xo f41403r;

    public po(xo xoVar, Context context, hh.m mVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, mVar, c6Var, false);
        this.f41403r = xoVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f41403r.H && super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return !this.f41403r.H && super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }
}
