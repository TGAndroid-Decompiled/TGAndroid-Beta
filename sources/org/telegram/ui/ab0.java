package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;
public final class ab0 extends EditText {
    public final int f36501a;

    public ab0(Context context, int i10) {
        super(context);
        this.f36501a = i10;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f36501a) {
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
