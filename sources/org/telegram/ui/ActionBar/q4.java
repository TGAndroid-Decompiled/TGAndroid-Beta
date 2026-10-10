package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class q4 extends ImageButton {
    public final u4 f21498a;

    public q4(u4 u4Var, Context context) {
        super(context);
        this.f21498a = u4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f21498a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
