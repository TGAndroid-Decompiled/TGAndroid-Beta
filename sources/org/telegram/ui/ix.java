package org.telegram.ui;

import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ix extends org.telegram.ui.Components.aa {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final int v1() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
    }
}
