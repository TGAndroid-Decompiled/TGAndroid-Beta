package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class jy extends org.telegram.ui.Components.s20 {
    public jy(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
