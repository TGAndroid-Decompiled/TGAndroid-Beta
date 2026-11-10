package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class w6 extends vg.e {
    public final x6 L;

    public w6(x6 x6Var, Context context) {
        super(context);
        this.L = x6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f43355y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
