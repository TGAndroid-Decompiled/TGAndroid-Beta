package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class v6 extends vg.e {
    public final w6 M;

    public v6(w6 w6Var, Context context) {
        super(context);
        this.M = w6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.M.f44654y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
