package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class iy extends org.telegram.ui.Components.f20 {
    public iy(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
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
