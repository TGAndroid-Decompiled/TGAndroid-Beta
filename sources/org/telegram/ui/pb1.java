package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
public final class pb1 extends fi.q7 {
    public pb1(Activity activity) {
        super(activity, 3);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
