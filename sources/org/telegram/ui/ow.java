package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ow extends org.telegram.ui.Components.r00 {
    public ow(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
