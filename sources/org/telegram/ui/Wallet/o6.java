package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class o6 extends tg.f {
    public final p6 L;

    public o6(p6 p6Var, Context context) {
        super(context);
        this.L = p6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f34747x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
