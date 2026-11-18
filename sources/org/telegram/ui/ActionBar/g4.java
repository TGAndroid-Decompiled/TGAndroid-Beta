package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class g4 extends ImageButton {
    public final k4 f28974a;

    public g4(k4 k4Var, Context context) {
        super(context);
        this.f28974a = k4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f28974a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
