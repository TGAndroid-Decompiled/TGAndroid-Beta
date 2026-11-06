package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class v6 extends vg.e {
    public final w6 L;

    public v6(w6 w6Var, Context context) {
        super(context);
        this.L = w6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f43308y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
