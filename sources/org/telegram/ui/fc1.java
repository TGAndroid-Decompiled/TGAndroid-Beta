package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
public final class fc1 extends qh.k6 {
    public fc1(Activity activity) {
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
