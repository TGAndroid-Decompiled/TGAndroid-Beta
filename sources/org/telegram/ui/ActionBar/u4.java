package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class u4 extends ImageButton {
    public final y4 f21912a;

    public u4(y4 y4Var, Context context) {
        super(context);
        this.f21912a = y4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f21912a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
