package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class m20 extends FrameLayout {
    public m20(LaunchActivity launchActivity) {
        super(launchActivity);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
