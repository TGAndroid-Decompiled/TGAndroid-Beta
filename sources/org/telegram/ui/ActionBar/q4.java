package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class q4 extends ImageButton {
    public final u4 f21491a;

    public q4(u4 u4Var, Context context) {
        super(context);
        this.f21491a = u4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f21491a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
