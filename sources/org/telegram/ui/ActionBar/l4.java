package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class l4 extends ImageButton {
    public final q4 f20537a;

    public l4(q4 q4Var, Context context) {
        super(context);
        this.f20537a = q4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f20537a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
