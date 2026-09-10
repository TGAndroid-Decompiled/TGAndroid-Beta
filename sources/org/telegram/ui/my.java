package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class my extends org.telegram.ui.Components.k20 {
    public my(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
