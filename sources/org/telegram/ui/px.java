package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class px extends org.telegram.ui.Components.h10 {
    public px(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
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
