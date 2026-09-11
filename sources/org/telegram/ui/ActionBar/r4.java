package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class r4 extends ImageButton {
    public final v4 f21322a;

    public r4(v4 v4Var, Context context) {
        super(context);
        this.f21322a = v4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f21322a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
