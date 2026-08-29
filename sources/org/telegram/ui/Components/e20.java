package org.telegram.ui.Components;

import android.view.MotionEvent;
public interface e20 {
    void a1();

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10);

    void onLongPress(MotionEvent motionEvent);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10);

    boolean onSingleTapUp(MotionEvent motionEvent);
}
