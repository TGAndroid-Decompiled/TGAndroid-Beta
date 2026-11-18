package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;
public final class f90 extends EditText {
    public final int f47576a;

    public f90(Context context, int i7) {
        super(context);
        this.f47576a = i7;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f47576a) {
            case 0:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
