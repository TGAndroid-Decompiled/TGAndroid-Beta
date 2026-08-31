package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class fy extends org.telegram.ui.Components.d20 {
    public fy(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
