package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k31 extends EditTextBoldCursor {
    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !org.telegram.messenger.i0.J3(this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
