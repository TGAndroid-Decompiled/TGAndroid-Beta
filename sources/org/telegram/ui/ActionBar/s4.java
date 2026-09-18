package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class s4 extends ImageButton {
    public final w4 f19554a;

    public s4(w4 w4Var, Context context) {
        super(context);
        this.f19554a = w4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f19554a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
