package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class t6 extends vg.e {
    public final u6 L;

    public t6(u6 u6Var, Context context) {
        super(context);
        this.L = u6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f43196y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
