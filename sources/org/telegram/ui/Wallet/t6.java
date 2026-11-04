package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class t6 extends wg.e {
    public final u6 M;

    public t6(u6 u6Var, Context context) {
        super(context);
        this.M = u6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.M.f43267y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
