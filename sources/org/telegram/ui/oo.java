package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oo extends org.telegram.ui.Components.xo0 {
    public final wo f39945r;

    public oo(wo woVar, Context context, ai.r rVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, rVar, d6Var, false);
        this.f39945r = woVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f39945r.L && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f39945r.L && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }
}
