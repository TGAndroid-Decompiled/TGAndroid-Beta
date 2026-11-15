package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class c4 extends ImageButton {
    public final g4 f28491a;

    public c4(g4 g4Var, Context context) {
        super(context);
        this.f28491a = g4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f28491a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
