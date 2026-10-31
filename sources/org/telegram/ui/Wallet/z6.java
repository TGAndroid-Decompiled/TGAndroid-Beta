package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class z6 extends lg.g {
    public final a7 L;

    public z6(a7 a7Var, Context context) {
        super(context);
        this.L = a7Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f34213y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
