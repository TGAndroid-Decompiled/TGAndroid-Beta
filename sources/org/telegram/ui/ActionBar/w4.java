package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class w4 extends ImageButton {
    public final a5 f23211a;

    public w4(a5 a5Var, Context context) {
        super(context);
        this.f23211a = a5Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f23211a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
