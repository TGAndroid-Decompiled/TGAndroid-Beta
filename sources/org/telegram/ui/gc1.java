package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
public final class gc1 extends ph.n6 {
    public gc1(Activity activity) {
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
