package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class w4 extends ImageButton {
    public final a5 f23212a;

    public w4(a5 a5Var, Context context) {
        super(context);
        this.f23212a = a5Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f23212a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
