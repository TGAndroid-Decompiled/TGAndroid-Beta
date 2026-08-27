package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;

public final class bb0 extends EditText {

    public final int f36769a;

    public bb0(Context context, int i10) {
        super(context);
        this.f36769a = i10;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f36769a) {
            case 0:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                break;
            default:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
