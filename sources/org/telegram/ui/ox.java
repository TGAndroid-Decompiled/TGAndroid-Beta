package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ox extends org.telegram.ui.Components.h10 {
    public ox(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
