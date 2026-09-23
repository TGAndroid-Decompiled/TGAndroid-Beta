package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class hy extends org.telegram.ui.Components.c20 {
    public hy(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
