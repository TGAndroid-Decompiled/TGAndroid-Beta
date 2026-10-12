package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class oy extends org.telegram.ui.Components.o20 {
    public oy(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
