package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class u6 extends vg.e {
    public final v6 L;

    public u6(v6 v6Var, Context context) {
        super(context);
        this.L = v6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f43278y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
