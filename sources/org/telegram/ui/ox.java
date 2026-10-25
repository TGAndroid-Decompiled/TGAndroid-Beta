package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ox extends org.telegram.ui.Components.m20 {
    public ox(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
