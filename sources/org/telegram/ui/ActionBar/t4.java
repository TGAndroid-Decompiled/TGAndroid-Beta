package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class t4 extends ImageButton {
    public final x4 f22293a;

    public t4(x4 x4Var, Context context) {
        super(context);
        this.f22293a = x4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f22293a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
