package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class q4 extends ImageButton {
    public final u4 f19479a;

    public q4(u4 u4Var, Context context) {
        super(context);
        this.f19479a = u4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f19479a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
